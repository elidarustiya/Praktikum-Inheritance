/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class MoodyTest {
     public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        SadObject Sad = new SadObject();
        HappyObject Happy = new HappyObject();
        
        m.speak();
        Sad.cry();
        Happy.laugh();
    }
}