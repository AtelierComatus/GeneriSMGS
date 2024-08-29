/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generismgs;

/**
 *
 * @author USER
 */
public class GeneriSMGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un par para almacenar la edad y el nombre de una persona
        Pair<Integer, String> ageNamePair = new Pair<>(30, "Juan Pérez");

        // Crear un par para almacenar la EPS y la fecha de nacimiento
        Pair<String, String> epsBirthDatePair = new Pair<>("SaludTotal", "1994-05-23");

        // Imprimir los pares
        System.out.println("Edad y Nombre: " + ageNamePair);
        System.out.println("EPS y Fecha de Nacimiento: " + epsBirthDatePair);

        // Almacenar los datos en una "base de datos" (puede ser un arreglo o una lista)
        Pair[] userDatabase = new Pair[2];
        userDatabase[0] = ageNamePair;
        userDatabase[1] = epsBirthDatePair;

        // Mostrar los datos almacenados
        for (Pair<?, ?> pair : userDatabase) {
            System.out.println(pair);
        }
    
    }
}
