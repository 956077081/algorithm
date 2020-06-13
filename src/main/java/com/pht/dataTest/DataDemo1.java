package com.pht.dataTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DataDemo1 {
    public static void main(String[] args)   {
//        Date da= new Date();
//        System.out.println( da.toString());
//        String data ="2020-03-12 23:00:45";
//        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(da));
//        Date data1 =simpleDateFormat.parse(data);
//        System.out.println(data1.getSeconds());
        LocalDate local = LocalDate.of(2012,6,12);
        System.out.println(local.getDayOfWeek());
        LocalDateTime localdatatime = LocalDateTime.now();
        SimpleDateFormat sf =new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter ss =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localdatatime.format(ss));
        LinkedBlockingQueue  as =new LinkedBlockingQueue();
        Set set =new HashSet();
        set.add(null);
        set.add(null);
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        for (Object  o :list){
            System.out.println(o);
        }
    }
}
