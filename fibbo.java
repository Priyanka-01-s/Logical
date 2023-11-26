package Logical;

import java.util.Scanner;

public class fibbo {

    public static void fibb(int n){
        int num1 =0, num2 =1;
        int count =0;
        while(count < n){
            System.out.println(num1 + " ");
            int sum = num1 +num2;

            num1 = num2;
            num2 = sum;
            count++;            
        
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibb(n);
        sc.close();
    }
    
}
