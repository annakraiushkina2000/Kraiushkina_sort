import java.util.Arrays;

public class Sort{
    public static int[] getResult(int array []){
    boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i=0; i<mas.length-1; i++){
                if (mas[i]> mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [] mas = {11, 3, 34, 8, 9};
        System.out.println(Arrays.toString(mas));
    }
}