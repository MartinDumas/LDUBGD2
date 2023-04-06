public class Task1 { public static void main(String[] args) {
    int[] mine = new int[50];
    int num = 1;
    for (int i = 0; i < 50; i++) {
        mine[i] = num;
        num += 2;
    }

    for (int i = 0; i < 50; i++) {
        System.out.println(mine[i]);
    }
}
}
