package com.example.weather;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Map;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    
    // Using Open-Meteo API (Free, No Key required)
    private static final String API_URL = "https://api.open-meteo.com/v1/forecast";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getWeather(double lat, double lon) {
        // Build the URL: ?latitude=...&longitude=...&current_weather=true
        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("latitude", lat)
                .queryParam("longitude", lon)
                .queryParam("current_weather", "true")
                .toUriString();

        // Fetch data and parse directly into a Map for simplicity
        // In a production app, use a dedicated DTO class instead of Map
        return restTemplate.getForObject(url, Map.class);
    }
}