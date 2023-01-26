package api.repositories.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnexion {
    public Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";

    private String url = "jdbc:mysql://localhost:3307/db_supportapp?" +
    "useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public MysqlConnexion() {
        if(conn == null) {
            this.getConnection();
        }
    }

    private void getConnection() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.println("Exception: "+ ex.getMessage());
        }
        
    }
    

    
    }
    