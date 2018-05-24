package thread._6_singleton._6_enum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

enum MyObject {
    connectionFactory;
    private Connection connection;

    MyObject() {
        System.out.println("调用了MyObject的构造");
        String url = "jdbc:mysql://172.16.5.20:3306/ksp?useSSL=false";
        String userName = "ksp";
        String password = "ksp%123";
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        return connection;
    }
}
