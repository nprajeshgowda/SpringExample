package com.mytest.common;

import java.util.ArrayList;

public class InventoryDataCollector {
	
	private static int count = 0;
	
	private ArrayList<InventoryCollector> collectors;
	
	public InventoryDataCollector() {
		count++;
		System.out.println("Constructor in PrototypeTester_1, Count is :" + count);
	}

	public ArrayList<InventoryCollector> getCollectors() {
		return collectors;
	}

	public void setCollectors(ArrayList<InventoryCollector> collectors) {
		this.collectors = collectors;
	}

}
