package Day1_2_3_object_class;

public class DynamicArray {
    private Object[] arr;
    private int size;

    public DynamicArray() {
        arr = new Object[2]; // initial capacity
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = value;
    }

    private void resize() {
        int newCapacity = arr.length * 2; // nhân đôi
        Object[] newArr = new Object[newCapacity];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }
    public <T> void showArr (Class<T> vClass) {
        for (int i =0; i < size; i++) {
            if (arr[i] != null) {
                System.out.println("value : " +  vClass.cast(arr[i]).toString());
            }
        }
    }
}
