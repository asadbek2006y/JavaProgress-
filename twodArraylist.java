import java.util.ArrayList;

public class twodArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList= new ArrayList();

        ArrayList<String> bakeryList =  new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("bread");
        bakeryList.add("Donuts");

        ArrayList<String> drinksList =  new ArrayList();
        drinksList.add("Cola");
        drinksList.add("Fanta");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        
    }
    
}