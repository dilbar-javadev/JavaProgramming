package day17_customClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentId;
    public int grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, String studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Micheal Jackson", 'M', 29, "1234567", 11, true);
        System.out.println(student1);
    }
}
