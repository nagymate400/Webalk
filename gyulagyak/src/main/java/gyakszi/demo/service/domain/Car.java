package gyakszi.demo.service.domain;

import gyakszi.demo.web.domain.CarResponse;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode
public class Car {

    private long id;
    private String brand;
    private String manufacturer;
    private int numberOfSeats;

}
