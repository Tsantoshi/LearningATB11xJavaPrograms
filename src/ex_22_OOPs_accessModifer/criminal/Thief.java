package ex_22_OOPs_accessModifer.criminal;

import ex_22_OOPs_accessModifer.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop thief = new Cop(4);
        //thief.canIshoot();  // not allowed to other package
    }
}
