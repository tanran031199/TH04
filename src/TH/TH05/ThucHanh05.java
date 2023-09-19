package TH.TH05;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        do {
            System.out.println("Nhập số lượng phần tử của mảng: ");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("Số lượng phần tử tối đa là 20. Xin hãy nhập lại!");
            }
        } while(size > 20);

            arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Các phần tử trong mảng là: " + Arrays.toString(arr));

        System.out.println("Số nhỏ nhất là" + minValue(arr));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }
}
