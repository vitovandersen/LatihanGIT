/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vito
 */
public interface Interface {
    final Scanner SCANNER = new Scanner(System.in);
    final ArrayList<Interface> LIST_ANIMALS = new ArrayList<>();
    
    final String EXIT_MASSAGE = "Keluar Dari Program!" ;
    final String UNVALID_MASSAGE = "Input Tidak Valid ";
    final String GARIS = "-----------------------------------------------------------------";
}
