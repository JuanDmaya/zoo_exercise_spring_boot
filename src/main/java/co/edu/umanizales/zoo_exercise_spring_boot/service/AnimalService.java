package co.edu.umanizales.zoo_exercise_spring_boot.service;

import co.edu.umanizales.zoo_exercise_spring_boot.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    private List<Animal> animales = new ArrayList<>();

    // Agregar animal
    public Animal agregarAnimal(Animal animal) {
        animales.add(animal);
        return animal;
    }

    // Obtener todos los animales
    public List<Animal> obtenerTodosLosAnimales() {
        return animales;
    }

    // Actualizar un animal por nombre
    public Optional<Animal> actualizarAnimal(String nombre, Animal nuevoAnimal) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                animales.set(i, nuevoAnimal);
                return Optional.of(nuevoAnimal);
            }
        }
        return Optional.empty();
    }

    // Eliminar un animal por nombre
    public boolean eliminarAnimal(String nombre) {
        return animales.removeIf(animal -> animal.getNombre().equals(nombre));
    }
}