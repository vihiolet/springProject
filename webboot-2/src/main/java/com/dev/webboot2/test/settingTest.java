package com.dev.webboot2.test;
 
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.dev.webboot2.service.*;

@Controller
public class settingTest {
	
	@Autowired
    private yearService yearservice;
	@Autowired
	private monthService monthservice;
	@Autowired
	private dateService dateservice;
	@Autowired
	private daptService daptservice;
	
    
    @ResponseBody 
    @RequestMapping("/loginhistory-year")
    public Map<String, Object> loginyearcnt(String year) throws Exception{ 
        
        return yearservice.yearloginCnt(year);
    }
    
    @ResponseBody 
    @RequestMapping("/loginhistory-month")
    public Map<String, Object> loginmonthcnt(String year, String month) throws Exception{ 
        
        return monthservice.monthloginCnt(year, month);
    }
    
    @ResponseBody 
    @RequestMapping("/loginhistory-date")
    public Map<String, Object> logindatecnt(String year, String month, String date) throws Exception{ 
        
        return dateservice.dateloginCnt(year, month, date);
    }
    
    @ResponseBody 
    @RequestMapping("/loginhistory-dapt")
    public Map<String, Object> logindaptcnt(String year, String month, String date, String dapt) throws Exception{ 
        System.out.println(dapt);
        return daptservice.daptloginCnt(year, month, date, dapt);
    }
 
}