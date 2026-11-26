import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        long num= sc.nextLong();
        sc.close();
        ullmanModificado(num);
    }

    private static void ullmanModificado(long num) {
        while (num!=1) {
            System.out.print(num+", ");
            if (num % 4 == 0) {
                num = num / 4;
            } else if (num % 7 == 0) {
                num = num / 7;
            } else if (num % 2 == 0 && num % 4 != 0 && num % 7 != 0) {
                num = num / 2;
            } else if (num % 2 == 1 && num % 7 != 0) {
                num = num * 3 - 1;
            }
        }
        System.out.print(num);
    }
}
