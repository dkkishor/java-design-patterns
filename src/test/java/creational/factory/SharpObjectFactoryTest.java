package creational.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class SharpObjectFactoryTest {
    @Test
    public void testFactoryPattern() {
        SharpObjectFactory sharpObjFactory = new SharpObjectFactory();

        String type = "KniFe";
        SharpObject sharpObj = sharpObjFactory.makeObject(type);
        sharpObj.makeSharpObject();

        type = "ScissoR";
        sharpObj = sharpObjFactory.makeObject(type);
        sharpObj.makeSharpObject();

        type = "PEELER";
        sharpObj = sharpObjFactory.makeObject(type);
        sharpObj.makeSharpObject();
    }
}