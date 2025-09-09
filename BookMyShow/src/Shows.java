import java.util.List;

public class Shows {
    int showsid;
    Movie movie;
    Screen screen;
    List<Integer> bookedSeats;
    public int getShowsid() {
        return showsid;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setShowsid(int showsid) {
        this.showsid = showsid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Integer> getBookedSeatsIds() {
        return bookedSeats;
    }

    public void setBookedSeatsIds(List<Integer> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }



}
