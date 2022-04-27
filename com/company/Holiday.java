package com.company;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static boolean inSameMonth(Holiday firstHoliday, Holiday otherHoliday) {
        return firstHoliday.month.equalsIgnoreCase(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        double avg = 0;
        for (Holiday holiday : holidays) {
            avg += holiday.day;
        }
        return avg / holidays.length;
    }
}