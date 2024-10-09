package exceptions.myException;


import java.util.List;

public class MyClass {

   public static void checkArraysEqual (List<Integer> list1, List<Integer> list2) throws CollectionsNotEqual{
        if (!list1.equals(list2)) throw new CollectionsNotEqual("CollectionsNotEqual");
   }
}