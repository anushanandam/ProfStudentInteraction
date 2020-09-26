//I worked on the homework assignment alone, using only course materials.

public class Professor {

    private String name;
    private boolean remote;
    private String courseName;
    private double difficulty;
    private Student[] studentList;

    public static final String DEFAULT_NAME = "Dr. Omojokun";
    public static final boolean DEFAULT_REMOTE = true;
    public static final String DEFAULT_COURSENAME = "CS1331";
    public static final double DEFAULT_DIFFICULTY = 0.80;
    public static final Student[] DEFAULT_STUDENTLIST = new Student[10];

    public Professor(String initName, String intitCourseName) {
        this(initName, DEFAULT_REMOTE, intitCourseName, DEFAULT_DIFFICULTY, DEFAULT_STUDENTLIST);
    }
    public Professor() {
        this(DEFAULT_NAME, DEFAULT_REMOTE, DEFAULT_COURSENAME, DEFAULT_DIFFICULTY, DEFAULT_STUDENTLIST);
    }
    public Professor(String name, boolean remote, String courseName, double difficulty, Student[] studentList) {
        this.name = name;
        this.remote = remote;
        this.courseName = courseName;
        if (difficulty < 0) {
            difficulty = 0;
        } else if (difficulty > 1) {
            difficulty = 1;
        }
        this.difficulty = difficulty;
        this.studentList = studentList;
    }

    public Student[] getStudentList() {
        return studentList;
    }
    public double getDifficulty() {
        return difficulty;
    }
    public String getCourseName() {
        return courseName;
    }
    public boolean getRemote() {
        return remote;
    }
    public String getName() {
        return name;
    }

    public String rollCall() {
        int ii;
        String studentNames = null;
        for (ii = 0; ii < studentList.length; ii++) {
            if (studentList[ii] != null) {
                studentNames += studentList[ii].getName() + ", ";
            }
        }
        return studentNames;
    }

    public void giveExam(Student s) {
        int ii;
        boolean found = false;
        for (ii = 0; ii < studentList.length; ii++) {
            if (s.equals(studentList[ii])) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(s.getName() + " is not in " + name + "\'s " + courseName + "!");
            return;
        }

        s.setGrade(s.getGrade() + 100 - s.getTirednessLevel() * difficulty);
        s.setGrade(s.getGrade() / 2);

    }
    public int getClassSize() {
        int ii;
        int count = 0;
        for (ii = 0; ii < studentList.length; ii++) {
            if (studentList[ii] != null) {
                count++;
            }
        }
        return (count);

    }
    public void officeHours(Student s) {
        int ii;
        boolean found = false;
        for (ii = 0; ii < studentList.length; ii++) {
            if (s.equals(studentList[ii])) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(s.getName() + " is not in " + name + "\'s " + courseName + "!");
            return;
        }
        if (remote) {
            System.out.println("Office hours are being held online! How can I help?");
            difficulty -= 0.15;
        } else {
            System.out.println("My office hours are being held tomorrow. I can help you then!");
            difficulty -= 0.15;
        }
        if (s.getGrade() < 80) {
            giveExam(s);
        }
    }
    public String toString() {
        String appendDiff = "";
        if (difficulty >= 0.65) {
            appendDiff = " I've heard that my course is challenging, so feel free to visit office hours!";
        }
        if (remote) {
            return "My name is " + name + ", and I am currently teaching " + courseName + " remotely." + appendDiff;

        } else {
            return "My name is " + name + ", and I am currently teaching " + courseName + " in-person." + appendDiff;

        }
    }
}
