package schedule;

import java.util.HashMap;

public class Tstatus {
    public HashMap<String, String> clazzHour() {
        HashMap<Integer, String> Lesson = new Lesson().lesson();
        HashMap<Integer, String> chinese = new Teacher().chinese();
        HashMap<Integer, String> math = new Teacher().math();
        HashMap<Integer, String> english = new Teacher().english();
        HashMap<String, String> lessonN = new HashMap<String, String>();

        String status = "未上课";

        for (int i = 0; i < chinese.size(); i++) {
            String value = Lesson.get(0) + chinese.get(i);
            lessonN.put(value,status);

        }

        for (int i = 0; i < math.size(); i++) {
            String value = Lesson.get(1) + math.get(i);
            lessonN.put(value,status);

        }
        for (int i = 0; i < english.size(); i++) {
            String value = Lesson.get(2) + english.get(i);
            lessonN.put(value,status);

        }
        return lessonN;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> Lesson = new Lesson().lesson();
        HashMap<Integer, String> chinese = new Teacher().chinese();
        HashMap<Integer, String> math = new Teacher().math();
        HashMap<Integer, String> english = new Teacher().english();
        HashMap<String, String> lessonN = new HashMap<String, String>();

        String status = "未上课";

        for (int i = 0; i < chinese.size(); i++) {
            String value = Lesson.get(0) + chinese.get(i);
            lessonN.put(value,status);

        }

        for (int i = 0; i < math.size(); i++) {
            String value = Lesson.get(1) + math.get(i);
            lessonN.put(value,status);

        }
        for (int i = 0; i < english.size(); i++) {
            String value = Lesson.get(2) + english.get(i);
            lessonN.put(value,status);

        }
        System.out.println(lessonN);
    }
}
