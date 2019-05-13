public class Date {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println("The date is " + this.day + "." + this.month + "." + this.year);
    }
}
