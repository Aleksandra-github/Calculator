import java.util.Scanner;
public class Calc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.println("ведите первое число");
        int a = scanner.nextInt();
        System.out.println (a + "первое число");
        System.out.println("ведите второе число");
        int b = scanner.nextInt();

        System.out.println("ведите операцию");
        char a = scanner.nextChar();

        Calculator c = new Calculator();
        if  (a == '+') {
            System.out.println(c.summ(a,b));

        } else if (a == '-')
            System.out.println(c.minus(a,b));
          else if (a== '*')
            System.out.println(c.multiply(a,b));
    }
}


