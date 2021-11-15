package gyakszi.demo.web.transformer;

import gyakszi.demo.dal.domain.CarEntity;
import gyakszi.demo.service.domain.Car;
import gyakszi.demo.web.domain.CarRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarRequestToCarTransformer {

    public Car transform(CarRequest request){
        return Car.builder()
                .brand(request.getBrand())
                .id(request.getId())
                .manufacturer(request.getManufacturer())
                .numberOfSeats(request.getNumberOfSeats())
                .build();
    }

    public List<Car> transform(List<CarRequest> requests){
        return requests.stream().map(this::transform).collect(Collectors.toList());
    }
}
