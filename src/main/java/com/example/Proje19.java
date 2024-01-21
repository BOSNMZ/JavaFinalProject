package com.example;

public abstract class Proje19 {

    private String isim;
    private String renk;
    private String sahiplik;

    public Proje19(String isim, String renk, String sahiplik) {
        this.isim = isim;
        this.renk = renk;
        this.sahiplik = sahiplik;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setSahiplik(String sahiplik) {
        this.sahiplik = sahiplik;
    }

    public String getIsim() {
        return isim;
    }

    public String getRenk() {
        return renk;
    }

    public String getSahiplik() {
        return sahiplik;
    }

    public abstract String PazaryeriTuru();
}