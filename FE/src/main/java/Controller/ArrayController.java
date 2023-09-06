/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Algorithm;
import view.Menu;

/**
 *
 * @author quandba
 */
public class ArrayController {

    private Algorithm al;
    private Menu menu;

    public ArrayController(Algorithm al, Menu menu) {
        this.al = al;
        this.menu = menu;
    }
    public void run() {
        while (true) {
            double decimalNumber = menu.input();
            if (decimalNumber == 3) {
                break;
            }
            int arraySize = (int) decimalNumber;
            al.generateRandomArray(arraySize, 1, 100);
            menu.displayArray(al.getArray());
            int choice = menu.getMenuChoice();
            if (choice == 1) {
                al.bubbleSort();
            } else if (choice == 2) {
                al.quickSort();
            }
            if (choice != 3) {
                menu.displaySortedArray(al.getArray());
            }
        }
    }
}
