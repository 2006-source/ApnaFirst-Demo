// product of two floating value


import java.util.Scanner;
public class challenge2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first floating value: ");
        float a= (float)input.nextFloat();
        System.out.print("enter second floating value: ");
        float b= (float)input.nextFloat();
        float product = (float)a*b;
        System.out.println("product of both floating value: "+product);
    }
    
}
