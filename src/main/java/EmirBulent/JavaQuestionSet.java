package EmirBulent;

import org.openqa.selenium.json.JsonOutput;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;


public class JavaQuestionSet{
    private static int numberIncrement = 0;
    public JavaQuestionSet(){
        numberIncrement++;
    }
    public JavaQuestionSet(int number){
        this.numberIncrement = number;
    }
    //Write a Program to showcase inheritance
    class Animal{
        String color;
    }
    class cat extends Animal{
        void meow(){
            System.out.println("meow");
        }
    }
    public static void main(String[] args) {
        //swapVariable(3,4);
        //System.out.println(IsAnagram("emir","mira"));
        //reverseSentence("emir abc def");
        //System.out.println(" ");
        //System.out.println(Arrays.toString(sortArray(new int[]{2, 1, 4, 5})));
        //letterRepeat("emir mire");
        //System.out.println(IsPalindrome("10801"));
        //System.out.println(IsPalindrome("10803"));
        //System.out.println(fibonacci(5));
        //System.out.println(missingNumber(new Integer[] {2,3,4,5,6,7,8,9,10}));
        //findPairs(new int[] {4, 6, 5, -10, 8, 5, 20},10);
        //countWords("Ali came to school and Ayse came to school");
        //showDuplicate("Meeeeerhaba");
        //star(new int[] {4,2,6,5});
//        System.out.println(primeNumber(2928));
//        System.out.println(primeNumber(15));
//        System.out.println(primeNumber(-42141));
        //System.out.println(remainder(224,10));
        //System.out.println(largestArray(new int[] {4,5,8,21,5,1,4,2},4));
        //System.out.println(isEmirp(14));
//        System.out.println(isAutomorphic(5));
//        System.out.println(isAutomorphic(6));
//        System.out.println(isAutomorphic(36));
//        System.out.println(isAutomorphic(890625));
        //System.out.println(isPeterson(145));
        //System.out.println(midNum(2025));
//        System.out.println(fascinatingNumber(327));
//        System.out.println(fascinatingNumber(23));
//        System.out.println(fascinatingNumber(12));
        //ifElse();
        //System.out.println(sumOfTwo(3));
        //System.out.println(weirdAlgorithm(3));
        //System.out.println(missingNumber());
        //longestRepetition("ATTCGGGA");
        //bitStrings(0);
        //countDistinct(5,new int[] {2,3,2,2,3});
        //maxSubArray(8,new int[] {-1,3,-2,5,3,-5,2,2});
        //sumOfTwoValues(4,8,new int[] {2,7,5,1});
        //playList(8,new int[] {1,2,1,3,2,7,4,2});


        //char[] array = new char[] {'c','a','n'};
        //System.out.println(String.valueOf(array)); Convert char array to string variable
        //creatingStrings("aabac");
        //String s = "aabac";
        //System.out.println(permutateForAboveQuestion("aabac",0,s.length()));
        //System.out.println(vowelIsPresent("Hello"));
        //System.out.println(removeWhiteSpace("a a b c e"));
        //System.out.println(otherWayRemoveWhiteSpace("a a b c e"));
        //System.out.println(leadingAndTrailingWhiteSpace("  abc  def "));
        //System.out.println(leadingAndTrailingSpacesWithStrip("  abc  def  "));
        //sortArray();
        //reverseList();
        //System.out.println(leadingAndTrailingWhiteSpace("  abc  def " ));
        //System.out.println(9/2);
        //System.out.println(binarySearch(new int[] {5,8,2,1,4,6,3,7},5));
        //pyramidCharacter(5);
        //reversePyramid(5);
        //System.out.println(sameElements(new int[] {1,2,3,4},new int[] {1,2,3,5}));
        //sumAllElements(new int[] {1,2,3,4,5});
        //secondLargest(new int[] {1,3,4,2,5});
        //shuffleArray(new int[] {1,3,4,2,5});
        //date();
        //mergeLists();
        //sortHashMap();
        //removeOccurences("abcdABCDabcdABCD");
        //removeOccurences("hello");
        //distinctCharacter("abcdABCDabcdABCD");
        //incrementSalary();
        //System.out.println(numberIncrement);
        //JavaQuestionSet myquestionSet = new JavaQuestionSet();
        //System.out.println(numberIncrement);
        //JavaQuestionSet myquestionSet2 = new JavaQuestionSet();
        //System.out.println(numberIncrement);
        //new JavaQuestionSet();
        //System.out.println(numberIncrement);
        //digitQueries(3);
        //numberSpiral();
        //System.out.println(leadingAndTrailingWhiteSpace2("  abc def "));
        //reverseStringProblem("abcd");
        //swapToNumbersProblem(3,4);
        //System.out.println(printFibonacciProblem(5));
        //System.out.println(differenceBetweenNumbers(new int[] {5,6,2,4,9,12,1}));
        //System.out.println(isArmstrongNumber(153));
        //List<Integer> removeFunctionExampleList = Arrays.asList(1,4,3,3,6,7,2,5,2,6);
        //System.out.println(removeDuplicatesList(removeFunctionExampleList));
        //System.out.println(findAllPairsProblem(Arrays.asList(4, 6, 5, -10, 8, 5, 20),10));
        //System.out.println(countTheWords("Ali came to school and Ayse came to school"));
        //System.out.println(countTheCharacters("MerhabaBenimAdimBulent"));
        //System.out.println(isMyTicketLucky(123321));
        //System.out.println(reverseNumber(12345));
        System.out.println(reverseInteger3(12345));
    }



    //1. Write a method that swap two variables' values without using temp variable.
    public static void swapVariable(int a,int b){ // 3 4 7
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);
    }


    //2. Write a method that checks to see if the words u pass is Anagram.
    public static boolean IsAnagram(String a,String b){ // emir mire
        List<String> newList = stream(a.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<String> newList2 = stream(b.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        if(newList.equals(newList2)){
            return true;
        }
        return false;
    }


    //3. Write a method that reverses a sentence. "abc def" --> "def abc"
    public static void reverseSentence(String a){ // ctrl+p           Intermediate  Terminal  --> operators
        // Arrays.stream(a.split(" ")).sorted(Comparator.reverseOrder()).forEach(System.out::print);
        // emir abc def
         String[] splitList = a.split(" ");
         for(int i=splitList.length-1;i>=0;i--){
             System.out.print(splitList[i] + " ");
         }
    }

    //4. Write a method that sorts an Array int[] without using the sort method.
    public static int[] sortArray(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        return array;
    }


    public static void sortArrayWithoutUsingSortMethod4(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) { //--->if I switch > to < then it will be descending
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }



    //5. Write a method that returns how many times each letter is repeated? "emir mire"
    public static void letterRepeat(String a){
        Map<String,Integer> values = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(!values.containsKey(a.charAt(i)+ "")){
                values.put(a.charAt(i) + "",1);
            }
            else {
                values.put(a.charAt(i) + "", values.get(a.charAt(i) + "") + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : values.entrySet()){
            System.out.println("Letter: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }

    //6. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    public static boolean IsPalindrome(String a){ // 10801
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString().equals(a);
    }

    // 7. Write a method that returns nth fibonacci number on given a number num. In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
    public static int fibonacci(int a){
        int b = 0;
        int c = 1;
        int temp = 0;
        for(int i=1;i<a;i++){
            temp = b+c;
            b = c;
            c = temp;
        }
    // 1 1 2 3 5
        return c;
    }

    // 8. Write a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
    public static int missingNumber(Integer[] array){        //new int[] {1,2,3,4,5,6,7,8,9}

        if(!(Arrays.asList(array).contains(1))){
            for(Integer w:Arrays.asList(array)){
                System.out.println(w);

            }
            return 1;
        }

        else if(!(Arrays.asList(array).contains(10))){
            return 10;
        }

        for(int i=1;i<array.length;i++){

            if(!(array[i] - array[i-1] == 1)){
                return array[i] + 1;
            }

            }

       return -1;
    }


    //9. From a given array find all pairs whose sum is a given number
    //    {4, 6, 5, -10, 8, 5, 20} ==> 10
    //    For example;  4+6=10, 5+5=10, -10+20=10

    public static void findPairs(int[] array,int a){
        //nested list
        List<ArrayList<Integer>> pairs = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==a){
                    System.out.print(array[i]  + "+" + array[j] + "=" + a + " ");
                }

            }
        }
    }


    //10.Count the words in a String one by one
    //    String is "Ali came to school and Ayse came to school"
    //    Ali=1, came=2, to=2, school=2, and=1, Ayse=1
    public static void countWords(String a){
        Map<String,Integer> words = new HashMap<>();
        String[] splitted = a.split(" ");
        for(int i=0;i<splitted.length;i++){
            if(!words.containsKey(splitted[i])){
                words.put(splitted[i],1);
            }
            else{
                words.put(splitted[i],words.get(splitted[i])+1);
            }
        }

        //System.out.println(words);
        for(Map.Entry<String,Integer> entry: words.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }

    }

    //11.Write a Java Program that shows the duplicated characters in a given String  Meeeeerhaba
    public static void showDuplicate(String a){
        Map<Character,Integer> duplicate = new HashMap<>();

        for(int i=0;i<a.length();i++){
            if(!(duplicate.containsKey(a.charAt(i)))){
                duplicate.put(a.charAt(i),1);
            }

            else{// shows how many times
                duplicate.put(a.charAt(i),duplicate.get(a.charAt(i)) + 1);
                }
        }

        for(Map.Entry<Character,Integer> entry:duplicate.entrySet()){
            if(entry.getValue() != 1 && entry.getValue() > 1){
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }

    public static void star(int[] array){
        // 4 2 6 5
        int flag = Arrays.stream(array).max().getAsInt();
        for(int i=flag;i>0;i--){ // array * 3
            for(int j=0;j<array.length;j++){
                if(i <= array[j]){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

    // 9. Write a method that checks if the passing argument is a prime number.

    public static boolean primeNumber(int a) {
        if (a % 2 == 0 || a < 2) {
            return false;
        }

        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // 10.Write a method that finds remainder of 2 numbers without using the % operator?
    public static int remainder(int a,int b){
        int quotient = a / b;
        return a-(quotient*b);
    }


    // Given an integer array nums and an integer k, return the kth largest element in the array. {4,5,6,7,12,3,27}
    public static int largestArray(int[] array,int k){
        return Arrays.stream(array).sorted().skip(k-1).findFirst().getAsInt();
    }
    // 31 13
    //A number is called an emirp number if we get another prime number on reversing the number itself. In other words, an emirp number is a number that is prime forwards or backward. It is also known as twisted prime numbers.
    //Java programs to check if the given number is emirp or not.

    public static boolean isEmirp(Integer a){
        StringBuilder sb = new StringBuilder(a+"");
        Integer b = Integer.parseInt(sb.reverse().toString());
        if(primeNumber(a) && primeNumber(b)){
            return true;
        }

        return false;
    }



    //A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 25*25 = 625
    // For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself.
    // Some other automorphic numbers are 5, 6, 890625, etc.

    public static boolean isAutomorphic(long a){
        long square = a*a;
        while(a>0){
            if(a % 10 != square % 10){
                return false;
            }
            a = a/10;
            square = square / 10;
        }

        return true;
    }


    //A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
    //static long[] factorial = new int[] {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    public static boolean isPeterson(int a){
        int[] factorial = new int[] {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        int temp = a;
        int sum = 0;

        while(a>0){
            int b=a%10;
            sum += factorial[b-1];
            a = a / 10;

            if(sum == temp){
                return true;
            }
        }

        return false;
    }

    public static boolean midNum(int a){
        // 2025
        int digit = 0;
        int temp = a;
        while(a>0){
            a = a/10;
            digit++;
        }
        digit = digit/2;
        int left_side =  (temp /(int) Math.pow(10,(digit))); // 1234 --> 2
        int right_side =  (temp % (int)Math.pow(10,digit));

        int left_right = left_side + right_side;
        if(temp==(left_right*left_right)){
            return true;
        }
        return false;
    }

    // 327
 // I stayed here
    public static boolean fascinatingNumber(int a){ // *******************************************************
        int b = a*2;
        int c = a*3;
        String concatNum = a + "" +  b + c; // 327654981
        //String concatNum = "123"; // 327654981

        String[] splitNum = concatNum.split("");
        Arrays.sort(splitNum);
        for(int i=1;i<=9;i++){
            if(i!=Integer.parseInt(splitNum[i-1])){
                return false;
            }
        }
        return true;

    }
    // *******************************************************

    public static void ifElse(){
        boolean type = true;
        boolean type_2 = false;
        if(type){
            System.out.println("main if is running");
        }
        if(type_2){
            System.out.println("second if is running");
        }
        else{
            System.out.println("second if's else is running");
        }

    }
// i stayed here
    public static int sumOfTwo(int a){
        return a+2;
    }
 // . If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one

    public static ArrayList<Integer> weirdAlgorithm(Integer a){
        Integer b = a;
        List<Integer> myList = new ArrayList<>();
        myList.add(b);
        while(b>1) {
            if (b % 2 == 0) {
                b = b / 2;
                myList.add(b);
            } else {
                b = (b * 3) + 1;
                myList.add(b);
            }
        }
        return (ArrayList<Integer>) myList;
    }

    // You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

    public static int missingNumber(){
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        Integer sumOfAllNumbers = (a*(a+1)) / 2; // 15
        // Arrays.stream(array).sum() ???
        Integer sumOfArray = 0;
        for(int i=0;i<array.length;i++){
            sumOfArray += Integer.parseInt(array[i]);
        }
        return sumOfAllNumbers - sumOfArray;
    }

    public static void longestRepetition(String s){
        //String s = "ATTCGGGA";

        Map<Character,Integer> dnaSequence = new HashMap<>();
        int count = 0;
        Map.Entry<Character,Integer> entryWithMaxValue = null;
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(!(dnaSequence.containsKey((s.charAt(i))))){
                dnaSequence.put((s.charAt(i)),1);
            }
            else{
                dnaSequence.put((s.charAt(i)),dnaSequence.get(s.charAt(i))+1);
            }

        }

        for(int j=0;j<s.length();j++){
            for(int i=j+1;i<s.length();i++){
                String temp = Character.toString(s.charAt(i));
                if((Character.toString(s.charAt(j)).equals(temp))){
                    count++;
                }
                if(count != 0){
                    flag=true;
                }
            }
            //myArrList.add(count);
        }
        if(flag){
            for(Map.Entry<Character,Integer> entry : dnaSequence.entrySet()){
                if(entryWithMaxValue== null || entry.getValue().compareTo(entryWithMaxValue.getValue()) > 0){
                    entryWithMaxValue = entry;
                }
            }
        }

        System.out.println("Longest entry : "+entryWithMaxValue+ " and it's value --> " + entryWithMaxValue.getValue());

    }

    public static void permutations(int a){

    }


    public static void bitStrings(int n){

        System.out.println((int)Math.pow(2,n));
    }


    public static void countDistinct(int size,int[] number){ // added solution within set
        Map<String,Integer> numbersMap = new HashMap<>();
        Set<String> numbersSet = new HashSet<>();

        for(int i=0;i<number.length;i++){
            if(!(numbersMap.containsKey(String.valueOf(number[i])))){
                numbersMap.put(String.valueOf(number[i]),1);
            }
            else{
                numbersMap.put(String.valueOf(number[i]),numbersMap.get(String.valueOf(number[i]))+1);
            }
        }
        for(Map.Entry<String,Integer> Entry: numbersMap.entrySet()){
            if(Entry.getValue() % 2 != 0){
                numbersSet.add(Entry.getKey());
            }
        }
        System.out.println(numbersMap.entrySet());
        //System.out.println(stream(numbersSet.toArray()).findFirst().get());
        System.out.println(numbersSet);
    }


     // 05-07-2022
     public static void maxSubArray(int a,int[] array){ // finds all subsequents in an array and gets the max of those subsequents
            int sum = 0;
            List<Integer> maxInteger = new ArrayList<>();
           for(int i=0;i<array.length;i++){
               for(int j=i;j<array.length;j++){
                   for(int k=i;k<=j;k++){
                       //System.out.print(array[k] + " ");
                        sum+=array[k];
                   }

                   //System.out.println("");
                   //System.out.println("sum -->" + sum);
                   maxInteger.add(sum);
                   sum=0;
               }
           }
         System.out.println(Collections.max(maxInteger));
    }

    public static void sumOfTwoValues(int arraySize,int targetSum,int[] array){

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                    if(array[i]+array[j]==targetSum){
                        if((j-i)==1){
                            System.out.println("no solution");
                            return;
                        }
                        else{
                            System.out.print(i+1 + " ");
                            System.out.print(j+1);
                        }
                    }

                }
            }
        }

        public static void playList(int numberOfSongs,int[] songsID){
        int uniqeSequence = 1,tempForI=0;
        List<Integer> uniqeSequenceMax = new ArrayList<>();
            for(int i=0;i<songsID.length;i++){
                for(int j=i+1;j< songsID.length;j++){
                    tempForI = j;
                    if(songsID[j] != songsID[i]){
                        uniqeSequence++;
                    }
                    else{
                        uniqeSequenceMax.add(uniqeSequence);
                        uniqeSequence=0;
                        i= tempForI-1;
                    }
                }
            }
            // 1 2 1 3 2 7 4 2
            System.out.println(uniqeSequenceMax);
            System.out.println(Collections.max(uniqeSequenceMax));
        }




        // **********************************************
    // I cannot do it
        public static void creatingStrings(String a){
            // Total number of permutations of given string a is permutation of total numbers in a characters
            String tempStr = "";
            int numberOfPermutations = permutateForAboveQuestion(a,0,a.length());
            for(int i=0;i<a.length();i++){
                for(int j=i+1;j<a.length();j++){
                    tempStr = swapVariablesForAboveQuestion(a,i,j);
                    System.out.println(tempStr);
                }
            }

        }
        public static String swapVariablesForAboveQuestion(String a,int i,int j){
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }


        public static int permutateForAboveQuestion(String s,int a,int b){
        int count = 0;
        if(a==b){
            System.out.println(s);
        }
        else{
            for(int i = a;i<=b;i++){
                s = swapVariablesForAboveQuestion(s,a,b);
                permutateForAboveQuestion(s,a+1,b);
                s = swapVariablesForAboveQuestion(s,a,b);
                count++;
            }
        }
        return count;
        }


    // **********************************************

    //Java Program to check if a vowel is present in the string?
    public static boolean vowelIsPresent(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    //Check if a List of integers contains only odd numbers?
    public static boolean OnlyContainsOdd(int[] list){
        for(int i=0;i<list.length;i++){
            if(!(list[i] % 2 == 0)){
                return false;
            }
        }

        return true;
    }
    // How to remove Whitespaces from String
    // We can use Character method isWhitespace()
    // and then we can solve the problem without using iswhitespace method
    public static String removeWhiteSpace(String s){
        // if we wanted to use '' this annotation java will give us a complication error so in order to solve this we should just create a char value and assign it to the
        // empty char value
        char a = Character.MIN_VALUE;
        return s.replaceAll(" ","");
        //for(int i=0;i<s.length();i++){
        //    if(s.charAt(i) == ' '){
        //        String.valueOf(s.charAt(i)).replace(' ',a);
        //    }
        //}
        //return s;
    }

    //How to remove Whitespaces from String
    public static String otherWayRemoveWhiteSpace(String s){
        StringBuilder output = new StringBuilder();
        char[] charArray = s.toCharArray();
            for(char c: charArray){
                if(!(Character.isWhitespace(c))){
                    output.append(c);

                }
        }
        return output.toString();
    }

    // How to remove leading and trailing whitespaces from a string?
    // first solve the problem without using strip and solve the problem again within strip function
    //String s = "  abc  def\t";
    public static String leadingAndTrailingWhiteSpace(String s){ // I will look after the internship
        //   "  abc  def "
        StringBuilder sc = new StringBuilder();
        char[] charArray = s.toCharArray();
        int tempForI = 0;
        //System.out.println(charArray);
        for(int i=0;i<charArray.length;i++){
            if(!(Character.isWhitespace(charArray[i]))){
                tempForI = i;

                sc.append(charArray[i]);
            }

        }
        return sc.toString();
    }

    public static String leadingAndTrailingWhiteSpace2(String s){ //--> solved
        StringBuilder sc = new StringBuilder();
        char[] charArray = s.toCharArray();
        // "  abc  def ghj "
        int lastIndexNotWhiteSpace = 0;
        int firstIndexNotWhiteSpace = 0;
        for(int i=s.length();i>=0;i--){ // to find out the spaces with trailing
            if(!(Character.isWhitespace(charArray[i-1]))){
                lastIndexNotWhiteSpace = i-1;
                break;
            }
        }
        for(int j=0;j<=s.length();j++){ // to find out the spaces with leading
            if(!(Character.isWhitespace(s.charAt(j)))){
                firstIndexNotWhiteSpace = j;
                break;
            }
        }
        for(int k=firstIndexNotWhiteSpace;k<=lastIndexNotWhiteSpace;k++){
            sc.append(charArray[k]);
        }
        return sc.toString();
    }

    public static String leadingAndTrailingSpacesWithStrip(String s){
        s= s.strip();
        return s;
    }

    //Sorting an array in Java
    public static void sortArray(){
        List<Integer> exampleList = new ArrayList<>();
        int temp= 0;
        exampleList.add(3);
        exampleList.add(1);
        exampleList.add(5);
        exampleList.add(4);
        exampleList.add(7);
        exampleList.add(2);
        for(int i=0;i< exampleList.size();i++){
            for(int j=i+1;j<exampleList.size();j++){
                if(exampleList.get(j) < exampleList.get(i)){
                    temp = exampleList.get(i);
                    exampleList.set(i, exampleList.get(j));
                    exampleList.set(j,temp);
                }
            }
        }
        System.out.println(exampleList);
    }
    //How to Create a Deadlock Scenario Programatically --> passed no needed to solve this
    // maybe trying to solve later


    //Reverse a Linked List
    public static void reverseList(){
        List<Integer> exampleList = new ArrayList<>();
        List<Integer> exampleList2 = new LinkedList<>();
        exampleList.add(3);
        exampleList.add(1);
        exampleList.add(5);
        exampleList.add(4);
        exampleList.add(7);
        exampleList.add(2);
        System.out.println(exampleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        //exampleList2.desce
        // I found this different solution
    }

    // How to implement Binary Search
    public static int binarySearch(int[] array,int key){
        //Arrays.stream(array).sorted().forEach(System.out::print);
        //Arrays.stream(array).sorted().collect(Collectors.joining(","));
        Arrays.sort(array); // sorts the array , to perform binary search array should be sorted form
        //{5,8,2,1,4,6,3,7} --> {1,2,3,4,5,6,7,8}  //// 9/2 --> 4
        int low = array[0];
        int high = array[array.length-1];
        int mid = array[(low+high)/2];
        while(low <= high){
            if(key == mid){
                return mid;
            }
            else if(key > array[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        return -1;
    }

    // Merge Sort in Java --> later

    //Create a Pyramid of Characters in Java
    public static void pyramidCharacter(int rows){ // if we just want to the print stars this will be better for us --> https://www.journaldev.com/24605/pyramid-pattern-programs-in-java --> pattern 3
            for(int i=1;i<=rows;i++){
                for(int j=i;j<rows;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<(i*2);k++){
                    System.out.print("*");
                }
                System.out.println("");
        }
    }

    public static void reversePyramid(int rows){
        for(int i=0;i<rows;i++){
            System.out.print(" ");
            for(int j=i;j<rows;j++){
                System.out.print("*");
            }
            for(int k=0;k<(i*2)+1;k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //Check if two arrays contains same elements
    public static boolean sameElements(int[] array,int[] array2){
        //Set<Object> uniqueElement = new HashSet<>(Arrays.asList(array));
        //Set<Object> uniqueElement2 = new HashSet<>(Arrays.asList(array2));

        if(array.length!= array2.length){
            return false;
        }
        for(int i=0;i<array.length;i++){
            if(array[i] != array2[i]){
                return false;
            }
        }

        return true;
    }

    //Sum of all elements in integer array
    public static void sumAllElements(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        System.out.println(sum);
    }

    //Find second largest number in an array
    public static void secondLargest(int[] array){ // {1,2,3,4,5}
        Arrays.sort(array);
        System.out.println(Arrays.stream(array).skip(array.length-2).findFirst().getAsInt());
    }

    //How to Shuffle an Array in Java
    public static void shuffleArray(int[] array){ // {1,3,4,2,5}
        //Random rand = new Random(); or we can just use Math.random random seems better
        //int random_int = rand.nextInt();
        //System.out.println(random_int);
        int temp = 0,temp2 = 0;
        int random_index = 0;
        //System.out.println(random_index);
        for(int i=0;i<array.length;i++){
            temp = array[i];
            random_index = (int)Math.floor(Math.random()*(array.length)); // generates a random number between 0 and (array.length-1)
            temp2 = array[random_index];
            array[random_index] = temp;
            array[i] = temp2;
        }
        System.out.println(Arrays.toString(array));
    }

    // How to find if a string is present in a text file --> I am just passing this question.

    //How to print date in specific format
    public static void date(){
//        Date date = new Date();
//        System.out.println(date.toString());
        String format = "MM-dd-yyyy";
        SimpleDateFormat simpleDate = new SimpleDateFormat(format);
        String date = simpleDate.format(new Date());
        System.out.println(date);
    }

    //How to merge two lists in java
    public static void mergeLists(){
        //List<Integer> newList = Stream.concat(stream(array), stream(array2)).collect(Collectors.toList());
        //List<Integer> newList = Stream.concat(stream(array), stream(array2)).toList();
        List<Integer> integerArray = new ArrayList<>();
        List<Integer> integerArray2 = new ArrayList<>();
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray2.add(4);
        integerArray2.add(5);

        List<Integer> mergedList = new ArrayList<>(integerArray);
        mergedList.addAll(integerArray2);
        System.out.println(mergedList);
    }

    // How to Sort HashMap by values
    public static void sortHashMap(){
        Map<String,Integer> exampleHashMap = new HashMap<>();
        exampleHashMap.put("first",9);
        exampleHashMap.put("second",3);
        exampleHashMap.put("third",4);
        exampleHashMap.put("fourth",2);
        exampleHashMap.put("fifth",5);
        exampleHashMap.put("sixth",8);
        //System.out.println(exampleHashMap.entrySet()); [9,3,4,2,5,8]
        List<Integer> hashMapValues = new ArrayList<>(exampleHashMap.values());
        //System.out.println(exampleHashMap.values());
        Collections.sort(hashMapValues);
        System.out.println(hashMapValues);
    }
    // Remove all occurrences of a given character from input String
    public static void removeOccurences(String str){
        // "hello"
        StringBuilder myStrBuilder = new StringBuilder(str);
        char temp = ' ';
        for(int i=0;i<str.length();i++){
            temp = str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(temp == str.charAt(j)){
                   //myStrBuilder.deleteCharAt(i);
                   myStrBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println(myStrBuilder);
    }

    //How to get distinct characters and their count in a String
    public static void distinctCharacter(String str){
        // "abcdABCDabcd"
        Map<Character,Integer> distinctMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!(distinctMap.containsKey(str.charAt(i)))){
                distinctMap.put(str.charAt(i),1);
            }
            else{
                distinctMap.put(str.charAt(i),distinctMap.get(str.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: distinctMap.entrySet()){
            System.out.println("Keys: --> " + entry.getKey() + "  Values : --> " + entry.getValue());
        }

    }


    // Stream operations
    // Java Stream Operations
    // forEach
    public static void incrementSalary(){
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(50);
        salaryList.add(100);
        salaryList.add(150);
        salaryList.add(200);
        salaryList.stream().forEach(e -> System.out.print(e + " "));
    }
    // gray code problem maybe later
    public static void digitQueries(int numOfIterations){
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        String infiniteNum = "0123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960";
        char[] infiniteNumCharArray = infiniteNum.toCharArray();
        while(numOfIterations != 0){
            guess = scanner.nextInt();
            System.out.println(infiniteNumCharArray[guess]);
            numOfIterations--;
        }
    }

    public static void numberSpiral(){
        List<List<Integer>> myMatrix = new ArrayList<>(); // In order to create a matrix in java you can use nested list structure. Should be given an ArrayList object
    /*
        myMatrix.add(new ArrayList<>());
        myMatrix.add(new ArrayList<>());
        myMatrix.add(new ArrayList<>());
        myMatrix.add(new ArrayList<>());
        myMatrix.add(new ArrayList<>());
        myMatrix.add(new ArrayList<>());
                for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                myMatrix.add(new ArrayList<>());
            }
        }
    */
        //System.out.println(myMatrix);
        List<List<Integer>> myNestedList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
        //        System.out.println("my matrix : " + myMatrix);
        System.out.println(myNestedList);
        //System.out.println(myNestedList.get(0));
        for(int i=0;i<myNestedList.size();i++){
            for(int j=0;j<myNestedList.size();j++){
                System.out.println(myNestedList.get(i).get(j));
            }
        }
        //myMatrix.forEach(System.out::println);
    }

    // Again

    //1. Write a Java Program that reverses a string
    public static void reverseStringProblem(String a){ //abcd --> dcba
        StringBuilder sc = new StringBuilder();
        for(int i=a.length();i>0;i--){
            System.out.print(a.charAt(i-1));
        }
    }

    //2. Write a Java Program to swap two numbers
    public static void swapToNumbersProblem(int a,int b){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    //3. Write a Java Program that prints fibonacci number due to given integer (11235811...)
    public static int printFibonacciProblem(int a){ // 1 1 2 3 5
        int b = 0;
        int c = 1;
        int temp = 0;
        for(int i=1;i<a;i++){
            temp = b+c;
            b = c;
            c = temp;
        }
        return c;
    }
    //4. Write a Java Program that checks whether given integer is Prime or not
    public static boolean primeOrNot(int a){ // 15
        for(int i=2;i<a;i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    //5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.
    public static int differenceBetweenNumbers(int[] a){
        int max,min,temp = 0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){ // 6 5 4 9 2 8
                if(a[j] < a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        min = a[0];
        max = a[a.length-1];
        return max-min;
    }
    //6. Write a Java Program that checks if a String is palindrome or not. (tersten de okunuşu aynı olanlar palindrome)
    public static boolean checkPalindrome(String a){
        StringBuilder sc = new StringBuilder(a);
        return sc.reverse().toString().equals(a);
    }
    //7. Write a Java Program that checks if given integer is Armstrong number or not (basamaklarındaki rakamlarının küpleri toplamı kendisine eşit olan sayı: 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27)
    public static boolean isArmstrongNumber(int a){
        int digit = 0;
        int sum= 0,last_digit = 0;
        int temp = a;
        int temp2 = a;
        while(a > 0){ // 153 --> 3
            digit++;
            a = a/10;
        }
        System.out.println("digit : " + digit);
        for(int i=0;i<digit;i++){
            last_digit = temp % 10;
            sum += last_digit*last_digit*last_digit;
            System.out.println("sum : "+sum);
            temp = temp / 10;
            System.out.println("temp : " + temp);
        }
        return sum == temp2;

    }
    //8. Write a Program that removes the duplicate elements from given list
    public static List<Integer> removeDuplicatesList(List<Integer> list){ // {1,4,3,3,6,7,2,5,2,6}
        List<Integer> returnList = new ArrayList<>();
        Map<Integer,Integer> duplicates = new HashMap<>();
        for(int i=0;i<list.size();i++){
            if(!(duplicates.containsKey(list.get(i)))){
                duplicates.put(list.get(i),1);
            }else{
                duplicates.put(list.get(i),list.get(i)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : duplicates.entrySet()){
            if(entry.getValue() == 1){
                returnList.add(entry.getKey());
            }
        }
        return  returnList;
    }
    //9. From a given array find all pairs whose sum is a given number
//    {4, 6, 5, -10, 8, 5, 20} ==> 10
//    For example;  4+6=10, 5+5=10, -10+20=10
    public static List<List<Integer>> findAllPairsProblem(List<Integer> arrayOfNumbers,int givenNum){
        List<List<Integer>> pairNumbers = new ArrayList<List<Integer>>(); // initializing with null is not working
        for(int i=0;i<arrayOfNumbers.size();i++){
            for(int j=i+1;j<arrayOfNumbers.size();j++){
                if((arrayOfNumbers.get(i) + arrayOfNumbers.get(j)) == givenNum){
                    pairNumbers.add(Arrays.asList(arrayOfNumbers.get(i),arrayOfNumbers.get(j)));
                }
            }
        }
        return pairNumbers;
    }
    //10.Count the words in a String one by one
//    String is "Ali came to school and Ayse came to school"
//    Ali=1, came=2, to=2, school=2, and=1, Ayse=1
    public static Map<String,Integer> countTheWords(String s){
        Map<String,Integer> countWords = new HashMap<>();
        String[] splittedList = s.split(" ");
        for(int i=0;i< splittedList.length;i++){
            if(!(countWords.containsKey(splittedList[i]))){
                countWords.put(String.valueOf(splittedList[i]),1);
            }else{
                countWords.put(splittedList[i],countWords.get(splittedList[i])+1);
            }
        }
        return countWords;
    }
    //11.Write a Java Program that shows the duplicated characters in a given String
    public static Map<Character,Integer> countTheCharacters(String s){
        Map<Character,Integer> countLetters = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!(countLetters.containsKey(s.charAt(i)))){
                countLetters.put(s.charAt(i),1);
            }else{
                countLetters.put(s.charAt(i),countLetters.get(s.charAt(i))+1);
            }
        }
        return countLetters;
    }
    public static boolean isMyTicketLucky(int ticketNumber){
        int digitNumber = 0;
        int temp = ticketNumber;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        while(ticketNumber>0){
            digitNumber++;
            ticketNumber = ticketNumber / 10;
        }
        int firstHalf =(int) Math.floor( temp % (int)Math.pow(10,digitNumber / 2)); // stands for right part
        int secondHalf = (int) Math.floor( temp / (int)Math.pow(10,digitNumber / 2));
        System.out.println("firsthalf:  "+firstHalf);
        System.out.println("secondhalf:  "+secondHalf);

        String firstHalfString = String.valueOf(firstHalf); //123321 --> 123
        String secondHalfString = String.valueOf(secondHalf); // 321
        for(int i=0;i<firstHalfString.length();i++){
            firstHalfSum += Integer.parseInt(String.valueOf(firstHalfString.charAt(i)));
        }
        for(int i=0;i<secondHalfString.length();i++){
            secondHalfSum += Integer.parseInt(String.valueOf(secondHalfString.charAt(i)));
        }
        System.out.println("firsthalfsum :   "+firstHalfSum);
        System.out.println("secondhalfum :   "+secondHalfSum);

        return firstHalfSum == secondHalfSum;
    }


    //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
    public static int reverseNumber(int a){ //12345 --> 54321
        int digitNum = (a + "").length();
        int reverseNum = 0;
        int lastDigit = 0;
        for(int i=digitNum;i>0;i--,a/=10){
            lastDigit = a % 10;
            reverseNum += lastDigit* Math.pow(10,i);
        }
        return reverseNum/10;
    }


    public static int reverseInteger(int input){

        int result = 0;
        int loopCondition = (input + "").length();
        for (int i =0; i< loopCondition; i++,input/=10){
            result *= 10;
            result = result + input % 10;

        }
        return result;
    }

    public static int reverseInteger2(int input){

        int result = 0;
        int loopCondition = String.valueOf(input).length();
        for (int i = 0; i < loopCondition; i++, input/=10){
            result = (result*10) + input % 10;
        }
        return result;
    }
    public static int reverseInteger3(int input){
        int reverseResult = 0;
        int forLoop = (input+"").length();
        for(int i=0;i<forLoop;i++,input/=10){
            reverseResult = reverseResult * 10 +  (input % 10);
        }
        return reverseResult;
    }




}