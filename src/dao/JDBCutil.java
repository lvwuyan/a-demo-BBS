package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
    private static String DB_URL ="jdbc:mysql://localhost:3306/BBS?user=root&password=password&serverTimezone=UTC&useSSL=false";
    private static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("连接数据库异常");
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
