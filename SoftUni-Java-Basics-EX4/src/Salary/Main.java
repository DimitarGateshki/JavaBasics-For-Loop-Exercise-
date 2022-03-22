package Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        double salary=Double.parseDouble(scan.nextLine());
        for (int i =0;i<n;i++){
            String tab=scan.nextLine();
            if (tab.equals("Facebook")){
                salary=salary-150;
            }else if (tab.equals("Instagram")){
                salary=salary-100;
            }else if (tab.equals("Reddit")){
                salary=salary-50;
            }
        }

        if (salary<=0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.printf("%.0f",salary);
        }

    }
}
