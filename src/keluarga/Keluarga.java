/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia bapak = new Orang_Tua("Subandi", "Magelang", "08 May 1966", "PNS", "Kleteran,Grabag,Magelang", "082138266422", 0);
        Manusia ibu = new Orang_Tua("Suciati", "Magelang", "19 June 1969", "PNS", "Kleteran,Grabag,Magelang", "085244186295", 0);
        Manusia agung = new Anak("Agung Setyawan", "Magelang", "07 April 2006", "Pelajar/Mahasiswa", "Kleteran, Grabag, Magelang", "085227244317", 0);
        Manusia dzaki = new Cucu("Dzaki", "Magelang", "07 January 2011", "Pelajar/Mahasiswa", "Kleteran, Grabag, Magelang", "0", 0);
       
        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(agung.getDetails());
        System.out.println(dzaki.getDetails());
    }
    
       
    }

