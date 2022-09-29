let category = ""
function sortBook(value) {
    Rename(value)
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
                    show += "<td class='topnav'><a onclick= 'showBook(" + j + ")'"+"><img src=" + Listnamebook[Category[j]].pic + " /></a></td>";
                    tile += "<td>" + Listnamebook[Category[j]].tile + "</td>"
                }
            }
        }
        demo[i] = "<table>" + show + tile + "</tr></table>"
    }
    document.getElementById('changeView').innerHTML = show1 + demo.join(" ")
}
function Rename(value){

    switch (value) {
        case "vanHoc":
            return category = "Văn Học"
            break;
        case "xayDung":
            return category = "Xây Dựng Công Ty"
            break;
        case "lanhDao":
            return category = "Lãnh Đạo"
            break;
        case "giaoTiep":
            return category = "Giao Tiếp"
            break;
        case "kinhTe":
            return category = "Kinh Tế"
            break;
    }
}

