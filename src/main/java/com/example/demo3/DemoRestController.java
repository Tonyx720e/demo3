/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo3;

import com.example.demo3.entidades.Empleado;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tony
 */
@RestController
public class DemoRestController {
    
    private static final List<Empleado> empleados = new ArrayList<>();    
    
    static {
        empleados.add(new Empleado(1, "Tony", "Medina", 35));
        empleados.add(new Empleado(2, "Dylan", "Piña", 5));
        empleados.add(new Empleado(3, "Angelberth", "Noguera", 32));
    }
    
    @GetMapping("/")
    public String holaMundo() {
        return "¡Hola mundo!";
    }
    
    @GetMapping("/empleados")
    public List<Empleado> empleados() {
        return empleados;
    }
    
    @GetMapping("/empleados/{id}")
    public Empleado getIdEmpleado(@PathVariable Long id) {
        return empleados.stream().filter(empleado -> empleado.getId() == id).findFirst().orElse(null);
    }
    
    @PostMapping("/empleados")
    public String addEmpleado(@RequestBody Empleado elEmpleado) {
        Long nuevoId = empleados.stream().mapToLong(Empleado::getId).max().orElse(0) + 1;
        elEmpleado.setId(nuevoId);
        empleados.add(elEmpleado);
        return "El empleado se ha añadido correctamente";
    }
    
}
