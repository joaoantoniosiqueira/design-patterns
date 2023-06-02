package br.com.amplitude.designpatterns.capitulo2.displayers;

import br.com.amplitude.designpatterns.capitulo2.DisplayElement;
import br.com.amplitude.designpatterns.capitulo2.Observer;
import br.com.amplitude.designpatterns.capitulo2.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature;
    private float minTemperature;
    private float sumTemperature;
    private boolean firstMeasurement = true;
    private int measurementCount = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float averageTemperature = sumTemperature / measurementCount;
        System.out.println("Avg/Max/Min temperature = " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (firstMeasurement) {
            maxTemperature = temperature;
            minTemperature = temperature;
            sumTemperature = temperature;
            measurementCount++;
            firstMeasurement = false;
        } else {
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            } else if (temperature < minTemperature) {
                minTemperature = temperature;
            }
            sumTemperature += temperature;
            measurementCount++;
        }

        display();
    }
}
