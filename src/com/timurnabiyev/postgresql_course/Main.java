package com.timurnabiyev.postgresql_course;
import com.timurnabiyev.postgresql_course.models.Products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://ec2-18-209-78-11.compute-1.amazonaws.com:5432/df2b4qumbjts2c";
        String name = "xaazspofggenfa";
        String password = "b4f5eb1fe9d22fe5f259531e1bf533340460b1d32f7ccdaa48e2c910431f4bdd";


        Products product = new Products();
        Products product2 = new Products();
        
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager
                    .getConnection(url, name, password);
            connection.setAutoCommit(false);

            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM timur.products;");
            while (resultSet.next()) {
               product.setProductId(resultSet.getInt("product_id"));
               product.setProductName(resultSet.getString("product_name"));
               product.setSupplierId(resultSet.getInt("supplier_Id"));
               product.setCategoryId(resultSet.getInt("category_id"));
               product.setQuantityPerUnit(resultSet.getString("quantity_per_unit"));
               product.setUnitPrice(resultSet.getBigDecimal("unit_price"));
               product.setUnitsInStock(resultSet.getInt("units_in_stock"));
               product.setUnitsOnOrder(resultSet.getInt("units_on_order"));
               product.setReorderLevel(resultSet.getInt("reorder_level"));
               product.setDiscontinued(resultSet.getInt("discontinued"));

               if (resultSet.getInt("product_id") == 1) {
                   product2.setProductId(resultSet.getInt("product_id"));
                   product2.setProductName(resultSet.getString("product_name"));
                   product2.setSupplierId(resultSet.getInt("supplier_Id"));
                   product2.setCategoryId(resultSet.getInt("category_id"));
                   product2.setQuantityPerUnit(resultSet.getString("quantity_per_unit"));
                   product2.setUnitPrice(resultSet.getBigDecimal("unit_price"));
                   product2.setUnitsInStock(resultSet.getInt("units_in_stock"));
                   product2.setUnitsOnOrder(resultSet.getInt("units_on_order"));
                   product2.setReorderLevel(resultSet.getInt("reorder_level"));
                   product2.setDiscontinued(resultSet.getInt("discontinued"));
               }
            }
            resultSet.close();
            statement.close();
            connection.close();

            System.out.println("Database closed successfully");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println(product);
        System.out.println(product2);
    }

}
