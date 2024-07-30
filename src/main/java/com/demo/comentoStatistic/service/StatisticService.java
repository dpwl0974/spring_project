package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {

    @Autowired
    StatisticMapper statisticMapper;

    public YearCountDto getYearLogins(String year){
        return statisticMapper.selectYearLogin(year);
    }

    public YearMonthDayCountDto getYearMonthLogins(String year, String month){
        return statisticMapper.selectYearMonthLogin(year + month);
    }

    public YearMonthCountDto getYearMonthVisitors(String year, String month) {
        return statisticMapper.selectYearMonthVisitors(year + month);
    }

    public YearMonthDayCountDto getYearMonthDayVisitors(String year, String month, String day) {
        return statisticMapper.selectYearMonthDayVisitors(year + month + day);
    }

    public AvgDayLoginDto getAvgDayLogins(String year, String month) {
        return statisticMapper.selectAvgDayLogins(year + month);
    }

    public NonHolidayDto getNonHolidayLogins(String year, String month) {
        return statisticMapper.selectNonHolidayLogins(year + month);
    }

    public List<DepartmentMonthLoginDto> getDepartmentMonthLogins(String year, String month) {
        return statisticMapper.selectDepartmentMonthLogins(year + month);
    }
}
