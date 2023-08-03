package nimesa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class WeatherApp {

    private static final String API_URL = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice;
            while (true) {
                printMenu();
                choice = reader.readLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter the date (YYYY-MM-DD HH:MM:SS): ");
                        String date = reader.readLine();
                        getWeather(date);
                        break;
                    case "2":
                        System.out.print("Enter the date (YYYY-MM-DD): ");
                        date = reader.readLine();
                        getWindSpeed(date);
                        break;
                    case "3":
                        System.out.print("Enter the date (YYYY-MM-DD): ");
                        date = reader.readLine();
                        getPressure(date);
                        break;
                    case "0":
                        System.out.println("Terminating the program.");
                        reader.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Get weather\n2. Get Wind Speed\n3. Get Pressure\n0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void getWeather(String date) throws IOException {
        String apiUrl = API_URL;
        System.out.println("API URL: " + apiUrl);
    }

    private static void getWindSpeed(String date) throws IOException {
       
    	 String apiUrl = API_URL; 
         System.out.println("API URL: " + apiUrl);
    }

    private static void getPressure(String date) throws IOException {
    	 String apiUrl = API_URL;        
         System.out.println("API URL: " + apiUrl );
    }
}
