class Book {
    constructor(cate, pic, tile, tacGia,pdf,tomtat) {
        this.pic = pic
        this.tile = tile
        this.cate = cate
        this.tacGia=tacGia
        this.pdf=pdf
        this.tomtat=tomtat
    }

    set Pic(pic) {
        this.pic = pic;
    }

    get Pic() {
        return this.pic
    }

    set Tile(tile) {
        this.tile = tile;
    }

    get Tile() {
        return this.tile
    }

    set Url(url) {
        this.url = url
    }

    get Url() {
        return this.url;
    }
}
let Listnamebook = []
Listnamebook[0] = new Book("kinhTe", 'pic/khoi-nghiep-ban-le.jpg', "Khởi Nghiệp Bán Lẻ", "Trần Thanh Phong",'5','')
Listnamebook[1] = new Book("kinhTe", 'pic/phi-ly-tri.jpg', "Phi Lý Trí",'Dan Ariely','','' )
Listnamebook[2] = new Book("kinhTe", 'pic/PRTKM.jpg', "Pr Theo Kiểu Mỹ", 'Robert L. Dilenschneider','pdf/pr-theo-kieu-my.pdf',Tomtat_PRtheokieumy)
Listnamebook[3] = new Book("kinhTe", 'pic/nguoi-giau-nhat-thanh-babylon.jpg', "Người Giàu Nhất Thành Babylon",'George Samuel Clason','','' )
Listnamebook[4] = new Book("kinhTe", 'pic/chien-tranh-tien-te.jpg', "Chiến Tranh Tiền Tệ",'Song Hongbing','','' )
Listnamebook[5] = new Book("vanHoc", 'pic/3-nguoi-thay-vi-dai.jpg', "Ba Người Thầy Vĩ Đại",'Robin Sharma','','')
Listnamebook[6] = new Book("vanHoc", 'pic/nha-gia-kim.jpg', "Nhà Giả Kim", 'Paulo Coelho','pdf/nha-gia-kim.pdf',Tomtat_nhagiakim)
Listnamebook[7] = new Book("vanHoc", 'pic/cho-toi-xin-1-ve-di-tuoi-tho.jpg', "Cho Tôi Xin Một Vé Đi Tuổi Thơ",'Nguyễn Nhật Ánh','','' )
Listnamebook[8] = new Book("vanHoc", 'pic/hoang-tu-be.jpg', "Hoàng Tử Bé",'Antoine de Saint-Exupéry','','' )
Listnamebook[9] = new Book("vanHoc", 'pic/tat-den.jpg', "Tắt Đèn", " Ngô Tất Tố",'','')
Listnamebook[10] = new Book("giaoTiep", 'pic/hai-huoc-mot-chut-the-gioi-se-khac-di.jpg', "Hài Hước Một Chút-Thế Giới Sẽ Khác Đi ", "The Book Worm ",'','')
Listnamebook[11] = new Book("giaoTiep", 'pic/nghe-thuat-giao-tiep-de-thanh-cong.jpg', "Nghệ Thuật Giao Tiếp Để Thành Công", "Leil Lowndes ",'','')
Listnamebook[12] = new Book("giaoTiep", 'pic/ky-nang-giao-tiep-dinh-cao.jpg', "Kỹ Năng Giao Tiếp Đỉnh Cao", "Lý Tử Quyên",'','')
Listnamebook[13] = new Book("giaoTiep", 'pic/dac-nhan-tam.jpg', "Đắc Nhân Tâm",'Dale Carnegie','pdf/dac-nhan-tam.pdf',Tomtat_dacnhantam)
Listnamebook[14] = new Book("giaoTiep", 'pic/suc-manh-cua-ngon-tu-sach.jpg', "Sức Mạnh Của Ngôn Từ", "Don Gabor",'','')
Listnamebook[15] = new Book("lanhDao", 'pic/tu-tot-den-vi-dai.jpg', "Từ Tốt Đến Vĩ Đại", "Jim Collins",'pdf/tu-tot-den-vi-dai.pdf',Tomtat_tutotdenvidai)
Listnamebook[16] = new Book("lanhDao", 'pic/hoi-dap-ve-lanh-dao.jpg', "Hỏi Đáp Về Lãnh Đạo", "John C. Maxwell",'','')
Listnamebook[17] = new Book("lanhDao", 'pic/phat-trien-ky-nang-lanh-dao.jpg', "Phát Triển Kỹ Năng Lãnh Đạo", "John C. Maxwell",'','')
Listnamebook[18] = new Book("lanhDao", 'pic/nha-lanh-dao-khong-chuc-danh.jpg', "Nhà Lãnh Đạo Không Chức Danh", "Robin Sharma",'','')
Listnamebook[19] = new Book("lanhDao", 'pic/lanh-dao-theo-gia-tri.jpg', "Lãnh Đạo Theo Giá Trị", "Harry M. Jansen Kraemer Jr",'','')
Listnamebook[20] = new Book("xayDung", 'pic/hon-ca-khoi-nghiep-2.jpg', "Hơn Cả Khởi Nghiệp 2.0", "Jim Collins và Bill Lazier",'','')
Listnamebook[21] = new Book("xayDung", 'pic/de-xay-dung-doanh-nghiep-hieu-qua.jpg', "Để Xây Dựng Doanh Nghiệp Hiệu Quả", "Michael E Gerber",'','')
Listnamebook[22] = new Book("xayDung", 'pic/doc-het-trai-tim.jpg', "Dốc Hết Trái Tim", "Howard Schultz",'','')
Listnamebook[23] = new Book("xayDung", 'pic/vi-dai-do-lua-chọn.jpg', "Vĩ Đại Do Lựa Chọn", "Jim Collins",'','')
Listnamebook[24] = new Book("xayDung", 'pic/xay-dung-de-truong-ton.jpg', "Xây Dựng Để Trường Tồn", "Jim Collins và Jerry I. Porras",'pdf/xay-dung-de-truong-ton.pdf',Tomtat_xaydungdetruongton)
Listnamebook[25] = new Book("lanhDao", 'pic/pham-chat-lanh-dao.jpg', "Phẩm Chất Lãnh Đạo", "John C. Maxwell",'','')
Listnamebook[26] = new Book("lanhDao", 'pic/nha-lanh-dao-360.jpg', "Nhà Lãnh Đạo 360", "John C. Maxwell",'','')
Listnamebook[27] = new Book("kinhTe", 'pic/bong-bong-kinh-te.jpg', "Bong Bóng Kinh Tế", "Michael Lewis",'','')
Listnamebook[28] = new Book("giaoTiep", 'pic/giao-tiep-bat-ky-ai.jpg', "Giao Tiếp Bất Kì Ai", "Bennie Boughn và Jon Condrill",'','')
