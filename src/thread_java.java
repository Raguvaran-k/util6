
class doys{
    void redcolour(){
        for (int i=0;i<=5;i++){
            System.out.println("red colour ");
        }
    }
}
class EB {
    void current() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
    public class thread_java {
        public static void main(String[] args) {
            doys obj = new doys();
            EB obj1 = new EB();
            obj.redcolour();
            obj1.current();

        }
    }

