
public class DersProgrami {
  
    private int id;
    private String ad;
    private String soyad;
    private String brans;
    private String derssaatisayisi;
    private String sinif;
    private String sube;
    //private int derssaati;

    public DersProgrami(int id, String ad, String soyad, String brans, String derssaatisayisi, String sinif, String sube) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.derssaatisayisi = derssaatisayisi;
        this.sinif = sinif;
        this.sube = sube;
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

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
    
    public String haftalikDersSaatiSayisi(String derskacsaat){
        // 0.index --> 5.siniflar
        // 1.index --> 6.siniflar
        // 2.index --> 7.siniflar
        // 3.index --> 8.siniflar
        int [] TurkceDersSaati = {6,6,5,5};
        int [] MatematikDersSaati = {5,5,5,5};
        int [] FenDersSaati = {4,4,4,4};
        int [] SosyalDersSaati = {3,3,3,2};
        int [] YabanciDilSaati = {3,3,4,4};
        int [] DinDersSaati = {2,2,2,2}; 
        int [] GorselDersSaati = {1,1,1,1};
        int [] MuzikDersSaati = {1,1,1,1};
        int [] BedenDersSaati = {2,2,2,2};
        int [] TekTasDersSaati = {0,0,2,2};
        int [] BilisimDersSaati = {2,2,0,0};
        
        return derssaati;
    }
}
