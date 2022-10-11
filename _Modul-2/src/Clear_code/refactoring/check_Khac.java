package Clear_code.refactoring;

public class check_Khac {
    public static void checkKhac(int scroreJohn, int scroreBill){
        if(scroreBill<4 && scroreJohn<4){
            System.out.println(Check_score.checkScore(scroreJohn)+" - "+Check_score.checkScore(scroreBill));
        }else {
            if(scroreBill>scroreJohn){
                System.out.println("Advantage player2");
            }else {
                System.out.println("Advantage player 1");
            }

        }
    }
}
