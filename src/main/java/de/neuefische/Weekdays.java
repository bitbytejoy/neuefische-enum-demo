package de.neuefische;

public enum Weekdays {
    MONDAY("Mo"),
    TUESDAY("Di"),
    WEDNESDAY("Mi"),
    THURSDAY("Do"),
    FRIDAY("Fr"),
    SATURDAY("Sa"),
    SUNDAY("So");

    private final String abbreviation;

    Weekdays(String abbr) {
        this.abbreviation = abbr;
    }

    public static Weekdays of(String day) {
        if (day.equals("Mo")) {
            return Weekdays.MONDAY;
        } else if (day.equals("Di")) {
            return Weekdays.TUESDAY;
        } else if (day.equals("Mi")) {
            return Weekdays.WEDNESDAY;
        } else if (day.equals("Do")) {
            return Weekdays.THURSDAY;
        } else if (day.equals("Fr")) {
            return Weekdays.FRIDAY;
        } else if (day.equals("Sa")) {
            return Weekdays.SATURDAY;
        }

        return Weekdays.SUNDAY;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }
}
