package gyakszi.demo.dal.repository;

import org.springframework.data.repository.CrudRepository;

import gyakszi.demo.dal.domain.CarEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Long> {

    List<CarEntity> findAll();

}
