import java.util.List;

public class Shows {
    int showsid;
    Movie movie;
    List<Integer> bookedSeats;
    public int getShowsid() {
        return showsid;
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

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Integer> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }



}
