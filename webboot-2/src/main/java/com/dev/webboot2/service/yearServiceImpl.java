package com.dev.webboot2.service;
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.dev.webboot2.dao.*;
 
@Service
public class yearServiceImpl implements yearService {
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginCnt (String year) {
    	
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
            retVal.put("loginCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
            retVal.put("message", "실패");
        }
        
        return retVal;
    }   
}
