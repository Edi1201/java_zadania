import java.util.Scanner;
public class Zadanie20{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj se liczbe:");
		int a = sc.nextInt();
		int reszta;
		String binarnie = "";
		while(a != 0){
			reszta = a % 16;
			a = a / 16;
			if(reszta == 10){
				binarnie += "A";
			}else if(reszta == 11){
				binarnie += "B";
			}else if(reszta == 12){
				binarnie += "C";
			}else if(reszta == 13){
				binarnie += "D";
			}else if(reszta == 14){
				binarnie += "E";
			}else if(reszta == 15){
				binarnie += "F";
			}else{
				binarnie += reszta;
			}
		}
		System.out.print(binarnie);
	 }
}