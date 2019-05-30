package incrementalSearch;

import java.util.ArrayList;
import java.util.List;

public class UnknowArray {
    private List<Integer> array;

    public UnknowArray(){
        array = new ArrayList<>();
    }

    public void addArray(int []arr){
        for(int elem:arr){
            array.add(elem);
        }
    }

    public Integer get(int index){
        return (index>=array.size())?null:array.get(index);
    }
}
