package util;

import java.util.Scanner;

public class Distance {
    public double calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 && y1 like: x1 y1");
        String x1y1 = scanner.nextLine();
        System.out.println("Enter x2 && y2 like: x2 y2");
        String x2y2 = scanner.nextLine();
        String[] first = x1y1.split(" ");
        String[] second = x2y2.split(" ");

        int x1 = Integer.parseInt(first[0]);
        int y1 = Integer.parseInt(first[1]);
        int x2 = Integer.parseInt(second[0]);
        int y2 = Integer.parseInt(second[1]);

        return calculateDistanceRecursive(x1, y1, x2, y2);
    }
    private double calculateDistanceRecursive(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 0;
        } else {
            double x2minx1 = (double) x2 - x1;
            double y2miny1 = (double) y2 - y1;
            double distance = Math.sqrt(x2minx1 * x2minx1 + y2miny1 * y2miny1);
            return distance;
        }
    }
}
