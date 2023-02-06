public class App {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }catch (NullPointerException n){
            System.out.println("NullPointerExceptionが発生した");
            System.out.println(n.getMessage());
        }
    }
}
