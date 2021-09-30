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
public class Duck extends Aves implements Constant,Interface{
    
    String jenisBebek;
    public Duck (){
    }
    public Duck (String name, int age , String food , String gender,boolean alive,int ukuranSayap, String jenisKaki,String jenisBebek){
        super(name,age,food,gender,alive,ukuranSayap,jenisKaki);
        this.jenisBebek = jenisBebek ;
    
    }
    @Override
    String printSound() {
        return "Kwek Kwek kwek" ;
    }
    @Override
    public String toString() {
        return super.toString() + " " +  jenisBebek  ;
    }
    
}
