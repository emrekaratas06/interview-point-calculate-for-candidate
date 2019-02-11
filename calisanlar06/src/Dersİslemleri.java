import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dersİslemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<DersProgrami> dersleriGetir() {
        
        ArrayList<DersProgrami> cikti = new ArrayList<DersProgrami>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From dersprogrami";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String brans  = rs.getString("brans");
                String sinif  = rs.getString("sinif");
                String sube = rs.getString("sube");
                String derssaatisayisi = rs.getString("derssaatisayisi");
                cikti.add(new DersProgrami(id, ad, soyad, brans, sinif, sube, derssaatisayisi));
              
            }
            return cikti;
          
        } catch (SQLException ex) {
            Logger.getLogger(Dersİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }

    }
    
     public void dersGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_brans,String yeni_sinif, String yeni_sube, String yeni_derssaatisayisi) {
        String sorgu =  "Update dersprogrami set ad = ? , soyad = ? , brans = ? , sinif = ?, sube = ? , derssaatisayisi = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setString(2,yeni_soyad);
            preparedStatement.setString(3,yeni_brans);
            preparedStatement.setString(4,yeni_sinif);
            preparedStatement.setString(5,yeni_sube);
            preparedStatement.setString(6,yeni_derssaatisayisi);
            preparedStatement.setInt(7, id);
            
            preparedStatement.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(Dersİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
     public void dersSil(int id) {
        
        String sorgu = "Delete from dersprogrami where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dersİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
      public void dersEkle(String ad,String soyad,String brans,String sinif,String sube,String derssaatisayisi) {
        
        String sorgu = "Insert Into dersprogrami (ad,soyad,brans,sinif,sube,derssaatisayisi) VALUES(?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
         
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, brans);
            preparedStatement.setString(4, sinif);
            preparedStatement.setString(5, sube);
            preparedStatement.setString(6, derssaatisayisi);
            //preparedStatement.setString(6, derssaatisayisi);
            
            preparedStatement.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(Dersİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
     public Dersİslemleri(){
          String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
    
    
}