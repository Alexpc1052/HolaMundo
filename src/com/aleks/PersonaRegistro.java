package com.aleks;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Alexander comenté la liena de código que considero se puede eliminar
        //System.out.println("esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);

    }
}
