package gyakszi.demo.web.controller;


import gyakszi.demo.service.CarService;
import gyakszi.demo.web.domain.CarRequest;
import gyakszi.demo.web.domain.CarResponse;
import gyakszi.demo.web.transformer.CarRequestToCarTransformer;
import gyakszi.demo.web.transformer.CarToCarResponseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class DefaultCarController implements CarController {

    @Autowired
    private CarRequestToCarTransformer carRequestToCarTransformer;

    @Autowired
    private CarService service;

    @Autowired
    private CarToCarResponseTransformer carToCarResponseTransformer;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CarResponse> getAllCars(){
        return carToCarResponseTransformer.transform(service.getAllCars());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CarResponse getCar(@PathVariable("id") Long id){
        return carToCarResponseTransformer.transform(service.getCar(id));
    }

    @PostMapping(path = "")
    public void addCar(@RequestBody @Valid CarRequest request){
        service.addCar(carRequestToCarTransformer.transform(request));
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCar(@PathVariable("id")Long id){
        service.deleteCar(id);
    }

    @PutMapping(path = "/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody @Valid CarRequest request){
        service.updateCar(id,carRequestToCarTransformer.transform(request));

    }
}
