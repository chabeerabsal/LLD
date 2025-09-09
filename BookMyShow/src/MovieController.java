import java.util.*;
import Enum.*;

public class MovieController {
    Map<City, List<Movie>> movieMap= new HashMap<City, List<Movie>>();
    List<Movie> totalmovies;

    public void addMovie(Movie movie,City city) {
        totalmovies.add(movie);
        List<Movie> citymovie=movieMap.getOrDefault(city,new ArrayList<>());
        citymovie.add(movie);
        movieMap.put(city,citymovie);
    }

    Movie getMovieByName(String movieName) {
        for(Movie movie:totalmovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;

    }

    List<Movie> getMoviesByCity(City city) {
        return movieMap.get(city);
    }


}
