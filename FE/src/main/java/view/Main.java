/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Controller.ArrayController;
import model.Algorithm;

/**
 *
 * @author quandba
 */
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        Menu menu = new Menu();
        ArrayController arrayController = new ArrayController(algorithm, menu);    
        arrayController.run();     
    }
}
