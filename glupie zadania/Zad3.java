import java.util.Scanner;
public class Zad3{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj A: ");
		int a = sc.nextInt();
		System.out.print("Podaj B: ");
		int b = sc.nextInt();
		if(a == 0 && b == 0){
			System.out.print("zero - zero = zero");
		}else{
			System.out.print(a+" - "+b+" = "+(a-b));
		}
	}
}