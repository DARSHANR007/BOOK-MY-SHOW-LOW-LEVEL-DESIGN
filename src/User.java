import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
    String user_name;
    String user_email;
    String user_password;
    String user_phone;   
    int age;
    int user_id;
    String user_city;

    Ticket ticket;
    AddCinema show_details;

    static HashMap<Integer, User> user_list = new HashMap<>(); // user list, people who use app
    static HashMap<String, List<User>> booking_details = new HashMap<>();

    public User(String user_name, String user_email, String user_password, 
               String user_phone, int age, int user_id, String user_city) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.age = age;
        this.user_id = user_id;
        this.user_city = user_city;

        user_list.put(user_id, this);
    }   

    public static User getUser(int user_id) {
        return user_list.get(user_id);
    }

    public void book_show_get_ticket(int id, String user_name, String show_name, String city,int no_of_tickets) {
        if (user_list.containsKey(id) && show_details.city_names.contains(city) && ticket.available_seats > 0) {
            // Get or create the booking list for this show
            List<User> users = booking_details.getOrDefault(show_name, new ArrayList<>());
            users.add(this);
            booking_details.put(show_name, users);
            
            ticket.available_seats-=no_of_tickets;
            Ticket.generate_Ticket();
        }
    }
}