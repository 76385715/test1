package com.demo;

import lombok.Data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

@Data
public class User {
    private Integer age;
    private String userName;
    private String nickName;



}
