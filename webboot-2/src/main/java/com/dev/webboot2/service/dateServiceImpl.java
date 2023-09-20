package com.dev.webboot2.service;
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.dev.webboot2.dao.*;
 
@Service
public class dateServiceImpl implements dateService {
    
    @Autowired
    private StatisticMapperDate dMapper; 

	@Override
	public HashMap<String, Object> dateloginCnt(String year, String month, String date) {
		HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = dMapper.selecDateLogin(year, month, date);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("date", date);
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
        	System.out.println(e);
            retVal.put("monthloginCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("date", date);
            retVal.put("is_success", false);
            retVal.put("message", "실패");
        }
        
        return retVal;
	}
	 
}
