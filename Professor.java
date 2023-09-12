public class Professor {
    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected String courseName;


    public Professor(Integer id, String firstName, String lastName, String courseName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
    }

    public Professor(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void assignGrade(Student student, int grade){
        if ( grade >= 18 ) {
            student.gradesArchived.add(grade);
        }else{
            System.out.println("Non hai superato l'esame");
        }
    }




}
