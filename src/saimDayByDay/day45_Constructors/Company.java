package saimDayByDay.day45_Constructors;

import java.util.Arrays;

public class Company {

    public static void main(String[] args) {

        Employee one = new Employee("Zeynab", 7,"agent", 1_000_000_000);

        System.out.println(one);

        one.goToMeeting();

        Employee [] staff = new Employee[3];
        staff[0] = one;
        staff[1] = new Employee("Nadir", 10, "SDET", 300_000);

        System.out.println(Arrays.toString(staff));

    }
}