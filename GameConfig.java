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
GameConfig es la clase que contiene la configuración del juego.
La clase tiene tres variables miembro privadas: musicVolume, soundVolume y background, 
que se utilizan para almacenar la configuración actual del juego.
*/
public class GameConfig {
    
        private static GameConfig instance;
    private int musicVolume;
    private int soundVolume;
    private String background;
/**
El constructor de la clase GameConfig es privado para evitar que se creen nuevas instancias de la clase. 
En su lugar, utilizamos el método estático getInstance() para obtener la instancia única de la clase.
*/
    private GameConfig() {
        // Constructor privado para evitar la creación de nuevas instancias.
        musicVolume = 50;
        soundVolume = 50;
        background = "default";
    }
/**
El método getInstance() comprueba si ya existe una instancia de la clase. 
Si no existe, se crea una nueva instancia. Si ya existe, se devuelve la instancia existente.
*/
    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }
/**
Los métodos getMusicVolume(), setMusicVolume(), getSoundVolume(), setSoundVolume(), getBackground() y setBackground() 
se utilizan para acceder y modificar la configuración del juego.
*/
    public int getMusicVolume() {
        return musicVolume;
    }

    public void setMusicVolume(int musicVolume) {
        this.musicVolume = musicVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
