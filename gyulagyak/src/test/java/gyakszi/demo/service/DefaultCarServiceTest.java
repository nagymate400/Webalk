package gyakszi.demo.service;

import gyakszi.demo.dal.CarDao;
import gyakszi.demo.dal.domain.CarEntity;
import gyakszi.demo.service.domain.Car;
import gyakszi.demo.service.transformer.CarEntityToCarTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

class DefaultCarServiceTest {

    private static final long ID = 1L;
    private static final String BRAND = "M3";
    private static final String MANUFACTURER = "BMW";
    private static final int NUMBER_OF_SEATS = 4;

    @Mock
    private CarDao carDao;

    @Mock
    private CarEntityToCarTransformer carEntityToCarTransformer;

    @InjectMocks
    private DefaultCarService underTest;

    @BeforeEach
    private void createMocks(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    void testGetAllCars() {
        //GIVEN
        given(carDao.getAllCars()).willReturn(List.of(createCarEntity()));
        given(carEntityToCarTransformer.transform(List.of(createCarEntity()))).willReturn(List.of(createCar()));
        List<Car> expected = List.of(createCar());

        //WHEN
        List<Car> result = underTest.getAllCars();

        //THEN
        then(carDao).should().getAllCars();
        then(carEntityToCarTransformer).should().transform(List.of(createCarEntity()));
        assertEquals(expected, result);
    }

    @Test
    void testGetCar() {
    }

    @Test
    void testAddCar() {
    }

    @Test
    void testDeleteCar() {
    }

    @Test
    void TestUpdateCar() {
    }

    private Car createCar () {
        return Car.builder()
                .id(ID)
                .brand(BRAND)
                .manufacturer(MANUFACTURER)
                .numberOfSeats(NUMBER_OF_SEATS)
                .build();
    }

    private CarEntity createCarEntity () {
        return CarEntity.builder()
                .id(ID)
                .brand(BRAND)
                .manufacturer(MANUFACTURER)
                .numberOfSeats(NUMBER_OF_SEATS)
                .build();
    }
}