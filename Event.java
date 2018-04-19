
package calendar;

public class Event {
    private String name;
    private Date date;
    private String description;
    private String place;
    private int importance;

    public Event(String name, Date date, String description, String place, int importance) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.place = place;
        this.importance = importance;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
    
}
