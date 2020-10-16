/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domba;

/**
 *
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan variabel static
 */


public class Mamalia{
    public static int jumlahKambing;
        // TODO code application logic here
        public static final String NAMA_KAMBING = "MIDUN";
        
        public static void main (String[] args) {
            Mamalia.jumlahKambing=485000;
            System.out.println(NAMA_KAMBING +" memiliki kambing sebanyak " + Mamalia.jumlahKambing);
        }
    }

