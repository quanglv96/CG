class Book {
    constructor(cate, pic, tile, url) {
        this.pic = pic
        this.tile = tile
        this.url = url
        this.cate = cate
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

    get showpic() {
        return "<td><a onclick= '" + this.url + "'><img src=" + this.pic + " /></a></td>";
    }

    get showtile() {
        return "<td>" + this.tile + "</td>";
    }

    set Url(url) {
        this.url = url
    }

    get Url() {
        return this.url;
    }
}
let Listnamebook = []
Listnamebook[0] = new Book("kinhTe", 'pic/kinh-te.jpg', "Book Kinh Tế 1", " ")
Listnamebook[1] = new Book("kinhTe", 'pic/kinh-te.jpg', "Book Kinh Tế 2", " ")
Listnamebook[2] = new Book("kinhTe", 'pic/PRTKM.jpg', "Pr Theo Kiểu Mỹ", "PRtheokieumy()")
Listnamebook[3] = new Book("kinhTe", 'pic/kinh-te.jpg', "Book Kinh Tế 3", " ")
Listnamebook[4] = new Book("kinhTe", 'pic/kinh-te.jpg', "Book Kinh Tế 5", " ")
Listnamebook[5] = new Book("vanHoc", 'pic/van-hoc.jpg', "Book Văn Học 1", " ")
Listnamebook[6] = new Book("vanHoc", 'pic/nha-gia-kim.jpg', "Nhà Giả Kim", "Nhagiakim()")
Listnamebook[7] = new Book("vanHoc", 'pic/van-hoc.jpg', "Book Văn Học 3", " ")
Listnamebook[8] = new Book("vanHoc", 'pic/van-hoc.jpg', "Book Văn Học 4", " ")
Listnamebook[9] = new Book("vanHoc", 'pic/van-hoc.jpg', "Book Văn Học 5", " ")
Listnamebook[10] = new Book("giaoTiep", 'pic/giao-tiep.jpg', "Book Giao Tiếp 1", " ")
Listnamebook[11] = new Book("giaoTiep", 'pic/giao-tiep.jpg', "Book Giao Tiếp  2", " ")
Listnamebook[12] = new Book("giaoTiep", 'pic/giao-tiep.jpg', "Book Giao Tiếp  3", " ")
Listnamebook[13] = new Book("giaoTiep", 'pic/dac-nhan-tam.jpg', "Đắc Nhân Tâm", "Dacnhantam()")
Listnamebook[14] = new Book("giaoTiep", 'pic/giao-tiep.jpg', "Book Giao Tiếp  4", "")
Listnamebook[15] = new Book("lanhDao", 'pic/tu-tot-den-vi-dai.jpg', "Từ Tốt Đến Vĩ Đại", "Tutotdenvidai()")
Listnamebook[16] = new Book("lanhDao", 'pic/lanh-dao.jpg', "Book Lãnh Đạo 1", " ")
Listnamebook[17] = new Book("lanhDao", 'pic/lanh-dao.jpg', "Book Lãnh Đạo 2", " ")
Listnamebook[18] = new Book("lanhDao", 'pic/lanh-dao.jpg', "Book Lãnh Đạo 3", " ")
Listnamebook[19] = new Book("lanhDao", 'pic/lanh-dao.jpg', "Book Lãnh Đạo 4", " ")
Listnamebook[20] = new Book("xayDung", 'pic/xay-dung.jpg', "Book Xây Dựng Công ty 1", " ")
Listnamebook[21] = new Book("xayDung", 'pic/xay-dung.jpg', "Book Xây Dựng Công ty 2", " ")
Listnamebook[22] = new Book("xayDung", 'pic/xay-dung.jpg', "Book Xây Dựng Công ty 3", " ")
Listnamebook[23] = new Book("xayDung", 'pic/xay-dung.jpg', "Book Xây Dựng Công ty 4", " ")
Listnamebook[24] = new Book("xayDung", 'pic/xay-dung-de-truong-ton.jpg', "Xây Dựng Để Trường Tồn", "Xaydungtruongton()")