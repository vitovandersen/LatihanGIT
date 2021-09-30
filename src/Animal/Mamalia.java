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
public class Mamalia extends Animals implements Constant,Interface {
    int tebalRambut ; 
    String jenisKaki ;
    public Mamalia(){
    }
    public Mamalia (String name, int age , String food , String gender,boolean  alive,int tebalRambut, String jenisKaki){
        super(name,age,food,gender,alive);
        this.tebalRambut = tebalRambut ;
        this.jenisKaki = jenisKaki ;
        
    
    }
    @Override
    String printSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString() + " " +  tebalRambut + " " + jenisKaki ;
    }

 
}
