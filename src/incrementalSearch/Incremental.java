package incrementalSearch;
/*
        0 1 2 3 4 5
arr = [-2,1,2,5,6,110]
target = 5

 */
public class Incremental {

    public static void main(String []arg0){

        UnknowArray array = new UnknowArray();
        array.addArray(new int[]{-2,1,2,5,6,110});
        int target = -1;
        System.out.println(incrementalBinary(array,target));
    }
/*

        0 1 2 3 4 5
arr = [-2,1,2,4,5,110]
target = 5

offset = 0
low = 3
high = 4
num = 4
 */

    public static int incrementalBinary(UnknowArray array,int  target){
        int offset = 0;
        int low = 0;
        int high = 0;
        while(true){
           Integer num = array.get(high);
            if(num!=null){
                if(num==target){
                    return high;
                }else if(num>target){
                    if(high-low==1){return -1;}
                    offset =0;
                    high = low;
                }else{
                    int temp = low;
                    low = high;
                    high = temp+(int)Math.pow(2,offset);
                    offset++;
                }
            }else{
                high = low+1;
                offset = 0;
            }
        }
        //return -1;
    }
}
