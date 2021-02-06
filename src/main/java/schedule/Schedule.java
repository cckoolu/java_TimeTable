package schedule;


import java.util.LinkedHashMap;
import java.util.*;

public class Schedule {
    public static void main(String[] args) {
        HashMap<Integer, String> Time = new Time().lessonx();
        HashMap<String, String> Tstatus = new Tstatus().clazzHour();
        HashMap<Integer, String> Clazz = new Clazz().clazz();
        HashMap<Integer, String> Lesson = new Lesson().lesson();
        HashMap<Integer, String> chinese = new Teacher().chinese();
        HashMap<Integer, String> math = new Teacher().math();
        HashMap<Integer, String> english = new Teacher().english();

        Random r = new Random();
//      绑定班级的上课老师
        HashMap<String, String> clazz1 = new HashMap<String, String>();
        HashMap<String, String> clazz2 = new HashMap<String, String>();
        HashMap<String, String> clazz3 = new HashMap<String, String>();




        ArrayList<Integer> C1List = new ArrayList<Integer>();
        ArrayList<Integer> C2List = new ArrayList<Integer>();

        for (int i = 0; i < Clazz.size(); i++) {
            String clazz = Clazz.get(i);
//            System.out.println(clazz);
            for (int j = 0; j < Lesson.size(); j++) {
                String lesson = Lesson.get(j);

                if (clazz == "183-1") {
                    if (lesson == "语文") {
                        int chineseNum = r.nextInt(chinese.size());
                        String teacherc = chinese.get(chineseNum);
                        String value = lesson + teacherc;
//                    System.out.println(value);
                        clazz1.put(lesson, value);
                    } else if (lesson == "数学") {
                        int mathNum = r.nextInt(math.size());
                        String teacherm = math.get(mathNum);
                        String value = lesson + teacherm;
//                    System.out.println(value);
                        clazz1.put(lesson, value);
                    } else {
                        int englishNum = r.nextInt(english.size());
                        String teachere = english.get(englishNum);
                        String value = lesson + teachere;
//                    System.out.println(value);
                        clazz1.put(lesson, value);
                    }
                } else if (clazz == "183-2") {
                    if (lesson == "语文") {
                        int chineseNum = r.nextInt(chinese.size());
                        String teacherc = chinese.get(chineseNum);
                        String value = lesson + teacherc;
//                    System.out.println(value);
                        clazz2.put(lesson, value);
                    } else if (lesson == "数学") {
                        int mathNum = r.nextInt(math.size());
                        String teacherm = math.get(mathNum);
                        String value = lesson + teacherm;
//                    System.out.println(value);
                        clazz2.put(lesson, value);
                    } else {
                        int englishNum = r.nextInt(english.size());
                        String teachere = english.get(englishNum);
                        String value = lesson + teachere;
//                    System.out.println(value);
                        clazz2.put(lesson, value);
                    }

                } else {
                    if (lesson == "语文") {
                        int chineseNum = r.nextInt(chinese.size());
                        String teacherc = chinese.get(chineseNum);
                        String value = lesson + teacherc;
//                    System.out.println(value);
                        clazz3.put(lesson, value);
                    } else if (lesson == "数学") {
                        int mathNum = r.nextInt(math.size());
                        String teacherm = math.get(mathNum);
                        String value = lesson + teacherm;
//                    System.out.println(value);
                        clazz3.put(lesson, value);
                    } else {
                        int englishNum = r.nextInt(english.size());
                        String teachere = english.get(englishNum);
                        String value = lesson + teachere;
//                    System.out.println(value);
                        clazz3.put(lesson, value);
                    }
                }
            }
        }


        List<String> list = new ArrayList<>(List.of("语文", "数学", "英语","休息"));

        int j = 0;
        int clazzCNum = 0;
        int clazzMNum = 0;
        int clazzENum = 0;

        int teacherNum1 =2;
        int teacherNum2 =2;
        //        时间
//        for (int i = 0; i < Time.size(); i++) {
        for (int i = 0; i < 25; i++) {
            String time = Time.get(i);

            System.out.println(time + " ");
            for (int k = 0; k < Clazz.size(); k++) {
//                班级
                String clazzs = Clazz.get(k);

                if (j< Clazz.size()) {
                    String clazz = Clazz.get(j);
                    System.out.print(clazz + " ");
                }else {
                    j = 0;
                    String clazz = Clazz.get(j);
                    System.out.print(clazz + " ");
                }


//              课程
                int lessonNum = r.nextInt(list.size());
                String lessonResult = list.get(lessonNum);
                System.out.println(lessonResult+" ");

//              老师
                if (Clazz.get(j).equals(Clazz.get(0))) {
                    if (lessonResult.equals("语文")) {
                        String techerc = clazz1.get("语文");
                        System.out.println(techerc+" ");
                        if (Tstatus.get(techerc).equals("已上课")) {
                            System.out.println("重复语文老师，休息");
                        } else if (techerc.equals("语文C1")) {
                            Tstatus.put(techerc, "已上课");
                            C1List.add(i);



//                            老师不能连续上3节课
                            if (C1List.size() <= 2) {
                                clazzCNum++;
                                System.out.println("语文课时" + clazzCNum);

                            }else {
                                if (C1List.get(teacherNum1 ) - C1List.get(teacherNum1-1) == 1 && C1List.get(teacherNum1-1) - C1List.get(teacherNum1-2) == 1 ) {
                                    System.out.println("休息啦-------------------------------");
                                    C1List.remove(teacherNum1);
                                } else {
                                    clazzCNum++;
                                    System.out.println("语文课时" + clazzCNum);
                                    teacherNum1++;
                                }
                            }
                            System.out.println(C1List);
                            System.out.println(teacherNum1);
                            System.out.println(C1List.size());

                        } else if (techerc.equals("语文C2")) {
                            Tstatus.put(techerc, "已上课");
                            C2List.add(i);

                            if (C2List.size() <= 2) {
                                clazzCNum++;
                                System.out.println("语文课时" + clazzCNum);

                            }else {
                                if (C2List.get(teacherNum2 ) - C2List.get(teacherNum2-1) == 1 && C2List.get(teacherNum2-1) - C2List.get(teacherNum2-2) == 1 ) {
                                    System.out.println("休息啦-------------------------------");
                                    C1List.remove(teacherNum2);
                                } else {
                                    clazzCNum++;
                                    System.out.println("语文课时" + clazzCNum);
                                    System.out.println("正常上课");
                                    teacherNum2++;
                                }
                            }
                            System.out.println(C2List);
                            System.out.println(teacherNum2);
                            System.out.println(C2List.size());
                        }

//                        控制课时
                        if (clazzCNum == 9){
                            list.remove(lessonResult);
                        }


                    } else if (lessonResult.equals("数学")) {
                        String techerc = clazz1.get("数学");
                        System.out.println(techerc);
                        if (Tstatus.get(techerc).equals("已上课")) {
                            System.out.println("重复数学老师，休息");
                        } else if (techerc.equals("数学M1")) {
                            Tstatus.put(techerc, "已上课");
                        } else if (techerc.equals("数学M2")) {
                            Tstatus.put(techerc, "已上课");
                        }
                        clazzMNum++;
                        System.out.println("数学课时"+clazzMNum);
                        if (clazzMNum == 2){
                            list.remove(lessonResult);
                        }

                    } else if (lessonResult.equals("英语")) {
                        String techerc = clazz1.get("英语");
                        System.out.println(techerc);
                        if (Tstatus.get(techerc).equals("已上课")) {
                            System.out.println("重复英语老师，休息");
                        } else if (techerc.equals("英语E1")) {
                            Tstatus.put(techerc, "已上课");
                        } else if (techerc.equals("英语E2")) {
                            Tstatus.put(techerc, "已上课");
                        }
                        clazzENum++;
                        System.out.println("英语课时"+clazzENum);
                        if (clazzENum == 2){
                            list.remove(lessonResult);
                        }
                    }
                }
                j++;
            }
            Tstatus.put("语文C1","未上课");
            Tstatus.put("语文C2","未上课");
            Tstatus.put("数学M1","未上课");
            Tstatus.put("数学M2","未上课");
            Tstatus.put("英语E1","未上课");
            Tstatus.put("英语E2","未上课");
        }
    }
}



