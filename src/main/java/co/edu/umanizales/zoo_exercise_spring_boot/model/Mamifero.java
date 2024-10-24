package co.edu.umanizales.zoo_exercise_spring_boot.model;


public class Mamifero extends Animal {
    private int periodoGestacion; // en meses

    public Mamifero(String nombre, int edad, String especie, int periodoGestacion) {
        super(nombre, edad, especie);
        this.periodoGestacion = periodoGestacion;
    }

    
    public int getPeriodoGestacion() {
        return periodoGestacion;
    }

    public void setPeriodoGestacion(int periodoGestacion) {
        this.periodoGestacion = periodoGestacion;
    }
}
