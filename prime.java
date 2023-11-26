package Logical;

import java.util.Scanner;

public class prime {

    public static void primeNo(int n){
        int c=0;
        if(n==0 || n==1){
            System.out.println("Not a prime number");
        }

        for(int i=2;i<n/2;i++){
            if(n%i ==0){
                System.out.println("Is not a prime number");
                c =1;
            }

        }if(c ==0){
            System.out.println("Is a prime number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check prime :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNo(n);
        sc.close();

    }
    
}
