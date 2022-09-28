function sortBook(value) {
    let category = ""
    switch (value) {
        case "vanHoc":
            category = "Văn Học"
            break;
        case "xayDung":
            category = "Xây Dựng Công Ty"
            break;
        case "lanhDao":
            category = "Lãnh Đạo"
            break;
        case "giaoTiep":
            category = "Giao Tiếp"
            break;
        case "kinhTe":
            category = "Kinh Tế"
            break;
    }
    let show1 = "<table><tr><td colSpan=\"5\"><a href=\"trang-chu.html\"><h3>Trang chủ:</h3></a></td></tr><tr><td colspan='3'><h3>Thể loại: Sách " + category + "</h3></td></tr></table>";
    let demo = []
    let Category = []
    // lọc sách theo cate vào mảng cate
    for (let i = 0; i < Listnamebook.length; i++) {
        if (Listnamebook[i].cate === value) {
            Category.push(i)
        }
    }
    // show mảng 2 chiều
    //tách hàm
    let j=0
    for (let i = 0; i < Category.length; i++) {
        let show = "<tr>";
        let tile = "<tr>"
        demo[i] = ""
        let n = j + 5
        if (j < Category.length) {
            for (; j < n; j++) {
                if (Listnamebook[Category[j]] !== undefined) {
                    show += Listnamebook[Category[j]].showpic;
                    tile += Listnamebook[Category[j]].showtile;
                }
            }
        }
        demo[i] = "<table>" + show + tile + "</tr></table>"
    }
    document.getElementById('changeView').innerHTML = show1 + demo.join(" ")
}

