public class Zadanie{
	 public static void main(String args[]){
		int ts_a = (int)(Math.random()*10+1);
		int ts_b = (int)(Math.random()*10+1);
		if(ts_a > ts_b){
			System.out.println("A jest wieksze od B");
		}else if(ts_a < ts_b){
			System.out.println("B jest wieksza od A");
		}else{
			System.out.println("Liczby sa rowne");
		}
	}
}