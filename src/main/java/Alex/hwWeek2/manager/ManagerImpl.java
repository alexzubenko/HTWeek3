package Alex.hwWeek2.manager;

import Alex.hwWeek2.enteties.Student;
import Alex.hwWeek2.enteties.Subject;
import Alex.hwWeek2.exceptions.NullStudentException;
import Alex.hwWeek2.exceptions.NullSubjectException;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by alex on 30.11.15.
 */
public class ManagerImpl implements Manager {
    private static final Logger LOGGER = Logger.getLogger(ManagerImpl.class);

    @Override
    public boolean passExam(Student student, Subject subject) throws NullSubjectException, NullStudentException {

        if (subjecttExists(student, subject)) {

            student.getListOfSubjects().get(subject.getId()).setExamStatus(true);
            return true;
        } else {
            throw new NullSubjectException();
        }

    }

    @Override
    public Subject showInfoBySubject(Student student, Subject subject) throws NullStudentException, NullSubjectException {

        if (subjecttExists(student, subject)) {

            return student.getListOfSubjects().get(subject.getId());


        } else {
            LOGGER.error("your Subject is null");
            throw new NullSubjectException();
        }
    }

    @Override
    public int showStudentMarkBySubject(Student student, Subject subject) throws NullStudentException, NullSubjectException {

        if (subjecttExists(student, subject)) {
            return student.getListOfSubjects().get(subject.getId()).getSubjectMarkByStudent();
        } else {
            throw new NullSubjectException();
        }
    }


    @Override
    public boolean beginStuding(Student student) throws NullStudentException {
        if (studentExists(student)) {
            student.setStuding(true);
            return true;

        } else {
            throw new NullStudentException();
        }


    }

    @Override
    public Subject addSubject(Student student, Subject subject) throws NullStudentException, NullSubjectException {
        if (subjecttExists(student, subject)) {
            return student.getListOfSubjects().put(subject.getId(), subject);

        } else {
            throw new NullSubjectException();
        }

    }

    @Override
    public boolean delSubject(Student student, Subject subject) throws NullStudentException, NullSubjectException {
        if (subjecttExists(student, subject)) {
            return student.getListOfSubjects().remove(subject.getId(), subject);
        } else {
            throw new NullSubjectException();
        }

    }

    @Override
    public Map<Integer, Subject> showAllSubjects(Student student) throws NullStudentException {
        if (studentExists(student)) {
            return student.getListOfSubjects();
        } else {
            throw new NullStudentException();
        }


    }

    @Override
    public int averageMark(Student student) throws NullStudentException {
        if (student != null) {
            int count = 0;

            Map<Integer, Subject> map = student.getListOfSubjects();

            for (Subject st : map.values()) {
                count = count + st.getSubjectMarkByStudent();

            }

            int result = count / map.values().size();


            return result;
        } else {
            throw new NullStudentException();
        }

    }


    @Override
    public boolean subjecttExists(Student student, Subject subject) throws NullStudentException, NullSubjectException {
        if (student != null) {

            if (student.getListOfSubjects().containsKey(subject.getId())) {
                return true;
            } else {
                throw new NullSubjectException();
            }

        } else {
            throw new NullStudentException();
        }
    }

    @Override
    public boolean studentExists(Student student) throws NullStudentException {
        if (student != null) {
            return true;

        } else {
            throw new NullStudentException();
        }

    }


}
