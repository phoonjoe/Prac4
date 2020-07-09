/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Missing One
 */
public class TestEmployee {
    public static void main(String []args){
    
        Employee s1 = new Employee("Joe",2000.00);
        Employee s2 = new Employee("Lol");
        s2.setSalary(5600.00);
        /* //part b
        System.out.println("Name:" + s1.getName());
        System.out.println("Current Salary:" + s1.getSalary());
        
        s1.raiseSalary(8);
        System.out.println("New Salary:" + s1.getSalary());
        */
        
        //part c
        if (s1.getSalary()>s2.getSalary()) {
            System.out.println(s1.getName()+" "+s1.getSalary());
        }else{
             System.out.println(s2.getName()+" "+s2.getSalary());
        }
        
        System.out.printf("%.2f + %.2f = %.2f",s1.getSalary(),s2.getSalary(),s1.getSalary()+s2.getSalary());
    }
}
