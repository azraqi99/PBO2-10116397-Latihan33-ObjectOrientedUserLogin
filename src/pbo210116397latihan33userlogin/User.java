/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : User Login
 */
package pbo210116397latihan33userlogin;

/**
 *
 * @author Zetro
 */
public class User {
    private static String username;
    private static String password;
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        username = "RizkiAdam";
        password = "terbaikselalu";
        if (parPassword.equals(password) && parUserName.equals(username)) {
            statusAkun = true;
        } else {
            statusAkun = false;
        }
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUserName){
        if (status==true) {
            System.out.println("\n******HALLO "+parUserName.toUpperCase()+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
    }
}
