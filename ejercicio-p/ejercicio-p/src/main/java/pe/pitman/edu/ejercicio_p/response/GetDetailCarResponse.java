package pe.pitman.edu.ejercicio_p.response;

import pe.pitman.edu.ejercicio_p.dto.CarDetailDto;

public record GetDetailCarResponse(String code,
                                   String error,
                                   CarDetailDto carDetailDto) {
}
