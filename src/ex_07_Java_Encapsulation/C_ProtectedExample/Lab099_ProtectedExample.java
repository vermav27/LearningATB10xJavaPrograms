package ex_07_Java_Encapsulation.C_ProtectedExample;

import ex_07_Java_Encapsulation.C_ProtectedExample.Police.Police;

public class Lab099_ProtectedExample {
    public static void main(String[] args) {
        Police P2 = new Police(20);
        //Here also i am not able to access the canIShoot method which is in Police package
        //because that is protected and that can only be access with in the package
        //not outside that
    }
}
