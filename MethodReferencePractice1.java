public class MethodReferencePractice1 {

    //Classname::methodName

    public static void main(String args[]){
      System.out.println(MethodReferencePractice1.compare(10,20));
    }
    public static int compare(Integer x, Integer y){
        return Integer.compare(x,y);
    }
}
