package CodeAcademy;

import java.util.ArrayList;
import java.util.Arrays;

public class ToDoList {
    public static void main(String[] args){
        ArrayList<String> toDoList = new ArrayList<String>();
        String[] todo = {};

        String toDo1 = "Water plants";
        String toDo2 = "Exercises";
        String toDo3 = "Courses";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);


        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList below:
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());

        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        sherlocksToDos.remove("visit the crime scene");
        sherlocksToDos.remove("play violin");
        poirotsToDos.remove("visit the crime scene");

        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlocksToDos + "\n");
        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos);

        System.out.println(sherlocksToDos.get(2));
        System.out.println(poirotsToDos.get(1));

        System.out.println(sherlocksToDos.indexOf("solve the case"));

        // Print the name of the detective with the larger to-do list:
        if(sherlocksToDos.size() > poirotsToDos.size()) {
            System.out.println("sherlocks");
        } else {
            System.out.println("poirotsToDos");
        }


        String[] favoriteSongs = new String[10];
        favoriteSongs[0] = "favoriteSongs";
        favoriteSongs[1] = "Numb";
        favoriteSongs[2] = "Du hast";
        favoriteSongs[3] = "New devide";
        favoriteSongs[4] = "Auslander";
        favoriteSongs[5] = "Blow up your mind";
        favoriteSongs[6] = "Human";
        favoriteSongs[7] = "Espresso";
        favoriteSongs[8] = "Snuff";
        favoriteSongs[9] = "Levitate";

        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Song1");
        desertIslandPlaylist.add("Song2");
        desertIslandPlaylist.add("Song3");
        desertIslandPlaylist.add("Song4");
        desertIslandPlaylist.add("Song5");

        System.out.println(desertIslandPlaylist);

        ArrayList<String> favoriteSongsList = new ArrayList<String>(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.addAll(favoriteSongsList);
        System.out.println(desertIslandPlaylist);
    }
}
