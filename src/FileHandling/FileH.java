package FileHandling;
import java.io.*;
import java.util.Scanner;


public class FileH {
    public static void main(String[] args) {
//        try(OutputStreamWriter fw = new OutputStreamWriter(System.out)){
//            fw.write("hello");
//            fw.write(10);
//            fw.write(98);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//               try(InputStreamReader fr = new InputStreamReader(System.in)){
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.print((char)(letters));
//                letters = fr.read();
//            }
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr = new FileReader("text.txt")){
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.print((char)(letters));
//                letters = fr.read();
//            }
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        try(FileWriter fw = new FileWriter("text.txt")){
            fw.write(97);
        }
        catch(IOException e){
            System.out.println();
        }



    }
}
