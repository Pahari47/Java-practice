public class LinearSearch2 {
    public static int linear(String fruits[], String key) {
        for(int i=0; i<fruits.length; i++) {
            if (fruits[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"mango", "banana", "apple", "graps"};
        String key = "mango";

        int index = linear(fruits, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the index is : " + index);
        }
    }
}
