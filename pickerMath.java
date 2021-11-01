import java.util.*;

public class pickerMath {

    // default constructor
    public pickerMath(){};

    // constructor
    public pickerMath(String teamX, String teamY){
        String teamA = teamX;
        String teamB = teamY;

    };

    static final int X = 15;
    private static String winner;
    private static String loser;

    /**
     ranking categories
   1 Offense, 2 Defense, 3 Coaching, 4 Turnover Diff, 5 D Line, 6 O line, 7 QB, 8 Pass Rush, 9 Scoring Offense,
    10 Scoring defense(points against), 11 Pass Defense, 12 Run Defense, 13 Pass Offense, 14 Run Offense, 15 FG kicker
     **/

    // afc north
    int Steelers[] = {4,7,7,4,8,3,6,9,3,7,6,7,6,4,7};
    int Ravens[] =   {7,6,7,4,5,6,7,5,8,6,5,7,6,9,9};
    int Browns[] =   {7,7,6,4,7,9,7,7,7,8,8,7,5,9,7};
    int Bengals[] =  {6,5,6,4,6,4,7,6,6,7,7,7,5,6,6};

    //afc east
    int Bills[] =    {9,8,7,8,7,6,8,8,9,8,9,8,7,8,8};
    int Dolphins[] = {4,5,7,7,6,6,5,5,4,6,6,4,4,4,6};
    int Patriots[] = {5,8,9,4,6,7,6,7,6,8,8,6,6,3,7};
    int Jets[] =     {3,6,5,3,5,3,4,7,3,6,7,5,3,3,6};

    // afc west
    int Chiefs[] =   {10,4,8,2,6,7,10,5,10,3,4,4,9,8,7};
    int Raiders[] =  {8,6,6,7,7,7,7,7,8,5,6,6,8,6,7};
    int Broncos[] =  {4,8,6,7,7,6,4,7,6,8,8,8,4,7,8};
    int Chargers[] = {7,7,6,7,6,7,7,6,6,7,7,3,8,5,6};

    // afc south
    int Texans[] =  {4,4,5,3,4,4,4,3,3,3,4,4,3,4,6};
    int Titans[] =  {6,4,6,2,5,7,6,4,6,4,4,7,5,8,5,};
    int Colts[] =   {5,5,6,7,6,6,6,6,5,5,7,5,5,6,7};
    int Jaguars[] = {4,4,5,2,4,5,5,5,4,3,3,6,4,6,6};

    //nfc north
    int Packers [] = {8,6,7,6,5,7,9,5,8,6,7,6,9,6,8};
    int Bears[] =    {4,7,6,6,7,6,4,7,3,6,5,5,3,7,8};
    int Lions[] =    {4,6,5,4,5,5,7,5,4,3,5,4,7,5,6};
    int Vikings[] =  {5,7,6,5,5,4,7,6,6,6,6,4,7,7,6};

    // nfc west
    int Niners[] =    {8,7,3,7,7,6,7,5,7,5,7,7,6,7,5};
    int Seahawks[] =  {7,6,7,6,6,9,5,5,4,4,4,4,6,6,5};
    int Cardinals[] = {9,7,8,7,7,9,7,7,7,7,6,4,8,7,6};
    int Rams[] =      {8,8,5,8,7,8,8,5,5,5,4,5,8,6,7};

    // nfc south
    int Buccaneers[] = {8,6,7,7,8,8,9,6,8,5,3,9,9,4,7};
    int Saints[] =     {5,7,8,8,7,6,5,7,6,8,4,8,3,7,4};
    int Falcons[] =    {6,4,3,4,5,5,7,4,5,3,5,6,5,4,8};
    int Panthers[] =   {6,8,4,5,7,7,6,7,7,8,9,7,7,6,5};

    // nfc east
    int Cowboys[] =    {8,6,5,9,6,8,8,6,9,6,3,8,8,8,6};
    int Eagles[] =     {7,7,5,6,7,6,6,6,6,4,7,3,7,7,6};
    int Giants[] =     {5,5,4,7,5,5,5,4,6,5,5,4,7,5,7};
    int Washington[] = {6,6,7,3,7,7,6,7,7,3,4,5,6,7,7};



    public void printer(){
        System.out.println("DarBot predicts that the " + winner + " will defeat" +
                " the " + loser + "! Take it to the bank!!! " );

    } // end method printer




    /**
    method calculates formulas to pick winner of game
     **/
    public static void calcWinner(int a[], int b[], String teamA, String teamB){

        int teamAPoints = 0;
        int teamBPoints = 0;
        int winnerPoints = 0;
        for (int i = 0; i < X; i++ ){

            if (a[i] > b[i]) {
                teamAPoints++;
                if (a[i] - b[i] > 4)
                    teamAPoints++;
            }
            else if(b[i] > a[i]){

                teamBPoints++;
                if (b[i] - a[i] > 4)
                    teamBPoints++;
            }

        }

        if (teamAPoints > teamBPoints) {
            winner = teamA;
            loser = teamB;
        }
        else {
            winner = teamB;
            loser = teamA;
        }


    }

}



