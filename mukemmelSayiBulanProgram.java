import java.util.Scanner;

public class mukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) System.out.println(total + " Sayısı bir mükemmel sayıdır.");
        else System.out.println(number + " Sayısı bir mükemmel sayı değildir.");

    }
}
