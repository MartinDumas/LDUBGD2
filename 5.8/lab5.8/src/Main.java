
public class Main {
    public static void main(String[] args) {
        //Task 1
        int n=21;
        if ((n>25)&&(n<100)){
            System.out.println("Число " + n + " міститься в проміжку (25;100)");
        }
        else {
            System.out.println("Число " + n + " не міститься в проміжку (25;100)");
        }
        //Task 2
        int p = 563;
        int a = p/100;
        int b = (p/10)%10;
        int c =  p%10;
       int maximum=a;
       if (b>maximum)
           maximum=b;
       if (c>maximum)
           maximum=c;
        System.out.println(maximum);
        int MAXabc = Math.max(Math.max(a,b),c);
        System.out.println(MAXabc);

        //Task3
        String m = "До низу";
        int v =6;
        if (m.equals("До верху")){
            if (v==2 || v==3){
                System.out.println("Ви піднялись на 3 поверх");
            }
            else if (v<=9 && v>0){
                System.out.println("Ви піднялись на  поверх"+ v);}
            else {
                System.out.println("Ви вказали неіснуючий поверх");}
            }
        if (m.equals("До низу")){
            if (v==2||v==1){
                System.out.println("Ви спустились на перший поверх");
            }
            else if (v<=9 && v>0){
                System.out.println("Ви спустились на "+v+" поверх");}
            else{
                    System.out.println("Ви вказали неіснючий поверх");

            }
        }
            //Task4
        String l = "NO";
        switch (l){
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь");


        }




    }
}