package com.neutech.service;

import com.neutech.bean.system.User;
import com.neutech.vo.reception.RegForm;

import java.util.List;
import java.util.Map;

/*挂号页面的service*/
public interface RegService {
    /*获取当前上班医生的余号*/
    public int getRegNumber(String id);

    /*根据科室和号别查找当前有余号的医生*/
    public List<User> getByDeReg(String depart, String regtype);

    /**
     * 获取billNum发票号   regFormNum挂单单号   seqNum序号   regTime(时间非日期)
     * */
    public Map<String,Object> getFetchdate(String docID,String idNum);

    /**
     *根据患者的id查找病人
     * @return病人的基本信息
     */
    public Map<String, Object> getPatient(String id);

    /**
     * 根据医生的id返回实时的已经挂号的病人数量(已经判断上下午了)
     * @param docId
     * @return
     */
    public int getNowNum(String docId);

    /**
     * 真正实现添加挂号单功能，包括基本信息和挂号信息
     * @param regForm
     * @return
     */
    public void add(RegForm regForm);

}
