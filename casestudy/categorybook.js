let category = ""
function sortBook(value) {
    let Category = []
    Rename(value)
    let show1 = "<table><tr><td colSpan=\"5\"><a href=\"trang-chu.html\"><h3>Trang chủ:</h3></a></td></tr><tr><td colspan='3'><h3>Thể loại: Sách " + category + "</h3></td></tr></table>";
    let i = 0
    // lọc sách theo cate vào mảng cate
    for (; i < Listnamebook.length; i++) {
        if (Listnamebook[i].cate === value) {
            Category.push(i)
        }
    }
    console.log(Category.join(", "))
    // show mảng 2 chiều
    //tách hàm
    let j=0
    let demo = []
    for (let z = 0; z < Category.length; z++) {
        let show = "<tr>";
        let tile = "<tr>"
        demo[z] = ""
        let n = j + 5
        if (j < Category.length) {
            for (; j < n; j++) {
                if (Listnamebook[Category[j]] !== undefined) {
                    show += "<td class='topnav'><a onclick= 'showBook(" + Category[j] + ")'"+"><img src=" + Listnamebook[Category[j]].pic + " /></a></td>";
                    tile += "<td>" + Listnamebook[Category[j]].tile + "</td>"
                }
            }
        }
        demo[z] = "<table>" + show + tile + "</tr></table>"
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

