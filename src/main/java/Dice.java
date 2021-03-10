import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    int dieTotal=0;
    List<Integer> dieRolls=new ArrayList<Integer>();


            //Empty constructor basically used to make fixed die for tests
    public Dice(){}

    public Dice(int a){
        int roll=0;
    for(int i=0;i<a;i++){
        this.dieRoll();
            }
        }

    public void dieRoll(){
        Random die = new Random();
        int roll=  1+die.nextInt(6);
        this.dieTotal+=roll;
        dieRolls.add(roll);
    }

    public Integer numRolledDie(){
        return dieRolls.size();
        }

    public Integer getTotal(){
        return dieTotal;
    }

    public void displayRolls(){
        System.out.println("Your rolled dice are:");
        for(Integer die:dieRolls){
            System.out.println(die);
        }
    }
    //used for testing purposes, or cheating possibly?
    public void dieSet(Integer fixedRoll){
        dieRolls.add(fixedRoll);
        this.dieTotal+=fixedRoll;
        }
    }

