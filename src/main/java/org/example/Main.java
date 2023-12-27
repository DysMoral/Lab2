package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.thecatapi.com/v1/images/search"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .header("x-api-key", "65e376ef-0ade-4793-a9be-1f2691f2a48b")
                .header("accept", "*/*")
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}