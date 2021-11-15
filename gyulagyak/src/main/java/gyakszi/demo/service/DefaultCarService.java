package gyakszi.demo.service;

import gyakszi.demo.dal.CarDao;
import gyakszi.demo.service.domain.Car;
import gyakszi.demo.service.transformer.CarEntityToCarTransformer;
import gyakszi.demo.service.transformer.CarToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCarService implements CarService {

    @Autowired
    private CarDao carDao;

    @Autowired
    private CarEntityToCarTransformer carEntityToCarTransformer;

    @Autowired
    private CarToEntity carToEntity;

    @Override
    public List<Car> getAllCars() {
        return carEntityToCarTransformer.transform(carDao.getAllCars());
    }

    @Override
    public Car getCar(Long id) {
        return carEntityToCarTransformer.transform(carDao.getCar(id));
    }

    @Override
    public void addCar(Car car) {
        carDao.saveCar(carToEntity.transform(car));
    }

    @Override
    public void deleteCar(Long id) {
        carDao.deleteCar(id);
    }

    @Override
    public void updateCar(Long id, Car updatedCar) {
        Car adatmegorzo = carEntityToCarTransformer.transform(carDao.getCar(id));
        settingFields(id, updatedCar, adatmegorzo);
        carDao.saveCar(carToEntity.transform(adatmegorzo));
    }

    private void settingFields(Long id, Car updatedCar, Car adatmegorzo) {
        adatmegorzo.setId(id);
        adatmegorzo.setBrand(updatedCar.getBrand());
        adatmegorzo.setManufacturer(updatedCar.getManufacturer());
        adatmegorzo.setNumberOfSeats(updatedCar.getNumberOfSeats());
    }
}
