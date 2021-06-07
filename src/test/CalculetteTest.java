import org.junit.Assert;
import org.junit.Test;


public class CalculetteTest {
    @Test
    public void testCalculetteAdd() {
        Assert.assertEquals(4, Calculette.add(2,2));
    }


    @Test
    public void testCalculetteSub() {
        Assert.assertEquals(0, Calculette.sub(2,2));
        Assert.assertEquals(-1, Calculette.sub(2,3));
    }

    @Test
    public void testCalculetteMul() {
        Assert.assertEquals(9, Calculette.mul(3,3));
        Assert.assertEquals(-6, Calculette.mul(2,-3));
    }

    @Test
    public void testCalculetteDiv() {
        try {
            Assert.assertEquals(3, Calculette.div(9, 3), 0.01);
            Assert.assertEquals(0, Calculette.div(5, 0), 0.01);
            Assert.assertEquals(-5, Calculette.div(10, -2), 0.01);
        }
        catch (Exception e) {
            final String expected = "Division par zero";
            Assert.assertEquals( expected, e.getMessage());
        }
    }

    @Test
    public void testCalculetteAvg() {
        int[] list = {0,3,6};
        int[] list2 = {};

        try {
            Assert.assertEquals(3, Calculette.avg(list), 0.01);
            Assert.assertEquals(0, Calculette.avg(list2), 0.01);
        }
        catch (Exception e) {
            final String expected = "Liste vide";
            Assert.assertEquals( expected, e.getMessage());
        }
    }

    //CORRECTION



}
