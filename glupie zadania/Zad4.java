public class Zad4{
	public static void main(String[] arg){
		int number = 0;
		while(number != 7){
			number = (int)(Math.random() * 10 + 1);
			System.out.println(number);
		}
	}
}