package com.project.model.queries;

public class CategoryQueries {
	public static final String findCategoryByIdQuery = "SELECT * FROM category WHERE categoryId = ?";
	public static final String findCategoriesQuery = "SELECT * FROM category";

}
