package Common;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Doctor;

public class Library {
    public static int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public static String validString(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;

        while (s == null || s.isEmpty() == true) {
            System.out.println(name + ":");

            s = sc.nextLine();
        }
        return s;
    }

    public static String validCode(ArrayList<Doctor> dataDoctor, String promt) {
        String Str = validString(promt);
        for (Doctor doctor : dataDoctor) {
            if (doctor.getIncludeCode().equals(Str) || Str == null) {
                System.out.println("Code is not null or duplicate in the DB");
                validCode(dataDoctor, promt);
            }
        }
        return Str;
    }
}
