import java.lang.reflect.Field;

import static java.lang.Thread.sleep;

public  abstract class MyFunctions{


    //reflections
    static void printMethodeNames(Class<?> klass) {
        System.out.print("the methodes of "+ klass.getName()+ " are: \n\n");
        boolean flag = true;
        int i = 0;
        while (flag) {
            try {
                sop(i + ". ");
                //klass.getDeclaredMethods()[i].setAccessible(true);
                System.out.print(klass.getDeclaredMethods()[i] + "\n");
                i++;
            } catch (Exception e) {
                flag = false;
            }
        }
    }

    static void printAllParamters(Class<?> klass){
      System.out.println("the parameters of the class "+ klass +  " are: ");
      boolean flag = true;
      int i = 0;
      while(flag){
          Field[] f = klass.getDeclaredFields();
          try{
              f[i].setAccessible(true);
              Object o = f[i].get(klass.newInstance());
              System.out.println(i+". ( "+"Modifier: "+f[i].getModifiers()+", type: "+f[i].getType()+", Name: "+f[i]+", content: "+ o +")\n");
              i++;
          }
          catch(IndexOutOfBoundsException e){
              flag = false;
          }
          catch(Exception e){
              try {
                  System.out.println("fail");
                  sleep(2000);
              }
              catch(Exception e2){
                  System.out.println("sleep crashed" + e2.getMessage());
              }
          }
      }
    }





    //for normal printing
    static void sop(Object o){
        System.out.print(o);
    }

    static void sopl(Object o){
        System.out.println(o);
    }




}
