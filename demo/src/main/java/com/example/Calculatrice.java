package com.example;

public class Calculatrice {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculatrice <nombre1> <opération> <nombre2>");
            return;
        }

        double nombre1 = Double.parseDouble(args[0]);
        char operation = args[1].charAt(0); // Récupérez le premier caractère de l'opération
        double nombre2 = Double.parseDouble(args[2]);

        double resultat = calculer(nombre1, operation, nombre2);
        System.out.println("Le résultat est : " + resultat);
    }

    public static double calculer(double nombre1, char operation, double nombre2) {
        switch (operation) {
            case '+':
                return additionner(nombre1, nombre2);
            case '-':
                return soustraire(nombre1, nombre2);
            case '*': // Ajoutez le cas pour la multiplication
                return multiplier(nombre1, nombre2);
            case '/':
                return diviser(nombre1, nombre2);
            default:
                throw new IllegalArgumentException("Opération non valide: " + operation);
        }
    }

    public static double additionner(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }

    public static double soustraire(double nombre1, double nombre2) {
        return nombre1 - nombre2;
    }

    public static double multiplier(double nombre1, double nombre2) {
        return nombre1 * nombre2;
    }

    public static double diviser(double nombre1, double nombre2) {
        if (nombre2 == 0) {
            throw new ArithmeticException("Division par zéro impossible !");
        }
        return nombre1 / nombre2;
    }
}
