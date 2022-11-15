class doys4 implements Runnable{
    public void run(){
        for (int i=0;i>=5;i++){
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
class EB2 implements   Runnable {
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
public class thread_runnable {

    public static void main(String[] args) {
        doys4 obj=new doys4();
        EB2 obj1=new EB2();
        obj.run();
        obj1.run();
    }
}










