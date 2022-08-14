package com.aleks;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);

    }
}
