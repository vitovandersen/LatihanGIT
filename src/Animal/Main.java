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
public class Main implements Constant,Interface{
    public static void main(String[] args) {
        Main Object = new Main();
       
        Object.hardcode();
        
        int pilih ;
        do {
            System.out.print("\tPILIH MENU"
                    + "\n0.Exit "
                    + "\n1.Input Data  "
                    + "\n2.Print Data"
                    + "\n3.Print Semua Data"
                    + "\nInput :  ");
            pilih = SCANNER.nextInt();
            System.out.println(GARIS);
            switch (pilih){
                case 0 :
                    System.out.println(EXIT_MASSAGE);
                    break;
                case 1 :
                    Object.input(); //belum bisa input
                    break;
                case 2 :
                    int inputList  ;
                    do {
                        System.out.println("List Hewan ke-:"); //indexDi list Array
                        inputList  = SCANNER.nextInt();

                        if (inputList >= LIST_ANIMALS.size()) {
                            System.out.println(UNVALID_MASSAGE );
                        }
                    } while (inputList >= LIST_ANIMALS.size()); 
                    Object.printData(LIST_ANIMALS.get(inputList));
                    break;
                case 3 :
                    Object.printAllData();
                    break;
                default :
                    System.out.println(UNVALID_MASSAGE);
                    break;
            }   
        } while (pilih != 0);
        
    }
    
    
    
    public void printAllData(){
        for (int i = 0; i < LIST_ANIMALS.size(); i++) {
            System.out.println("\t\t\t\tNO "+ (i+1));
            printData( LIST_ANIMALS.get(i)) ;
        }
    }
    
   
    public void printData(Interface data) {
        System.out.println("Nama    \t : " +((Animals) data).name);
        System.out.println("Usia    \t : " +((Animals) data).age + " Tahun") ;
        System.out.println("makanan \t : " +((Animals) data).food);
        System.out.print("status    \t : ");
        if (((Animals) data).alive) {
            System.out.println("Hidup");
        }else {
            System.out.println("Mati");
        }
     
        if(data instanceof Mamalia) {
            System.out.println("Tebal Rambut \t : " + ((Mamalia) data).tebalRambut+ " cm");
            System.out.println("Jenis Kaki   \t : " + ((Mamalia) data).jenisKaki);
            
            if (data instanceof Cat) {
                System.out.println("Jenis Kucing \t : "  + ((Cat) ((Mamalia) data)).jenisKucing);
            }else if (data instanceof Dog) {
                System.out.println("Jenis Anjing \t : "  + ((Dog) ((Mamalia) data)).jenisAnjing);
            }else if (data instanceof Horse) {
                System.out.println("Jenis Kuda \t : "  + ((Horse) ((Mamalia) data)).jenisKuda);
            }else {
                
            }
        } else if(data instanceof Aves) {
            System.out.println("Panjang Sayap\t : " + ((Aves) data).ukuranSayap + " cm");
            System.out.println("Bentuk  Paruh\t : " + ((Aves) data).bentukParuh);
        } 

        System.out.println(GARIS);
    }
    //@Override
    public boolean isAlive(int alive){
        if (alive == DEAD) {
            return false ;
        }
        
        return true ;
    }
    public void input(){
        Main object = new Main();
        
        System.out.print("Input Nama  \t : ");
        String nama = SCANNER.next();
        
        System.out.print("Input Age   \t : ");
        int age = SCANNER.nextInt();
        
        System.out.print("Input Food  \t : ");
        String food = SCANNER.next();
        
        System.out.print("Input Gender  \t : ");
        String gender = SCANNER.next();
        
        System.out.print("STATUS\t : "
                + "\n 1.HIDUP | 0.MATI"
                + "\n Input \t: ");
        int status = SCANNER.nextInt();
        
        boolean alive = object.isAlive(status);
        System.out.print("CLASS      \t "
                + "\n 1.Mamamalia | 0.Aves"
                + "\n Input \t : ");
        int kelas = SCANNER.nextInt();
        
        if(kelas == 1) {
            System.out.print("MAMALIA\n");
            System.out.println("Tebal Rambut \t : ");
            int tebalRambut = SCANNER.nextInt();
            
            System.out.println("Jenis Kaki   \t : ");
            String jenisKaki = SCANNER.next();
            
            System.out.print("Input Spesies Hewan \t : ");
            String spesies = SCANNER.next().toUpperCase();
            
            if (spesies.equals("CAT")) {
                System.out.println("input Jenis Kucing : ");
                String jenisKucing = SCANNER.next();
                //name,age,food,gender,alive,tebalRambut,jenisKaki,jenisKucing
                Cat newCat = new Cat(nama,age,food,gender,alive,tebalRambut,jenisKaki,jenisKucing);
                LIST_ANIMALS.add(newCat);
            }else if (spesies.equals("DOG")) {
                System.out.println("input Jenis Anjing : ");
                String jenisAnjing = SCANNER.next();
                //name,age,food,gender,alive,tebalRambut,jenisKaki,jenisKucing
                Dog newDog = new Dog(nama,age,food,gender,alive,tebalRambut,jenisKaki,jenisAnjing);
                LIST_ANIMALS.add(newDog);
            }else if (spesies.equals("HORSE")) {
                System.out.println("input Jenis Kuda : ");
                String jenisKuda = SCANNER.next();
                //name,age,food,gender,alive,tebalRambut,jenisKaki,jenisKucing
                Horse newHorse = new Horse(nama,age,food,gender,alive,tebalRambut,jenisKaki,jenisKuda);
                LIST_ANIMALS.add(newHorse);
            }
        }
        System.out.println(GARIS);
        
    }
    void hardcode(){
        //name,age,food,gender,alive,jumlahRambut,jumlahKelenjarSusu,jenisKucing
        Cat kucing = new Cat ("Ketty", 1 , "ikan" , "betina" ,false,3,"cakar Tajam","Kucing Persia");
        Dog anjing = new Dog ("Doggy", 5 , "tulang" , "jantan" ,true,1,"cakar Tajam","Anjing Bull Dog");
        Horse kuda = new Horse ("Horsyx", 5 , "rumput Segar" , "jantan" ,true,5,"Berkuku","Kuda Falabella" );
        Duck bebek = new Duck ("Donald", 5 , "Ikan Segar" , "jantan" ,true,50,"Pipih","itik bali" );
        Duck bebek2 = new Duck ("Quaisy", 5 , "Ikan kecil" , "betina" ,true,40,"Pipih","itik belanda" );
        Mamalia mamalia  = new Mamalia ("Blaxyz", 3 , "daging" , "jantan" ,true,2,"cakar Tajam");
        Aves aves      = new Aves ("Avekt", 3 , "daging" , "jantan" ,true,45,"lebar") ;
        LIST_ANIMALS.add(kucing);
        LIST_ANIMALS.add(anjing);
        LIST_ANIMALS.add(kuda);
        LIST_ANIMALS.add(bebek);
        LIST_ANIMALS.add(mamalia);
        LIST_ANIMALS.add(aves);
    
    }
}
