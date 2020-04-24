package exercises;



public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 3, 5, 8};
        int i, j;

        for (i = 0; i < arr.length; i++){
            if (arr[i]%2 != 0) {
                System.out.print(arr[i] + " " );
            }

        }

        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = poem.split(" ");



    }
}
