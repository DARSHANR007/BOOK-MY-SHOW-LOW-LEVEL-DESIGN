import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Create_Show {


    public int show_id;

    public int no_shows;

    public int start_time;

    public int end_time;

    public int city_id;

    public String city;

    

    static HashMap<Integer,Create_Show> show_details=new HashMap<>();


    List<String> city_names = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata"));



    public Create_Show(int show_id, int no_shows, int start_time, int end_time, int city_id, String city) {
        this.show_id = show_id;
        this.no_shows = no_shows;
        this.start_time = start_time;
        this.end_time = end_time;
        this.city_id = city_id;
        this.city = city;


        if(city_names.contains(city)){
            show_details.put(show_id, this);
        }
        else{
            System.out.println("City not found. Please enter a valid city name.");
        }

        
    }


    public Create_Show getShow(int show_id) {
        return show_details.get(show_id);
    }





  
    
}
