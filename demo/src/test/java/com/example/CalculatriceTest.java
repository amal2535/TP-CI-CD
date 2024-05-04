package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        double resultat = calculatrice.additionner(5, 3);
        assertEquals(8, resultat, 0); // Attendu: 8, Résultat: 5 + 3 = 8
    }

    @Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        double resultat = calculatrice.soustraire(10, 4);
        assertEquals(6, resultat, 0); // Attendu: 6, Résultat: 10 - 4 = 6
    }

    @Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        double resultat = calculatrice.multiplier(2, 5);
        assertEquals(10, resultat, 0); // Attendu: 10, Résultat: 2 * 5 = 10
    }

    @Test
    public void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
        double resultat = calculatrice.diviser(15, 3);
        assertEquals(5, resultat, 0); // Attendu: 5, Résultat: 15 / 3 = 5
    }
}
