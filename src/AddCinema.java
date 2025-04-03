import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AddCinema {


   static HashMap<Integer,AddCinema> cineama_list=new HashMap<>();


    public  String show_name;
    public int show_id;
    public int show_duration;
    
    List<String> city_names = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata"));

    public int show_times;
    public int row_size;
    public int column_size;

    

    public AddCinema(String show_name,int show_id, int show_duration, int show_times,int row_size,int column_size){
        this.show_name=show_name;
        this.show_id=show_id;
        this.show_duration=show_duration;
        this.show_times=show_times;
        cineama_list.put(show_id, this);

    }


    public AddCinema  getCinema(int show_id){
        return cineama_list.get(show_id);


    }


    
}
