package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Weekdays weekdays = Weekdays.MONDAY;
        System.out.println(weekdays.getAbbreviation());
        System.out.println(weekdays == Weekdays.MONDAY);

        Weekdays weekday = Weekdays.of("Mo");
        Weekdays w = Weekdays.valueOf("MONDAY");
        System.out.println(weekday);
        System.out.println(w);
    }
}