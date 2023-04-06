public class Task3 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101);
        System.out.println("The randomly generated number: " + randomNum);
        String num = Integer.toString(randomNum);
        System.out.println("The quantity of digits in the nuber: " + num.length() );

    }
}
