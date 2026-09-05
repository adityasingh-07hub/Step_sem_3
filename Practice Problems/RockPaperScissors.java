import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;
        int rounds = 5;

        String[][] table = new String[rounds][3];

        for (int i = 0; i < rounds; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String player = sc.next();

            String computer = moves[random.nextInt(3)];

            String result = playRound(player, computer);

            table[i][0] = "Round " + (i + 1);
            table[i][1] = player;
            table[i][2] = result;

            System.out.println("Computer: " + computer);
            System.out.println(result);

            if(result.equals("Player Wins"))
                wins++;
            else if(result.equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("\nSummary");
        System.out.println("Round | Player Move | Result");

        for(String[] row : table)
            System.out.println(row[0] + " | " + row[1] + " | " + row[2]);

        double percentage = (wins * 100.0) / rounds;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + percentage + "%");

        sc.close();
    }
}