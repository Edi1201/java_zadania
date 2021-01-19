import java.util.Scanner;
public class Zad3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String ts_name = sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String ts_surname = sc.nextLine();
        System.out.print("Podaj wiek: ");
        int ts_age = sc.nextInt();

        System.out.print("Wpisz swoją wage w KG: ");
        double ts_weight = sc.nextDouble();
        System.out.print("Wpisz wzrost w CM: ");
        double ts_height = sc.nextDouble();
        double ts_bmi = (double)ts_weight/((ts_height*ts_height)/100)*100;
        System.out.print("Imie: " + ts_name +" Nazwisko: "+ ts_surname +" Wiek: "+ ts_age + "\nTwoje BMI: " + ts_bmi + "\n");
        if(ts_bmi<=16){
            System.out.println("Wyglodzenie");
        }else if(ts_bmi <= 16.99){
            System.out.println("Wychudzenie");
        }else if(ts_bmi <= 18.49){
            System.out.println("Niedowaga");
        }else if(ts_bmi <= 24.99){
          System.out.println("Wartosc prawidlowa");
        }else if(ts_bmi <= 29.99){
          System.out.println("Nadwaga");
        }else if(ts_bmi <= 34.99){
          System.out.println("I stopien otylosci");
        }else if(ts_bmi <= 39.99){
          System.out.println("II stopien otylosci");
        }else if(40 <= ts_bmi){
          System.out.println("Otylosc skrajna");    
      }      
   }
}
