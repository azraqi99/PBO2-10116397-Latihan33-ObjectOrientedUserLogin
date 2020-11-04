/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : User Login
 */
package pbo210116397latihan33userlogin;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan33UserLogin {
       private static String usName;
       private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);
    }
    
}
