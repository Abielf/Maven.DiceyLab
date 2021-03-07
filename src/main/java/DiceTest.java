import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


    @Test
    public void dieRollerTest(){
        Dice buncha = new Dice(10);
        buncha.dieSet(10);
        buncha.dieSet(11);
        buncha.displayRolls();
    }

    @Test
    public void totalDieTest(){
            Dice yahtzee=new Dice(5);
            Integer actual= yahtzee.numRolledDie();
            Integer expected=5;
        Assert.assertEquals(expected,actual);
        }



    @Test
    public void getDisplayRolledTest(){
        Dice cheater=new Dice();
        cheater.dieSet(4);
        cheater.dieSet(5);
        cheater.dieSet(10);
        cheater.displayRolls();
        }

    @Test
    public void getDisplayTotalTest(){
        Dice cheater=new Dice();
        cheater.dieSet(4);
        cheater.dieSet(5);
        cheater.dieSet(10);
        Integer expected =19;
        Integer actual=cheater.getTotal();
        Assert.assertEquals(expected,actual);
    }

}
