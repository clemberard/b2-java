import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        // testNumber(myInput);
        NombresPremiers(myInput);
        // NombrePlusGrand(myInput);
        // JourSemaineParChiffre(myInput);
    }

    // Fonction qui teste si un nombre est pair ou impair
    public static void testNumber(Scanner Input) {
        System.out.println("Entre un nombre mon ami, je suis devin ;)");

        int number = Integer.parseInt(Input.nextLine());  // Read user input
        if (number % 2 == 0) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }
    }

    // Fonction qui retourne les nombres premiers
    public static void NombresPremiers(Scanner Input) {
        System.out.println("Entre un nombre mon ami, je vais te dire les nombres entiers qui le precede");

        int number = Integer.parseInt(Input.nextLine());  // Read user input
        int arrayNumbers[] = new int[number];
        int sommePrimeNumbers = 0;
        int compteur = 2;
        while(compteur < number) {
            boolean isPrime = true;
            for (int i = 2; i <= compteur; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0 && arrayNumbers[i] == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    arrayNumbers[i] = i;
                    sommePrimeNumbers += i;
                }
            }
            compteur++;
        }
        System.out.println("Les nombres premiers sont : ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] != 0) {
                System.out.println(arrayNumbers[i]);
            }
        }
        System.out.println("La somme des nombres premiers est : " + sommePrimeNumbers);
    }

    public static void NombrePlusGrand(Scanner Input) {
        int maxNumber = 0;
        while (true) {
            System.out.println("Entre un nombre mon ami, je vais te dire le nombre le plus grand. Ca s'arrete quand tu rentres zero");

            int number = Integer.parseInt(Input.nextLine());
            if (number == 0) {
                break;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Le nombre le plus grand est : " + maxNumber);
    }

    public static void JourSemaineParChiffre(Scanner Input) {
        String[] jours;
        jours = new String[8];
        jours[1] = "Lundi";
        jours[2] = "Mardi";
        jours[3] = "Mercredi";
        jours[4] = "Jeudi";
        jours[5] = "Vendredi";
        jours[6] = "Samedi";
        jours[7] = "Dimanche";

        System.out.println("Entre un nombre mon ami, je vais te dire le jour de la semaine");
        int number = Integer.parseInt(Input.nextLine());

        if (number < 1 || number > 7) {
            System.out.println("Le nombre doit etre compris entre 1 et 7");
        } else {
            System.out.println("Le jour de la semaine est : " + jours[number]);
        }
    }
}