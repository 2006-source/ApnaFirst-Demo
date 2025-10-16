//calculate parameter of ractangle P=A+B+C+D

import java.util.Scanner;
public class challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int A= input.nextInt();
        System.out.print("B: ");
        int B= input.nextInt();
        System.out.print("C: ");
        int C= input.nextInt();
        System.out.print("D: ");
        int D= input.nextInt();
        //perimeter of ractangle is denoted by P
        int P = A+B+C+D;
        System.out.println("perimeter of ractangle is "+ P);

    }
}
