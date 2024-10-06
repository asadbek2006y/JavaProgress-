import java.util.ArrayList;
public class foreach {
    public static void main(String[] args) {
        
        // for - each = traversing to iterate through the elemtnts in array/collection 
        //          less steps , more readable 
        // less fixeable 

        String[] animals = {"cat ","dog " , "rat "};
        

        for(String i : animals)
        {
            System.out.println(i);
        }
    }
}
