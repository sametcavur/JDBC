package com.project.model;

import java.util.Date;

public class Product {
	private int productId;
	private String productName;
	private double unitPrice;
	private int available;
	private Date addDate;
	private Date updateDate;
	private Category categoryId;
	private Brand brandId;
	
	public Product() {}

	public Product(int productId, String productName, double unitPrice, int available, Date addDate, Date updateDate,
			Category categoryId, Brand brandId) {
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.available = available;
		this.addDate = addDate;
		this.updateDate = updateDate;
		this.categoryId = categoryId;
		this.brandId = brandId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Brand getBrandId() {
		return brandId;
	}

	public void setBrandId(Brand brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice
				+ ", available=" + available + ", addDate=" + addDate + ", updateDate=" + updateDate + ", categoryId="
				+ categoryId + ", brandId=" + brandId + "]";
	}
	
	
	
	
}