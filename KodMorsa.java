import java.util.Scanner;
import java.io.*;
public class KodMorsa{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] normalne = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                  "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                  "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String[] mors = { " .- ", " -... ", " -.-. ", " -.. ", " . ", " ..-. ", " --. ", " .... ", " .. ", 
                " .--- ", " -.- ", " .-.. ", " -- ", " -. ", " --- ", " .---. ", " --.- ", " .-. ",
                " ... ", " - ", " ..- ", " ...- ", " .-- ", " -..- ", " -.-- ", " --.. ", " .---- ",
                " ..--- ", " ...-- ", " ....- ", " ..... ", " -.... ", " --... ", " ---.. ", " ----. ",
                " ----- "};
		System.out.print("Wczytano: ");
		String zdanie = sc.nextLine();
		String zdanieOrginalne=zdanie;
		zdanie = zdanie.toLowerCase();
		char pierwsza = zdanie.charAt(0);
		if(pierwsza == '.' || pierwsza == '-'){
			for(int i=0;i<35;i++){  
				zdanie=zdanie.replace(mors[i], normalne[i]); 
			}
			System.out.println("Przetlumaczone: "+zdanie);
		}else{
			for(int i=0;i<35;i++){  
				zdanie=zdanie.replace(normalne[i], mors[i]);  
			}
			System.out.println("Przetlumaczone: "+zdanie);
		}
		File f = new File("mors.txt");
		try{
			FileWriter fw = new FileWriter(f);
			fw.write("Wczytano:"+zdanieOrginalne+"\n"+"Przetlumaczone: "+zdanie);
			fw.close();
		}catch(IOException e){
			System.out.println("BLAD: "+e.toString());
		}
	}
}