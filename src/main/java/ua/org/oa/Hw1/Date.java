package ua.org.oa.Hw1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    @Getter
    @Setter
    @Data
    static class Day {


        enum DayOfWeek {
            MONDAY(0),
            TUESDAY(1),
            WEDNESDAY(2),
            THURSDAY(3),
            FRIDAY(4),
            SATURDAY(5),
            SUNDAY(6);

            int index;

            DayOfWeek(int index) {

                this.index = index;
            }

            public static DayOfWeek valueOf(int index) {
                for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                    if (dayOfWeek.index == index)
                        return dayOfWeek;
                }
                throw new IllegalArgumentException("Incorect day");
            }
        }
    }

    public static Day.DayOfWeek getDayOfWeek(int day, int month, int year) {
        int index = ((daysBetween(31, 3, 2018, day, month, year))) % 7;
        return Day.DayOfWeek.valueOf(index);
    }

    public static int daysBetween(int day, int month, int year, int day1, int month1, int year1) {
        int d = 0;
        int days = Month.getDayOfYear(day, month, year) - Month.getDayOfYear(day1, month1, year1);
        days = Math.abs(days);
        if (year != year1) {
            d = 365 * (year - year1);
            d = Math.abs(d);
        }
        for (int i = year; i < year1; i++) {
            if (Year.HighYear(i))
                d = d + 1;
        }
        int daysBeetwen = d + days;
        return daysBeetwen;
    }


    public static class Year {
        int YearNumber;
        public static boolean HighYear;

        public static boolean HighYear(int YearNumber) {


            if (YearNumber % 4 == 0)
                return HighYear = true;
            else return HighYear = false;


        }
    }


    public static class Month {

        public static int getDayOfYear(int day, int month, int year) {
            int days = 0;
            int[] numberOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            month = month - 1;
            for (int i = 0; i < month; i++) {
                days += numberOfDays[i];
            }
            if (Date.Year.HighYear(year)) {
                days = days + day + 1;

                return days;
            } else
                days = days + day;
            return days;
        }

        public static int getDays(int month, int year) {
            int days = 0;
            int[] numberOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            month = month - 1;
            if (Date.Year.HighYear(year)) {
                days += numberOfDays[month] + 1;

                return days;
            } else
                days += numberOfDays[month];

            return days;
        }
    }
}




