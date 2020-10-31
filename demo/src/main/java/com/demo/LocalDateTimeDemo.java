package com.demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {
    public static void main1(String[] args) {
        //获取当前日期
        LocalDate localDateNow = LocalDate.now();
        //获取指定日期
        LocalDate localDate = LocalDate.of(2020, 10, 31);
        //获取年
        int year = localDateNow.getYear(); //得到2020
        int yearInt = localDateNow.get(ChronoField.YEAR); //得到2020
        //获取月
        Month month = localDateNow.getMonth(); //得到OCTOBER
        int monthInt = localDateNow.get(ChronoField.MONTH_OF_YEAR); //得到10
        //获取天
        int dayOfMonth = localDateNow.getDayOfMonth(); //得到31
        int dayOfMonthInt = localDateNow.get(ChronoField.DAY_OF_MONTH); //得到31
        //获取星期
        DayOfWeek dayOfWeek = localDateNow.getDayOfWeek(); //得到SATURDAY
        int dayOfWeekInt = localDateNow.get(ChronoField.DAY_OF_WEEK); //得到6
        //获取天
        int dayOfYear = localDateNow.getDayOfYear(); //得到305
        int dayOfYearInt = localDateNow.get(ChronoField.DAY_OF_YEAR); //得到305

        System.out.println(year);
        System.out.println(yearInt);
        System.out.println("----------------------");
        System.out.println(month);
        System.out.println(monthInt);
        System.out.println("----------------------");
        System.out.println(dayOfMonth);
        System.out.println(dayOfMonthInt);
        System.out.println("----------------------");
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeekInt);
        System.out.println("----------------------");
        System.out.println(dayOfYear);
        System.out.println(dayOfYearInt);
    }

    public static void main2(String[] args) {
        //获取当前时分秒
        LocalTime localTimeNow = LocalTime.now(); //得到21:51:10.974
        //获取指定时分秒
        LocalTime localTime = LocalTime.of(21, 44, 45); //得到21:44:45
        //获取小时
        int hour = localTimeNow.getHour(); //得到21
        int hourInt = localTimeNow.get(ChronoField.HOUR_OF_DAY); //得到21
        //获取分钟
        int minute = localTimeNow.getMinute(); //得到51
        int minuteInt = localTimeNow.get(ChronoField.MINUTE_OF_HOUR); //得到51
        //获取秒钟
        int second = localTimeNow.getSecond(); //得到10
        int secondInt = localTimeNow.get(ChronoField.SECOND_OF_MINUTE); //得到10

        System.out.println(localTimeNow);
        System.out.println(localTime);
        System.out.println("------------------------");
        System.out.println(hour);
        System.out.println(hourInt);
        System.out.println("------------------------");
        System.out.println(minute);
        System.out.println(minuteInt);
        System.out.println("------------------------");
        System.out.println(second);
        System.out.println(secondInt);
        System.out.println("------------------------");

    }

    public static void main3(String[] args) {
        //获取当前日期时间
        LocalDateTime localDateTimeNow = LocalDateTime.now(); //得到2020-10-31T21:59:07.534
        //获取指定时分秒
        LocalTime localTime = LocalTime.of(21, 44, 45); //得到21:44:45
        //获取指定日期
        LocalDate localDate = LocalDate.of(2020, 10, 31);
        //获取指定日期时间
        //得到 2020-10-31T21:44:45
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.OCTOBER, 31, 21, 44, 45);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime); //得到2020-10-31T21:44:45
        LocalDateTime localDateTime3 = localDate.atTime(localTime); //得到2020-10-31T21:44:45
        LocalDateTime localDateTime4 = localTime.atDate(localDate); //得到2020-10-31T21:44:45
        // 获取LocalDate
        LocalDate localDate2 = localDateTimeNow.toLocalDate(); //得到2020-10-31
        // 获取LocalTime
        LocalTime localTime2 = localDateTimeNow.toLocalTime(); //得到22:00:38.480

        System.out.println(localDateTimeNow);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
        System.out.println(localDate2);
        System.out.println(localTime2);
    }

    public static void main4(String[] args) {
        // 2020-10-31T22:11:50.605
        LocalDateTime localDateTime = LocalDateTime.now();
        //增加一年 得到2021-10-31T22:11:50.605
        LocalDateTime localDateTimeAfter1Year = localDateTime.plusYears(1);
        LocalDateTime localDateTimeAfter1Year2 = localDateTime.plus(1, ChronoUnit.YEARS);
        //减少两个月 得到2020-08-31T22:11:50.605
        LocalDateTime localDateTimeBefore2Month = localDateTime.minusMonths(2);
        LocalDateTime localDateTimeBefore2Month2 = localDateTime.minus(2, ChronoUnit.MONTHS);

        System.out.println(localDateTimeAfter1Year);
        System.out.println(localDateTimeAfter1Year2);
        System.out.println(localDateTimeBefore2Month);
        System.out.println(localDateTimeBefore2Month2);
    }

    public static void main5(String[] args) {
        //初始化时间1 LocalDateTime的of方法最少是年月日时分可以不加秒啥的
        LocalDateTime localDateTime1 = LocalDateTime.of(1993, 5, 19, 1, 53, 15);
        //初始化时间2
        LocalDateTime localDateTime2 = LocalDateTime.of(1995, 8, 27, 13, 25, 45);
        //localDateTime1是否在localDateTime2之前
        boolean isBefore = localDateTime1.isBefore(localDateTime2); //得到true
        //localDateTime1是否在localDateTime2之后
        boolean isAfter = localDateTime1.isAfter(localDateTime2);  //得到false
        //localDateTime1是否等于localDateTime2
        boolean isEqual = localDateTime1.isEqual(localDateTime2);  //得到false

        System.out.println(isBefore);
        System.out.println(isAfter);
        System.out.println(isEqual);

    }

    public static void main(String[] args) {
        //初始化时间
        LocalDateTime localDateTime = LocalDateTime.now();
        //得到 20201101
        String basicFormat = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
        //得到 2020-11-01
        String isoFormat = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        //自定义格式化 yyyy/MM/dd HH:mm:ss
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //得到 2020/11/01 01:11:42
        String customizeFormat1 = localDateTime.format(dateTimeFormatter1);
        //自定义格式化 yyyy-MM-dd
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //得到 2020-11-01
        String customizeFormat2 = localDateTime.format(dateTimeFormatter2);

        System.out.println(basicFormat);
        System.out.println(isoFormat);
        System.out.println(customizeFormat1);
        System.out.println(customizeFormat2);


    }
}
