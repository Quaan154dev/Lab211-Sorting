/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author quandba
 */
public class Menu {

    public double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số lượng phần tử: ");
        return scanner.nextDouble();
    }
    public int getMenuChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice < 1 || choice > 3) {
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Thoát");
            System.out.print("Chọn : ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Lựa chọn không hợp lệ");
            }
        }
        return choice;
    }
    
    public void displayArray(int[] arr) {
        System.out.println("Mảng: " + Arrays.toString(arr));
    }

    public void displaySortedArray(int[] arr) {
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
