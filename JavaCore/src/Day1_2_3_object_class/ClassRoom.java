package Day1_2_3_object_class;

class ClassRoom {
    private long id;
    private String name;

    public ClassRoom(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id; }

    public void show() {
        System.out.println(id + " - " + name);
    }
    //thêm ClassRoom
    public void add(ClassRoom[] arr, int index) {
        arr[index] = this;
    }
    //xem danh sách classRoom
    public void showAll(ClassRoom[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                arr[i].show();
            }
        }
    }
    //xóa ClassRoom
    public int delete(ClassRoom[] arr, int size, long id) {
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