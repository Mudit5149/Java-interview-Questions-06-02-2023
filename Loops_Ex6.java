package hackerrank_Solution;

import java.util.Scanner;

public class Loops_Ex6 {
	public static void main(String[] args) {
		
        Scanner in =new Scanner(System.in);
        System.out.println("enter a number");
        int N = in.nextInt();
        for (int i =1; i<=10;i++){
            int result = N*i;
            System.out.printf("%d x %d = %d\n",N,i,result);
        }
    }
    
    
}


