package gyakszi.demo.service;

import gyakszi.demo.service.domain.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car getCar(Long id);

    void addCar(Car car);

    void deleteCar(Long id);

    void updateCar(Long id, Car updatedCar);
}
