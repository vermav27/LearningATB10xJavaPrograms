package ex_07_Java_Encapsulation.C_ProtectedExample.Thief;

import ex_07_Java_Encapsulation.C_ProtectedExample.Police.Police;

public class Lab098_ThiefMain {
    public static void main(String[] args) {
        Police thief = new Police(20);
        //thief.canIShoot();
        //So now here as "canIShoot" is protected in nature so that can not be access outside the
        //package,
    }
}
