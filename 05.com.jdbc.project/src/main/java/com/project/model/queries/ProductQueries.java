package com.project.model.queries;

public class ProductQueries {
	public static final String saveProductQuery = "INSERT INTO product(productId,productName,unitPrice,available,addDate,updateDate,categoryId,brandIdVALUES (?,?,?,?,?,?,?,?)";
	public static final String updateProductQuery ="UPDATE product SET productName=?,unitPrice=?,available=?,updateDate=?,categoryId=?,brandId=?";
	public static final String deleteUserProductQuery ="DELETE FROM user_product WHERE productId = ?";
	public static final String deleteProductQuery= "DELETE FROM product WHERE productId = ?";
	public static final String findProductById= " SELECT * FROM product WHERE productId=?";
	public static final String findProduct = "SELECT * FROM product";
}
