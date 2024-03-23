package Practica1;

import java.util.Scanner;

/**
 * Esta clase permite calcular la nota definitiva de un estudiante basada en tres notas parciales.
 * También verifica la validez de las notas ingresadas y determina si el estudiante aprobó o no.
 * 
 * @author Tomas_Gonzalez
 * @version 22/03/2024
 */
public class notasUF2 {
    // Variables para almacenar las notas y la nota definitiva
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    
    // Scanner para entrada de datos
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Este método permite al usuario ingresar las notas del estudiante.
     * 
     * @param uf1 La primera nota del estudiante.
     * @param uf2 La segunda nota del estudiante.
     * @param uf3 La tercera nota del estudiante.
     */
    public void IngresaNotas(double uf1, double uf2, double uf3) {
        System.out.println("Ingrese las notas del estudiante:");
        
        this.uf1 = uf1;
        this.uf2 = uf2;
        this.uf3 = uf3;
    }
    
    /**
     * Este método verifica si las notas introducidas son válidas (están en el rango de 0 a 10).
     */
    public void comprobacion(){
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }
        
        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }
        
        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }
    
    /**
     * Este método calcula la nota definitiva del estudiante.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        
        def = acu1 + acu2 + acu3;
    }
    
    /**
     * Este método muestra las notas ingresadas por el usuario y la nota definitiva calculada.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        
        System.out.println("Acumuladoill 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Este método determina si el estudiante aprobó o no, basado en su nota definitiva.
     * 
     * @return Un mensaje indicando si el estudiante aprobó, suspendió o si hay un error en las notas.
     */
    public String aprobado() {
        if (def < 5 && def >= 0) {
            return "El estudiante suspendió";
        } else {
            if (def >= 5 && def <= 10) {
                return "El estudiante aprobó";
            } else {
                return "Error en las notas";
            }
        }
    }
    
    /**
     * El método principal que ejecuta el programa.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Instanciamos un objeto de la clase notas
        notasUF2 fc = new notasUF2();
        
        // Llamamos a los métodos para ingresar notas, verificarlas, calcular la nota definitiva, mostrar resultados y determinar si el estudiante aprobó
        fc.IngresaNotas(7.5, 8.0, 7.0);
        fc.comprobacion();
        fc.Calculonotas();
        fc.Mostrar();
        System.out.println(fc.aprobado());
    }
}