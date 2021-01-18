public class Zad5{
	public static void main(String[] arg){
		int number = 0;
		for(int i=0;i<20;i++){
			number = (int)(Math.random() * 22 - 11); //Dziala od -10 do 10, sprawdzone
			if(number>0){
				System.out.println(number);
			}
		}
	}
}