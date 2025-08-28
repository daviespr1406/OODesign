package com.example;

import com.example.MyLinkedList;

public class Statistics {

    public static double mean(MyLinkedList<Double> data) {
        if (data.size() == 0) throw new IllegalArgumentException("Empty dataset");
        double sum = 0.0;
        for (Double d : data) sum += d;
        return sum / data.size();
    }

    public static double stdDev(MyLinkedList<Double> data) {
        if (data.size() < 2) throw new IllegalArgumentException("At least 2 elements required");
        double mean = mean(data);
        double sum = 0.0;
        for (Double d : data) {
            sum += Math.pow(d - mean, 2);
        }
        return Math.sqrt(sum / (data.size() - 1));
    }
}
