function show_info_book(value) {
    console.log(value)
    Rename(Listnamebook[value].cate)
    console.log(category)
    let showbook = ""
    //in trang chủ
    showbook += '<div><table style="text-align: left"><tr><td colSpan="5"><a onclick="showDefault()"><h3 style="text-align: left">Trang chủ:</h3></a></td></tr>'
    //in ảnh sách
    showbook += '<tr><th rowSpan="4" style="padding-left:300px "><img src="' + Listnamebook[value].pic + '" style="width:350px ;height: 500px;"/></th>'
    //in tên sách
      showbook+=  '<th style="text-align: left">' + Listnamebook[value].tile + '</th></tr>'
    //in tác giả
    showbook += '<tr><td style="text-align: left">Tác giả: ' + Listnamebook[value].tacGia + '</td></tr>'
    // in thể loại
    showbook += '<tr><td style="text-align: left"> Thể loại: <a onClick=sortBook("' + Listnamebook[value].cate + '")>'+category+'</a></td></tr>'
    //in button đọc
    showbook += '<tr><td style="text-align: left"><form action="' + Listnamebook[value].pdf + '"><button>Đọc PDF</button></form> </td></tr></table>'
    showbook+= Listnamebook[value].tomtat
    document.getElementById("changeView").innerHTML = showbook
}