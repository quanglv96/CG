function seach() {
    let txt = document.getElementById('Seach').value;
    let checkname=Listnamebook.filter(value => {
        return value.tile.toUpperCase().includes(txt.toUpperCase())
    })
    console.log(checkname)
    let j=0
    let show=""
    let tile=""
    let returnSeach=[]
    for (let i = 0; i < checkname.length; i++) {
        show = "<tr>";
        tile = "<tr>"
        returnSeach[i] = ""
        let n = j + 5
        if (j < checkname.length) {
            for (; j < n; j++) {
                if (checkname[j] !== undefined) {
                    show += checkname[j].showpic;
                    tile += checkname[j].showtile;
                }
            }
        }
        returnSeach[i] = "<table>" + show + tile + "</tr></table>"
    }
    document.getElementById('changeView').innerHTML ="<table><tr><h3>Kết quả tìm kiếm:</h3></tr></table>"+ returnSeach.join(" ")
}