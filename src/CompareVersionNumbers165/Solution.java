package CompareVersionNumbers165;

class Solution {
    public int compareVersion(String version1, String version2) {
        StringBuilder v1 = new StringBuilder() ;
        StringBuilder v2 = new StringBuilder();
        int size1 = version1.length();
        int size2 =version2.length();
        int maxSize = Math.max(size1,size2);
        int i = 0;
        int j = 0;
        while(i<size1||j<size2){

            while(i<size1&&version1.charAt(i)!='.') {
                v1.append(version1.charAt(i++));



            }



            while(j<size2&&version2.charAt(j)!='.'){

                v2.append(version2.charAt(j++));


            }
            if(v1.length()==0) v1.append('0');
            if(v2.length()==0) v2.append('0');
            int n1 = Integer.parseInt(v1.toString());
            int n2 = Integer.parseInt(v2.toString());
            v1.delete(0,i);
            v2.delete(0,j);

            if(n1!=n2){
                return n1>n2?1:-1;
            }
            else{
                i++;
                j++;
            }

        }
        return 0;
    }

}
