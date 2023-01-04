package com.example.odev9.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private static final String name = "EmirhanAytekin";
    private static final String sifre = "123456";

    private MutableLiveData<String> kullaniciAdi = new MutableLiveData<>();
    private MutableLiveData<String> kullaniciSifre = new MutableLiveData<>();
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi.setValue(kullaniciAdi);
    }
    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre.setValue(kullaniciSifre);
    }
    public LiveData<String> getKullaniciAdi() {
        return kullaniciAdi;
    }
    public LiveData<String> getKullaniciSifre(){
        return kullaniciSifre;
    }
    public static String getName() { return name; }
    public static String getSifre(){return sifre;}


}