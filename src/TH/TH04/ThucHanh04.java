package TH.TH04;

import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Chuyển đổi độ F sang độ C.\n" +
                    "2. Chuyển đổi độ C sang độ F.\n" +
                    "0. Thoát chương trình.");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F:");
                    fahrenheit = sc.nextDouble();
                    System.out.printf("Độ F được chuyển đổi sang độ C là: %.2f độ C.\n\n", fahrenheit * (5.0/9) * (fahrenheit - 32));
                    break;
                case 2:
                    System.out.println("Nhập độ C:");
                    celsius = sc.nextDouble();
                    System.out.printf("Độ C được chuyển đổi sang độ F là: %.2f độ F.\n\n", (9.0/5) * celsius + 32);
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình!!!");
                    break;
                default:
                    System.out.println("Không có lựa chọn " + choice + "!!! Xin hãy nhập lại.");
                    break;

            }
        } while(choice != 0);
    }
}
