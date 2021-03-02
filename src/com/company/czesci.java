package com.company;

    public class czesci {
        String marka;
        String silnik;
        String kolor;
        String rozmiar;

        public czesci(String marka, String silnik, String kolor, String rozmiar){
            this.marka = marka;
            this.silnik = silnik;
            this.kolor = kolor;
            this.rozmiar = rozmiar;
        }
        @Override
        public String toString() {
            return String.format("Moje %s, ma silnik o pojemności %s, jest koloru %s, i jest samochodem o %s wielkości",marka,silnik,kolor,rozmiar);
}
}