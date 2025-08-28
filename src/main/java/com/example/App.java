package com.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java -cp target/meanstddev-1.0-SNAPSHOT.jar com.example.meanstddev.App <inputfile>");
            System.exit(1);
        }

        String filename = args[0];
        MyLinkedList<Double> numbers = new MyLinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) numbers.add(Double.parseDouble(line.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        double mean = Statistics.mean(numbers);
        double stddev = Statistics.stdDev(numbers);

        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Standard Deviation: %.2f%n", stddev);
    }
}