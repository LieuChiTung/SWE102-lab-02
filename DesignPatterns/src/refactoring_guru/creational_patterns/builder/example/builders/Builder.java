package refactoring_guru.creational_patterns.builder.example.builders;

import refactoring_guru.creational_patterns.builder.example.components.Engine;
import refactoring_guru.creational_patterns.builder.example.components.GPSNavigator;
import refactoring_guru.creational_patterns.builder.example.components.Transmission;
import refactoring_guru.creational_patterns.builder.example.components.TripComputer;
import refactoring_guru.creational_patterns.builder.example.cars.CarType;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}