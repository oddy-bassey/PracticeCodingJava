package days_from_now;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class DaysFromNow {

    public static LocalDate calculateHundredDaysFromNow(LocalDate today){

        Period hundredDays = Period.ofDays(100);
        return today.plus(hundredDays);
    }

    public static void main(String[] args){
        /* NOTE:
         * Today can be initialized as LocalDate.now()
         * This will default to the local Date and Time of wherever this code is being run
         * Be aware that it is unsafe || risky because it can change depending on the JVM
         * default zone settings of whatever machine is running this code.
         */
        LocalDate today = LocalDate.now(ZoneId.of("Africa/Lagos"));
        System.out.println("100 days from now is... "+calculateHundredDaysFromNow(today));
    }
}
