import java.util.Scanner;

public class Programa1 {


    public static void main(String[] args){

        Scanner inputText = new Scanner(System.in);

        System.out.println("Ingrese una Palabra para determinar si es palindromo: ");

        String Word = inputText.nextLine();

        if (Palindrome(Word)){

            System.out.println("La palabra " + Word + " es palindromo");
        }
        else{
            System.out.println("La palabra " + Word + " no es palindromo");
        }
    }


    public static boolean Palindrome(String text){

        text = text.replace(" ", "");

        boolean isPalindrome = false;

        char[] textArray = text.toCharArray();

        for (int i=0; i<textArray.length; i++){

            if (textArray[i] == textArray[textArray.length - i - 1]){

                isPalindrome = true;

            }else{

                isPalindrome = false;
                break;
            }
        }

      return isPalindrome;

    }
}
