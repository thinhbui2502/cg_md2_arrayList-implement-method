public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(1,10);
        myList.add(2,20);
        myList.add(3,30);
        myList.add(4,40);
        System.out.println(myList.get(1));
        System.out.println(myList.contains(50));
        System.out.println(myList.indexOf(10));
        System.out.println(myList.size());
        System.out.println(myList.add(60));
    }
}
