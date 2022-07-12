//20 All armstrong number between rangeJAVA Program to Display Armstrong Number between Two Intervals.

import java.util.Scanner;


public class Interval {
    public static void main(String[] args) {
        int low , high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        low = sc.nextInt();
        System.out.println("Enter Higher limit");
        high = sc.nextInt();

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
                }

            originalNumber = number;


            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
            }
        }
    }

