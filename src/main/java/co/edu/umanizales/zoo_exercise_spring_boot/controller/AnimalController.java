package co.edu.umanizales.zoo_exercise_spring_boot.controller;


import co.edu.umanizales.zoo_exercise_spring_boot.model.Animal;
import co.edu.umanizales.zoo_exercise_spring_boot.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animales")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("/crear")
    public Animal agregarAnimal(@RequestBody Animal animal) {
        return animalService.agregarAnimal(animal);
    }

    @GetMapping("/todos")
    public List<Animal> obtenerTodosLosAnimales() {
        return animalService.obtenerTodosLosAnimales();
    }
    
    @PutMapping("/actualizar/{nombre}")
    public Optional<Animal> actualizarAnimal(@PathVariable String nombre, @RequestBody Animal nuevoAnimal) {
        return animalService.actualizarAnimal(nombre, nuevoAnimal);
    }


    @DeleteMapping("/eliminar/{nombre}")
    public boolean eliminarAnimal(@PathVariable String nombre) {
        return animalService.eliminarAnimal(nombre);
    }
}