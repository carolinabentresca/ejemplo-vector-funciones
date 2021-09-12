/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovector;

public class EjemploVector {

    public static void main(String[] args) {
        System.out.println("Los Nombres de mi Vector son: ");
        System.out.println("******************************");
        MostrarNombres();
        System.out.println("******************************");
    }

    public static void MostrarNombres() {
        String[] nombres = {"Federico", "Flopy", "Mimi", "Chaparro", "Julian", "Carolina"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

}
