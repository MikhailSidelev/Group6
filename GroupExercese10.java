package Group6;

public class GroupExercese10 {

    public static void main(String[] args) {
        
        String[] strings = {"gold", "silver", "copper", "gold", "aluminum", "titanium"};

        for (int i = 0; i < strings.length; i++) {

            for (int j = i + 1; j < strings.length; j++) {

                if (strings[i].equals(strings[j])) {

                    System.out.println("Duplicate elements in the array:");

                    System.out.println(strings[i]);
                }
            }
        }
    }
}


