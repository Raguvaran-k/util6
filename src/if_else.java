import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your value");
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int mark4= sc.nextInt();
        int mark5= sc.nextInt();
        int total=sc.nextInt();
       /* int mark1 = 38;
        int mark2 = 39;
        int mark3 = 45;
        int mark4 = 65;
        int mark5 = 39;
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        float averagemark = total / 5f;*/

        if (mark1 <= 35) {
            System.out.println(mark1);
        }
       else if (mark2 <= 35) {
            System.out.println(mark2);
        }
       else if (mark3 <= 35) {
            System.out.println(mark3);
        } else if (mark4 <= 35) {
            System.out.println(mark4);
        }
         else {
             System.out.println("above");
        }

    }

}


