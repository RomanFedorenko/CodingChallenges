package com.challenge.minutestomidnight;

import java.util.Date;

/**
 * The function minutesToMidnight(d) will take a date object as parameter. Return the number of minutes in the following format:
 *
 * "x minute(s)"
 *
 * You will always get a date object with of today with a random timestamp.
 * You have to round the number of minutes.
 * Milliseconds doesn't matter! *
 *
 * Some examples:
 * 10.00 am => "840 minutes"
 * 23.59 pm => "1 minute"
 * */

public class MinutesToMidnight {
    public String countMinutes(Date d) {
        int minutesToMidnight = 1440 - d.getHours() * 60 - d.getMinutes() - (d.getSeconds() > 0 ? 1 : 0);
        return minutesToMidnight == 1 ? minutesToMidnight + " minute" : minutesToMidnight + " minutes";
    }
}
