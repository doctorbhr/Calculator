package com.mycompany.calculadoralogica.java;

/**
 * @author bhrem
 * Classe responsável pelo processamento matemático (Integrante 2)
 */
public class CalculadoraLogicaJava {

    // Método principal que o Integrante 3 (Controlador) vai chamar
    public double executarOperacao(double num1, double num2, String sinal) {
        double resultado = 0;

        switch (sinal) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                // Validação para não travar o sistema do Integrante 4
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    resultado = 0; // Ou você pode retornar Double.NaN
                }
                break;
        }
        return resultado;
    }
}