package com.example.sistemukm;

public class Mahasiswa {
    private int id;
    private String nim;
    private String nama;
    private String jurusan;
    private String fakultas;
    private String email;
    private Integer wa;

    public Mahasiswa(int id, String nim, String nama, String jurusan, String fakultas, String email, Integer wa) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.email = email;
        this.wa = wa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getWa() {
        return wa;
    }

    public void setWa(Integer wa) {
        this.wa = wa;
    }
}
