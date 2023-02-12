import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Sveiks ceļotāj! Esi šogad ceļojis ( Jā/Nē):") ;
            String cont = scan.next();

            if (cont.equals("Nē")) {
               break;
            }
            System.out.println("Kur tu esi ceļojis?" );
            String valsts = scan.next();

            if (valsts.equals ("Spānija"))  {
                System.out.println("Oho,tur gan ir karsts!");
            } else if (valsts.equals ("Lietuva"))  {
                System.out.println("Wow, kaimiņos vienmēr ir labi! Noteikt esi apmeklējis delfināriju! Lieliski!");
            } else if (valsts.equals ("Francija"))  {
                System.out.println("Ceru, ka esi redzējis Parīzes torni! Satriecoši!");
            } else if (valsts.equals ("Nekur"))  {
                System.out.println("Latvijā tak ir daudz neredzētas un skaistas vietas, kuras tu noteikti neesi ameklējis- saņemies un aizbrauc!");
            } else {
                System.out.println("Piedod,nepazīstu tādu valsti. Bet gan jau drīz aizlidošu!");}

            }
         }
    }


