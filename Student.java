//I worked on the homework assignment alone, using only course materials.

public class Student {
    //instance variables
    private String name;
    private double grade;
    private double tirednessLevel;

    //Static constants/variables
    private static int studentPopulation = 0;
    public static final double DEFAULT_TIREDNESSLEVEL = 65.0;
    public static final String DEFAULT_NAME = "George P. Burdell";
    public static final double DEFAULT_GRADE = 91.6;
    //constructor

    public Student(String initName, double initGrade) {
        this(initName, initGrade, DEFAULT_TIREDNESSLEVEL);
    }
    public Student() {
        this(DEFAULT_NAME, DEFAULT_GRADE, DEFAULT_TIREDNESSLEVEL);
    }
    public Student(String name, double grade, double tirednessLevel) {
        this.name = name;
        this.grade = grade;
        this.tirednessLevel = tirednessLevel;
        studentPopulation++;
    }

    public static int getstudentPop() {
        return studentPopulation;
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getTirednessLevel() {
        return tirednessLevel;
    }

    public void drinkCoffee() {
        tirednessLevel = tirednessLevel * 0.75;
        System.out.println("Yum coffee, I have so much energy");
    }

    public String checkGrade() {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public boolean joinClass(Professor p) {
        int ii;
        Student[] pStudentList = p.getStudentList();
        for (ii = 0; ii < pStudentList.length; ii++) {
            if (pStudentList[ii] == null) {
                pStudentList[ii] = this;
                System.out.println(name + " has been added to Professor " + p.getName() + "\'s class");
                return true;
            }
        }
        System.out.println("Class full!");
        return false;
    }
    public String toString() {
        return "My name is " + name + ", my tiredness level is " + tirednessLevel + "!";

    }

}
