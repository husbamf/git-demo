/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Em
 */
public class AccountTwo {
    private String name; //instance variable
  
    public AccountTwo(String name) { //constructor name is class name
        this.name = name;
    }
    
    //method to set the name in the object
    public void setName(String name){
        this.name = name; //store the name
    }
    //method to retrieve the name from the object
    public String getName(){
        return name;
    }
}
