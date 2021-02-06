package schedule;

import java.util.HashMap;

public class Teacher {

    String[] chineseTeacher = {"C1", "C2"};
    String[] mathTeacher = {"M1","M2"};
    String[] englishTeacher = {"E1", "E2"};

    public HashMap<Integer, String> chinese() {
        HashMap<Integer, String> chineseMap = new HashMap<Integer, String>();
        for (int i = 0; i < chineseTeacher.length; i++) {
            chineseMap.put(i,chineseTeacher[i]);

        }
        return chineseMap;
    }

    public HashMap<Integer, String> math() {
        HashMap<Integer, String> mathMap = new HashMap<Integer, String>();
        for (int i = 0; i < mathTeacher.length; i++) {
            mathMap.put(i,mathTeacher[i]);
        }
        return mathMap;
    }

    public HashMap<Integer, String> english() {
        HashMap<Integer, String> englishMap = new HashMap<Integer, String>();
        for (int i = 0; i < englishTeacher.length; i++) {
            englishMap.put(i,englishTeacher[i]);
        }
        return englishMap;
    }
}


