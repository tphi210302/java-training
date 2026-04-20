package Day1_2_3_object_class;

import Day1_2_3_object_class.Student;

public class StudentService {
    public static int sizeStudentArr = 0;

    public void addStudent(Student[] arr, Student student) {
        sizeStudentArr ++;
        if (arr.length <= sizeStudentArr) {
            Student[] oldSt = arr;
            arr = new Student[sizeStudentArr * 2];
            for (int x = 0; x <oldSt.length ; x++) {
                arr[x] = oldSt[x];
            }
            arr[oldSt.length + 1] = student;
        } else {
            arr[arr.length + 1] = student;
        }
    }

}
