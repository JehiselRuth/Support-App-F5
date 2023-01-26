package api.payloads;

import java.sql.Date;

public class RequestPayload {
private int id;
private String name;
private Date date;
private String event;
private String description;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Date getDate() {
    return date;
}
public void setDate(Date date) {
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
public void setId(int id) {
this.id = id;
}
public int getId() {
    return id;
}
 
}
