package com.demo.comentoStatistic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.comentoStatistic.dao")
public class StatisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticApplication.class, args);
	}

}
