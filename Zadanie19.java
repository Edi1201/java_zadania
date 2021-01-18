import java.util.Scanner;
public class Zadanie19{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj se liczbe:");
		int a = sc.nextInt();
		int reszta;
		String binarnie = "";
		while(a != 0){
			reszta = a % 2;
			a = a / 2;
			binarnie += reszta; 
		}
		System.out.print(binarnie);
	}
}