
package arraylist_package;
import java.util.*;
class main {
 public static void main(String[] args) {

    ArrayList<? super Object> A10=new ArrayList<>();
    A10.add(10);
    A10.add("String");
    
    // ArrayList<? extends Object>A20=new ArrayList<>();
    // A20.add(60); ///in cazul la extedns noi trebuie sa indicam tipul exact care folosim.


    
    array_list<String>A1=new array_list<>();
        A1.add_element("aaa");
        A1.add_element("bbb");
        A1.add_element("ccc");
        A1.add_element("ddd");
        A1.add_element("mmm");
        A1.add_element("ggg");
        A1.add_element("dddd");
        A1.add_element("ugfddfgg");
        A1.add_element("ertygg");
        A1.add_element("ertygg");
        A1.add_element("ugfddfgg");
        A1.add_element("ertygg");
        A1.add_element("ertygg");
        A1.add_element("aaa");
        A1.add_element("bbb");
        A1.add_element("ccc");
       
   
        System.out.println(A1);
        System.out.println(A1.isEmpty());
         A1.remove(0);
         System.out.println(A1);

         System.out.println("Dupa add la elemente capacitatea s-a schimbat:"+A1.capacity);
         System.out.println("Dimensiunea array-ului este:"+A1.size);

         array_list<Integer>A2=new array_list<>();
         A2.add_element(1);
         A2.add_element(2);
         A2.add_element(4);
         A2.add_element(3);
         A2.add_element(1);
         A2.add_element(2);
         A2.add_element(6);
         A2.add_element(8);
         System.out.println(A2);
         A2.remove(7);
         System.out.println(A2);
         A2.set(3,90);
         System.out.println(A2);

       

         String[] elementsArray = {"Element1", "Element2", "Element3","Element4","Element5"};
          array_list<String> A5 = new array_list<>();
          A5.add_element("vbnljdfdsl");
          A5.addAll(elementsArray);
          System.out.println(A5);

          System.out.println(A5.subList(1, 3));
          

 }
 }