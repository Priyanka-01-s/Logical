package Logical;

import java.util.Scanner;

public class perfectNo {

    public static void checkPerfect(int n){
        int count=0;
        for(int i =1;i<=n/2;i++){
            if(n%i == 0){
                count +=i;
                System.out.println(i);
            }

        }
        if(count == n){
            System.out.println("Number is perfect number ");
        }else{
            System.out.println("Number is not perfect number ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check perfect number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPerfect(n);
        sc.close();
    }
}
