package br.com.alura.coinconverter;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moedas buscaTaxas(String moedaBase){

        String chave = "63cd881a3219456b6d6804f4";

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter as taxas de conversão.");
        }
    }
}
