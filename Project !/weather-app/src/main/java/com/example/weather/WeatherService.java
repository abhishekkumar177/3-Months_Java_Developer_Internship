package com.example.weather;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Map;
import java.util.HashMap;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private static final String API_URL = "https://api.open-meteo.com/v1/forecast";
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getWeather(double lat, double lon) {
        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("latitude", lat)
                .queryParam("longitude", lon)
                .queryParam("current", "temperature_2m,relative_humidity_2m,wind_speed_10m") 
                .queryParam("daily", "temperature_2m_max,temperature_2m_min") 
                .queryParam("timezone", "auto") 
                .toUriString();

        try {
            return restTemplate.getForObject(url, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Failed to fetch weather data");
            errorResponse.put("message", e.getMessage());
            return errorResponse;
        }
    }
}