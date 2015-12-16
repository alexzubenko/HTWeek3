package alex.hwWeek2.enteties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 28.11.15.
 */
public class Student {

    private int id;
    private String name;
    private String adress;
    private boolean studing;
    private Map<Integer, Subject> listOfSubjects;

    public Student(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        listOfSubjects = new HashMap<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isStuding() {
        return studing;
    }

    public Map<Integer,Subject> getListOfSubjects() {
        return listOfSubjects;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setStuding(boolean studing) {
        this.studing = studing;
    }

    public void setListOfSubjects(Map<Integer,Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (studing != student.studing) return false;
        if (!name.equals(student.name)) return false;
        if (!adress.equals(student.adress)) return false;
        return listOfSubjects.equals(student.listOfSubjects);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + adress.hashCode();
        result = 31 * result + (studing ? 1 : 0);
        result = 31 * result + listOfSubjects.hashCode();
        return result;
    }
}
