/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : menampilkan program kalkulator dengan pendekatan objek 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calculator = new Kalkulator();
        calculator.setValue1(7);
        calculator.setValue2(5);
        System.out.println("VALUE 1 = " + calculator.getValue1());
        System.out.println("VALUE 2 = " + calculator.getValue2());
        calculator.setNameProject();
        calculator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + calculator.add(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Minus is = " + calculator.minus(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Multiple is = " + calculator.minus(calculator.getValue1(),calculator.getValue2()));
        System.out.println("Result Division is = " + calculator.minus(calculator.getValue1(),calculator.getValue2()));
    }
    
}
