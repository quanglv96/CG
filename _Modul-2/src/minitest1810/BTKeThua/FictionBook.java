package minitest1810.BTKeThua;

public class FictionBook extends Book {
    private String category;
    public FictionBook(){}

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public FictionBook[] fictionBooks(){
        FictionBook[] fictionBooks=new FictionBook[5];
        fictionBooks[0]=new FictionBook(1,"Stephen King",90,"Fairy Tale","Viễn tưởng 1");
        fictionBooks[1]=new FictionBook(2,"The Diamond Eye",110,"Kate Quinn","Viễn tưởng 2");
        fictionBooks[2]=new FictionBook(3,"Book of Night",120,"Holly Black","Viễn tưởng 1");
        fictionBooks[3]=new FictionBook(4,"A Woman of War",90,"Mandy Robotham","Viễn tưởng 3");
        fictionBooks[4]=new FictionBook(5,"Best Fiction",100,"Timothy Kinght","Viễn tưởng 1");
        return fictionBooks;
    }
    public int sumPrice() {
        int sumF=0;
        for (int i = 0; i<fictionBooks().length; i++){
            sumF+=fictionBooks()[i].getPrice();
        }
        return sumF;
    }
    public int countCategory(String txt){
        int countF=0;
        for (int i=0;i<fictionBooks().length;i++){
            if(txt.equals(fictionBooks()[i].getCategory())){
                countF++;
            }
        }
        return  countF;
    }
    public int countPrice(int num){
        int count=0;
        for(int i=0;i<fictionBooks().length;i++){
            if(num<=fictionBooks()[i].getPrice()){
                count++;
            }
        }
        return count;
    }
}
