package Day1_2_3_object_class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[StudentService.sizeStudentArr];
        DynamicArray studentArr = new DynamicArray();
        DynamicArray classArr = new DynamicArray();
        StudentService studentService = new StudentService();
        ClassRoom[] classes = new ClassRoom[0];

        int studentSize = 0;
        int classSize = 0;

        // object trung gian (để gọi method)
        ClassRoom classService = new ClassRoom(0,"");

        while (true) {
            System.out.println("\n1. Quản lý lớp");
            System.out.println("2. Quản lý học sinh");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();

            // ===== CLASS =====
            if (choice == 1) {
                System.out.println("1. Thêm lớp");
                System.out.println("2. Xem lớp");

                int c = sc.nextInt();

                if (c == 1) {
                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Tên: ");
                    String name = sc.nextLine();

                    ClassRoom cr = new ClassRoom(id, name);
                    classArr.add(cr);
                }

                if (c == 2) {
                    classArr.showArr(ClassRoom.class);
                }
            }

            // ===== STUDENT =====
            if (choice == 2) {
                System.out.println("1. Thêm student");
                System.out.println("2. Xem student");
                System.out.println("3. Tìm Ninh Bình");

                int s = sc.nextInt();

                if (s == 1) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tên: ");
                    String name = sc.nextLine();

                    System.out.print("Địa chỉ: ");
                    String addr = sc.nextLine();

                    System.out.print("classId: ");
                    long classId = sc.nextLong();

                    Student st = new Student(id, name, addr, classId);
                    studentArr.add(st);
                }

                if (s == 2) {
                    studentArr.showArr(Student.class);
                }
//
//                if (s == 3) {
//                    studentService.findByAddress(students, studentSize, "Ninh Bình");
//                }
            }
        }
    }
}