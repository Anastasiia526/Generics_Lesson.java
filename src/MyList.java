import java.util.ArrayList;
import java.util.List;

public class MyList <T> {

private List<T> myList = new ArrayList<>();


    public void add(T value){
    myList.add(value);
    }
    public int size(){
        return myList.size();
    }
    public T get(int index){
       return myList.get(index);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList +
                '}';
    }
}
class MyListMain{
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(15);
        myList.add(7);
        myList.add(3);
        myList.add(12);
        System.out.println(myList);
        System.out.println(myList.get(1));
        System.out.println(myList.size());
    }
}