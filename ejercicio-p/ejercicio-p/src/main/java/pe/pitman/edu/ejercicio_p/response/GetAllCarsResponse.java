package pe.pitman.edu.ejercicio_p.response;

import pe.pitman.edu.ejercicio_p.dto.CarDto;

import java.util.List;

public record GetAllCarsResponse(String code,
                                 String error,
                                 List<CarDto> cars) {
}
