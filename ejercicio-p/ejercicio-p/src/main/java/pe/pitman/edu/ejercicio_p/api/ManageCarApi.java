package pe.pitman.edu.ejercicio_p.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.pitman.edu.ejercicio_p.dto.CarCreateDto;
import pe.pitman.edu.ejercicio_p.dto.CarDetailDto;
import pe.pitman.edu.ejercicio_p.dto.CarDto;
import pe.pitman.edu.ejercicio_p.response.*;
import pe.pitman.edu.ejercicio_p.service.ManageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cars")
public class ManageCarApi {

    @Autowired
    ManageService manageService;

    @GetMapping("/all")
    public GetAllCarsResponse getAllCars() {

        try {
            List<CarDto> cars = manageService.getAllCars();
            if (!cars.isEmpty())
                return new GetAllCarsResponse("01", null, cars);
            else
                return new GetAllCarsResponse("02", "Cars not found", null);

        } catch (Exception e) {
            e.printStackTrace();
            return new GetAllCarsResponse("99", "There was an error I tried again", null);

        }
    }

    @GetMapping("/detail")
    public GetDetailCarResponse getDetailCar(@RequestParam(value = "id", defaultValue = "0") int id) {

        try {
            Optional<CarDetailDto> optional = manageService.getDetailCar(id);
            return optional.map(car ->
                    new GetDetailCarResponse("01", null, car)
            ).orElse(
                    new GetDetailCarResponse("02", "Cars not found", null)
            );

        } catch (Exception e) {
            e.printStackTrace();
            return new GetDetailCarResponse("99", "There was an error I tried again", null);
        }


    }

    @PutMapping("/update")
    public UpdateCarResponse updateCar(@RequestBody CarDto carDto) {

        try {
            if (manageService.updateCar(carDto))
                return new UpdateCarResponse("01", null);
            else
                return new UpdateCarResponse("02", "Update failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new UpdateCarResponse("99", "There was an error I tried again");
        }


    }

    @DeleteMapping("/delete/{id}")
    public DeleteCarResponse deleteCar(@PathVariable String id) {

        try {
            if (manageService.deleteCar(Integer.parseInt(id)))
                return new DeleteCarResponse("01", null);
            else
                return new DeleteCarResponse("02", "Delete failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new DeleteCarResponse("99", "There was an error I tried again");
        }


    }

    @PostMapping("/create")
    public CreateCarResponse createCar(@RequestBody CarCreateDto userCreateDto) {

        try {
            if (manageService.createCar(userCreateDto))
                return new CreateCarResponse("01", null);
            else
                return new CreateCarResponse("02", "Create failed");

        } catch (Exception e) {
            e.printStackTrace();
            return new CreateCarResponse("99", "There was an error I tried again");
        }


    }
}
