package minitest1810.BTKeThua;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook[] programmingBooks() {
        ProgrammingBook[] programmingBook = new ProgrammingBook[5];
        programmingBook[0] = new ProgrammingBook(1, "Clean Code", 120, "Robert", "Java", "fw");
        programmingBook[1] = new ProgrammingBook(2, "Python Programming", 80, "Anthony Brun", "Python", "fw");
        programmingBook[2] = new ProgrammingBook(3, "C programming Language", 100, "Will Norton", "C", "fw");
        programmingBook[3] = new ProgrammingBook(4, "Java Programming", 110, "P.Rizwan Ahmed", "Java", "fw");
        programmingBook[4] = new ProgrammingBook(5, "Programming with Java", 70, "E Balagurusamy", "Java", "fw");
        return programmingBook;
    }

    public int sumPrice() {
        int sumP=0;
        for (int i = 0; i<programmingBooks().length; i++){
            sumP+=programmingBooks()[i].getPrice();
        }
        return sumP;
    }
    public int countLanguage(String txtP){
        int countP=0;
        for (int i=0;i<programmingBooks().length;i++){
            if(txtP.equals(programmingBooks()[i].getLanguage())){
                countP++;
            }
        }
        return  countP;
    }

}
