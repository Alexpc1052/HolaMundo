package com.aleks;

import java.util.Scanner;

public class Mensaje {
    public String solicitaDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, Bienvendio a Java \n", p);
    }
}
