import java.sql.*;
import java.util.Scanner;

public class SQLsecond {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String name = "root";
        String password = "root";
        String URL = "jdbc:mysql://localhost:3306/mysql?userSSL=false";
        try (Connection connection = DriverManager.getConnection(URL, name, password)) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE  world.ordersInStock ( id int, status char(30),  price int, itemPlace  char(30))");
            System.out.println("Insert id, status, price and placeId ");
            Scanner scanner = new Scanner((System.in));
            int id = scanner.nextInt();
            String status = scanner.next();
            int price = scanner.nextInt();
            int itemPlace = scanner.nextInt();

            statement.execute("INSERT INTO world.ordersInStock values ('" + id + "', '" + status + "', '" + price + "','" + itemPlace + "')");
            ResultSet resultSet = statement.executeQuery("SELECT  * from world.ordersInStock where id = '" + id + "'");
        }
    }
}

