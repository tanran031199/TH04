package TH.TH06;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        do {
            System.out.println("Nhập số lượng sinh viên:");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("Số lượng sinh viên tối đa là 20!");
            }
        } while(size > 20);

        arr = new int[size];

        System.out.println("Nhập điểm số của các sinh viên: ");
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Điểm số của các sinh viên là: " + Arrays.toString(arr));

        int count = 0;
        for(int i : arr) {
            if(i > 5 && i <= 10) {
                count++;
            }
        }

        System.out.println("Số lượng sinh viên thi đỗ và có số điểm trên 5 là: " + count);
    }
}
