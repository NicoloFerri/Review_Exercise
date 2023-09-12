import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    protected Integer id;
    protected String name;
    protected String lastName;
    protected Date dateOfBirth;

List<Integer> gradesArchived = new ArrayList<>();

    public Student(Integer id, String name, String lastName, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    public Student(List<Integer> gradesArchived) {
        this.gradesArchived = null;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirthFormatted() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public boolean calculateGradeAverage (){
        int n=0;
        int sommaVoti =0;
        for (Integer s : gradesArchived) {
            sommaVoti = sommaVoti + s ;
            n++;
        }

        if ( (sommaVoti/n )>= 28 ){
            return true;
        }else{
                return false;
            }
        }

    }

