import java.util.Scanner;
public class Zad2{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj haslo do 8 znakow: ");
		String password = sc.nextLine();
		if(password.length() >= 8){
			System.out.println("Haslo ma byc krotsze niz 8 znakow");
		}
	}
}