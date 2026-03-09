package EasyQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl",
                    "prathamesh",
                    "prathamesh");
                 Scanner sc = new Scanner(System.in);
                 PreparedStatement ps = con.prepareStatement(
                         "select * from emp where id = ?")) {

                int id = sc.nextInt();
                ps.setInt(1, id);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        System.out.println(
                            "Eid: " + rs.getInt(1) +
                            " NAME: " + rs.getString(2) +
                            " SAL: " + rs.getInt(3)
                        );
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
