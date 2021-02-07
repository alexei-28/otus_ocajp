package ru.otus.ocajp.webinar21;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

// Создание и манипуляция календарными датами
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#21.\nJDK: " + System.getProperty("java.version"));

        LocalDate ld = LocalDate.of(2015, Month.APRIL, 12);
        ld.plusDays(10);
        System.out.println("ld = " + ld); // 2015-04-12, LocalDateXXX is immutable classes

        LocalDate ld2 = LocalDate.of(2015, Month.APRIL, 12);
        ld2 = ld.plusMonths(2).plusDays(10);
        System.out.println("ld2 = " + ld2); // 2015-06-22

        //LocalDate ld = LocalDate.of(2015, Month.APRIL, 32); // throw DateTimeException

        LocalTime lt = LocalTime.NOON.plusMinutes(120);
        System.out.println("lt = " + lt); // 14:00

        LocalDate ld3 = LocalDate.of(2020, 1, 30);
        //ld3.plusMinutes(120); // compile error

        Period period = Period.of(1, 0, 7); // every year and 7 days
        System.out.println("period = " + period); // "P1Y7D"

        LocalDate ld4 = LocalDate.of(1, 1, 1).plus(Period.of(2009, 7, 12));
        System.out.println("ld4 = " + ld4); // 2010-08-13

        LocalDate ld5 = LocalDate.of(0, 10, 21);
        System.out.println("ld5 = " + ld5); // 0000-10-21

        Period period1 = Period.of(2, 4, 8);
        System.out.println(period1); // P2Y4M8D

        Period period123Y = period1.withYears(123);
        System.out.println("period123Y = " + period123Y); // P123Y4M8D

        Period period2 = period1.withMonths(7);
        // isNegative() - Checks if any of the three units(y,M,d) of this period are negative.
        System.out.println("period2 = " + period2 + ", isNegative = " + period2.isNegative()); // P2Y7M8D, isNegative = false

        Period period3 = period1.withMonths(-7);
        // isNegative() - Checks if any of the three units(y,M,d) of this period are negative.
        System.out.println("period3 = " + period3 + ", isNegative = " + period3.isNegative()); // P2Y-7M8D, isNegative = true


        Period period15D = period1.withDays(15);
        System.out.println("period15D = " + period15D); // P2Y4M15D

        Period periodPlusDays15 = period1.plusDays(15);
        System.out.println("periodPlusDays15 = " + periodPlusDays15); // P2Y4M23D

        Period periodParse = Period.parse("P2Y4M23D");
        System.out.println("periodParse = " + periodParse); // P2Y4M23D

        Period periodTest = Period.ofDays(1);
        System.out.println("periodTest = " + periodTest); // P1D

        Period periodTest2 = Period.ofDays(1).ofMonths(34); // Period does not allow chaining. Only the last Period method called counts
        System.out.println("periodTest2 = " + periodTest2); // P34M

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        LocalDate localDate = LocalDate.of(2021, 10, 30);
        String dateStr = localDate.format(dtf);
        System.out.println("dateStr = " + dateStr); // 2021-10-30

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate localDate2 = LocalDate.of(2021, 10, 30);
        String dateStr2 = localDate2.format(dtf2);
        System.out.println("dateStr2 = " + dateStr2); // 2021-10-30

        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDate localDate3 = LocalDate.of(2021, 10, 30);
        //String dateStr3 = localDate3.format(dtf3); // error UnsupportedTemporalTypeException
        //System.out.println("dateStr3 = " + dateStr3); // 2021-10-30

        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.of(2021, 10, 30, 13, 56);
        String dateStr4 = localDateTime.format(dtf4);
        System.out.println("dateStr4 = " + dateStr4); // 2021-10-30T13:56:00

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String dateStr5 = localDateTime.format(dateTimeFormatter);
        System.out.println("dateStr5 = " + dateStr5); // 10/30/21 1:56 PM

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalTime localTime = LocalTime.of(10, 56);
        //String dateStr6 = localTime.format(dateTimeFormatter2); // // error UnsupportedTemporalTypeException
        //System.out.println("dateStr6 = " + dateStr6); // 1:56 PM

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        LocalTime localTime2 = LocalTime.of(20, 56);
        String dateStr7 = localTime2.format(dateTimeFormatter3);
        System.out.println("dateStr7 = " + dateStr7); // 8:56 PM

        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate localDate8 = LocalDate.of(2021, 1, 27);
        String dateStr8 = localDate8.format(dateTimeFormatter4);
        System.out.println("dateStr8 = " + dateStr8); // 1/27/21

        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        LocalDateTime localDate5 = LocalDateTime.of(2021, 1, 27, 12, 42);
        String dateTimeStr6 = localDate5.format(dateTimeFormatter5);
        System.out.println("dateTimeStr6 = " + dateTimeStr6); // 12:42 PM

        DateTimeFormatter dateTimeFormatter9 = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm");
        LocalDateTime ldt9 = LocalDateTime.parse("27.01.2021 14:45", dateTimeFormatter9);
        System.out.println("ldt9 = " + ldt9); // 2021-01-27T14:45

        //LocalDateTime ldt10 = LocalDateTime.parse("27.01.202", dateTimeFormatter9);  // throw DateTimeParseException
        //System.out.println("ldt10 = " + ldt10);

        // By default use DateTimeFormatter.ISO_LOCAL_DATE (yyyy-MM-dd)
        //LocalDate ld11 = LocalDate.parse("27.01.202T10:12"); // throw DateTimeParseException
        //System.out.println("ld11 = " + ld11);

        // By default use DateTimeFormatter.ISO_LOCAL_TIME (HH:mm:ss)
        //LocalTime lt12 = LocalTime.parse("11:2");  // throw DateTimeParseException (2 digits for hours and minutes)
        //System.out.println("lt12 = " + lt12); //

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' HH:mm:ss");

        LocalDate localDate1 = LocalDate.parse("01/29/2015 at 00:15:30", dateTimeFormatter1);
        System.out.println("localDate1 = " + localDate1 + " -> isLeapYear = " + localDate1.isLeapYear());
        System.out.println("localDate1 = " + localDate1); // 2015-01-29

        LocalTime localTime1 = LocalTime.parse("01/29/2015 at 00:15:30", dateTimeFormatter1);
        System.out.println("localTime1 = " + localTime1); // 00:15:30

        LocalDateTime ldt13 = LocalDateTime.of(2021, Month.APRIL, 22, 14, 34);
        //System.out.println("isLeapYear = " + ldt13.isLeapYear()); // compile error
        LocalDateTime ldt14 = LocalDateTime.of(2021, Month.APRIL, 22, 14, 34);
        System.out.println("ldt13 == ldt14: " + ldt13.equals(ldt14)); // true

        LocalTime lt15 = LocalTime.MAX;
        System.out.println("lt15 = " + lt15); // 23:59:59.999999999

        LocalDate ld16 = LocalDate.MAX;
        System.out.println("ld16 =  " + ld16); // +999999999-12-31

        LocalDate ld17 = LocalDate.of(2015, 3, 22);
        //ld17 = ld17.withYear(13); // Returns a copy of this LocalDate with the year altered -> 0013-03-22
        ld17.withMonth(1); // LocalDate is IMMUTABLE. As result date not change
        // LocalDate.getMonth() method returns a Month enum constant
        System.out.println("ld17 = " + ld17.getYear() + "|" + ld17.getMonth() + "|" + ld17.getDayOfMonth()); // 2015|MARCH|22

        LocalDate ld18 = LocalDate.of(2021, 1, 12);
        LocalDate ld19 = LocalDate.of(2021, 2, 12);
        System.out.println(ld18.isAfter(ld19)); // false
        System.out.println(ld18.isBefore(ld19)); // true

        // between - Obtains a Period consisting of the number of years, months, and days between two dates. Return Period
        System.out.println(Period.between(ld18, ld19).isNegative()); // false

        // until - Calculates the period between this date and another date as a Period. Return Period
        System.out.println(ld18.until(ld19).isNegative()); // false


    }
}
