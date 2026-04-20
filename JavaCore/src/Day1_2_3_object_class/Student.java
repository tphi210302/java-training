package Day1_2_3_object_class;

public class Student extends Object{
    private int id;
    private String name;
    private String address;
    private long classId;

    public Student() {
    }

    public Student(int id, String name, String address, long classId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.classId = classId;
    }

    // getter
    public int getId() { return id; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classId=" + classId +
                '}';
    }

    // hiển thị 1 student
    public void show() {
        System.out.println(id + " - " + name + " - " + address + " - classId: " + classId);
    }

    // thêm student
    public void add(Student[] arr, int index) {

        arr[index] = this;
    }

    // hiển thị tất cả student
    public void showAll(Student[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                arr[i].show();
            }
        }
    }

    // tìm theo địa chỉ Ninh Bình
    public void findByAddress(Student[] arr, int size, String addr) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].getAddress().equals(addr)) {
                arr[i].show();
            }
        }
    }

    // xóa Strudent
    public int delete(Student[] arr, int size, int id) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                return size - 1;
            }
        }
        return size;
    }
}