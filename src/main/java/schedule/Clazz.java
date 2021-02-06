package schedule;

import java.util.HashMap;


public class Clazz {
    public HashMap<Integer, String> clazz(){
        String[] allClazz = {"183-1", "183-2", "183-3"};
        HashMap<Integer, String> clazzMap = new HashMap<Integer, String>();
        for (int i = 0; i < allClazz.length; i++) {
            clazzMap.put(i, allClazz[i]);
        }
        return clazzMap;
    }

    public static void main(String[] args) {
        String[] allClazz = {"183-1", "183-2", "183-3"};
        HashMap<Integer, String> clazzMap = new HashMap<Integer, String>();
        for (int i = 0; i < allClazz.length; i++) {
            clazzMap.put(i, allClazz[i]);
        }
        System.out.println(clazzMap);
    }
}

