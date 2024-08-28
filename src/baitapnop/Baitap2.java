package baitapnop;

import java.util.Scanner;

public class Baitap2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sa luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println(
                "Nhập các phần tử của mảng:");
        for (int i = 0;
                i < n;
                i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1;
                i < n;
                i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(
                "Giá trị lớn nhất: " + max);
        System.out.println(
                "Giá trị nhỏ nhất: " + min);

        scanner.close();
    }
}
