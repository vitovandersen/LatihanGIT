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
public class Horse extends Mamalia implements Constant,Interface{
    String jenisKuda ;
    
    public Horse(){
    }
    public Horse (String name, int age , String food , String gender,boolean alive,int jumlahRambut ,String jenisKaki,String jenisKuda ){
        super(name,age,food,gender,alive,jumlahRambut,jenisKaki);
        this.jenisKuda = jenisKuda ;
    }
    
    @Override
    String printSound() {
        return "Ngigggghttt" ;
    }
    @Override
    public String toString() {
        return super.toString() + " " +  jenisKuda   ;
    }
    
}
