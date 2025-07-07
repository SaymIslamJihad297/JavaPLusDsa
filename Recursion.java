public class Recursion {

    public static int printInDecreasingOrder(int x){
        if(x==0) return x;
        System.out.println(x);
        printInDecreasingOrder(x-1);
        return x;
    }
    
    public static void main(String[] args) {
        printInDecreasingOrder(10);
    }
}
