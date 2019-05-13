/**
 * Create Time class
 *
 *     Holding information about hour, minutes and seconds. Create 4 instances of this class.
 *
 *     Add printTime() method that writes in console the time in format Time is 12 hours, 23 minutes and 6 seconds.
 *
 *     Store those Objects in an array of Objects. Create a for loop that is calling printTime() in the loop.
 *
 *     Create Date class that also has a method printDate. What are the fields that you need?
 *
 *     ADVANCED: Create a method addSeconds(int seconds) for the  Time class that is adding the seconds correctly
 *     (meaning, if seconds are added, and you have more than 60 seconds, you need to update the minutes accordingly.
 *     Discuss with group.
 *
 *     ADVANCED: Improve previous solution by taking care of the hours as well. Discuss with group.
 */
public class A003_Time {

    public static void main(String[] args){
        Time t1 = new Time(12,34,55);
        Time t2 = new Time(3,59,58);
        Time t3 = new Time(7,11,23);
        Time t4 = new Time(0,55,34);


       /* t1.printTime();
        t1.addSeconds(2);
        t1.printTime();
        t1.addSeconds(2);
        t1.printTime();
        t1.addSeconds(2);
        t1.printTime();

        */
        Time t5 = new Time(1, 2, 3);
       t5.printTime();
       t5.addSeconds(121);
       t5.printTime();


/*
        int seconds = 15;
        int second = seconds % 60;
        int minute = seconds / 60;

        System.out.println("Minutes: " + minute + " Seconds: " + second);

     */


/*
        Time[] times = {t1, t2, t3, t4};

        for(int i = 0; i < times.length; i++) {
            times[i].printTime();
        }

        Date d1 = new Date(13, 11, 1990);
        Date d2 = new Date(16, 2, 82);
        Date d3 = new Date(29, 3, 78);

        d1.printDate();
       */

        
    }
}
