package com.proje.entity;

public enum Gunler {
	Pazartesi("Pazartesi"),
	Sal�("Sal�"),
	�ar�amba("�ar�amba"),
	Per�embe("Per�embe"),
	Cuma("Cuma"),
	Cumartesi("Cumartesi"),
	Pazar("Pazar");
private final String label;
private Gunler(String label) {
	this.label=label;
}
public String getLabel() {
	return this.label;
}
	
}
