
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        int capacity = 4;

       //method add();
        String[] names = new String[capacity];
        names[0] = "Max";
        names[1] = "Igor";
        names[2] = "Daria";
        names[3] = "Vlad";
        System.out.println(Arrays.toString(names));
       //method remove();
        names[2] = names[3];
        names[3] = null;
        String[] result = Arrays.copyOf(names,capacity-1);
        System.out.println(Arrays.toString(result));
        //method get();
        for (int i = 0; i < result.length; i++) {
            if (i == 2) {
                System.out.println(result[i]);
            }
        }
        System.out.println("Size: " + result.length);


        //method clear();
        String[] result2 = Arrays.copyOf(names, 0);
        System.out.println(Arrays.toString(result2));

        }
}




