package CodeAcademy;

import java.util.ArrayList;

public class Lunch {
    public static ArrayList<String> removeItem(ArrayList<String> list, String item) {
        /*int i = 0;
        while (i < list.size()) {
            if(list.get(i).contains(item)) {
                list.remove(i);
            } else {
                i++;
            }
        }*/

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(item)) {
                list.remove(i);
                i--;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchBox = new ArrayList<String>();

        String item = "banana";

        lunchBox.add("banana");
        lunchBox.add("juice");
        lunchBox.add("sandwich");

        ArrayList<String> result = removeItem(lunchBox, item);
        System.out.println(result);
    }
}
