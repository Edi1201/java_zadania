import java.util.Scanner;
public class Zad4{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Prosty kalkulator");
		System.out.print("Podaj pierwsza liczbe: ");
		float ts_n1 = sc.nextFloat();
		System.out.print("Podaj druga liczbe: ");
		float ts_n2 = sc.nextFloat();
		System.out.print("Podaj dzialanie [+ - * /]: ");
		String ts_operation = sc.next();
		if(ts_operation.equals("+")){
			System.out.println(ts_n1+ts_operation+ts_n2+"="+(ts_n1+ts_n2));
		}else if(ts_operation.equals("-")){
			System.out.println(ts_n1+ts_operation+ts_n2+"="+(ts_n1-ts_n2));
		}else if(ts_operation.equals("*")){
			System.out.println(ts_n1+ts_operation+ts_n2+"="+(ts_n1*ts_n2));
		}else if(ts_operation.equals("/")){
			System.out.println(ts_n1+ts_operation+ts_n2+"="+(ts_n1/ts_n2));
		}else{
			System.out.println("\""+ts_operation+"\" nieobslugiwane dzialanie");
		}
	}
}