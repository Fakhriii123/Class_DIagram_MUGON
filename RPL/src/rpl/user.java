package rpl;

public class user {
    private String userName, email, userPass;
    private int Saldo;
    private Barang[] Keranjang = new Barang[100];
    private Barang[] listJual = new Barang[100];

    public user(String userName, String email, String userPass, int Saldo) {
        this.userName = userName;
        this.email = email;
        this.userPass = userPass;
        this.Saldo = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public Barang[] getKeranjang() {
        return this.Keranjang;
    }
    
    public Barang[] getListJual() {
        return this.listJual;
    }

    public void setKeranjang(Barang[] Keranjang) {
        this.Keranjang = Keranjang;
    }
    
    public String cariBarang(String findBarang){
        for (int i = 0; i < 100; i++) {
            if (Keranjang[i] != null && Keranjang[i].namaBarang.equals(findBarang)) {
                return Keranjang[i].namaBarang;
            }
        }
        return "Barang tidak ditemukan";
    }
    
    public void jualBarang(String namaBarang, String TipeBarang, String Lokasi, int Harga){
        Barang newBarang = new Barang(namaBarang, TipeBarang, Lokasi, Harga, 0, true);
        marketplace.uploadToMarketplace(newBarang);
    }
    
    public void beliBarang(){
        System.out.println("Belum ter-implementasi");
    }
    
    public void tambahSaldo(int Angka){
        this.Saldo += Angka;
    }
    
    public void liatKeranjang(){
        for (Barang barang : Keranjang) {
            if (barang != null) {
                System.out.println("Nama Barang: " + barang.namaBarang);
                System.out.println("Tipe Barang: " + barang.TipeBarang);
                System.out.println("Lokasi: " + barang.getLokasi());
                System.out.println("Harga: " + barang.Harga);
                System.out.println("Kondisi: " + barang.Kondisi);
                System.out.println("Is Baru: " + barang.isBaru);
                System.out.println();
            }
        }
    }
           
}
