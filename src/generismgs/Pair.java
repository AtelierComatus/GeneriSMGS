/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generismgs;

/**
 *
 * @author USER
 */
public class Pair<T, U> {
    // Atributos
    private T first;
    private U second;

    // Constructor que recibe dos argumentos de tipo T y U
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // M�todo que devuelve el primer elemento del par
    public T getFirst() {
        return first;
    }

    // M�todo que devuelve el segundo elemento del par
    public U getSecond() {
        return second;
    }

    // M�todo que devuelve una representaci�n en cadena del par
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
