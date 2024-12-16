package pe.pitman.edu.ejercicio_p.repository;

import org.springframework.data.repository.CrudRepository;
import pe.pitman.edu.ejercicio_p.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
