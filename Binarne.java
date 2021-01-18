import java.util.Scanner;
public class Zadanie19{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj se liczbe:");
		int a = sc.nextInt();
		String binarnie = Integer.toBinaryString(a);
		System.out.println(binarnie);
	 }
}