package gyakszi.demo.service.transformer;

import gyakszi.demo.dal.domain.CarEntity;
import gyakszi.demo.service.domain.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarEntityToCarTransformer {

    public Car transform(CarEntity entity){
        return Car.builder()
                .brand(entity.getBrand())
                .id(entity.getId())
                .manufacturer(entity.getManufacturer())
                .numberOfSeats(entity.getNumberOfSeats())
                .build();
    }

    public List<Car> transform(List<CarEntity> entities){
        return entities.stream().map(this::transform).collect(Collectors.toList());
    }
}
