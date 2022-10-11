package Clear_code.refactoring;

public class Check_score {
    // check point
    public static String checkScore(int score) {
        String txt;
        switch (score) {
            case 0:
               txt= "love";
                break;
            case 1:
                txt= "Fifteen";
                break;
            case 2:
                txt=  "Thirty";
                break;
            case 3:
                txt= "Forty";
                break;
            default:
                txt="Deuce";
                break;
        }
        return txt;
    }
}
