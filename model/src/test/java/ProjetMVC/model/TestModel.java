package ProjetMVC.model;

import org.junit.Test;
import org.testng.Assert;

public class TestModel {
    @Test
    public void testGetMessage()
    {
        Model model=new Model();
        String m=model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello World !");
    }

}
