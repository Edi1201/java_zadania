
import java.util.*;
class FunkcjeAndList{

	static final int MAX = 5000000;
	
	static int [] tab = new int[MAX];
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String arg[]){
		long start = System.nanoTime();
		saveToTable();
		long stop = System.nanoTime();
		System.out.println("1="+((double)(stop-start)/1000000000));
		start = System.nanoTime();
		saveToList();
		stop = System.nanoTime();
		System.out.println("2="+((double)(stop-start)/1000000000));
	}
	
	private static void saveToTable(){
		Random r = new Random();
		for(int i=0;i<MAX;i++){
			tab[i]=r.nextInt(100)+1;
		}
	}
	private static void showTableElements(){
		for(int i=0;i<MAX;i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	private static void saveToList(){
		Random r = new Random();
		for(int i=0;i<MAX;i++){
			list.add(r.nextInt(100)+1);
		}
	}
	private static void showListElements(){
		for(int i=0;i<MAX;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
}