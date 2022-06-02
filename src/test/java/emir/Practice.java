package emir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        countLetters("emire");
        sortArrayWithoutUsingSortMethod4();

    }

    public static String[] asd(){
        String[] emir = new String[3];
        emir[2] = "asd";
        return emir;


    }


    public static void countLetters(String str){
        List<String> arr = new ArrayList<String>(List.of(str.split("")));

        arr.stream()
                .filter(x-> Collections.frequency(arr,x)!=1)
                .distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    //4.Write a method that sorts an Array int[] without using the sort method.
    public static void sortArrayWithoutUsingSortMethod4() {
//        int[] arr = {2,86,72,8} --> {2,8,72,86} or {86,72,8,2}
        int[] arr = new int[] {11,22,33,1,2,3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) { //--->if I switch > to < then it will be descending
                    int	temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
