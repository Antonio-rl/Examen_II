package pe.edu.upeu.marl.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeerTeclado {
    public static BufferedReader digitador = new BufferedReader(new InputStreamReader(System.in));

    public static String lector(String datos) {
        try {
            datos = digitador.readLine();
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        return datos;
    }

    public static int lector(int datos) {
        try {
            datos = Integer.parseInt(digitador.readLine());
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        return datos;
    }
    
    public static double lector(double datos) {
        try {
            datos = Double.parseDouble(digitador.readLine());
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        return datos;
    }
    public static float lector(float datos) {
        try {
            datos = Float.parseFloat(digitador.readLine());
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        return datos;
    }
    public static boolean lector(boolean datos) {
        try {
            datos = Boolean.parseBoolean(digitador.readLine());
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        return datos;
    }
}