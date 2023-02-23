
import javax.xml.stream.events.StartElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Terminal {
    public static void main(String[] args) {

//        //Which of the following three statements are valid
//        Interface1 i1=new B<Double>(5.5,"text");
//        Interface2 i2=new B<>("name","text");
//        Interface1 i3 = i2;
//
//        B<Double> b1 = new B<Double>(4.4, "sample");
//        B<Double> b2 = new B<>(4.4, "sample");
//        B<String> b3 = new B<String>(4.4, "sample");
//
//        //
//        List<C> list=new ArrayList<>();
//        //add three instances of type c in list
//        list.add(new C(new A("Name 1"), new ArrayList<>()));
//        list.add(new C(new A("Name 2"), new ArrayList<>()));
//        list.add(new C(new A("Name 3"), new ArrayList<>()));
//
//
//        List<A> list2=new ArrayList<>();
//        //add one object of A and one of B in list2
//        list2.add(new B<String>("",""));
//
//        //add one object of A and one of B in list2
//        list2.add(new A(""));
//
//
//        //sort list1 using C which is a comparator
//
//        //Collections.sort(list, new C());
//        //list.sort(new C());
//
//
//        // Write a function to iterate list using forEach
//        list.forEach((i)-> System.out.println(i));
        System.out.println( (new A(0.0)) instanceof Interface1);

    }

    //complete the follwoing function to count objects of A and B in the list
    public static void countTypes(List<A> list ){
        int countA=0;
        int countB=0;
        for(A a:list)
        {

            if(a instanceof A)
                countA++;
            if(a instanceof B)
                countB++;
        }
        System.out.printf("Count of A %d, B %d",countA,countB);
    }




}

interface Interface1 {
    public void doIt();
}

interface Interface2 extends Interface1 {
    public abstract void doItNow();
}

class D implements Interface1 {
    public void doIt() {
    }
}

class A implements Interface2{
    public double t;
    A(double t) {
        this.t = t;
    }

    public void display()
    {

    }
    @Override
    public void doItNow() {
    }

    @Override
    public void doIt() {

    }
}

class B<T> extends A {
    T o;

    B(T o, double s) {
        super(s);
        this.o = o;
    }
}

class C implements Interface1 {
    public A a1;
    public ArrayList<String> alStr;

    public C(A a1, ArrayList<String> alStr) {
        this.a1 = a1;
        this.alStr = alStr;
    }

    public void doIt() {
    }
}




