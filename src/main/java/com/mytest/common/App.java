package com.mytest.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.spring.Inventory.IDataCollector;
import com.samples.spring.Inventory.Bean.DataCollectorBean;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		DataCollectorBean invCollector = (DataCollectorBean) context.getBean("invDataCollectorBean");

		System.out.println(invCollector.getRouteBean());
		
		for(IDataCollector collector : invCollector.getCollectors()){
			collector.collectData();
			collector.transform();
		}

	}
}
