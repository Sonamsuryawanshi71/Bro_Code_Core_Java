
public class Array1 {
    public static void main(String[] args){

//        2D array = an array of arrays

            String[][] cars = {
                {"Carmaro" , "Corvette" , " ]Silverado"},
                {"Mustang" , "Ranger" , "F-150"},
                {"Ferrari" , "Lambo" , "Tesla"}
        };

        for (int i=0; i<cars.length; i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+ " ");

            }
        }
    }
}
