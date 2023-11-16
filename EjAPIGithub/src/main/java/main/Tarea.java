package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Tarea {

    public static void main(String[] args) {
        // URL de la API de GitHub para obtener información de un repositorio público
        //String apiUrl = "https://api.github.com/repos/octocat/hello-world";
        //String apiUrl = "https://api.github.com/repos/Fer-Net/RepoDeCursoJavaNeo";
        String apiUrl = "https://api.github.com/repos/Fer-Net/prueba_fer";
        // Realizar la solicitud HTTP utilizando HttpClient
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
         try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			String jsonText = response.body();
			DataJson.parsear(jsonText);
			System.out.println("----");
			DataJson.parsearMap(jsonText);
         } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         //string response.body()
    }
}