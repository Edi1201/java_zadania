import java.util.Scanner;
public class Zad2{
    public static void main(String args[]){
        System.out.print("Wprowadz tekst:");
        Scanner sc = new Scanner(System.in);
        String ts_text = sc.nextLine();
        System.out.println("Dlugosc wprowadzonego tekstu wynosi: "+ts_text.length());
    }
}