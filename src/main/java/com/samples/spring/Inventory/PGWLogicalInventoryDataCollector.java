package com.samples.spring.Inventory;

public class PGWLogicalInventoryDataCollector implements IDataCollector{

	public Object collectData() {
		System.out.println("Collecting PGW Inv Data");
		return null;
	}

	public Object transform() {
		System.out.println("Trnasform PGW Inv Data");
		return null;
	}
}
