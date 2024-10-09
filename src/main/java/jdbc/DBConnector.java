package jdbc;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DBConnector {

    private static Statement statement = null;
    private static Connection connection = null;

    @SneakyThrows
    public void getConnection() {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://ec2-34-251-245-108.eu-west-1.compute.amazonaws.com/d53akmn0e4dt6i";

        Properties props = new Properties();
        props.setProperty("user", "exmhrqxutjmulr");
        props.setProperty("password", "4b8b21ed0791483f82ee253c24c830000028914648417df81f24e578954a93ee");
        connection = DriverManager.getConnection(url, props);
    }

    @SneakyThrows
    public Statement getStatement() {
        if (statement == null) {
            statement = connection.createStatement();
        }
        return statement;
    }

    @SneakyThrows
    public void closeStatement() {
        statement.close();
    }

    @SneakyThrows
    public void closeConnection() {
        connection.close();
    }

}
