package tech.getarrays.employeemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class controller {
    
    @GetMapping("/prueba")
    public String prueba(){
        return "Hola mundo";
    }

}
