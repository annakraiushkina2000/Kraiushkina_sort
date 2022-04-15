import java.util.Arrays;

public class Sort{
    public static int[] getResult(int array []){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
    public static void main(String[] args) {
        int [] mas = {11, 3, 34, 8, 9};
        getResult(mas);
        System.out.println(Arrays.toString(mas));
    }
}