package ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    // Connect database for MySQL (XAMPP)
    public static Connection getConnection() {
        Connection cnt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL kết nối đến MySQL qua XAMPP
            String url = "jdbc:mysql://localhost:3307/qlykhohang?useSSL=false&serverTimezone=UTC";

            // Tài khoản mặc định của XAMPP là 'root', không có mật khẩu
            String user = "root";
            String password = "";  // nếu có mật khẩu thì nhập vào đây

            cnt = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ket noi that bai!");
            e.printStackTrace();
        }
        return cnt;
    }
}
