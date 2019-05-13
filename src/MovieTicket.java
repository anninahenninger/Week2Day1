import java.sql.Time;
import java.util.Date;

public class MovieTicket {

    int price;
    Date date;
    Time time;
    String movie;
    int cinemaHall;

    public MovieTicket(int price, Date date, Time time, String movie, int cinemaHall){
        this.price = price;
        this.date = date;
        this.time = time;
        this.movie = movie;
        this.cinemaHall = cinemaHall;
    }

    public String getAllData(){
        return this.movie + " " + this.date + " " + this.time + " " + this.price + " " + this.cinemaHall;
    }
}
