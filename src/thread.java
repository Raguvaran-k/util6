class doys1 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("redcolour");
            try
            {
                Thread.sleep(8000);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }

    }
}
class EB1 extends  Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }
}
public class thread {
    public static void main(String[] args) {
        doys1 obj=new doys1();
        EB1 obj1=new EB1();
        obj.start();
        obj1.start();
    }
}
