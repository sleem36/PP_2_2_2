package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiseImpl;


@Controller
public class CarController {
    private final CarServiseImpl carService;

    @Autowired
    public CarController(CarServiseImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carTest (@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("listCars", carService.index());
        model.addAttribute("count", count);
        return "all/cars";
    }
}
