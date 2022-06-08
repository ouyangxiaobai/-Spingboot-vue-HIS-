package com.neutech.service.impl;

import com.neutech.bean.base.Icd;
import com.neutech.bean.base.Inspection;
import com.neutech.bean.base.TechMana;
import com.neutech.bean.patient.PatientMessage;
import com.neutech.bean.patient.Patienticd;
import com.neutech.bean.patient.Patientreg;
import com.neutech.mapper.base.IcdMapper;
import com.neutech.mapper.base.InspectionMapper;
import com.neutech.mapper.base.TechMapper;
import com.neutech.mapper.patient.PatientMapper;
import com.neutech.mapper.patient.PatientMessageMapper;
import com.neutech.mapper.patient.PatienticdMapper;
import com.neutech.mapper.patient.PatientregMapper;
import com.neutech.service.DiagnoseService;
import com.neutech.util.MyUtil;
import com.neutech.util.SelectK;
import com.neutech.vo.outdepart.CheckItem;
import com.neutech.vo.outdepart.EicdShow;
import com.neutech.vo.outdepart.WicdShow;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DiagnoseServiceImpl implements DiagnoseService {
    @Autowired
    InspectionMapper inspectionMapper;//检查项
    @Autowired
    PatienticdMapper patienticdMapper;//诊断信息
    @Autowired
    TechMapper techMapper;
    @Autowired
    IcdMapper icdMapper;
    @Autowired
    PatientMessageMapper patientMessageMapper;
    @Autowired
    PatientregMapper patientregMapper;

    @Override
    public List<CheckItem> getInspection(String reg_ID) {//根据挂号单号获取该病人所有的检验项
        List<CheckItem> res=new ArrayList<>();

        Inspection inspection=new Inspection();
        inspection.setCheck_RegID(reg_ID);
        /*-----------需要类型，名称，时间，结果------------------------------------------------*/
        List<Inspection> inspectionBy = inspectionMapper.getInspectionBy(inspection);//根据挂号单号获取到了所有的检查项
        for(Inspection i:inspectionBy){
            if(i.getCheck_State().equals("已完成")){//必须是已完成的检查项,已开立
                TechMana tech = techMapper.getTech(i.getCheck_TechID());
                res.add(new CheckItem(tech.getTechType(),tech.getTechItem(), MyUtil.dateToS(i.getCheck_Time()),""));
            }
        }
        return res;
    }

    /*编号，姓名，时间*/

    @Override
    public Map<String, Object> getICD(String regID) {
        List<Patienticd> byRegID = patienticdMapper.getByRegID(regID);
        List<WicdShow> wicd = getWICD(byRegID);//西医诊断
        List<EicdShow> eicd = getEICD(byRegID);//中医诊断

        Map<String,Object> res=new HashMap<>();
        res.put("table1",wicd);
        res.put("table2",eicd);
        return res;
    }

    private List<WicdShow> getWICD(List<Patienticd> list){//根据挂号单号获取西医诊断
        List<WicdShow> res= new  ArrayList<>();
        for(Patienticd p:list){
            Icd icd = icdMapper.getIcd(p.getPti_ICE());
            if(icd.getIcd_Type().equals("西")){
                res.add(new WicdShow(p.getPti_ICE(),icd.getIcd_Name(),MyUtil.dateToS(p.getPti_Time())));
            }
        }
        return res;
    }

    private List<EicdShow> getEICD(List<Patienticd> list){//根据挂号单号获取中医诊断
        List<EicdShow> res= new  ArrayList<>();
        for(Patienticd p:list){
            Icd icd = icdMapper.getIcd(p.getPti_ICE());
            if(icd.getIcd_Type().equals("中")){
                res.add(new EicdShow(p.getPti_ICE(),icd.getIcd_Name(),MyUtil.dateToS(p.getPti_Time())));
            }
        }
        return res;
    }

    @Override
    public PatientMessage getMessage(String regID) {//获取诊断结果和处理意见
        return patientMessageMapper.getPmByRegID(regID);
    }

    @Override
    public Map<String,Object> getICD() {
        Map<String,Object> res=new HashMap<>();
        List<Icd> xi = icdMapper.getByType("西");
        List<Icd> zhong = icdMapper.getByType("中");
        List<SelectK> childtable1= new ArrayList<>();
        List<SelectK> childtable2=new ArrayList<>();
        for(Icd i: xi){
            childtable1.add(new SelectK(i.getIcd_Name(),i.getIcd_ID()));
        }
        for(Icd i:zhong){
            childtable2.add(new SelectK(i.getIcd_Name(),i.getIcd_ID()));
        }
        res.put("childtable1",childtable1);
        res.put("childtable2",childtable2);
        return res;
    }

    @Override
    public int deleteByregicd(String regID, String icdID) {
        return patienticdMapper.deleteByregicd(regID,icdID);
    }

    @Override
    public int updateMessage(PatientMessage patientMessage) {
        PatientMessage pmByRegID = patientMessageMapper.getPmByRegID(patientMessage.getPm_ID());
        int i=0;
        if(pmByRegID!=null){//不为空，代表已存在，更新
            i = patientMessageMapper.updateMessage(patientMessage);
        }else {//为空，代表没有，就添加
            i = patientMessageMapper.addMessage(patientMessage);
        }
        return i;
    }

    @Override
    public int addicd(String regID, String icdID) {
        Patienticd patienticd= new Patienticd();
        patienticd.setPti_ID(regID);
        patienticd.setPti_ICE(icdID);
        patienticd.setPti_Time(new Date());
        List<Patienticd> byRegID = patienticdMapper.getByRegID(regID);
        for(Patienticd patienticd1:byRegID){//如果已存在
            if(patienticd1.getPti_ICE().equals(icdID)){
                return 0;
            }
        }
        patienticdMapper.addPicd(patienticd);

        return 1;
    }

    @Override
    public int delete(String regID, String icdID) {
        return patienticdMapper.deleteByregicd(regID,icdID);
    }

    @Override
    public int zhenbi(String regID) {
        System.out.println("regID"+regID);
        Patientreg patientreg = patientregMapper.getPatientreg(regID);
        patientreg.setReg_State("已就诊");//已就诊
        int i = patientregMapper.updatePatientreg(patientreg);

        return i;
    }
}
