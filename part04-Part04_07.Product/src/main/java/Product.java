/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String productName, double cost, int quantity){
        this.name = productName;
        this.price = cost;
        this.quantity = quantity;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
        //Banana, price 1.1, 13 pcs
}