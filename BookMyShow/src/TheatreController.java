import Enum.*;

import java.util.*;

public class TheatreController {
    Map<City,List<Theatre>> theatreAvailbleinCity;
    List<Theatre> allTheatre;

    public TheatreController() {
        theatreAvailbleinCity = new HashMap<>();
        allTheatre = new ArrayList<>();
    }
    public void addTheatre(Theatre theatre,City city){
        allTheatre.add(theatre);
        List<Theatre> theatres=theatreAvailbleinCity.getOrDefault(city,new ArrayList<>());
        theatreAvailbleinCity.put(city,theatres);
    }
    Map<Theatre,List<Shows>> getAllShow(Movie movie,City city) {
        List<Theatre> theatres=theatreAvailbleinCity.get(city);
        Map<Theatre,List<Shows>> map=new HashMap<>();
        for(Theatre theatre:theatres){
            List<Shows> showslist=new ArrayList<>();
            List<Shows> shows=theatre.getShows();
            for(Shows show:shows){
                if(show.getMovie().getMovieName()==movie.getMovieName()){
                    showslist.add(show);
                }
            }
            if(showslist.size()>0){
                map.put(theatre,showslist);
            }
        }
        return map;
    }
}
