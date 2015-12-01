package Alex.hwWeek2.manager;

import Alex.hwWeek2.enteties.Student;
import Alex.hwWeek2.enteties.Subject;
import Alex.hwWeek2.exceptions.NullStudentException;
import Alex.hwWeek2.exceptions.NullSubjectException;

import java.util.Map;

/**
 * Created by alex on 30.11.15.
 */
public interface Manager {

    public boolean passExam(Student student,Subject subject) throws NullStudentException, NullSubjectException;
    public Subject showInfoBySubject (Student student,Subject subject) throws NullStudentException, NullSubjectException;
    public int showStudentMarkBySubject (Student student, Subject subject) throws NullStudentException, NullSubjectException;
    public boolean beginStuding (Student student) throws NullStudentException;
    public Subject addSubject (Student student, Subject subject) throws NullStudentException, NullSubjectException;
    public boolean delSubject(Student student, Subject subject) throws NullStudentException, NullSubjectException;
    public Map<Integer, Subject> showAllSubjects(Student student) throws NullStudentException;
    public int averageMark (Student student) throws NullStudentException;
    public boolean subjecttExists(Student student,Subject subject) throws NullStudentException, NullSubjectException;
    public boolean studentExists(Student student) throws NullStudentException;

        }
