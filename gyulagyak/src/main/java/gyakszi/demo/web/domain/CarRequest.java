package gyakszi.demo.web.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;

@Builder
@Data   //ezt a hármat mindenhova ctrl + c ctrl + v
@EqualsAndHashCode
public class CarRequest {
    private long id;
    private String brand;
    private String manufacturer;
    @Min(1)
    private int numberOfSeats;
}
