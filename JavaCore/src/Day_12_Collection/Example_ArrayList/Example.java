package Day_12_Collection.Example_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        //them các phần tử
        al.add("VQP");
        al.add("ThePD");
        Collections.addAll(al, "Apple","Banana");

        //xoa các phần tử theo value
        al.remove("Banana");

        //xóa ptu theo index
        al.remove(1);
        System.out.println(al);

        // tìm kiếm
        if (al.contains("VQP")) {
            System.out.println("VQP in the list");
        }

        //thêm vào bằng index
        al.set(0, "Orange");
        System.out.println("After Updating: " + al);

        //Sắp xếp theo thứ tự
        Collections.sort(al);
        System.out.println("After Sorting: " + al);

    }
}
