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
//radom sách gợi ý
let Hndg = [];
for(let i=0;i<5;i++){
    let c=parseInt(Math.floor(Math.random()*Listnamebook.length))
    let count=0
    for(let j=0;j<=Hndg.length;j++){
        if (c=== Hndg[j]){
            count++
        }
    }
    if(count===0){
        Hndg.push(c);
    }else{
        i--;
    }
}
function homnaydocgi() {
    let show = "<table class='tagHNDG'><td colspan=\"5\"><h3>Hôm nay đọc gì:</h3></td></tr><tr>"
    let tile = "<table class='tagHNDG'><tr>"
    for (let i = 0; i < Hndg.length; i++) {
        show += "<td class='topnav'><a onclick= 'show_info_book(" + Hndg[i] + ")'"+"><img src=" + Listnamebook[Hndg[i]].pic + " /></a></td>"
        tile +="<td>" + Listnamebook[Hndg[i]].tile + "</td>"
    }
    document.getElementById('HNDG').innerHTML = show + tile + "</tr></table>";
}
homnaydocgi()
