import java.util.*;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while(start < end) {

            if(text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    static boolean isPalindromeRecursive(String text) {

        return recursiveCheck(text,0,text.length()-1);
    }

    static boolean recursiveCheck(String text,int start,int end){

        if(start >= end)
            return true;

        if(text.charAt(start)!=text.charAt(end))
            return false;

        return recursiveCheck(text,start+1,end-1);
    }

    static boolean isPalindromeArrayReversal(String text){

        char arr[] = text.toCharArray();

        String reversed="";

        for(int i=arr.length-1;i>=0;i--)
            reversed += arr[i];

        return text.equals(reversed);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " +
                (isPalindromeIterative(text) ? "Palindrome":"Not Palindrome"));

        System.out.println("Recursive: " +
                (isPalindromeRecursive(text) ? "Palindrome":"Not Palindrome"));

        System.out.println("Array Reversal: " +
                (isPalindromeArrayReversal(text) ? "Palindrome":"Not Palindrome"));

        sc.close();
    }
}