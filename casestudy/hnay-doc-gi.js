class HNDG {
    constructor(pic, tile, url) {
        this.pic = pic
        this.tile = tile
        this.url = url
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
        return "<td><a onclick='" + this.url + "'><img src=" + this.pic + " /></a></td>";
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
let Hndg = [];
Hndg[0] = new HNDG("pic/PRTKM.jpg", "Pr Theo Kiểu Mỹ", "PRtheokieumy()")
Hndg[1] = new HNDG("pic/dac-nhan-tam.jpg", "Đắc Nhân Tâm", "Dacnhantam()")
Hndg[2] = new HNDG("pic/tu-tot-den-vi-dai.jpg", "Từ Tốt Đến Vĩ Đại", "Tutotdenvidai()")
Hndg[3] = new HNDG("pic/nha-gia-kim.jpg", "Nhà Giả Kim", "Nhagiakim()")
Hndg[4] = new HNDG("pic/xay-dung-de-truong-ton.jpg", "Xây Dựng Để Trường Tồn", "Xaydungtruongton()")
function homnaydocgi() {
    let show = "<table class='tagHNDG'><td colspan=\"5\"><h3>Hôm nay đọc gì:</h3></td></tr><tr>"
    let tile = "<table class='tagHNDG'><tr>"
    for (let i = 0; i < Hndg.length; i++) {
        show += Hndg[i].showpic
        tile += Hndg[i].showtile
    }
    document.getElementById('HNDG').innerHTML = show + tile + "</tr></table>";
}
homnaydocgi()
function Dacnhantam() {
    document.getElementById("changeView").innerHTML=Bookdacnhantam;
}
function PRtheokieumy() {
    document.getElementById("changeView").innerHTML=BookPRtheokieumy;
}
function Tutotdenvidai() {
    document.getElementById("changeView").innerHTML=Booktutotdenvidai;
}
function Xaydungtruongton() {
    document.getElementById("changeView").innerHTML=Bookxaydungdetruongton;
}
function Nhagiakim() {
    document.getElementById("changeView").innerHTML=Booknhagiakim;
}

