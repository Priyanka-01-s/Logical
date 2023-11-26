package Logical;

import java.util.Scanner;

public class stopwatch{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.println("The stopwatch timer has started");
        System.out.println("Press ENTER to stop:");
        sc.nextLine();
        long endTime = System.currentTimeMillis();
        System.out.println("Timer has stopped");
        long time = (endTime-startTime)/1000; 
        System.out.println("THE TOTAL TIME IS :"+time+" sec");
        sc.close();
    }
  
}


