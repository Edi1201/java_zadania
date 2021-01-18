import java.util.Scanner;
public class Kalkulator{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		char loop = 'a';
		while(loop != 'T' && loop != 't'){
			int a = sc.nextInt();
			System.out.print(a);
			char sign = sc.next().charAt(0);
			System.out.print(a);
			System.out.print(sign);
			int b = sc.nextInt();
			switch(sign){
				case '+':
					System.out.println(a+"+"+b+"="+(a+b));
					break;
				case '-':
					System.out.println(a+"-"+b+"="+(a-b));
					break;
				case '*':
					System.out.println(a+"*"+b+"="+(a*b));
					break;
				case '/':
					System.out.println(a+"/"+b+"="+((double)a/(double)b));
					break;
				default:
					System.out.println("Podano nieprawidlowy znak");
					break;
			}
			System.out.print("Zakonczyc czy chcesz obliczyc cos nowego? [T = zakoncz] ");
			loop = sc.next().charAt(0);
			
		}
	}
}