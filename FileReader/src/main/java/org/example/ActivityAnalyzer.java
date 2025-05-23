package org.example;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ActivityAnalyzer {

    public List<Activity> activities;

    public ActivityAnalyzer(String filePath) throws Exception {
        FileReader reader = new FileReader(filePath);
        CsvToBean<Activity> csvToBean = new CsvToBeanBuilder<Activity>(reader)
                .withType(Activity.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        activities = csvToBean.parse();
    }

    public void analyze() {
        System.out.println("1) Activities: " + activities.size());

        List<Integer> times = activities.stream()
                .map(a -> a.spent_time)
                .collect(Collectors.toList());

        int min = Collections.min(times);
        int max = Collections.max(times);
        double avg = times.stream().mapToInt(i -> i).average().orElse(0);
        int total = times.stream().mapToInt(i -> i).sum();

        System.out.println("2) Statystyki wszystkich aktywności:");
        System.out.println("a) Najkrótsze: " + min + " min");
        System.out.println("b) Najdłuższe: " + max + " min");
        System.out.println("c) Średnia na aktywność: " + avg + " min");
        System.out.println("d) Łączny czas pracy: " + total / 60 + " h");

        Set<Integer> facebookHours = activities.stream()
                .filter(a -> a.activity_name.toLowerCase().contains("facebook"))
                .map(a -> LocalDateTime.parse(a.start_time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).getHour())
                .collect(Collectors.toSet());

        System.out.println("3) Godziny na Facebooku: " + facebookHours);

        Map<Integer, Integer> hourWorkMap = new HashMap<>();
        for (Activity a : activities) {
            int hour = LocalDateTime.parse(a.start_time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).getHour();
            hourWorkMap.put(hour, hourWorkMap.getOrDefault(hour, 0) + a.spent_time);
        }

        int maxHour = Collections.max(hourWorkMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maxTime = hourWorkMap.get(maxHour);

        System.out.println("4) Najbardziej intensywna godzina: " + maxHour + " (Pracowano: " + maxTime / 60 + " h " + maxTime % 60 + " min)");
    }
}
