package Exam;


public class RunMain {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        CheckChoice checkChoice=new CheckChoice();
        System.out.println("CHƯƠNG TRÌNH QUA LÝ SINH VIÊN");
        System.out.println("Chọn chức năng theo số");
        int choice = -1;
        while (choice != 8) {
            System.out.println("1. Xem danh sách sinh viên ");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhập ");
            System.out.println("4. Xóa ");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.printf("%s", "Chọn chức năng: ");
            choice = checkChoice.checkChoice(1,8);
            switch (choice) {
                case 1:
                    studentManager.displayStudent();
                    break;
                case 2:
                    studentManager.addNewStudent();
                    break;
                case 3:
                    studentManager.updateStudent();
                    break;
                case 4:
                    studentManager.removeStudent();
                    break;
                case 5:
                    studentManager.sortStudent();
                    break;
                case 6:
                    studentManager.readFile();
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;

            }
        }

    }

}
