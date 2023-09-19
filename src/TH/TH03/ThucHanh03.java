package TH.TH03;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Nhập số lượng phần tử trong mảng:");
            size = sc.nextInt();
        } while(size > 20);

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Danh sách tài sản các tỷ phú là: " + Arrays.toString(arr));
        System.out.println("Tài sản lớn nhất là: " + max + " tỷ đô");
    }
}
