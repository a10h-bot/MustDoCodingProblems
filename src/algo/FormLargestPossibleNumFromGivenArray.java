package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Form the largest possible number from the given array of number
public class FormLargestPossibleNumFromGivenArray {
    public static void main(String[] args) {
        String [] Array = {"54", "546", "548", "60"};
        final List<String> input = new ArrayList<String>();
        for(int i=0;i<Array.length;i++){
            input.add(Array[i]);
        }
        System.out.println(helper(input));
        //o/p->    6054854654
    }

    private static int helper(List<String> input) {
        StringBuilder str  =new StringBuilder();
        Collections.sort(input, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b)>0? 1:1;
            }
        });
        for (int i=0;i< input.size();i++){
            str.append(input.get(i));
        }
        return Integer.parseInt(str.toString());
    }


}
