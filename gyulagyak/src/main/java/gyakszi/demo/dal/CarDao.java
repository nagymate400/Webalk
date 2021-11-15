package gyakszi.demo.dal;

import gyakszi.demo.web.domain.CarResponse;

import gyakszi.demo.dal.domain.CarEntity;
import java.util.List;

public interface CarDao {

    List<CarEntity> getAllCars();

    CarEntity getCar(Long id);

    void saveCar(CarEntity entity);

    void deleteCar(Long id);

}
