import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {





    @Test
    public void testGetData() {
        Simulation testing = new Simulation(2, 3);
        Integer actual = testing.getDataSize();
        Integer expected = 11;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetData2() {
        Simulation testing = new Simulation(1, 3);
        Integer actual = testing.getDataSize();
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHeader(){
        Simulation testing = new Simulation(3, 3);
        Integer actual=testing.getHeaderSize();
        Integer expected=15;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetHeader2(){
        Simulation testing = new Simulation(5, 3);
        Integer actual=testing.getHeaderSize();
        Integer expected=25;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetRolls(){
        Simulation testing = new Simulation(5, 10);
        Integer actual=testing.getTotalRolls();
        Integer expected=10;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetRolls2(){
        Simulation testing = new Simulation(9, 1000);
        Integer actual=testing.getTotalRolls();
        Integer expected=1000;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void displayTest(){
        Simulation testing = new Simulation(2, 50);
        testing.displayResults();
    }

    @Test
    public void dataTest(){
        Simulation testing = new Simulation(1, 20);
        testing.showData();
    }

    @Test
    public void headerTest(){
        Simulation testing = new Simulation(2, 50);
        testing.showHeader();
    }

    @Test
    public void rateTest(){
        Simulation testing = new Simulation(2, 50);
        Double expected=0.1;
        Double actual=testing.rollRate(10,100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rateTest2(){
        Simulation testing = new Simulation(2, 50);
        Double expected=0.025;
        Double actual=testing.rollRate(25,1000);
        Assert.assertEquals(expected, actual);
    }

}
