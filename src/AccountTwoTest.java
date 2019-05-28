/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Em,2019
 */
public class AccountTwoTest {
    public static void main(String[] args) {
        //create two Account objects
        AccountTwo account1 = new AccountTwo("Jane Green");
        AccountTwo account2 = new AccountTwo("John Blue");
        
        //display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
        
        account1.setName("Em Tay");
        
        System.out.printf("account1 name is: %s%n", account1.getName());
    }
}
