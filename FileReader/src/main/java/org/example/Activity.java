package org.example;

import com.opencsv.bean.CsvBindByName;

public class Activity {
    @CsvBindByName
    public String start_time;

    @CsvBindByName
    public String activity_name;

    @CsvBindByName
    public int spent_time;
}

