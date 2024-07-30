package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisticMapper {

    YearCountDto selectYearLogin(String year);

    YearMonthDayCountDto selectYearMonthLogin(String yearMonth);

    YearMonthCountDto selectYearMonthVisitors(String yearMonth);

    YearMonthDayCountDto selectYearMonthDayVisitors(String yearMonthDay);

    AvgDayLoginDto selectAvgDayLogins(String yearMonth);

    NonHolidayDto selectNonHolidayLogins(String yearMonth);

    List<DepartmentMonthLoginDto> selectDepartmentMonthLogins(String yearMonth);
}
