package dmoj;
import java.util.*;

class VaultDoor3 {
    public static void main(String args[]) {
        VaultDoor3 vaultDoor = new VaultDoor3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String a = "jU5t_a_sna_3lpm18g947_u_4_m9r54f";
        char[] b = new char[32];
        b = a.toCharArray();
 
        int i;
        for (i=0; i<8; i++) {
            b[i] = a.charAt(i);
        }
        for (; i<16; i++) {
            b[i] = a.charAt(23-i);
        }
        for (; i<32; i+=2) {
            b[i] = a.charAt(46-i);
        }
        for (i=31; i>=17; i-=2) {
            b[i] = a.charAt(i);
        }
        String s = new String(b);
        System.out.println(s);
        
        /*for (int i = 0; i<8; i++) 
        {
        System.out.print(a.charAt(i));
        }
        for (int i = 8; i < 16; i++) 
        {
        	System.out.print(a.charAt(23-i));
        }
        for (int i = 16; i< 32; i+=2) 
        {
        	System.out.print(a.charAt(46-i));
        }
        for (int i = 31; i >= 17; i-=2) 
        {
        	System.out.println(a.charAt(i));
        }
        */
        String userInput = scanner.next();
	String input = userInput.substring("picoCTF{".length(),userInput.length()-1);
	if (vaultDoor.checkPassword(input)) {
	    System.out.println("Access granted.");
	} else {
	    System.out.println("Access denied!");
        }
    }

    // Our security monitoring team has noticed some intrusions on some of the
    // less secure doors. Dr. Evil has asked me specifically to build a stronger
    // vault door to protect his Doomsday plans. I just *know* this door will
    // keep all of those nosy agents out of our business. Mwa ha!
    //
    // -Minion #2671
    public boolean checkPassword(String password) {
        if (password.length() != 32) {
            return false;
        }
        char[] buffer = new char[32];
        int i;
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23-i);
        }
        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i);
        }
        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);
        }
        String s = new String(buffer);
        return s.equals("jU5t_a_sna_3lpm18g947_u_4_m9r54f");
        //jU5t_a_
        //jU5t_a_l3_ans_
    }
}
