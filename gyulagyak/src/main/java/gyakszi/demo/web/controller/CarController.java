package gyakszi.demo.web.controller;

import gyakszi.demo.web.domain.CarRequest;
import gyakszi.demo.web.domain.CarResponse;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface CarController {

    List<CarResponse> getAllCars();

    CarResponse getCar(Long id);

    void addCar(CarRequest request);

    void deleteCar(Long id);

    void updateCar(Long id, CarRequest request);

}
