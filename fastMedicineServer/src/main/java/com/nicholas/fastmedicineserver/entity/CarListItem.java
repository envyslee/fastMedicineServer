package com.nicholas.fastmedicineserver.entity;

public class CarListItem {

	private String pharmacy;//药店名称
	
	private ProductListItem productListItem;

	public String getPharmacy() {
		return pharmacy;
	}

	public void setPharmacy(String pharmacy) {
		this.pharmacy = pharmacy;
	}

	public ProductListItem getProductListItem() {
		return productListItem;
	}

	public void setProductListItem(ProductListItem productListItem) {
		this.productListItem = productListItem;
	}
	
	
}
