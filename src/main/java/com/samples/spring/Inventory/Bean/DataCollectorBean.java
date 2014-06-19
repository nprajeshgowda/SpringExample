package com.samples.spring.Inventory.Bean;

import java.util.List;

import com.samples.spring.Inventory.IDataCollector;

public class DataCollectorBean implements IDataCollector{
	
	List<IDataCollector> collectors;
	
	RouteBean routeBean;

	public Object collectData() {
		System.out.println("Collecting Inv Data");
		for(IDataCollector collector : collectors){
			collector.collectData();
		}
		return null;
	}

	public Object transform() {
		System.out.println("Transfroming Inv Data");
		for(IDataCollector collector : collectors){
			collector.transform();
		}
		return null;
	}

	public List<IDataCollector> getCollectors() {
		return collectors;
	}

	public void setCollectors(List<IDataCollector> collectors) {
		this.collectors = collectors;
	}

	public RouteBean getRouteBean() {
		return routeBean;
	}

	public void setRouteBean(RouteBean routeBean) {
		this.routeBean = routeBean;
	}

	

}
