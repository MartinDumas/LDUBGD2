class One (

        int a;

        int b;

        int c;

        One(int a) {

this.a=a;

this.b= a;

this.c = a;

    One(int a, int b) {

        this.a= a;

        this.b = b;

        this.c = b;

    }

    void arithmetic() {

        int d = a+b+c;

        System.out.print(d + " ");

    }

    public class Main {

        public static void main(String[] args) {
            One one_1 = new One(2);
            One one_2 = new One(1, 2);

            one_1.arithmetic();

            one_2.arithmetic();
        }
    }