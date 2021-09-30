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

public class Dog extends Mamalia implements Constant,Interface{
    String jenisAnjing ;
    public Dog(){
    }
    public Dog (String name, int age , String food , String gender,boolean alive,int jumlahRambut ,String jenisKaki,String jenisAnjing ){
        super(name,age,food,gender,alive,jumlahRambut,jenisKaki);
        this.jenisAnjing = jenisAnjing ;
    }
    
    @Override
    String printSound() {
        return "GUk GUK guk" ;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " +  jenisAnjing  ;
    }
}
