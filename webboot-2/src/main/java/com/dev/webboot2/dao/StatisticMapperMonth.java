package com.dev.webboot2.dao;

import java.util.HashMap;
 
public interface  StatisticMapperMonth {
    public HashMap<String, Object> selectMonthLogin(String year, String month);
 
}
