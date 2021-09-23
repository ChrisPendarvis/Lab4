package com.example.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Utils {
    public static double cube(double x) {

        double v = x * x * x;
        return v;
    }

    public static boolean prime(int y) {
        if (y <= 1)
            return false;

        for (int i = 2; i < y; i++)
            if (y % i == 0)
                return false;

        return true;
    }
    public static int intread() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        return scanner.nextInt();
    }
}

