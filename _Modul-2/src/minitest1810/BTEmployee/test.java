package minitest1810.BTEmployee;

public class test {
    public static void main(String[] args) {
        NhanVien[] nhanVien = new NhanVien[10];
        nhanVien[0] = new NhanVienFulltime("1f", "abc", 27, "0123", "abc@123", 10, 20, 1000);
        nhanVien[1] = new NhanVienFulltime("2f", "def", 27, "456", "abc@456", 13, 20, 1000);
        nhanVien[2] = new NhanVienFulltime("3f", "ghi", 27, "789", "abc@123", 14, 15, 1000);
        nhanVien[3] = new NhanVienFulltime("4f", "jkl ", 27, "1011", "abc@123", 18, 30, 1000);
        nhanVien[4] = new NhanVienFulltime("5f", "mno", 27, "1213", "abc@123", 11, 50, 1000);
        nhanVien[5] = new NhanVienParttime("1p", "abc", 27, "0123", "abc@123", 40);
        nhanVien[6] = new NhanVienParttime("2p", "abc", 27, "0123", "abc@123", 27.5);
        nhanVien[7] = new NhanVienParttime("3p", "abc", 27, "0123", "abc@123", 33.4);
        nhanVien[8] = new NhanVienParttime("4p", "abc", 27, "0123", "abc@123", 11.8);
        nhanVien[9] = new NhanVienParttime("5p", "abc", 27, "0123", "abc@123", 47.8);
        //tính trung bình lương
        double medium=medium(nhanVien);
        System.out.println("Lương trung bình của cả công ty là: "+ medium);
        // nhân viên có lương thấp hơn trung bình
        System.out.println(" lương nhân vin thấp hơn trung bình:");
        soft(medium, nhanVien);
        //tổng lương trả cho bán thời gian
        System.out.println("Tổng lương trả cho parttime");
        System.out.println(sumParttime(nhanVien));
        System.out.println("Tổng lương trả cho nhân viên Part time là: ");
        // sắp xếp nhân viên full time
        System.out.println("Sắp xếp nhân viên full time theo mức lương giảm dần");
        softFull( nhanVien);
    }
    public static double medium(NhanVien[] nhanVien){
        double sumGross=0;
        for(int i=0;i< nhanVien.length;i++){
            if(nhanVien[i] instanceof NhanVienFulltime){
                sumGross+= ((NhanVienFulltime) nhanVien[i]).gross();
            }else {
                sumGross+= ((NhanVienParttime) nhanVien[i]).gross();
            }
        }
       return sumGross/ nhanVien.length;
    }
    public static void soft(double num,NhanVien[] nhanVien){
        for(int i=0 ;i<nhanVien.length;i++){
            if(nhanVien[i] instanceof NhanVienFulltime){
                if(((NhanVienFulltime) nhanVien[i]).gross()<num){
                    System.out.println(((NhanVienFulltime) nhanVien[i]).toString()+" "+((NhanVienFulltime) nhanVien[i]).gross());
                }
            }else {
                if(((NhanVienParttime) nhanVien[i]).gross()<num){
                    System.out.println(((NhanVienParttime) nhanVien[i]).toString()+" "+((NhanVienParttime) nhanVien[i]).gross());
                }
            }
        }
    }
    public static double sumParttime(NhanVien[] nhanVien){
        double sumParttime=0;
        for(int i=0; i<nhanVien.length;i++){
            if(nhanVien[i] instanceof NhanVienParttime){
                sumParttime+=((NhanVienParttime) nhanVien[i]).gross();
            }
        }
        return sumParttime;
    }
    public static void softFull(NhanVien[] nhanVien){
        NhanVienFulltime[] arr=new NhanVienFulltime[5];
        int count=0;
        for (int i=0; i< nhanVien.length;i++){
            if(nhanVien[i] instanceof NhanVienFulltime){
                arr[count]=(NhanVienFulltime) nhanVien[i];
                count++;
            }
        }
        for(int i=0;i< arr.length;i++){
            double num=arr[i].gross();
            for(int j=i;j<arr.length;j++){
                if(num>arr[j].gross()){
                    num=arr[j].gross();
                    NhanVienFulltime temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString()+" Lương "+arr[i].gross());
        }
    }


}
