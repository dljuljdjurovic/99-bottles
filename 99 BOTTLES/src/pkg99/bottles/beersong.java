/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg99.bottles;

/**
 *
 * @author Daniel
 */
public class beersong {
    public static void main (String [] args){
        ninety_nine_bottles_of_beer();
    }
    public static void ninety_nine_bottles_of_beer(){
             int numberbeer = 99;
    String word = "bottles";
    while (numberbeer > 0) {
    System.out.println(numberbeer + " " + word + " of beer on the wall " + numberbeer + " " + word + " of beer.");
      System.out.println("Take one down pass it around,");
    numberbeer = numberbeer - 1;
    if (numberbeer == 1) {
        word = "bottle";
      }
    if (numberbeer > 0) {
        System.out.println(numberbeer + " " + word + " of beer on the wall");
      } else {
        System.out.println("No more bottles of beer on the wall");
      }
    }
    }
}
