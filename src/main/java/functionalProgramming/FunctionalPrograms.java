package functionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalPrograms {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Bulent",5000));
        list.add(new Employee("Emre",6000));
        list.add(new Employee("Kaan",7000));
        // Function interface
        //Function<Employee,Integer> f = e -> e.getSalary() * 10 / 100;

        //for(Employee e : list){
        //    int bonus = f.apply(e);
        //    System.out.println(bonus);
        //}
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(9);// ctrl+ alt +shift + j --> to select all same words and maybe you would change them
        myList.add(131);
        myList.add(14);
        myList.add(9);
        myList.add(10);
        myList.add(4);
        myList.add(12);
        myList.add(15);
        //printStructured(myList);
        //printFunctional(myList);
        //twoColons(myList);
        //printsEvensFunctional(myList);
        //printSquareFunctional(myList);
        //printCubeFunctional(myList);
        //sumOfSquareFunctional(myList);
        //calculateProductOfCubes(myList);
        //maxValueFromList(myList);
        //minValueFromList(myList);
        //randomFunc(myList);
        randomFunc2(myList);
    }
    // //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printStructured(List<Integer> l){
        for(Integer a: l){
            System.out.print(a + " ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printFunctional(List<Integer> l){
        l.stream().forEach(z->System.out.print(z + " "));
    }
    //  two colons in foreach to sout
    public static void twoColons(List<Integer> l){
        l.forEach(System.out::print);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printsEvensFunctional(List<Integer> l){
        l.stream().filter(t->t%2==0).forEach(z->System.out.print(z + " "));
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printSquareFunctional(List<Integer> l){
        l.stream().filter(t->t%2!=0).map(t->t=t*t).forEach(t->System.out.print(t+ " "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeFunctional(List<Integer> l){
        l.stream().distinct().filter(t->t%2!=0).map(t->t=t*t*t).forEach(t->System.out.print(t + " "));
    }

    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareFunctional(List<Integer> l){
        int sumElements = l.stream().distinct().filter(t->t%2==0).map(t->t=t*t).reduce(0,(sum,element) -> sum+element);
        // is sum equals to 0 ?
        System.out.println(sumElements);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void calculateProductOfCubes(List<Integer> l){
        Integer product = l.stream().distinct().filter(t->t%2==0).map(t->t=t*t*t).reduce(1,(cube,element) -> cube*element);
        // is cube equals to 1
        System.out.println(product);
    }
    //7)Create a method to find the maximum value from the list elements
    public static void maxValueFromList(List<Integer> l){
        //System.out.println(Collections.max(l));
        Integer max = l.stream().reduce(Integer.MIN_VALUE,(t,u) -> t>u  ? t: u);
        System.out.println(max);
    }
    //8)Create a method to find the minimum value from the list elements
    public static void minValueFromList(List<Integer> l){
        Integer min = l.stream().reduce(Integer.MAX_VALUE,(t,u) -> t>u ? u: t);
        System.out.println(min);
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void randomFunc(List<Integer> l){
        Integer min = l.stream().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE,(t,u) -> t>u ? u: t);
        System.out.println(min);
    }
    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void randomFunc2(List<Integer> l){
        List<Integer> mylist = l.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(mylist);
    }
}

