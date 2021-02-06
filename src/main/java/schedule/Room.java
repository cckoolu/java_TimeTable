package schedule;

import java.util.HashMap;

public class Room {
    public HashMap<Integer, String> room(){
        String[] allRoom = {"801", "802", "803"};
        HashMap<Integer, String> roomMap = new HashMap<Integer, String>();
        for (int i = 0; i < allRoom.length; i++) {
            roomMap.put(i, allRoom[i]);
        }
        return roomMap;
    }

    public static void main(String[] args) {
        String[] allRoom = {"801", "802", "803"};
        HashMap<Integer, String> roomMap = new HashMap<Integer, String>();
        for (int i = 0; i < allRoom.length; i++) {
            roomMap.put(i, allRoom[i]);
        }
        System.out.println(roomMap);
    }
}
