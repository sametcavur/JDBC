package com.project.model.queries;

public class BrandQueries {
	public static final String findBrandByIdQuery = "SELECT * FROM brand WHERE brandId = ?";
	public static final String findBrandsQuery = "SELECT * FROM brand";

}
