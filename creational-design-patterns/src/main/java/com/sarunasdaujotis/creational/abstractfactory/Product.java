package com.sarunasdaujotis.creational.abstractfactory;

public abstract class Product {

	public abstract String getProductType();

	public abstract String getSku();
	public abstract String getDescription();
	public abstract boolean isAvailable();

	@Override
	public String toString() {
		return "Product{sku=" + getSku()
				+ "description=" + getDescription()
				+ "available=" + isAvailable()
				+ "}";
	}
}
