package schedule;

import java.util.HashMap;

public class Lesson {

    public HashMap<Integer, String> lesson() {
        String[] allLesson = {"语文", "数学", "英语"};
        HashMap<Integer, String> lessonMap = new HashMap<Integer, String>();
        for (int i = 0; i < allLesson.length; i++) {
            lessonMap.put(i,allLesson[i]);
        }
        return lessonMap;
    }

    public static void main(String[] args) {
        String[] allLesson = {"语文", "数学", "英语"};
        HashMap<Integer, String> lessonMap = new HashMap<Integer, String>();
        for (int i = 0; i < allLesson.length; i++) {
            lessonMap.put(i,allLesson[i]);
        }
        System.out.println(lessonMap);




    }
}
