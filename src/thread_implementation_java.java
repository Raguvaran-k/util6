class t1 implements Runnable{
    public void run() {
       for (int i=0;i>=2;i++)
            try {
               // for (int i=0;i<=3;i++)

                    System.out.println(i);
            }
        catch (Exception e){
              //  e.printStackTrace();
            System.out.println("raguvaran");
        }
    }
}
class t2 implements Runnable{

    public void run() {
        try{
            System.out.println("thread 2 is running!!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class thread_implementation_java {
    public static void main(String[] args) {
        t1 obj1=new t1();
        t2 obj=new t2();
        obj1.run();
        obj.run();
        System.out.println("finished");
    }
}
