import java.sql.Time;
import java.util.Date;

public class MovieTicket {

    int price;
    String date;
    String time;
    String movie;
    String cinemaHall;

    public MovieTicket(int price, String date, String time, String movie, String cinemaHall){
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
