public class Task5 {
    public static void main(String[] args) {
        int array[] = new int[15];
        System.out.println("Ваш масив:");
        for (int i=0; i< array.length; i++){
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Масив парних чисел, утворений із даного масиву:");
        int counter = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]%2 == 0) {
                System.out.print(array[i] + " ");
                counter += 1;
            }
        }
        System.out.println();
        System.out.println("У цьому масиві" +" " + counter +" "+"парних чисел");
    }
}
