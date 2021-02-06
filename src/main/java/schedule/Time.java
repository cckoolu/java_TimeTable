package schedule;

import java.util.HashMap;

public class Time {
    public HashMap<Integer, String> lessonx(){
        String[] day = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        String[] time = {"8:00", "9:00", "10:00", "11:00", "12:00"};
        HashMap<Integer,String> timeStampMap = new HashMap<Integer, String>();
        int num = 0;
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < time.length; j++) {
                String timestamp = day[i] + " " + time[j];
                timeStampMap.put(num,timestamp);
                num++;
            }
        }

        return timeStampMap;
    }


    public static void main(String[] args) {
        String[] day = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        String[] time = {"8:00", "9:00", "10:00", "11:00", "12:00"};
        HashMap<Integer,String> timeStampMap = new HashMap<Integer, String>();
        int num = 0;
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < time.length; j++) {
                String timestamp = day[i] + " " + time[j];
                timeStampMap.put(num,timestamp);
                num++;
            }
        }
        System.out.println(timeStampMap);

//        HashMap<Integer,String> lessonx = new HashMap<Integer, String>();
//        int nums = 0;
//        HashMap<Integer, String> Room = new Room().room();
//        for (int i = 0; i < timeStampMap.size(); i++) {
//            for (int j = 0; j < Room.size(); j++) {
//                String time_room = timeStampMap.get(i);
//                lessonx.put(nums,time_room);
//                nums++;
//            }
//        }
//        System.out.println(lessonx);
    }
}
