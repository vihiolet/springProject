package com.dev.webboot2.dao;

import java.util.HashMap;
 
public interface  StatisticMapperDapt {
    public HashMap<String, Object> selectDaptLogin(String year, String month, String date, String dapt);
 
}
