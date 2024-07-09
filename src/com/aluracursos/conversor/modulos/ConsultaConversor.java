package com.aluracursos.conversor.modulos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {
    public Conversor BuscaConversor(String moneda, String convertir, double monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e330e71c427fb9bd92ce16e3/pair/"
                + moneda + "/" + convertir + "/" + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré moneda");
        }
    }
}