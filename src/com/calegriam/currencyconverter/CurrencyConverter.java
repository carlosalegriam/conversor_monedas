package com.calegriam.currencyconverter;

import com.calegriam.currencyconverter.api.CurrencyApiClient;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = scanner.nextInt();
            handleOption(option, scanner);
        } while (option != 8);

        System.out.println("Gracias por usar el convertidor de monedas. ¡Hasta luego!");
    }

    private static void showMenu() {
        System.out.println("********************************************************************");
        System.out.println("Sea Bienvenido/a al Convertir de Moneda =] \n");
        System.out.println("1) Dólar => Peso Chileno");
        System.out.println("2) Peso Chileno => Dólar");
        System.out.println("3) Dólar => Real Brasileño");
        System.out.println("4) Real Brasileño => Dólar");
        System.out.println("5) Dólar => Peso Colombiano");
        System.out.println("6) Peso Colombiano => Dólar");
        System.out.println("7) Otras monedas");
        System.out.println("8) Salir");
        System.out.print("Elija una opción válida: ");
        System.out.println("\n********************************************************************");
    }

    private static void handleOption(int option, Scanner scanner) {
        switch (option) {
            case 1 -> CurrencyApiClient.convertCurrency("USD", "CLP");
            case 2 -> CurrencyApiClient.convertCurrency("CLP", "USD");
            case 3 -> CurrencyApiClient.convertCurrency("USD", "BRL");
            case 4 -> CurrencyApiClient.convertCurrency("BRL", "USD");
            case 5 -> CurrencyApiClient.convertCurrency("USD", "COP");
            case 6 -> CurrencyApiClient.convertCurrency("COP", "USD");
            case 7 -> handleOtherCurrencies(scanner);
            case 8 -> System.out.println("Saliendo del programa...");
            default -> System.out.println("Opción inválida. Intente de nuevo.");
        }
    }

    private static void handleOtherCurrencies(Scanner scanner) {
        System.out.print("Ingrese el código de la moneda origen (Ej. USD): ");
        String fromCurrency = scanner.next().toUpperCase();
        System.out.print("Ingrese el código de la moneda destino (Ej. EUR): ");
        String toCurrency = scanner.next().toUpperCase();
        CurrencyApiClient.convertCurrency(fromCurrency, toCurrency);
    }
}
