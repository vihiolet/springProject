package com.dev.webboot2.service;
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.dev.webboot2.dao.*;
 
@Service
public class daptServiceImpl implements daptService {
    
    @Autowired
    private StatisticMapperDapt uMapper;

	@Override
	public HashMap<String, Object> daptloginCnt(String year, String month, String date, String dapt) {
		HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDaptLogin(year, month, date, dapt);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("date", date);
            retVal.put("dapt", dapt);
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
            retVal.put("loginCnt", -999);
            retVal.put("month", month);
            retVal.put("date", date);
            retVal.put("dapt", dapt);
            retVal.put("year", year);
            retVal.put("is_success", false);
            retVal.put("message", "실패");
        }
        
        return retVal;
	}  
}
