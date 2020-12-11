package com.example.sistemukm;

public class UKM {
    private int id;
    private String nama;
    private String ketua;
    private String deskripsi;
    private String memberUKM;

    public UKM(int id, String nama, String ketua, String deskripsi, String memberUKM) {
        this.id = id;
        this.nama = nama;
        this.ketua = ketua;
        this.deskripsi = deskripsi;
        this.memberUKM = memberUKM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKetua() {
        return ketua;
    }

    public void setKetua(String ketua) {
        this.ketua = ketua;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getMemberUKM() {
        return memberUKM;
    }

    public void setMemberUKM(String memberUKM) {
        this.memberUKM = memberUKM;
    }
}
