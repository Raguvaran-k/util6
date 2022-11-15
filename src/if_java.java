import java.util.Scanner;

public class if_java {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter your value");
        int a= SC.nextInt();
        if (a==1){
            System.out.println("65");
        }
        else if (a==2) {
            System.out.println("munday");
        }
        else if (a==10) {
            System.out.println("tusday");
        }
        else if (a==4) {
            System.out.println("wenasday");
        }
        else if (a==5) {
            System.out.println("thusday");
        }
        else if (a==6) {
            System.out.println("friday");
        }
        else {
            System.out.println("holliday");

        }
    }
}
