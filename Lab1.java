import java.util.Scanner;

import static java.lang.Math.pow;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;
        double sd = 0;
        int median = 0;

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum is: "+sum);
        
        avg = (double)sum / n;
        System.out.println("Average is: "+avg);
        
        int maxValue = arr[0];
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Maximum is: "+maxValue);
        System.out.println("Minimum is: "+minValue);

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += pow((arr[i] - avg), 2);
        }
        sd = pow((sum2 / n), 0.5);
        System.out.println("Standard deviation is: "+sd);

        int pos = 0;
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            minValue = arr[i];
            pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        median = arr[arr.length/2];
        System.out.println("Median is: "+median);

    }
}
