package baitapnop;

import java.util.Scanner;
import java.util.Arrays;

public class Baitapnop4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
