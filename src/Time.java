public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void printTime() {
        System.out.println("The time is " + this.hours + " hours, " + this.minutes + " minutes and " + this.seconds + " seconds.");
    }


    public void addSeconds(int seconds) {

        int addSec = seconds % 60;
        int addMin = seconds / 60;

       this.seconds = this.seconds + addSec;
       this.minutes = this.minutes + addMin;

    }



    public void numberOfSec() {
       int timeInSec = (this.hours * 60 * 60) + (this.minutes * 60) + this.seconds;


        System.out.println(timeInSec);
    }





}
