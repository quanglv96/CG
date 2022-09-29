let show1 = "<table><tr><td colspan='3'><h3>Sách Cập Nhập</h3></td></tr></table>";
let demo = []
let j = 0
for (let i = 0; i < Listnamebook.length / 5; i++) {
    let show = "<tr>";
    let tile = "<tr>"
    demo[i] = ""
    let n = j + 5
    if (j < Listnamebook.length) {
        for (; j < n; j++) {
            if (Listnamebook[j] !== undefined) {
                show += "<td class='topnav'><a onclick= 'showBook(" + j + ")'"+"><img src=" + Listnamebook[j].pic + " /></a></td>";
                tile += "<td>" + Listnamebook[j].tile + "</td>"
            }
        }
    }
    demo[i] = "<table>" + show + tile + "</tr></table>"
}
document.getElementById('Bookupdate').innerHTML = show1 + demo.join(" ")

