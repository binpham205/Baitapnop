package baitapnop;

import java.util.Random;
import java.util.Scanner;

public class Baitapnop1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int n = rand.nextInt(100) + 1; 
        String check;
        
        do {
            System.out.print("Nhap vao 'yes' de tiep tuc hoac bat ky de kiem tra va thoat: ");
            check = sc.nextLine();
            
            if (check.equals("yes")) {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break; 
            }
        } while (true);
        
        sc.close();
   }
}

