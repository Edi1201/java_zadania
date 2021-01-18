import java.util.Scanner;
public class Zad1{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj haslo:");
        String passUser = sc.nextLine();
        final string pass = "1234";
		if(passUser.equals(pass))
            System.out.println("Dobre haslo");
        else
            System.out.println("Zle haslo");
        
	 }
}