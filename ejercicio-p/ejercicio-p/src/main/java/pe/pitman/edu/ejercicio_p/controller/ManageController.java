package pe.pitman.edu.ejercicio_p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.pitman.edu.ejercicio_p.dto.CarDto;
import pe.pitman.edu.ejercicio_p.service.ManageService;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    ManageService manageService;


    @GetMapping("/start")
    public String start(Model model) {

        try {
            List<CarDto> cars = manageService.getAllCars();
            model.addAttribute("cars", cars);
            model.addAttribute("error", null);

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Ocurrio un error al intentar procesar el servicio");
        }
        return "home";

    }
}
