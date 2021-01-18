import java.io.*;
public class Liczby{
    public static void main(String args[]){
        File f =  new File("mojeliczby.txt");
            try{
				FileWriter fw = new FileWriter(f);
				for(int i = 0; i < 101; i++){
					if(i%2 == 0){
						fw.write(i+"\n");
					}
				}
				fw.close();
            }catch(IOException e){
                System.out.println("BLAD: "+e.toString());
            }
    }
}