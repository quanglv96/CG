package Clear_code.refactoring;

public class checkWin {
    public static void CheckWin(int scroreJohn, int scroreBill) {
        String txt;
            if (scroreBill > scroreJohn) {
                txt = "Bill win";
            } else {
                txt = "John win";
            }
        System.out.println(txt);
        System.exit(0);
    }

    }
