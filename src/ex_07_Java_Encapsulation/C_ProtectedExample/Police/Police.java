package ex_07_Java_Encapsulation.C_ProtectedExample.Police;

public class Police {
    int bullet;

    public Police(int bullet){
        this.bullet = bullet;
    }

    protected void canIShoot(){
        System.out.println("You can shoot.");
    }
}
