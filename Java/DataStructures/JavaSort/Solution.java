package DataStructures.JavaSort;

import java.util.*;

class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            Double cgpa = Double.parseDouble(in.next()); // magic?????

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new ComparatorStudentCGPA().thenComparing(new ComparatorStudentName()).thenComparing(new ComparatorStudentID()));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class ComparatorStudentCGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return Double.compare(o2.getCgpa(), o1.getCgpa());
    }
}

class ComparatorStudentName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getFname().compareTo(o2.getFname());
    }
}

class ComparatorStudentID implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();  // magic?
    }
}