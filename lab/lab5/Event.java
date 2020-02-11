import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.Serializable;

public class Event implements Serializable//Class is tagged as Serializable
{

    private String name;
    private SimpleDateFormat dateFormat;
    private Date date;
    private String location;
    private String description;

    public Event(String name, String date, String location, String description)
    {
        this.name = name;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        try
        {
            this.date = dateFormat.parse(date);
        }
        catch(ParseException e)
        {
            System.out.println("Date unparseable using" + this.dateFormat);
        }

        this.location = location;
        this.description = description;

    }

    public String getName()
    {
        return this.name;
    }

    public String getDate()
    {
        return this.date.toString();
    }

    public String getLocation()
    {
        return this.location;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String toString()
    {
        String obj = "Name: " + this.getName() + "\nDate: " + this.getDate() + "\nLocation: " + this.getLocation() + "\nDescription: " + this.getDescription();

        return obj;
    }

}
