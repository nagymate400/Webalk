package gyakszi.demo.web.transformer;

import gyakszi.demo.service.domain.Car;
import gyakszi.demo.web.domain.CarRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarRequestToCarTransformerTest {

    private static final long ID = 1L;
    private static final String BRAND = "M3";
    private static final String MANUFACTURER = "BMW";
    private static final int NUMBER_OF_SEATS = 4;

    private CarRequestToCarTransformer underTest;

    @BeforeEach
    void setUp(){
        underTest = new CarRequestToCarTransformer();
    }

    @Test
    void testTransform() {

        //GIVEN
        Car expected = createCar();
        CarRequest carRequest = createCarRequest();

        //WHEN
        Car result = underTest.transform(carRequest);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    void testTransformWithLists() {

        //GIVEN
        List<Car> expected = List.of(createCar());
        List<CarRequest> carRequestList = List.of(createCarRequest());
        //WHEN
        List<Car> result = underTest.transform(carRequestList);
        //THEN
        assertEquals(result, expected);
    }

    private Car createCar () {
        return Car.builder()
                .id(ID)
                .brand(BRAND)
                .manufacturer(MANUFACTURER)
                .numberOfSeats(NUMBER_OF_SEATS)
                .build();
    }


    private CarRequest createCarRequest () {
        return CarRequest.builder()
                .id(ID)
                .brand(BRAND)
                .manufacturer(MANUFACTURER)
                .numberOfSeats(NUMBER_OF_SEATS)
                .build();
    }


}