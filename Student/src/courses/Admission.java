package courses;

import java.util.List;

public class Admission {

    public String avail(List<EEE> eeeCourses, String deptId) {
        int enro = 0;
        int booked = 0;

        for (EEE e : eeeCourses) {
            if (e.getDeptID().equals(deptId)) {
                enro = e.getSeat();
                booked++;
            }
        }

        if (booked < enro) {
            return "Few seats available";
        } else {
            return "Seats are full";
        }
    }
}
