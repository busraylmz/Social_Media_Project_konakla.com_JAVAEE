package com.proje.entity;

public enum Paylas�lacakBolum 
{
	Oda("Oda"),
	Yatak("Yatak"),
	Koltuk("Koltuk");
	private final String label;
	private Paylas�lacakBolum(String label) {
		this.label=label;
	}
	public String getLabel() {
		return this.label;
	}
	
	

}
