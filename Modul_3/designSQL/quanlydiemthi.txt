USE QuanLyDiemThi;
CREATE TABLE HocSinh(
    MaHS VARCHAR(20) PRIMARY KEY,
    TenHS VARCHAR(50),
    NgaySinh DATE,
    Lop VARCHAR(20),
    GT VARCHAR(20)
);
CREATE TABLE MonHoc(
    MaMH VARCHAR(20) PRIMARY KEY,
    TenMH VARCHAR(50)
);
CREATE TABLE BangDiem(
    MaHS VARCHAR(20),
    MaMH VARCHAR(20),
    DiemThi INT,
    NgayKT DATETIME,
    PRIMARY KEY (MaHS, MaMH),
    FOREIGN KEY (MaHS) REFERENCES HocSinh(MaHS),
    FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
);
CREATE TABLE GiaoVien(
MaGV Varchar(20) Primary KEy,
TenGV varchar(20),
SDT varchar(10)
);
alter table MonHoc add MaGV varchar(20);
alter table MonHoc add constraint FK_MaGV Foreign Key (MaGV) references GiaoVien(MaGV);
INSERT INTO hocsinh(MaHS,TenHS,NgaySinh,Lop,GT) value('asasdfs','Quang',17/12/1996,'c08','123');
select *from hocsinh;