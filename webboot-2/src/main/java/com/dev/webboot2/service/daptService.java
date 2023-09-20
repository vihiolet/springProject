package com.dev.webboot2.service;

import java.util.HashMap;
 
public interface daptService {
    
    //(일별)부서별
    public HashMap<String,Object> daptloginCnt(String year, String month, String date, String dapt);
    
}
