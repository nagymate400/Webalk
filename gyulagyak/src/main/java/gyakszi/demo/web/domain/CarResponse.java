package gyakszi.demo.web.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class CarResponse {

    private long id;
    private String brand;
    private String manufacturer;
    private int numberOfSeats;
}
