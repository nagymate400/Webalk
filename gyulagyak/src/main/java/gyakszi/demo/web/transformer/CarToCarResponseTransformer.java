package gyakszi.demo.web.transformer;

import gyakszi.demo.dal.domain.CarEntity;
import gyakszi.demo.service.domain.Car;
import gyakszi.demo.web.domain.CarResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarToCarResponseTransformer {

    public CarResponse transform(Car car){
        return CarResponse.builder()
                .brand(car.getBrand())
                .id(car.getId())
                .manufacturer(car.getManufacturer())
                .numberOfSeats(car.getNumberOfSeats())
                .build();
    }

    public List<CarResponse> transform(List<Car> cars){
        return cars.stream().map(this::transform).collect(Collectors.toList());
    }
}
