package comparble;

public class Main {
    static class Student implements Comparable<Student>{
        public String name;
        public Integer eta;

        public String toString(){
            return this.name+" "+this.eta;
        }

        public int compareTo(Student student){
            return this.eta.compareTo(student.eta);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student students[] = new Student[5];
        students[0] = new Student();students[0].eta =5;students[0].name = "A";
        students[1] = new Student();students[1].eta =6;students[1].name = "B";
        students[2] = new Student();students[2].eta =7;students[2].name = "C";
        students[3] = new Student();students[3].eta =8;students[3].name = "D";
        students[4] = new Student();students[4].eta =9;students[4].name = "E";

        Student target = new Student();
        target.eta = 10;

        System.out.println(binaryIt(students,target));
    }

    public static int binaryIt(Student [] students, Student target){
        int l = 0;
        int r = students.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(students[mid].compareTo(target)==0){
                return mid;
            }
            else if(students[mid].compareTo(target)>0){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}