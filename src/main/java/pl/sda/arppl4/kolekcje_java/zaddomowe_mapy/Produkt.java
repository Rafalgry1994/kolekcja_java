package pl.sda.arppl4.kolekcje_java.zaddomowe_mapy;

public class Produkt {
   private String nazwa;
   private String cena;
   private String ilosc;

   public Produkt(String nazwa, double cena, int ilosc, String kod) {
   }

   public String getNazwa() {
      return nazwa;
   }

   public void setNazwa(String nazwa) {
      this.nazwa = nazwa;
   }

   public String getCena() {
      return cena;
   }

   public void setCena(String cena) {
      this.cena = cena;
   }

   public String getIlosc() {
      return ilosc;
   }

   public void setIlosc(String ilosc) {
      this.ilosc = ilosc;
   }

   @Override
   public String toString() {
      return "Produkt{" +
              "nazwa='" + nazwa + '\'' +
              ", cena='" + cena + '\'' +
              ", ilosc='" + ilosc + '\'' +
              '}';
   }

   public Produkt(String nazwa, String cena, String ilosc) {
      this.nazwa = nazwa;
      this.cena = cena;
      this.ilosc = ilosc;


   }
}
