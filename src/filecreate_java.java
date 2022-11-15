import java.io.File;
import java.io.IOException;
public class filecreate_java {
    public static void main(String[] args) throws IOException {
     /*  // File car=new File("D:\\vlog\\karthi.txt");
        try {

           File car=new File("D:\\mani\\karthi.txt");
            System.out.println("lenova");
            car.createNewFile();
            System.out.println("dreive the car");
        }catch (IOException e){
            System.out.println("error accuard");
            System.out.println("car");
        }
        }
    }*/
      File name = new File("filename.txt");
        try {
           // File name = new File("filename.txt");
           if (name.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exiit");

            }

        } catch (IOException e) {
            System.out.println("an error accuarad");
           // e.printStackTrace();
        }
    }
}