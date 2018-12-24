import java.lang.reflect.Method;

public class DumpMethods {
    public static void main(String args[]) {
        Method[] myObjectMethods = MyObject.class.getMethods();
        int i = 0;
        for(Method method : myObjectMethods){
            i++;
            System.out.println("method "+ i +"name: " + method.getName());
        }
    }
}
