package Histogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        double P1=0;
        double P2=0;
        double P3=0;
        double P4=0;
        double P5=0;
        for (int i =0;i<n;i++){
            double number =Double.parseDouble(scan.nextLine());
            if (number<200){
                P1++;
            }else if (number<400){
                P2++;
            }else if (number<600){
                P3++;
            }else if (number<800){
                P4++;
            }else {
                P5++;
            }
        }

        P1=P1/n*100;
        P2=P2/n*100;
        P3=P3/n*100;
        P4=P4/n*100;
        P5=P5/n*100;
        String simb="%";

        System.out.printf("%.2f%s%n%.2f%s %n%.2f%s %n%.2f%s %n%.2f%s %n",P1,simb,P2,simb,P3,simb,P4,simb,P5,simb);





    }
}
