package com.project.model;

public class Category {

	private int categoryID;
	
	private String categoryName;

	public Category() {}
	public Category(int categoryID, String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryID;
	}
	public void setCategoryId(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}
}
