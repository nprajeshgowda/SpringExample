package com.samples.spring.Inventory;

public class PhysicalInvenrtoryDataCollector implements IDataCollector{

	public Object collectData() {
		System.out.println("Collecting Physical Inv Data");
		return null;
	}

	public Object transform() {
		System.out.println("Transforming Physical Inv Data");
		return null;
	}

}
