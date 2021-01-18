import java.util.Scanner;

class ObliczeniaMatematyczne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wybor = "";
        while(!wybor.equals("quit")){
            menu();
            wybor = sc.next();
            wybor(wybor);
        }
        menu();
        wybor = sc.next();
        wybor(wybor);
    }
    private static void wybor(String wybor){
        switch (wybor){
            case "1":
                potegowanie();
                break;
            case "2":
                PoleTrojkataRownobocznego();
                break;
            case "0":
                System.out.print("");
                break;
            default:
                defaultText();
        }
    }
    private static void defaultText(){
        System.out.println("Nie ma takiej opcji");
    }
    private static void menu(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" Pomocnik mlodego matematyka");
        System.out.println(" 1 - Potega podanej liczby");
        System.out.println(" 2 - Pole Trojkata Rownobocznego");
        System.out.println(" quit - Zakonczenie programu");
        System.out.print(" Wybierz dzialanie wpisujac liczbe: ");
    }
    private static void potegowanie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        float liczba = sc.nextFloat();
        System.out.print("Podaj potege liczby: ");
        float potega = sc.nextFloat();
        
        System.out.println("Liczba "+liczba+" podniesiona do potegi "+potega+" to "+Math.pow(liczba,potega));
    }
    private static void PoleTrojkataRownobocznego(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj bok trojkata: ");
        float bok = sc.nextFloat();
        System.out.println("Trojkat o boku "+bok+" wynosi "+(bok*bok*Math.sqrt(3)/4));
    }
}