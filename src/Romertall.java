import java.util.Scanner;

public class Romertall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultat = 0;
        int sisteTall = 0;
        System.out.println("Skriv inn ditt romertall for å få det konvertert desimaltall");
        String original = input.nextLine().toUpperCase();
        for (int i = original.length() - 1; i >= 0; i--) {
            switch (original.charAt(i)) {
                case 'M':
                    resultat = sjekkTall(sisteTall,1000,resultat);
                    sisteTall = 1000;
                    break;
                case 'D':
                resultat = sjekkTall(sisteTall,500,resultat);
                    sisteTall = 500;
                    break;
                case 'C':
                    resultat = sjekkTall(sisteTall,100,resultat);
                    sisteTall = 100;
                    break;
                case 'L':
                    resultat = sjekkTall(sisteTall,50,resultat);
                    sisteTall = 50;
                    break;
                case 'X':
                    resultat = sjekkTall(sisteTall,10,resultat);
                    sisteTall = 10;
                    break;
                case 'V':
                    resultat = sjekkTall(sisteTall,5,resultat);
                    sisteTall = 5;
                    break;
                case 'I':
                    resultat = sjekkTall(sisteTall,1,resultat);
                    sisteTall = 1;
                    break;
            }
        }
        System.out.println(resultat);
    }
    private static int sjekkTall(int sisteTall,int nesteTall,int resultat){
        if(nesteTall < sisteTall){
            return resultat - nesteTall;
        }
        else {
            return resultat + nesteTall;
        }
    }
}
