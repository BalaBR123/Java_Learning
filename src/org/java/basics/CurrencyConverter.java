package org.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final String BASE_URL = "https://api.openexchangerates.org/latest.json?app_id=" + API_KEY;

    public static void main(String[] args) {
        try {
            // Fetch exchange rates from the API
            JSONObject exchangeRates = fetchExchangeRates();
            
            // Sample conversion
            double amount = 100.0;
            String fromCurrency = "USD";
            String toCurrency = "EUR";
            double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency, exchangeRates);
            
            System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject fetchExchangeRates() throws IOException {
        URL url = new URL(BASE_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return new JSONObject(response.toString()).getJSONObject("rates");
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency, JSONObject exchangeRates) {
        double fromRate = exchangeRates.getDouble(fromCurrency);
        double toRate = exchangeRates.getDouble(toCurrency);
        return (amount / fromRate) * toRate;
    }
}

