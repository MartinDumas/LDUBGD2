public class Task2 {
    public static void main(String[] args) {
        int mine[]= new int[20];
        System.out.println("Перший масив:");
        for (int i=0; i<20; i++) {
            mine[i] = (int) (Math.random() * 9);
            System.out.println(mine[i] + "");
        }
        System.out.println();
        System.out.println("Оновлений масив:");
        for (int i=0; i<20; i+=2 ){
            mine[i]=0;
        }
        for (int i=0; i<20; i++){
            System.out.println(mine[i] + "");
        }
    }
}
