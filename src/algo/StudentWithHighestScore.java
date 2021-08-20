//package algo;
////given an array scores[][] = {“jerry”,”65”},{“bob”,”91”}, {“jerry”,”23”}, {“Eric”,”83”}}
//
//import java.util.HashMap;
//import java.util.Map;
//
////Find the student with highest average score
//public class StudentWithHighestScore {
//    //you can have a hashmap with key string and arraylist of size2 where u can store the current sum in 0 index and num of scores in 1 index
//    public static <Student> void main(String[] args) {
//        String Student[][] = {{"jerry", "65"}, {"bob", "1"}, {"jerry", "23"}, {"jerry", "23"}, {"jerry", "100"}, {"Eric", "83"}};
//        Map<Student> map =new HashMap<>();
//        double max_avg = 0.0;
//        String key;
//        for (int i = 0; i();
//             Integer score = Integer.parseInt(student[i][1]));
//        if (map.containsKey(student[i][0])
//        {
//            Integer sum = map.get(student[i][0]).get(0);
//            Integer num = map.get(student[i][0]).get(1) + 1;
//            sum = sum + score;
//            map.get(student[i][0]).set(0, sum);
//            map.get(student[i][0]).set(1, num);
//
//            avg = sum / score;
//            if (avg > max_avg) {
//                max_avg = avg;
//                key = student[i][0];
//            } else {
//                List ar = new ArrayList();
//                ar.add(score);
//                ar.add(1);
//                map.put(student[i][0], ar);
//            }
//        }
//
//        System.out.println(map.get(key));
//
//    }
//
//    //O(n) solution single pass
//}
