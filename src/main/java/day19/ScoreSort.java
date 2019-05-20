package day19;


import java.util.*;

class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class ScoreSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            List<Student> students = new ArrayList<Student>();
            for (int i = 0; i < n; i++){
                students.add(new Student(in.next(),in.nextInt()));
            }
            //降序
            if (k ==0){
                //public static <T> void sort(List<T> list, Comparator<? super T> c)
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            }else if (k == 1){//升序
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            }
            for (int i = 0; i < students.size(); i++){
                System.out.println(students.get(i).name + " " + students.get(i).score);
            }
        }
    }
}

