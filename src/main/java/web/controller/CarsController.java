package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servise.CarsServise;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsServise carsServise;

    public CarsController(CarsServise carsServise) {
        this.carsServise = carsServise;
    }

    @GetMapping()
    public String show(@RequestParam(name = "count", required = false) Integer count, ModelMap modelMap) {
        if (count == null) {
            modelMap.addAttribute("cars", carsServise.getAllCars());
        } else {
            modelMap.addAttribute("cars", carsServise.getCarsNumber(count));
        }
        return "cars";
    }
}
