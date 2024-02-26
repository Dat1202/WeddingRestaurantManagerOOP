/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CauHinh {

    public static final Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static boolean isWeekend(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public static int getQuy(LocalDate date) {
        int quy = 0;
        int thang = date.getMonthValue();
        if (thang >= 1 && thang <= 3) {
            quy = 1;
        } else if (thang >= 4 && thang <= 6) {
            quy = 2;
        } else if (thang >= 7 && thang <= 9) {
            quy = 3;
        } else if (thang >= 10 && thang <= 12) {
            quy = 4;
        }
        return quy;
    }
}
