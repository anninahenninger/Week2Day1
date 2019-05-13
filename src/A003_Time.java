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

        
    }
}
