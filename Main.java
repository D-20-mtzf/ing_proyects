/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softpong;
/**
 *
 * @author Daniel Martinez y Miguel Parada
 */

/**
En este ejemplo, primero obtenemos la instancia única de la clase GameConfig utilizando el método estático getInstance.
Luego, obtenemos los valores actuales de configuración utilizando los métodos get correspondientes y los imprimimos en la consola.
*/
public class Main {
/**
A continuación, cambiamos algunos valores de configuración utilizando los métodos set correspondientes y volvemos a imprimir los nuevos valores en la consola.
Cada vez que ejecutamos este método main, obtenemos la misma instancia de la clase GameConfig gracias al patrón Singleton implementado en la clase,
lo que nos permite mantener la coherencia de la configuración en todo el programa.
*/
    public static void main(String[] args) {
        // Obtener la instancia de GameConfig
        GameConfig config = GameConfig.getInstance();
        
        // Obtener los valores actuales de configuración
        int musicVolume = config.getMusicVolume();
        int soundVolume = config.getSoundVolume();
        String background = config.getBackground();
        
        // Imprimir los valores de configuración actuales
        System.out.println("Configuración actual:");
        System.out.println("Volumen de música: " + musicVolume);
        System.out.println("Volumen de sonido: " + soundVolume);
        System.out.println("Fondo: " + background);
        
        // Cambiar algunos valores de configuración
        config.setMusicVolume(80);
        config.setBackground("ciudad");
        
        // Imprimir los nuevos valores de configuración
        System.out.println("Configuración actualizada:");
        System.out.println("Volumen de música: " + config.getMusicVolume());
        System.out.println("Volumen de sonido: " + config.getSoundVolume());
        System.out.println("Fondo: " + config.getBackground());
    }
    
}
