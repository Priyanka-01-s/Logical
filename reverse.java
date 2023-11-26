package Logical;

import java.util.Scanner;

public class reverse {

    public static void ReverseNo(int n){
        int flag=0;
        int rem;
        while(n!=0){
            rem = n%10;
            flag = (flag *10)+rem;
            n /=10; 
        }
        System.out.println("Reverse number :"+flag);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseNo(n);
        sc.close();
    }
}
