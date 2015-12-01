package Alex.hwWeek2.manager;


import Alex.hwWeek2.enteties.Student;
import Alex.hwWeek2.enteties.Subject;
import Alex.hwWeek2.exceptions.NullSubjectException;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class ManagerImplTest {

    private static final Logger LOGGER = Logger.getLogger(ManagerImplTest.class);

    Student student;
    Subject subject;
    Manager manager;

    Student mockStudent;
    Subject mockSubject;
    Manager mockManager;

    @Before
    public void initEnteties() {
        student = new Student(1, "Alex", "Kiev");

        subject = new Subject(1, "Test", 34);
        student.getListOfSubjects().put(subject.getId(), subject);
        manager = new ManagerImpl();
        mockStudent = mock(Student.class);
        //todo init mock wia when
        mockSubject = mock(Subject.class);
        mockManager = mock(ManagerImpl.class);
    }

    @Test
    public void testPassExam() throws Exception {
        try {
            manager.passExam(student, subject);
        } catch (NullSubjectException e) {
            LOGGER.error("You have not inicialized Subject");
        }
        assertEquals(true, student.getListOfSubjects().get(student.getId()).isExamStatus());

    }

    @Test(expected = NullSubjectException.class)
    public void testPassExamNegative() throws Exception, NullSubjectException {
        Subject test = new Subject(2, "test2", 23);
        manager.passExam(student, test);
    }

    @Test
    public void testShowInfoBySubject() throws Exception {

        try {
            manager.showInfoBySubject(student, subject);
        } catch (NullSubjectException e) {
            e.printStackTrace();
        }
        assertEquals(subject.getClass(), student.getListOfSubjects().get(subject.getId()).getClass());


    }


    @Test(expected = NullSubjectException.class)
    public void testShowInfoBySubjectNegative() throws Exception, NullSubjectException {
        Student student2 = new Student(3, "Boris", "Dnepropetrovsk");

            manager.showInfoBySubject(student2, subject);
    }

    @Test
    public void testShowStudentMarkBySubject() throws Exception {


    }

    @Test
    public void testBeginStuding() throws Exception {

    }

    @Test //todo wi mock
    public void testAddSubject() throws Exception, NullSubjectException {
        Subject subject1 = null;
        Subject subj = new Subject(0,null,0);

            //subject1= manager.addSubject(mockStudent, mockSubject);
        subject1 = manager.addSubject(student,subj);

        assertEquals(Subject.class, subject1.getClass());

    }

    @Test
    public void testDelSubject() throws Exception {

    }

    @Test
    public void testShowAllSubjects() throws Exception {

    }

    @Test
    public void testAverageMark() throws Exception {

    }

    @Test
    public void testSubjecttExists() throws Exception {

    }

    @Test
    public void testStudentExists() throws Exception {

    }

    @Test
    public void testPassExam1() throws Exception {

    }

    @Test
    public void testShowInfoBySubject1() throws Exception {

    }

    @Test
    public void testShowStudentMarkBySubject1() throws Exception {

    }

    @Test
    public void testBeginStuding1() throws Exception {

    }

    @Test
    public void testAddSubject1() throws Exception {

    }

    @Test
    public void testDelSubject1() throws Exception {

    }

    @Test
    public void testShowAllSubjects1() throws Exception {

    }

    @Test
    public void testAverageMark1() throws Exception {

    }

    @Test
    public void testSubjecttExists1() throws Exception {

    }

    @Test
    public void testStudentExists1() throws Exception {

    }
}