import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double intervestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so tien vay : ");
        money = sc.nextDouble();
        System.out.println(" Nhap so thang vay: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat vay: ");
        intervestRate = sc.nextDouble();
        double total_intervest = 0;
        for (int i = 0; i < month; i++) {
            total_intervest = money + (intervestRate/100)/12 * month;
        }
        System.out.println("Tong so tien lai: " + total_intervest);
    }
}
