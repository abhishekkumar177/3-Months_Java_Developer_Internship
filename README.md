#  Java Spring Boot Weather App

A full-stack weather application built with **Java Spring Boot** and **Vanilla JavaScript**. This application allows users to check real-time weather conditions (Temperature and Wind Speed) for any location using Latitude and Longitude coordinates.

It acts as a bridge between the user and the **Open-Meteo API**, fetching data securely on the backend and serving it to a clean HTML frontend.

##  Features

  * **Real-Time Data:** Fetches live weather updates immediately.
  * **Simple UI:** Clean HTML/CSS interface for easy interaction.
  * **REST API Backend:** Exposes a custom JSON endpoint for weather data.
  * **Error Handling:** Gracefully handles API failures and bad requests.
  * **No API Key Required:** Uses the Open-Meteo public API.

##  Tech Stack

  * **Backend:** Java 17+, Spring Boot 3.2.0
  * **Build Tool:** Maven
  * **Frontend:** HTML5, CSS3, JavaScript (Fetch API)
  * **External Service:** [Open-Meteo API](https://open-meteo.com/)
  * **IDE:** Visual Studio Code

-----

##  Project Structure

```
Project !/
├── src/main/java/com/example/weather/
│   ├── WeatherApplication.java    # Main Entry Point
│   ├── WeatherController.java     # REST API Controller
│   └── WeatherService.java        # Logic to call external API
│
├── src/main/resources/static/
│   └── index.html                 # Frontend User Interface
│
└── pom.xml                        # Project Dependencies (Maven)
```

##  How to Run the Project

### Prerequisites

  * Java Development Kit (JDK) 17 or 21 installed.
  * Maven installed (or use the one embedded in VS Code).

### Option 1: Run via VS Code (Recommended)

1.  Open the project folder in **VS Code**.
2.  Navigate to `src/main/java/com/example/weather/WeatherApplication.java`.
3.  Click the **Run** or **Debug** button (usually appears above the `main` method).
4.  Wait for the terminal to show: `Started WeatherApplication in ... seconds`.

### Option 2: Run via Terminal

Open your terminal in the project root folder and run:

```bash
mvn spring-boot:run
```

-----

##  How to Use

### 1\. Using the Frontend (GUI)

Once the server is running:

1.  Open your browser and go to: **[http://localhost:8080/](https://www.google.com/search?q=http://localhost:8080/)**
2.  Enter the **Latitude** (e.g., `28.61`) and **Longitude** (e.g., `77.20`).
3.  Click **"Get Weather"**.
4.  View the temperature and wind speed results.

### 2\. Using the API (For Developers)

You can access the backend data directly via your browser or tools like Postman:

**Endpoint:**

```
GET http://localhost:8080/weather
```

**Parameters:**

  * `lat` (double): Latitude of the location.
  * `lon` (double): Longitude of the location.

**Example Request:**

```
http://localhost:8080/weather?lat=40.71&lon=-74.01
```

**Example JSON Response:**

```json
{
    "latitude": 40.71,
    "longitude": -74.01,
    "current_weather": {
        "temperature": -0.4,
        "windspeed": 14.1,
        "winddirection": 238,
        "is_day": 1,
        "weathercode": 2,
        "time": "2025-12-04T12:15"
    }
}
```

-----

##  Troubleshooting

  * **Whitelabel Error Page:** If you see this on the homepage, ensure `WeatherController.java` does not have a `@GetMapping("/")` method returning a String. The controller should let Spring serve the static `index.html` automatically.
  * **Port 8080 in use:** If the app fails to start because the port is taken, find the process using port 8080 and kill it, or restart your computer.

-----

##  Acknowledgments

  * Built during the **3-Month Java Developer Internship**.
  * Weather data provided by **Open-Meteo**.
