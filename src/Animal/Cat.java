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
public class Cat extends Mamalia implements Constant,Interface{
  
    String jenisKucing ;
    public Cat(){
    }
    public Cat (String name, int age , String food , String gender,boolean alive,int jumlahRambut ,String jenisKaki,String jenisKucing ){
        super(name,age,food,gender,alive,jumlahRambut,jenisKaki);
        this.jenisKucing = jenisKucing ;
    }
    
    @Override
    String printSound() {
        return "Meong Meong Meong" ;
    }
    
   
    @Override
    public String toString() {
        return super.toString() + " " +  jenisKucing ;
    }
}
