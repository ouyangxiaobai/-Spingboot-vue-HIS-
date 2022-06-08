package com.neutech.service.impl;

import com.neutech.bean.base.DepMana;
import com.neutech.bean.base.Inspection;
import com.neutech.bean.base.TechMana;
import com.neutech.mapper.base.InspectionMapper;
import com.neutech.mapper.base.TechMapper;
import com.neutech.service.InspectionService;
import com.neutech.util.SelectK;
import com.neutech.vo.outdepart.CommonInsShow;
import com.neutech.vo.outdepart.InspectionShow;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InspectionServiceImpl implements InspectionService {

    @Autowired
    InspectionMapper inspectionMapper;
    @Autowired
    TechMapper techMapper;

    /**
     * 加载检验项
     * @param check_RegID
     * @return
     */
    public Map<String,Object> getByRegID(String check_RegID){
        HashMap<String,Object> res=new HashMap<>();
        String techType="检验";
        if(inspectionMapper.getByRegID(check_RegID,techType)!=null){
            List<InspectionShow> inspectionShows=inspectionMapper.getByRegID(check_RegID,techType);
            res.put("inspec",inspectionShows);
            res.put("isAdd","true");
        }
        List<CommonInsShow> commonInsShows=inspectionMapper.getAllIns(techType);
        res.put("comins",commonInsShows);
        return res;
    }

    /**
     * 使用常用项
     * @param comTechNum
     * @param check_RegID
     * @return
     */
    public Map<String,Object> addIns(String comTechNum, String check_RegID){
        HashMap<String,Object> res=new HashMap<>();
        String check_State="未开立";
        String check_Num="1";
        Date date=new Date();
        String techType="检验";
        if(inspectionMapper.getInspection(check_RegID,comTechNum)==null){
            inspectionMapper.addIns(comTechNum,check_RegID,check_State,check_Num,date);
            List<InspectionShow> inspectionShows=inspectionMapper.getByRegID(check_RegID,techType);
            res.put("table",inspectionShows);
            res.put("flag","yes");
        }
        return res;
    }

    /**
     * 删除常用项
     * @param comTechNum
     * @return
     */
    public Map<String,Object> deleteByID(String comTechNum){
        HashMap<String,Object> res=new HashMap<>();
        inspectionMapper.deleteComIns(comTechNum);
        res.put("flag","yes");
        return res;
    }

    /**
     * 所有科室（下拉框用）
     * @param
     * @return
     */
    public Map<String,Object> getAllInsXZ(){
        HashMap<String,Object> res=new HashMap<>();
        String depType="医技";
        List<DepMana> depManas=inspectionMapper.getAllInsXZ(depType);
        List<SelectK> selecttech=new ArrayList<>();
        for(DepMana dep:depManas){
            selecttech.add(new SelectK(dep.getDepName(),dep.getDepNum()));
        }
        res.put("allxz",selecttech);
        return res;
    }

    /**
     * 科室的检验，下拉框用
     * @param techExeOff
     * @return
     */
    public Map<String,Object> getAllInsXM(String techExeOff){
        HashMap<String,Object> res=new HashMap<>();
        String techType="检验";
        List<TechMana> techManas=inspectionMapper.getAllInsXM(techExeOff,techType);
        List<SelectK> selectKS=new ArrayList<>();
        for(TechMana tech:techManas){
            selectKS.add(new SelectK(tech.getTechItem(),tech.getTechNum()));
        }
        res.put("item",selectKS);
        return res;
    }

    /**
     * 填写新增表单
     * @param techMum
     * @return
     */
    public Map<String,Object> getTech(String techMum){
        HashMap<String,Object> res=new HashMap<>();
        TechMana techMana=techMapper.getTech(techMum);
        CommonInsShow commonInsShow=new CommonInsShow(techMana);
        res.put("xinzen",commonInsShow);
        return res;
    }

    //常用项新增
    public Map<String,Object> allCom(CommonInsShow commonInsShow){
        HashMap<String,Object> res=new HashMap<>();
        String comTechType="检验";
        TechMana techMana=new TechMana(commonInsShow);
        String comTechNum=commonInsShow.getComTechNum();
        if(inspectionMapper.getCom(comTechNum)==null){
            inspectionMapper.addCom(techMana);
            List<CommonInsShow> commonInsShows=inspectionMapper.getAllIns(comTechType);
            res.put("childtable",commonInsShows);
            res.put("flag","yes");
        }
        return res;
    }

    public Map<String,Object> deleteInsp(String check_RegID,String check_TechID){
        HashMap<String,Object> res=new HashMap<>();
        String techType="检验";
        if(inspectionMapper.getInspection(check_RegID,check_TechID)!=null) {
            inspectionMapper.deleteById(check_RegID,check_TechID);
            res.put("flag","yes");
            List<InspectionShow> inspectionShows = inspectionMapper.getByRegID(check_RegID, techType);
            res.put("inspec", inspectionShows);
        }
        return res;
    }

    /**
     * 更新状态
     * @param check_RegID
     * @param check_TechID
     * @return
     */
    public Map<String,Object> updateInspection(String check_RegID,String check_TechID){
        HashMap<String,Object> res=new HashMap<>();
        String check_State="已开立";
        String check_Num="1";
        Date check_Time=new Date();
        String techType="检验";
        Inspection inspection=new Inspection(check_RegID,check_TechID,check_State,check_Num,check_Time);
        if(inspectionMapper.getInspection(check_RegID,check_TechID)!=null){
            inspectionMapper.updateInspection(inspection);
            res.put("flag","yes");
            List<InspectionShow> inspectionShows = inspectionMapper.getByRegID(check_RegID, techType);
            res.put("table", inspectionShows);
        }
        return res;
    }

}
