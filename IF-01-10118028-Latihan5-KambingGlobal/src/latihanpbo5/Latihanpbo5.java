/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo5;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-1 2018
   NIM       : 10118028
   DESKRIPSI : Kambing Global
 */
public class Latihanpbo5 {

    /**
     * @param args the command line arguments
     */
    
    //Variable jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getjumlahKambing () {
        System.out.println("Jumlah Kambing : " +jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " +jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Latihanpbo5 kambingSusu = new Latihanpbo5();
        
        //Menampilkkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getjumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }
    
}
