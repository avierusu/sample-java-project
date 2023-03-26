package chapter2.examples;

public class Welcome1{
    public static void main(String[] args){
        String text = "Hello";
        System.out.println(text);

        for (int index = 0; index <= text.length(); index++){
            System.out.println(text.charAt(index));
        }
        System.out.println("\n cool\n -Added by user gopale");
    }
}