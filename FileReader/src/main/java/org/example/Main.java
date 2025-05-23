package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        ActivityAnalyzer analyzer = new ActivityAnalyzer("src/main/resources/activities.csv");
        analyzer.analyze();
    }
}