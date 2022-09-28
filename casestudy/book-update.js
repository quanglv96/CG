let show1 = "<table><tr><td colspan='3'><h3>Sách Cập Nhập</h3></td></tr></table>";
let demo = []
let j = 0
for (let i = 0; i < Listnamebook.length / 5; i++) {
    let show = "<tr>";
    let tile = "<tr>"
    demo[i] = ""
    let n = j + 5
    if (j < Listnamebook.length) {
        console.log(j)
        for (; j < n; j++) {
            if (Listnamebook[j] !== undefined) {
                show += Listnamebook[j].showpic;
                tile += Listnamebook[j].showtile
            }
        }
    }
    demo[i] = "<table>" + show + tile + "</tr></table>"
}
document.getElementById('Bookupdate').innerHTML = show1 + demo.join(" ")

