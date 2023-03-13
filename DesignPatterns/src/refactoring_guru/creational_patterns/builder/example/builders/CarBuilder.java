package refactoring_guru.creational_patterns.builder.example.builders;

import refactoring_guru.creational_patterns.builder.example.components.Engine;
import refactoring_guru.creational_patterns.builder.example.components.GPSNavigator;
import refactoring_guru.creational_patterns.builder.example.components.Transmission;
import refactoring_guru.creational_patterns.builder.example.components.TripComputer;
import refactoring_guru.creational_patterns.builder.example.cars.Car;
import refactoring_guru.creational_patterns.builder.example.cars.CarType;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}