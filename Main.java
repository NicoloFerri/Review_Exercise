import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


         Student s1 = new Student(1,"Mario","Rossi", new Date("03/04/1990"));
        Student s2 = new Student(2,"Luca","Bianchi", new Date("10/07/1995"));
        Student s3 = new Student(3,"Andrea","Lori", new Date("11/02/1999"));
        Student s4 = new Student(4,"Antonio","Esposito", new Date("22/11/1988"));

       Professor p1 = new Professor(5,"Marino","Belloni","Analisi Matematica 1");
       Professor p2 = new Professor(6, "Edzeario", "Prati", "Meccanica Applicata Alle Macchine");

       p1.assignGrade(s1,30);
        p1.assignGrade(s1,28);
        p1.assignGrade(s2,15);
        p1.assignGrade(s3,30);
        p1.assignGrade(s3,20);

        Student[] arrayStudenti = {s1,s2,s3,s4};
        Professor[] arrayProfessori = {p1,p2};

        for (Student student : arrayStudenti) {
            boolean votoMassimo = false;
            int index=0;

           while(!votoMassimo && index<student.gradesArchived.size()){
                if (student.gradesArchived.get(index)==30){
                    index++;
                    votoMassimo=true;
                    System.out.println("lo studente "+student.getName() + " " + student.getLastName()+ " ha almeno un 30");
                }
            }
        }

       Double[] average = new Double[arrayStudenti.length];

        int indice=0;

        for (Student student : arrayStudenti) {
            indice++;
            Integer somma=0;
            for ( int i=0 ; i<student.gradesArchived.size(); i++){
                somma = somma + student.gradesArchived.get(i);
            }

            average[indice-1] = (double)somma/ student.gradesArchived.size();
        }


        Double max=0.0;
        int id=0;
        for ( int k=0 ; k<average.length;k++){
            if(average[k]>max){
                max=average[k];
                id=k;

            }
        }

        System.out.println("lo studente con la media piu alta è " + arrayStudenti[id].getName() + " " +
                            arrayStudenti[id].getLastName() + " con la medai del " + max);




    }
}