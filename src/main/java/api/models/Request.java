package api.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import api.repositories.mysql.MysqlConnexion;

public class Request {
    private String name;
    private Date date;
    private String event;
    private String description;

    MysqlConnexion repository = new MysqlConnexion();


    String table = "request";

    

    public Request(String name, Date date, String event, String description) {
        this.name = name;
        this.date = date;
        this.event = event;
        this.description = description;
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
        return "request [name=" + name + ", date=" + date + ", event=" + event + ", description=" + description + "]";
    }



    public List<Request> index() {
        try {
            Statement statement = repository.conn.createStatement();
            String sql = String.format("SELECT * FROM %s", table);
            ResultSet rs = statement.executeQuery(sql);

            List<Request> requests = new ArrayList<Request>();

            while (rs.next()) {
                this.event = rs.getString("event");
                this.name = rs.getString("name");
                this.date = rs.getDate("date");
                this.description = rs.getString("description");
                requests.add(this);
            }
            System.out.println(requests);
            return requests;

        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());
            return null;
        }
        
       

    }
  

}
