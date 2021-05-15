package com.project.model.queries;

public class UserQueries {
	public static final String saveUserQuery = "INSERT INTO user(userId,firstName,lastName,birthOfDate,username) VALUES (?,?,?,?,?)";
	public static final String saveUserProductQuery = "INSERT INTO user_product(userId,productId) VALUES (?,?)";
	public static final String updateUserQuery="UPDATE user SET firstName=? , lastName=? , birthOfDate=? , username=? WHERE userId=?";
	public static final String deleteUserProductQuery = "DELETE FROM user_product WHERE userId=?";
	public static final String deleteUserByIdQuery = "DELETE FROM user WHERE userId=?";
	public static final String findUserByIdQuery = "SELECT * FROM user WHERE userId=?";
	public static final String findUsersQuery = "SELECT * FROM user";
	public static final String findUserProductQuery ="SELECT * FROM user u LETF OUTER JOIN user_product up ON(u.userId = up.userId) "
			+ "LEFT JOIN product p ON(up.productId = p.productId) "
			+ "LEFT JOIN category c ON(p.categoryId = c.categoryId) "
			+ "LEFT JOIN brand b ON(p.brandId = b.brandId) "
			+ "WHERE u.userId = ?";

}
