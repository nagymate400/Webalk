package gyakszi.demo.dal;

import gyakszi.demo.dal.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import gyakszi.demo.dal.domain.CarEntity;
import java.util.List;

@Component
public class DefaultCarDao implements CarDao{

    @Autowired
    private CarRepository carRepository;


    @Override
    public List<CarEntity> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public CarEntity getCar(Long id) {
        if (carRepository.findById(id).isPresent())             //ha optional a téma akkor ez megy a követkető overrideig úgy hogy majd be kell helyetesíteni a dolgokat!
            return carRepository.findById(id).get();
        else
            return new CarEntity();
    }

    @Override
    public void saveCar(CarEntity entity) {
        carRepository.save(entity);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

}
