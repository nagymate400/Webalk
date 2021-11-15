package gyakszi.demo.dal.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CarEntity {

    @Id
    private long id;
    @NotNull
    private String brand;
    @NotNull
    private String manufacturer;
    @NotNull
    @Min(1)
    private int numberOfSeats;
}
