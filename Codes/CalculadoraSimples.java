import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite X:");
        int x = scanner.nextInt();
        System.out.println("Digite Y:");
        int y = scanner.nextInt();
        sum(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);
        scanner.close();
    }

    static void sum(int a,int b){
        System.out.println("Resultado da soma: "+(a+b));
    }

    static void sub(int a,int b){
        System.out.println("Resultado da sub: "+(a-b));
    }

    static void mul(int a,int b){
        System.out.println("Resultado da mult: "+(a*b));
    }

    static void div(int a,int b){
        System.out.println("Resultado da div: "+(a/b));
    }
}
