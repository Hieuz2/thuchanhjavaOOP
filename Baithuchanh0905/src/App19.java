import java.util.ArrayList;

import java.util.ListIterator;



public class ArrList {

    public static ArrList {



        ArrList<Character> arrListChar = new ArrList();



        arrListChar.add('a');

        arrListChar.add('e');

        arrListChar.add('b');

        arrListChar.add('c');



        ListIterator<Character> listIterator = arrListChar.listIterator();



        System.out.println("Cac phan tu co trong arrListChar la: ");

        while (listIterator.hasNext()){

            System.out.println(listIterator.next() + "\t");

        }

    }

}