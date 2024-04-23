import java.security.MessageDigest;     
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {  

    public void hash(String pin) { 
        try {
            MessageDigest md = MessageDigest.getInstance("SHA256");
            md.update(pin.getBytes()); 
            byte[] output = md.digest();

            StringBuilder sb = new StringBuilder();  
            for (byte b : output) {
                sb.append(String.format("%02x", b));

            }
            System.out.println("||              Process Completed Succesfuly :)           ||");
            System.out.println("||                                                        ||");
            System.out.println("||              Hashed Output: \\/                         ||");
            System.out.println("||                                                        ||");

            System.out.println(sb.toString());
            System.out.println("||                                                        ||");
            System.out.println("||                                                        ||");
        }

        catch (Exception e) {
            System.out.println("Error ");

        }

    }

    public void input() {

        System.out.println("===========================================================");
        System.out.println("||                   {'_'}                                ||");
        System.out.println("||    [[  Welcome to the \"SHA\" Hashing Algorithm  ]]      ||");
        System.out.println("||                                                        ||");
        System.out.println("||        Enter the input to be hashed below              ||");
        System.out.println("||                                                        ||");
        System.out.println("||        Enter the input to be hashed below              ||");

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        System.out.println("||                Input Recieved                          ||");
        System.out.println("||          Wait as we do the processing                  ||");
        System.out.println("||                                                        ||");

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(300);
                System.out.print("| ");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(300);
                System.out.print("_");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("");
        System.out.println("||                                                        ||");

        hash(password);
    }

    public static void main(String[] args) {

        SHA256 sh = new SHA256();
        sh.input();

        System.out.println("     ██████╗░██╗░░░██╗███████╗\r\n" + //
                "     ██╔══██╗╚██╗░██╔╝██╔════╝\r\n" + //
                "     ██████╦╝░╚████╔╝░█████╗░░\r\n" + //
                "     ██╔══██╗░░╚██╔╝░░██╔══╝░░\r\n" + //
                "     ██████╦╝░░░██║░░░███████╗\r\n" + //
                "     ╚═════╝░░░░╚═╝░░░╚══════╝");
    }

}
