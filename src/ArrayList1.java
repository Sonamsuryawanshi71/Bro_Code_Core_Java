import java.util.ArrayList;

public class ArrayList1<S> {
    public static void main(String[] args){

        // Array list = a resizable array.
//                      Elements can be added and removed after compilation phase store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");

//        food.set(0, "sushi");
//        food.remove(2);
//        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }


    }

    private boolean get(int i) {
        return false;
    }

    private int size() {
        return 0;
    }

    private void add(S pizza) {
    }


}
