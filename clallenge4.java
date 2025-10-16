//calculate compound intrest

import java.util.Scanner;
public class clallenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter value of P: ");
        int P= input.nextInt();
        System.out.print("enter value of R: ");
        float R= input.nextFloat();
        System.out.print("enter value of t: ");
        int t= input.nextInt();
        double SI= P*Math.pow((1+(R/100)),(t));
        System.out.println("simple intrest is: "+SI);

    }
    
}
