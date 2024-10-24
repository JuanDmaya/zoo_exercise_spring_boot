package co.edu.umanizales.zoo_exercise_spring_boot.model;

public class Ave extends Animal {
    private boolean puedeVolar;

    public Ave(String nombre, int edad, String especie, boolean puedeVolar) {
        super(nombre, edad, especie);
        this.puedeVolar = puedeVolar;
    }

    
    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}