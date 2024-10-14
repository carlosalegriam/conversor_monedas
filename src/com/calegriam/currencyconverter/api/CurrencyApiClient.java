package com.calegriam.currencyconverter.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CurrencyApiClient {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/3ed9c9b287e96914d77a2cb2/latest/";

    public static void convertCurrency(String fromCurrency, String toCurrency) {
        String url = API_URL + fromCurrency;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            if (jsonObject.get("result").getAsString().equals("success")) {
                double exchangeRate = jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
                System.out.println("La tasa de cambio actual de " + fromCurrency + " a " + toCurrency + " es: " + exchangeRate);
                System.out.print("Ingrese la cantidad a convertir: ");
                Scanner scanner = new Scanner(System.in);
                double amount = scanner.nextDouble();
                double convertedAmount = amount * exchangeRate;
                System.out.println("El valor de " + amount + " " + fromCurrency + " equivalen a " + convertedAmount + " " + toCurrency + "\n");
            } else {
                System.out.println("Error al obtener los datos de la API.");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
        }
    }
}
