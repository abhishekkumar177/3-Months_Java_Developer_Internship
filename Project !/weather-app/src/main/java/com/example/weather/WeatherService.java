package com.example.weather;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Map;
import java.util.HashMap; // Import HashMap

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    
    // Using Open-Meteo API (Free, No Key required)
    private static final String API_URL = "https://api.open-meteo.com/v1/forecast";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getWeather(double lat, double lon) {
        // Build the URL
        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("latitude", lat)
                .queryParam("longitude", lon)
                .queryParam("current_weather", "true")
                .toUriString();

        try {
            // Try to fetch the data
            return restTemplate.getForObject(url, Map.class);
        } catch (Exception e) {
            // If it fails, print the error to the console
            e.printStackTrace();
            
            // AND return the error to the browser so we can see it
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Failed to fetch weather data");
            errorResponse.put("message", e.getMessage());
            return errorResponse;
        }
    }
}