package com.samples.spring.Inventory.Bean;

public class RouteBean {
	private String user;
	private String password;
	private String hostname;
	private String comURI;
	private String inventoryQueueProps;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getComURI() {
		return comURI;
	}
	public void setComURI(String comURI) {
		this.comURI = comURI;
	}
	public String getInventoryQueueProps() {
		return inventoryQueueProps;
	}
	public void setInventoryQueueProps(String inventoryQueueProps) {
		this.inventoryQueueProps = inventoryQueueProps;
	}

}
