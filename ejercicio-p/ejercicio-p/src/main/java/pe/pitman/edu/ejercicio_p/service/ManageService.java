package pe.pitman.edu.ejercicio_p.service;

import pe.pitman.edu.ejercicio_p.dto.CarCreateDto;
import pe.pitman.edu.ejercicio_p.dto.CarDetailDto;
import pe.pitman.edu.ejercicio_p.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getDetailCar(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCar(int id) throws Exception;

    boolean createCar(CarCreateDto carDto) throws Exception;
}
