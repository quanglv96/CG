function Login() {
    let showLogin = '<table class="login">'
    showLogin += '<tr><td colspan="2" style="text-align: center; padding-left: 650px"><h3>ĐĂNG NHẬP</h3></td></tr>'
    showLogin += '<tr><td colspan="2" style=" padding-left: 70px"><input type="text" id="ID" placeholder="Tên đăng nhập" size="30px"></td></tr>'
    showLogin += '<tr><td colspan="2" style=" padding-left: 70px"><input type="text" id="pass"  placeholder="Nhập mật khẩu" size="30px"></td></tr>'
    showLogin += '<tr><td style="text-align: right; padding-right: 20px;padding-top: 15px"><a onclick="showDefault()">< Quay lại </a></td>'
    showLogin += '<td style="text-align: left; padding-top: 10px"><button onclick="checklogin()">Đăng Nhập</button></td></tr></table>'
    document.getElementById('changeView').innerHTML = showLogin;
}

const Default = document.getElementById('changeView').innerHTML
console.log(Default)

function showDefault() {
    document.getElementById('changeView').innerHTML = Default;
}

function checklogin() {
    let Id = document.getElementById('ID').value;
    let Pass = document.getElementById('pass').value;
    if (Id === "admin" && Pass === "1234") {
        let show = `<td>Quang Max <a href="trang-chu.html">Sign Out</a></td>`
        alert("Đăng nhập thành công")
        document.getElementById('login').innerHTML = show
        showDefault();
    } else {
        document.getElementById('ID').innerText=" "
        alert("Kiểm tra lại ID và Password")
    }
}



