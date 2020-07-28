import java.util.Scanner;
//git zmiana
// 2020.04.25 - gra w kółko i krzyżyk
/*
2020.04.28 - J19_2 - praca domowa (kółko/krzyżyk)
Zaprojektuj grę w kółko i krzyżyk
OK W programie obowiązują klasyczne zasady gry
OK Układ planszy 3x3
OK Wykorzystaj poznane Ci mechanizmy sekwencyjne
OK Współrzędne podawane są przez podanie np.: 00, albo 11.

Rozszerzenie:
Zadanie J19_2 proszę rozwinąć o:

1.       Jeżeli pole będzie zajęte to zawodnik traci kolejkę

2.       Jeżeli wszystkie pola będą zajęte i nie ma wygranej to koniec gry.

 */
public class J19_2 {
    //test
    //test 2
    //test 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] gra = new int[3][3];
        int zawodnik = 1;

        while (true) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("  " + gra[i][j]);
                }
                System.out.println();
            }

            System.out.println("Podaj wsp. X - zawodnik (" + zawodnik + "): ");
            int x = sc.nextInt();

            System.out.println("Podaj wsp. Y - zawodnik (" + zawodnik + "): ");
            int y = sc.nextInt();

            // spradzenie czy pole jest zajęte, jeśli tak, to gracz traci kolejkę
            if (gra[x][y] == 0) {
                gra[x][y] = zawodnik;
                if (zawodnik == 1) {
                    zawodnik = 2;
                } else {
                    zawodnik = 1;
                }
            } else {
                System.out.println("pole jest już zajęte, zawodnik " + zawodnik + " traci kolejkę");
                if (zawodnik == 1) {
                    zawodnik = 2;
                } else {
                    zawodnik = 1;
                }
            }
/*
            if (zawodnik == 1) {
                zawodnik = 2;
            } else {
                zawodnik = 1;
            }

 */

            //sprawdzenie czy wygrał zawodnik nr 1

            if (gra[0][0] == 1 && gra[1][0] == 1 && gra[2][0] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[0][1] == 1 && gra[1][1] == 1 && gra[2][1] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[0][2] == 1 && gra[1][2] == 1 && gra[2][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[0][0] == 1 && gra[0][1] == 1 && gra[0][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[1][0] == 1 && gra[1][1] == 1 && gra[1][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[2][0] == 1 && gra[2][1] == 1 && gra[2][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[0][0] == 1 && gra[1][1] == 1 && gra[2][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            } else if (gra[2][0] == 1 && gra[1][1] == 1 && gra[0][2] == 1) {
                System.out.println("Wygrywa zawodnik 1");
                break;
            }
            // sprawdzenie czy wygrał zawodnik nr 2
            else if (gra[0][0] == 2 && gra[1][0] == 2 && gra[2][0] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[0][1] == 2 && gra[1][1] == 2 && gra[2][1] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[0][2] == 2 && gra[1][2] == 2 && gra[2][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[0][0] == 2 && gra[0][1] == 2 && gra[0][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[1][0] == 2 && gra[1][1] == 2 && gra[1][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[2][0] == 2 && gra[2][1] == 2 && gra[2][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[0][0] == 2 && gra[1][1] == 2 && gra[2][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[2][0] == 2 && gra[1][1] == 2 && gra[0][2] == 2) {
                System.out.println("Wygrywa zawodnik 2");
                break;
            } else if (gra[0][0] != 0 && gra[0][1] != 0 && gra[0][2] != 0
                    && gra[1][0] != 0 && gra[1][1] != 0 && gra[1][2] != 0
                    && gra[2][0] != 0 && gra[2][1] != 0 && gra[2][2] != 0) {

                System.out.println("REMIS");
                break;
            }
        }
        // ostatnie wyświetlenie tabeli

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + gra[i][j]);
            }
            System.out.println();
        }

        System.out.println("KONIEC GRY");
    }

}


