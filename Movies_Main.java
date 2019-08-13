package Movie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movies_Main {

    public static void main (String [] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        //create movies
        MovieTheater starWars_ep4 = new MovieTheater("STAR WARS EPISODE 4", "PG", 30, 13.00);
        MovieTheater jurassicPark = new MovieTheater("Jurassic Park", "PG-13", 23, 12.75);
        MovieTheater scoobyDoo2 = new MovieTheater("Scooby-Doo 2: Monsters Unleashed", "PG", 23, 11.75);
        MovieTheater spiderman = new MovieTheater("Spiderman", "PG-13", 23, 10.50);

        for (int i = 0; i < 4; i++) {
            //customer requests movie
            int movieSelection = (int) (Math.random() * 4) + 1;
            MovieTheater movie;
            if (movieSelection == 1) {
                movie = starWars_ep4;
            } else if (movieSelection == 2) {
                movie = jurassicPark;
            } else if (movieSelection == 3) {
                movie = scoobyDoo2;
            } else {
                movie = spiderman;
            }

            System.out.println("\n\nCustomer wants to see " + movie.movieName + "\nThis movie is rated " + movie.movieRating);

            //get tickets
            int ticketsWanted = (int) (Math.random() * 8) + 1;
            System.out.println("Tickets requested: " + ticketsWanted);

            //sell tickets
            movie.seatsLeft -= ticketsWanted;
            double saleMade = movie.ticketPrice * ticketsWanted;

            //close up
            System.out.printf(movie.movieName + " made $" + saleMade);
        }

        System.out.println("\n\nTotal Revenue for " + formatter.format(date));
    }
}
