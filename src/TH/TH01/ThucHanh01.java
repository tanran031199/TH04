package TH.TH01;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh01 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số lượng phần tử của mảng.");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("Số lượng phần tử tối đa là 20!!! Xin hãy nhập lại.\n");
            }
        } while(size > 20);

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi đảo chiều là: " + Arrays.toString(arr));

        int count = 0;
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[count] = arr[i];
            count++;
        }

        System.out.println("Mảng sau khi đảo chiều là: " + Arrays.toString(newArr));
    }
}
