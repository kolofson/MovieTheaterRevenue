package Movie;

public class MovieTheater {

    String movieName, movieRating;
    int seatsLeft;
    double ticketPrice;


    public MovieTheater(String movieName, String movieRating, int seatsLeft, double ticketPrice) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.seatsLeft = seatsLeft;
        this.ticketPrice = ticketPrice;
    }

    public int GetSeatsLeft() {
        return this.seatsLeft;
    }

    public void SeatsTaken(int ticketsSold) {
        this.seatsLeft -= ticketsSold;
    }
}
