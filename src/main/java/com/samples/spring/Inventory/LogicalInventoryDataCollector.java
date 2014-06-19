package com.samples.spring.Inventory;

import java.util.List;

public class LogicalInventoryDataCollector implements IDataCollector {
	
	List<IDataCollector> collectors;

	public Object collectData() {
		System.out.println("Collecting Logical Data");
		for(IDataCollector collector : collectors){
			collector.collectData();
		}
		return null;
	}

	public Object transform() {
		System.out.println("Transfroming Logical Data");
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

}
