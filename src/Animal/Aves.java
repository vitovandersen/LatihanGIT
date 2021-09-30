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
public class Aves extends Animals implements Constant,Interface{
    int ukuranSayap ;
    String bentukParuh ;
    
    public Aves (){
    }
    public Aves (String name, int age , String food , String gender,boolean alive,int ukuranSayap, String bentukParuh){
        super(name,age,food,gender,alive);
        this.ukuranSayap = ukuranSayap ;
        this.bentukParuh = bentukParuh ;
    
    }
    
    @Override
    public String toString() {
        return super.toString() + " " +  ukuranSayap + " " + bentukParuh ;
    }
    
    @Override
    String printSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
