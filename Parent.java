/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */

public class Parent {
    String parentName;
    public Parent() {}

    public String getParentName() {
        return parentName;
    }public Parent(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }

}