package gyakszi.demo.service.transformer;

import gyakszi.demo.dal.domain.CarEntity;
import gyakszi.demo.service.domain.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarToEntity {

    public CarEntity transform(Car car){
        return CarEntity.builder()
                .brand(car.getBrand())
                .id(car.getId())
                .manufacturer(car.getManufacturer())
                .numberOfSeats(car.getNumberOfSeats())
                .build();
    }

    public List<CarEntity> transform(List<Car> cars){
        return cars.stream().map(this::transform).collect(Collectors.toList());
    }
}
