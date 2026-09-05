import java.util.*;

public class BankTransaction {

    static String normalizeReference(String raw) {

        raw = raw.trim();

        String bankCode = raw.substring(0,3).toUpperCase();

        return bankCode + raw.substring(3);
    }

    static String validateAndFormat(String reference) {

        if(reference.length()!=14)
            return "Invalid: wrong length";

        for(int i=0;i<3;i++) {

            if(!Character.isLetter(reference.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }

        for(int i=3;i<14;i++) {

            if(!Character.isDigit(reference.charAt(i)))
                return "Invalid: non-digit body";
        }

        String bank = reference.substring(0,3);

        String date = reference.substring(3,9);

        String seq = reference.substring(9);

        String formattedDate =
                date.substring(0,2) + "/" +
                date.substring(2,4) + "/" +
                date.substring(4);

        StringBuilder sb = new StringBuilder();

        sb.append("[")
          .append(bank)
          .append("] DATE: ")
          .append(formattedDate)
          .append(" | SEQ: ")
          .append(seq);

        return sb.toString();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference code: ");

        String raw = sc.nextLine();

        String normalized = normalizeReference(raw);

        System.out.println(validateAndFormat(normalized));

        sc.close();
    }
}