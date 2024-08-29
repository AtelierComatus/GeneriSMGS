/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generismgs;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class GeneriSMGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //edad y nombre 
        Pair<Integer, String> ageName = new Pair<>(20,"Raul Lopéz");
        
        //EPS y fecha 
        Pair<String, LocalDate> epsBirthDate = new Pair<>("Sura", LocalDate.of(2004, 2, 15));
        
        // Almacenar los datos en una "base de datos" (puede ser un arreglo o una lista)
        List<Pair<?, ?>> userDatabase = new ArrayList<>();
        userDatabase.add(ageName);
        userDatabase.add(epsBirthDate);
        
        
        userDatabase.add(new Pair<>(23, "Camilo Suarez"));
        userDatabase.add(new Pair<>("Nueva EPS", LocalDate.of(1997, 8, 13)));
        // Mostrar los datos almacenados
        System.out.println("Datos base");
        for (Pair<?, ?> pair : userDatabase) {
            System.out.println(pair);
            //System.out.println("Nombre: " + pair.getSecond());
            //System.out.println("Edad: " + pair.getFirst() +"Años");
            //System.out.println("EPS: " + pair.getFirst());
            //System.out.println("Fecha de nacimiento: : " + pair.getSecond());
            
        }
    
    }
}
