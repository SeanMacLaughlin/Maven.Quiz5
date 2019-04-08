package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private Student student;
    private ArrayList<Student> zipCodeWilmington = new ArrayList<>();
    private Map studyMap = new HashMap();

    public void enroll(Student student) {
        zipCodeWilmington.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return zipCodeWilmington.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student : zipCodeWilmington) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        return null;
    }
}
