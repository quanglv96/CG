package minitest1810.BTKeThua;

public class test {
    public static void main(String[] args) {
        ProgrammingBook programmingBook=new ProgrammingBook();
        FictionBook fictionBook=new FictionBook();
        System.out.println("Tổng tiền 10 cuốn sách là: "+(programmingBook.sumPrice()+ fictionBook.sumPrice()));
        String txtP="Java";
        System.out.println("Số sách Programming có Language "+txtP +" là: "+ programmingBook.countLanguage(txtP));
        String txtF="Viễn tưởng 1";
        System.out.println("Số sách Fiction có Category "+txtF+" là: "+ fictionBook.countCategory(txtF));
        int num=100;
        System.out.println("Số sách Fiction có giá lớn hơn "+num+" là "+fictionBook.countPrice(num));
    }

}
