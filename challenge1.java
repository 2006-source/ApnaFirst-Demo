// perform arithmetic operator


import java.util.Scanner;
class challenge1 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=a/b;
        int mod=a%b;
        System.out.println("execute all given airthmetic operations");
        System.out.println("sum "+sum);
        System.out.println("sub "+sub);
        System.out.println("mul "+mul);
        System.out.println("div "+div);
        System.out.println("mod "+mod);

    }
}
