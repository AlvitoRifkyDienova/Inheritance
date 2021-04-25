/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class main {
    public static void main(String[] args){
        siswa1 murid1=new siswa1();
        System.out.println("====Siswa 1====");
        murid1.nama="Budi";
        murid1.goldarah="O";
        murid1.display();
        
        siswa2 murid2=new siswa2();
        System.out.println("====Siswa 2====");
        murid2.nama="Adi";
        murid2.goldarah="B";
        murid2.display();
        
        siswa3 murid3=new siswa3();
        System.out.println("====Siswa 3====");
        murid3.nama="Boby";
        murid3.goldarah="AB";
        murid3.display();
    }
}