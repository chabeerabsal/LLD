import java.util.ArrayList;
import java.util.List;
import Enum.*;

public class Theatre {
    int id;
    List<Shows> shows=new ArrayList<>();
    City city;
    List<Screen> screen = new ArrayList<>();
    public int getId() {
        return id;
    }

    public List<Screen> getScreen() {
        return screen;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Shows> getShows() {
        return shows;
    }

    public void setShows(List<Shows> shows) {
        this.shows = shows;
    }

//    public List<Movie> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(List<Movie> movies) {
//        this.movies = movies;
//    }


}
