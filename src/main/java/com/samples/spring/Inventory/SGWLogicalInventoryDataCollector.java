package com.samples.spring.Inventory;

public class SGWLogicalInventoryDataCollector implements IDataCollector{

	public Object collectData() {
		System.out.println("Collecting SGW Inv Data");
		return null;
	}

	public Object transform() {
		System.out.println("Trnasform SGW Inv Data");
		return null;
	}

}
