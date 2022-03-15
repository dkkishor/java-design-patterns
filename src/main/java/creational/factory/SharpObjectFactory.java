package creational.factory;

import basics.enums.SharpObjectEnum;

/*
  The type of objects created is determined by this Factory Class.
  Rule: Always program to an Interface.
 */

public class SharpObjectFactory {

    public SharpObject makeObject(String type) {
        SharpObject sharpObj = null;

        if (type.equalsIgnoreCase(SharpObjectEnum.KNIFE.toString())) {
            sharpObj = new Knife();
        }
        else if (type.equalsIgnoreCase(SharpObjectEnum.SCISSOR.toString())) {
            sharpObj = new Scissor();
        }
        else if (type.equalsIgnoreCase(SharpObjectEnum.PEELER.toString())) {
            sharpObj = new Peeler();
        }
        else {
            System.out.println("WRONG TYPE!");
        }

        return sharpObj;
    }
}
