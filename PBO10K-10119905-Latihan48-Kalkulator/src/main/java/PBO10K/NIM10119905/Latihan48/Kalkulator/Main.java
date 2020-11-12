/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan48.Kalkulator;

/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Nilai Mahasiswa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator objKalkulator = new Kalkulator();
        objKalkulator.setValue1(7);
        objKalkulator.setValue2(5);
        System.out.println("Value 1 = "+ objKalkulator.getValue1());
        System.out.println("Value 2 = "+ objKalkulator.getValue2());
        objKalkulator.setNameProject();
        objKalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+objKalkulator.add(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Minus is = "+objKalkulator.minus(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Multiple is = "+objKalkulator.multiplication(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Division is = "+objKalkulator.divison(objKalkulator.getValue1(), objKalkulator.getValue2()));
    }
    
}
