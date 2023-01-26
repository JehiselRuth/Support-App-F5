package api.models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import api.payloads.RequestPayload;
import api.repositories.mysql.MysqlConnexion;

public class Request {
    private int id;
    private String name;
    private Date date;
    private String event;
    private String description;

    MysqlConnexion repository = new MysqlConnexion();


    String table = "request";

    

    public Request(int id, String name, Date date, String event, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.event = event;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Request() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getdate() {
        return date;
    }

    public void setdate(Date date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "request [id="+ id +" name=" + name + ", date=" + date + ", event=" + event + ", description=" + description + "]";
    }



    public List<Object> index() {

        
        try {
            Statement statement = repository.conn.createStatement();
            String sql = String.format("SELECT * FROM %s", table);
            ResultSet rs = statement.executeQuery(sql);

            List<Object> requests = new ArrayList<>();

            while (rs.next()) {
                RequestPayload request = new RequestPayload();
                request.setId(rs.getInt("id"));  
                request.setName(rs.getString("name"));
                request.setDate(rs.getDate("date"));
                request.setEvent(rs.getString("event"));
                request.setDescription(rs.getString("description"));
                requests.add(request);
            }
            System.out.println(requests);
            return requests;

        } catch (Exception e) {
            System.out.println("Sql Exception: "+ e.getMessage());
            return null; 
        }
        
       

    }
  public RequestPayload save(RequestPayload request) throws SQLException {
    String sql_insert = "INSERT INTO request (id,name,date,event,description) VALUES (?,?,?,?,?)";
    PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
    preparedStatement.setInt(1, request.getId());
        preparedStatement.setString(2, request.getName());
        preparedStatement.setDate(3, request.getDate());
        preparedStatement.setString(4, request.getEvent());
        preparedStatement.setString(5, request.getDescription());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        Statement statement = repository.conn.createStatement();



        String sql = String.format("SELECT * FROM %s ORDER BY date DESC", table);
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            request.setId(rs.getInt("id"));
            request.setName(rs.getString("name"));
            request.setDate(rs.getDate("date"));
            request.setEvent(rs.getString("event"));
            request.setDescription(rs.getString("description"));
        }
return request;
  }

}
