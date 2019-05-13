/**
 * Create a class MovieTicket for a cineplex-like movie theater.
 *
 *     This class holds following information:
 *
 *                 Price
 *                 Date
 *                 Time
 *                 Movie
 *                 cinema hall (1-10)
 *
 *
 *     Create four  MovieTicket objects and store them in properties.
 *
 *     Create get and set methods accessing the movie ticket properties.
 *
 *     Now, calculate and store in a variable the total price of all created MovieObjects. Discuss with the group.
 */
public class A001_MovieTicket {

    public static void main(String[] args){

        int totalPrice = 0;

        MovieTicket m1 = new MovieTicket(20, "2020/02/13", "20:00", "The Grinch", "A2");
        MovieTicket m2 = new MovieTicket(16, "2020/02/14", "15:00", "Winnie Puh", "C1");
        MovieTicket m3 = new MovieTicket(19, "2020/02/16", "18:00", "The Wave", "A3");
        MovieTicket m4 = new MovieTicket(24, "2020/02/17", "19:30", "End Game", "B2");

        MovieTicket[] tickets = {m1, m2, m3, m4};

        for(int i=0; i<tickets.length; i++){
            totalPrice += tickets[i].price;
        }
        System.out.println(totalPrice);
    }
}
