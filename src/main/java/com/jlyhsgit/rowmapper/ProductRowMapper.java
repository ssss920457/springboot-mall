package com.jlyhsgit.rowmapper;

import com.jlyhsgit.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();

        product.getProductId(resultSet.getInt("product_id"));
        product.getProductName(resultSet.getString("product_name"));
        product.getCategory(resultSet.getString("category"));
        product.setImageUrl(resultSet.getString("image_url"));
        product.getPrice(resultSet.getInt("price"));
        product.getStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreatedDate(resultSet.getTimestamp("created_date"));
        product.setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
