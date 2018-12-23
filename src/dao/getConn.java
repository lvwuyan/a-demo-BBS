package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getConn {
    public static Connection getConn() {

        //连接数据库
        String driver = "";
        String url = "";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            System.out.println("Connecting to database.....v");
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
