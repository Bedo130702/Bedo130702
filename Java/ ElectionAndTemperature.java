//Q-1)The daily maximum temperatures recorded in 10 cities during the month of January (for all 31 days)
// have been tabulated as follows: Write a program to read the table elements into a two-dimensional array temperature,
// and to firxi the city and day corresponding to (a) the highest ternperature and (b) the louest temperature.

import java.util.Random;

public class ElectionAndTemperature {
    public static void main(String[] args) {
        Random ran = new Random();
        // Temperature problem
        int cities = 5, days = 31; // Assuming 5 cities for demonstration
        int[][] temperature = new int[cities][days];

        System.out.println("Enter temperature data for " + cities + " cities and " + days + " days:");
        int maxTemp = Integer.MIN_VALUE, minTemp = Integer.MAX_VALUE;
        int maxCity = 0, maxDay = 0, minCity = 0, minDay = 0;
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < days; j++) {
                temperature[i][j] = ran.nextInt(101);
                if (temperature[i][j] > maxTemp) {
                    maxTemp = temperature[i][j];
                    maxCity = i;
                    maxDay = j;
                }
                if (temperature[i][j] < minTemp) {
                    minTemp = temperature[i][j];
                    minCity = i;
                    minDay = j;
                }
            }
        }
        System.out.println("Highest Temperature: " + maxTemp + " in City " + (maxCity + 1) + " on Day " + (maxDay + 1));
        System.out.println("Lowest Temperature: " + minTemp + " in City " + (minCity + 1) + " on Day " + (minDay + 1));
    }
}



//Q-2)An election is contested by 5 candidates. candidates are numbered I to S and the voting is done by
//marking the candidate number on the ballot paper. Write a program to read the ballots and count the votes
//cast for each candidate using an array variable count, In case. a number read is outside the range 1 to 5, thc
//ballot should be considered as a 'spoilt ballot' and the program should also count the number of spoilt
//ballots.

import java.util.Scanner;

public class ElectionCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] votes = new int[5];
        int spoiltBallots=0;
        System.out.println("Enter the vote (For the candidate 1-5) enter 0 for stop.");
        while (true) {
            int vote = obj.nextInt();
            if (vote == 0) {
                break;
            } else if (vote >= 1 && vote <= 5) {
                votes[vote - 1]++;
            } else {
                spoiltBallots++;
            }
        }
        System.out.println("Election Result.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate " + (i + 1) + "get " + votes[i] + " votes.");
        }
        System.out.println("Spoilt Ballots: " + spoiltBallots);
    }
}
