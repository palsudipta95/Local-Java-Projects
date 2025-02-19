import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName = sc.next();
        System.out.println("Enter your lover's name: ");
        String loverName = sc.next();

        int pert = (int)(Math.random()*100);
        System.out.println(loverName+" loves "+pert+"% to "+myName);

    }
}