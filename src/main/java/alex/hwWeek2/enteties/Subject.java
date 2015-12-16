package alex.hwWeek2.enteties;

/**
 * Created by alex on 28.11.15.
 */
public class Subject {
    private int id;
    private String name;
    private int hoursInSemestr;
    private int hoursByStudent;
    private int subjectMarkByStudent;
    private boolean examStatus;

    public Subject(int id, String name, int hoursInSemestr) {
        this.id = id;
        this.name = name;
        this.hoursInSemestr = hoursInSemestr;
        this.hoursByStudent = 0;
        this.subjectMarkByStudent = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHoursInSemestr() {
        return hoursInSemestr;
    }

    public int getHoursByStudent() {
        return hoursByStudent;
    }

    public int getSubjectMarkByStudent() {
        return subjectMarkByStudent;
    }

    public boolean isExamStatus() {
        return examStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursInSemestr(int hoursInSemestr) {
        this.hoursInSemestr = hoursInSemestr;
    }

    public void setHoursByStudent(int hoursByStudent) {
        this.hoursByStudent = hoursByStudent;
    }

    public void setSubjectMarkByStudent(int subjectMarkByStudent) {
        this.subjectMarkByStudent = subjectMarkByStudent;
    }

    public void setExamStatus(boolean examStatus) {
        this.examStatus = examStatus;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Subject{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", hoursInSemestr=").append(hoursInSemestr);
        sb.append(", hoursByStudent=").append(hoursByStudent);
        sb.append(", subjectMarkByStudent=").append(subjectMarkByStudent);
        sb.append(", examStatus=").append(examStatus);
        sb.append('}');
        return sb.toString();
    }
}
