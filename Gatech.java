//I worked on the homework assignment alone, using only course materials.

public class Gatech {
    public static void main(String[] args) {
        Student s1 = new Student(Student.DEFAULT_NAME, Student.DEFAULT_GRADE, Student.DEFAULT_TIREDNESSLEVEL);
        Student s2 = new Student("Bobby Dodd", 34.5);
        Student s3 = new Student("Sideways", 97.3, 11.2);
        Student s4 = new Student("Buzz", 80.3, 21.3);
        Student[] student1List = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        Professor p1 = new Professor(Professor.DEFAULT_NAME, Professor.DEFAULT_REMOTE,
            Professor.DEFAULT_COURSENAME, Professor.DEFAULT_DIFFICULTY, student1List);
        Student[] student2List = {
            s2,
            s4,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        Professor p2 = new Professor("Dr. Difficult", false, "CS9000", 0.99, student2List);
        Student[] student3List = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        Professor p3 = new Professor("Dr. Strange", false, "MAGIC101", 0.88, student3List);
        Student[] student4List = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        Professor p4 = new Professor("Dr. Dolittle", true, "ANIMALS101", 0.64, student4List);
        System.out.println(Student.getstudentPop());
        p2.officeHours(s2);
        p1.officeHours(s4);
        s3.joinClass(p2);
        s3.checkGrade();
        s4.joinClass(p1);
        p1.giveExam(s4);
        p1.giveExam(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
