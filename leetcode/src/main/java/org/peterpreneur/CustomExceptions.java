/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.peterpreneur;


public class CustomExceptions extends RuntimeException{

    public CustomExceptions(String wrong_length) {
        System.out.println(wrong_length);
    }

}
