import java.util.ArrayList;
import java.util.List;

public class Bins {
    List<Integer> data=new ArrayList<Integer>();
    List<Integer> header=new ArrayList<Integer>();

    public Bins(int lowest, int highest){
        for (int start=lowest;start<=highest;start++){
            header.add(start);
            data.add(0);}
    }

    public void setBin(Integer binNum) {
        for (int i = 0; i < header.size(); i++) {
            if (header.get(i) == binNum) {
                data.set(i, data.get(i) + 1);
            }
        }
    }

    public Integer getBin(Integer binNum){
        int binTotal=0;
        for (int i = 0; i < header.size(); i++) {
            if (header.get(i) == binNum) {
                binTotal=data.get(i);
            }
        }
        return binTotal;
    }

}
