package com.aleks;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        String apellidos = msg.solicitaDatos("Escribe tus apellidos: ");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);

    }
}
