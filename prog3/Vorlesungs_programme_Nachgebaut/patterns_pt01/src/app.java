

public class app extends MyFunctions {


    public static void main(String[] args) {
       SimpleMap<Integer, String> myList = new SimpleMap<Integer, String>(){};
       for(int i = 0; i<10;i++){
           myList.put(i,"value"+i);
       }
//     myList.printList();
        sop(myList.get(1));
        sop(myList.get(9));
        sop(myList.get(5));
        sop(myList.get(-30));
        sop(myList.get(100));



    }
}
