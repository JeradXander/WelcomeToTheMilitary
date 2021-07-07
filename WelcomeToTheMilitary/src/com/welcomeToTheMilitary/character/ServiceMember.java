package com.welcomeToTheMilitary.character;

import com.welcomeToTheMilitary.attributes.Inventory;
import com.welcomeToTheMilitary.attributes.Item;

public class ServiceMember extends Character {
    public int heal;
    public int level;
     private String special = "Baking";
//     Stretch goal is to add private Bldg location pulling from Post/Fort Sill Map
     private String location;
     private Inventory inventory = null;

// ServiceMember Constructor that pulls from Character class
    public ServiceMember(String _name, String _special, String _location ) {
        super(_name);
        this.special = _special;
        this.location = _location;
        inventory = new Inventory();
    }
    public String getName(){
        return super.getName();
    }
    public String getSpecial(){
        return special;
    }
    public String getLocation(){
        return location;
    }
    public void  setLocation(String _location){
        this.location = _location;
    }

    // method to obtain item and store it in the inventory
    public void storeItemInVentory(String itemName) {
        System.out.println("Adding up the item: " + itemName);
        inventory.addItem(new Item(itemName));
    }

    public void viewMyInventory() {
        inventory.viewInventory();
    }

    public int getHealth(String name, int heal) {
       //super(name);
        this.heal = heal;
        //this.type = "Consumable";
        return heal;
    }



}