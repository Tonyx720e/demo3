/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo3;

import com.example.demo3.entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tony
 */
@RestController
public class DemoRestController {

    private static final List<Empleado> empleados = new ArrayList<>(); 
    static{
            empleados.add(new Empleado( "Tony", "Medina", 35 ));
            empleados.add(new Empleado( "Dylan", "Piña",5 ));
            empleados.add(new Empleado( "Angelberth", "Noguera", 32 ));
}
    
    @GetMapping("/")
    public String holaMundo() {
        return "¡Hola mundo!";
    }
    @GetMapping("/empleados")
    public List<Empleado>  empleados(){
        return empleados;
    }
}
