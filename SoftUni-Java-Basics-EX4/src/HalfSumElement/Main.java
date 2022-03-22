package HalfSumElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<n;i++){
            int el=Integer.parseInt(scan.nextLine());
            sum+=el;
            if (el>max){
                max=el;
            }
        }
        sum=sum-max;
        if (sum==max){
            System.out.printf("Yes%nSum = %d",max);
        }else {
            int dif =Math.abs(max-sum);
            System.out.printf("No%nDiff = %d",dif);
        }




    }
}
