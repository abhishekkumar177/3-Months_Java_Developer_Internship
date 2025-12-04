package com.example.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // Endpoint: http://localhost:8080/weather?lat=52.52&lon=13.41
    @GetMapping("/weather")
    public Map<String, Object> getWeather(
            @RequestParam(defaultValue = "52.52") double lat, 
            @RequestParam(defaultValue = "13.41") double lon) {
        
        return weatherService.getWeather(lat, lon);
    }
    
    // Simple Health Check
    @GetMapping("/")
    public String home() {
        return "Weather App is running! Go to <a href='/weather'>/weather</a> to see data.";
    }
}