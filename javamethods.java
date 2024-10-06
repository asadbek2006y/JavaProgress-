public class javamethods {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.err.println(z);
    }

    static int add(int x, int y) {
  
        int z = x + y;
        return z;
        
       }
}
