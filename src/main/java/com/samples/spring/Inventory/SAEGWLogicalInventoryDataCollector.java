package com.samples.spring.Inventory;

public class SAEGWLogicalInventoryDataCollector implements IDataCollector{

	public Object collectData() {
		System.out.println("Collecting SAEGW Inv Data");
		return null;
	}

	public Object transform() {
		System.out.println("Trnasform SAEGW Inv Data");
		return null;
	}
}
