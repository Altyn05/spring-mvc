package web.controller;

import web.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CarController {

    private final Service service;
     @Autowired
    public CarController(Service service) {
        this.service = service;
    }

    @GetMapping("/cars")
        public String  getCars(@RequestParam(value="count",  defaultValue="5")int value, Model model){
        model.addAttribute("fromcars", service.getCarsByCount(value));
        return  "cars";
        }
}
