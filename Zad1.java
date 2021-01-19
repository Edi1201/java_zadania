import java.util.Scanner;
public class Zad1{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj haslo:");
        String ts_passUser = sc.nextLine();
        final String ts_pass = "1234";
		if(ts_passUser.equals(ts_pass))
            System.out.println("Dobre haslo");
        else
            System.out.println("Zle haslo");
        
	 }
}