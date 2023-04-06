public class Task4 {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int array2[] = new int[10];
        System.out.println("Перший масив:");
        for (int i=0; i< array1.length; i++){
            array1[i] = (int) (Math.random()*10);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Другий масив:");
        for (int i=0; i< array2.length; i++){
            array2[i] = (int) (Math.random()*10);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int array3[] = new int[10];
        System.out.println("Третій масив:");
        for (int i=0; i< array3.length; i++){
            array3[i] = array1[i]+array2[i];
            System.out.print( array3[i] + " ");
        }
    }
}
