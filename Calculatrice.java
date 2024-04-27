import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Sélectionnez une opération :");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");

        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choix = scanner.nextInt();

        double resultat;
        switch (choix) {
            case 1:
                resultat = additionner(scanner);
                break;
            case 2:
                resultat = soustraire(scanner);
                break;
            case 3:
                resultat = multiplier(scanner);
                break;
            case 4:
                resultat = diviser(scanner);
                break;
            default:
                System.out.println("Choix invalide !");
                return;
        }

        System.out.println("Le résultat est : " + resultat);

        scanner.close();
    }

    public static double additionner(Scanner scanner) {
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        return nombre1 + nombre2;
    }

    public static double soustraire(Scanner scanner) {
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        return nombre1 - nombre2;
    }

    public static double multiplier(Scanner scanner) {
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        return nombre1 * nombre2;
    }

    public static double diviser(Scanner scanner) {
        System.out.print("Entrez le dividende : ");
        double dividende = scanner.nextDouble();

        System.out.print("Entrez le diviseur : ");
        double diviseur = scanner.nextDouble();

        if (diviseur == 0) {
            System.out.println("Division par zéro impossible !");
            return 0;
        }

        return dividende / diviseur;
    }
}
