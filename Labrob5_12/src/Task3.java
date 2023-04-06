public class Task3 {
    public static void main(String[] args) {
int arr1[] = new int[5];
int arr2[] = new int[5];
int arr3[] = new int[5];
for (int i=0; i<5; i++) {
    arr1[i] = (int) (Math.random() * 5);
    arr2[i]= (int) (Math.random() * 5);
    arr3[i] = (int) (Math.random() * 5);
    }
        System.out.println("Перший масив:");
for (int i=0; i<5; i++){
    System.out.println(arr1[i] + "");
}
System.out.println("Другий масив:");
for (int i=0; i<5; i++){
    System.out.println(arr2[i] + "");
        }
System.out.println("Третій масив:");
for (int i=0; i<5; i++){
    System.out.println(arr3[i] + "");
        }
double aver1=0;
double aver2=0;
double aver3=0;
for (int i=0; i<5; i++){
    aver1+=arr1[i];
    aver2+=arr2[i];
    aver3+=arr3[i];
}
aver1/=5;
aver2/=5;
aver3/=5;
        if (aver1 > aver2 && aver1 > aver3) {
            System.out.println("Середнє арифметичне значення масиву 1 є більшим");
        } else if (aver2 > aver1 && aver2 > aver3) {
            System.out.println("Середнє арифметичне значення масиву 2 є більшим");
        } else if (aver3 > aver1 && aver3 > aver2) {
            System.out.println("Середнє арифметичне значення масиву 3 є більшим");
        } else {
            System.out.println("Середні арифметичні значення масивів є рівними");
        }
    }
}
