package objectarray;

public class Student {
    private int studentId;
    private String name;
    priate String program;
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public void showDetails(){
        System.out.println("StudentId : " + this.getStudentId());
        System.out.println("Name : " + this.getName());
        System.out.println("-----------------------------------");
    }
}
