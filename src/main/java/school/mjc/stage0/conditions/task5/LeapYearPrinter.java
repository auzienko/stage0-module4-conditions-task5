package school.mjc.stage0.conditions.task5;

import org.w3c.dom.ls.LSOutput;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(
                year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "leap" : "not leap"
        );
    }
}
