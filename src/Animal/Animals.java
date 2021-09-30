/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Vito
 */
public abstract class Animals implements Constant,Interface {
    String name ;
    int age ;
    String food ;
    String gender ;
    boolean alive ;
    
    public Animals(){
    }
   
    public Animals (String name, int age , String food , String gender,boolean alive){
        this.name = name ;
        this.age = age ;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    public boolean isAlive(int alive){
        if (alive == DEAD) {
            return false ;
        }
        
        return true ;
    }
    
    
    abstract String printSound();
    
    @Override
    public String toString() {
        return  name + " " + age + " " + food + " " + gender + " " + alive ;
    }
    
}
