import java.util.Scanner;
import java.io.*;

class ZapisDoPlikuZKlawiatury{
    public static void main(String[] args) {
        File f = new File("dane.txt");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        try{
            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();
        }catch(IOException e){
            System.out.println("BLAD: "+e.toString());
        }

    }
}