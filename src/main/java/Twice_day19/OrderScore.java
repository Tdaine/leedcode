package Twice_day19;

import java.util.*;

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}


public class OrderScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int order = in.nextInt();
            List<Student> list = new ArrayList<Student>();
            for (int i = 0; i < n;i++){
                list.add(new Student(in.next(),in.nextInt()));
            }
            //降序
            if (order == 0){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.getScore() - o1.getScore();
                    }
                });
            }else {
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getScore() - o2.getScore();
                    }
                });

            }

            for (int i = 0; i < n; i++){
                System.out.println(list.get(i).getName() + " "+ list.get(i).getScore());
            }
        }
    }
}
