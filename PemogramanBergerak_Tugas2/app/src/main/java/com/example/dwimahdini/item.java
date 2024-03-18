package com.example.dwimahdini;

public class item {
    String nama;
    String nim;
    int gambar;

    public item(String name, String nim, int picture) {
        this.nama = name;
        this.nim = nim;
        this.gambar = picture;
    }
    public String getName() {
        return nama;
    }
    public void setName(String name) {
        this.nama = name;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public int getpicture() {
        return gambar;
    }
    public void setpicture(int picture) {
        this.gambar = picture;
    }
}