
public class Calisan {
    
    private int id;
    private String ad;
    private String soyad;
    private String brans;
    private String derssaatisayisi;
    private String ekdersucreti;

    
    public Calisan(int id, String ad, String soyad, String brans, String derssaatisayisi, String ekdersucreti) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.derssaatisayisi=derssaatisayisi;
        this.ekdersucreti= ekdersucreti;
    }
      
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
    public String getDerssaatisayisi() {
        return derssaatisayisi;
    }

    public void setDerssaatisayisi(String derssaatisayisi) {
        this.derssaatisayisi = derssaatisayisi;
    }
    public String getEkdersucreti() {
        return ekdersucreti;
    }

    public void setEkdersucreti(String ekdersucreti) {
        this.ekdersucreti = ekdersucreti;
    }

    
}
