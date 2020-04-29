package com.collections.gamemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Months> months = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        months.put(1, new Months(1, "January"));
        months.put(2, new Months(2, "February"));
        months.put(3, new Months(3, "March"));
        months.put(4, new Months(4, "April"));
        months.put(5, new Months(5, "May"));
        months.put(6, new Months(6, "June"));
        months.put(7, new Months(7, "July"));
        months.put(8, new Months(8, "August"));
        months.put(9, new Months(9, "September"));
        months.put(10, new Months(10, "October"));
        months.put(11, new Months(11, "November"));
        months.put(12, new Months(12, "December"));

        int loc = 1;
        while (true) {
            System.out.println(months.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            loc = scanner.nextInt();
            if (!months.containsKey(loc)) {
                System.out.println("There is no such month\n");
            }
        }
    }
}
