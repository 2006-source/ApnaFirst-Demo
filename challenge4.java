//calculate the area of tringle "A"

import java.util.Scanner;
public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("B: ");
        int B = input.nextInt();
        System.out.print("H: ");
        int H = input.nextInt();
        float A=(B*H)/2;
        System.out.println("area of tringle is : "+A);

    }
}
