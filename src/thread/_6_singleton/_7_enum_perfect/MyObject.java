package thread._6_singleton._7_enum_perfect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class MyObject {
    private enum MyEnumSingleton {
        connectionFactory;
        private Connection connection;

        MyEnumSingleton() {
            System.out.println("创建MyObject对象");
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

        private Connection getConnection() {
            return connection;
        }
    }

    static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
