import java.util.Scanner;
public class Terning {
    public static void main(String[] args) {
        int tilfeldigTall, antallKast, grense, overGrense=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Oppgi verdien som terningens verdi skal vaere hoeyere eller lik (heltall fra 1 til 6):");
        do {
            while (!input.hasNextInt()) {
                System.out.println("Dette er ikke et heltall!");
                input.nextLine();
            }
            grense = input.nextInt();
            if (grense < 1 || grense > 6){
                System.out.println("Heltallet må vaere mellom 1 og 6");
            }
        }
        while (grense < 1 || grense > 6);
        System.out.println("Oppgi antall terningkast (positivt heltall:");
        do {
            while (!input.hasNextInt()) {
                System.out.println("Dette er ikke et positivt heltall!");
                input.nextLine();
            }
            antallKast = input.nextInt();
            if (antallKast < 0){
                System.out.println("Tallet må vaere et positivt heltall");
            }
        }
        while(antallKast < 0);
        for (int i=0; i<antallKast; i++) {
            tilfeldigTall = (int) (1 + 6 * Math.random());
            if(tilfeldigTall >= grense) {
                overGrense++;
            }
        }
        System.out.println("Terningens verdi var større eller lik " + grense + " " + overGrense + " av " + antallKast);
        System.out.println("p(v>=" + grense + ") = " + (double)overGrense/antallKast);
    }
}
