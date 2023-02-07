import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    private String name;
    private String eventDate;
    private int attendeesCount;
    
    public Event() {}
    
    public Event(String name, String eventDate, int attendeesCount) {
        this.name = name;
        this.eventDate = eventDate;
        this.attendeesCount = attendeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(int attendeesCount) {
        this.attendeesCount = attendeesCount;
    }
}

public class Main {
   public static void main(String[] args) throws ParseException, IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();
        String name,date, attendee;
        int count;

        for (int i = 0; i < n; i++) {            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line=reader.readLine();
            String parts[] = line.trim().split(",");
            for (String data : parts) {
              System.out.println(data);
            }
            name = parts[0].trim();
            date = parts[1].trim();
            attendee = parts[2].trim();
            count = Integer.parseInt(attendee);
            events.add(new Event(name, date, count));
        }
        int[] weekCounts = new int[5];
        for (Event event : events) {
             date = event.getEventDate();
             String substr=date.substring(0, 2);
             int d1=Integer.parseInt(substr);
             if(d1>=1 && d1<=7)
                 weekCounts[0]++;
             else if(d1>=8 && d1<=14)
                 weekCounts[1]++;
             else if(d1>=15 && d1<=21)
                 weekCounts[2]++;
             else if(d1>=22 && d1<=28)
                 weekCounts[3]++;
             else if(d1>=29 && d1<=31)
                 weekCounts[4]++;
        }

        int maxWeek = 0;
        int maxCount = 0;
        for (int i = 0; i < weekCounts.length; i++) {
            if (weekCounts[i] > maxCount) {
                maxWeek = i+1;
                maxCount = weekCounts[i];
            }
        }

        System.out.println("Busy week: " + maxWeek);
    }
}
