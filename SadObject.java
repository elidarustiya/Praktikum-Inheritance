/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class SadObject {
    extends MoodyObject{
   
    protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
 }
}