package Clear_code.refactoring;

public class showResult{
    public static void Showresult(){
        int scroreJohn= testTenisGame.score[0];
       int scroreBill= testTenisGame.score[1];
        int chenhLech=Math.abs(scroreJohn-scroreBill);
       if(scroreBill>=4 || scroreJohn>=4) {
           if (chenhLech >= 2) {
               checkWin.CheckWin(scroreJohn, scroreBill);
           }
       }
       if(scroreBill == scroreJohn){
           Check_hoa.checkHoa(scroreJohn);
       }
       if(chenhLech==1){
           check_Khac.checkKhac(scroreJohn, scroreBill);
       }
    }
}
