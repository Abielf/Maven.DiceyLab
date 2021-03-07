import java.util.ArrayList;
import java.util.List;

public class Simulation {
    List<Integer> data=new ArrayList<Integer>();
    List<Integer> header=new ArrayList<Integer>();
    Integer totalRolls=0;


    public Simulation(Integer numOfDie, Integer timesRolled){
        SimArrayBuilder(numOfDie, numOfDie*6);
        for(Integer i=0;i<timesRolled;i++){
        Dice simDie=new Dice(numOfDie);
            data.set( header.indexOf(simDie.getTotal()), data.get(header.indexOf(simDie.getTotal()))+1);
            }
        totalRolls=timesRolled;
        }



    //Builds the header and data lists for our statistics table
    public void SimArrayBuilder(Integer start, Integer end){
        Integer j=0;
        for(Integer i=start;i<=end;i++){
            header.add(i);
            data.add(j);
        }

    }

    public Integer getHeaderSize(){return header.size();}

    public Integer getDataSize(){return data.size();}

    public Integer getTotalRolls(){return totalRolls;}

    public void showData(){ System.out.println(data);}

    public void showHeader(){ System.out.println(header);}

    public void displayResults(){
        for(int i=0;i<header.size();i++){
            System.out.print(header.get(i));
            if(header.get(i)<10){System.out.print("  :");}else{System.out.print(" :");}
            if(data.get(i)<100000000){System.out.print(" ");}
            if(data.get(i)<10000000){System.out.print(" ");}
            if(data.get(i)<1000000){System.out.print(" ");}
            if(data.get(i)<100000){System.out.print(" ");}
            if(data.get(i)<10000){System.out.print(" ");}
            if(data.get(i)<1000){System.out.print(" ");}
            if(data.get(i)<100){System.out.print(" ");}
            if(data.get(i)<10){System.out.print(" ");}
            System.out.print(data.get(i)+": ");
            System.out.println(rollRate(data.get(i), totalRolls)+" ");
        }
    }

    public Double rollRate(Integer a, Integer b){
        double doubleA=a.doubleValue();
        double doubleB=b.doubleValue();
        return Math.round((doubleA/doubleB) * 100.0)/100.0;
    }

}
