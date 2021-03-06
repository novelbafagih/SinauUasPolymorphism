package com.company;

public class Yahoo extends Email{
    static int x = 3;
    public int y = 1;
    public Yahoo(String userName) {
        super(userName);
        idProvider = "@yahoo.com";
    }
    static {
        print();

    }
    public static void print(){
        System.out.println();
    }

    public String encryption(String isiSurat){
        System.out.println("Di encryp lewat yahoo");
        return isiSurat;
    }

    @Override
    public void menerimaSurat(PesanSurat pengirimProvider, String isiSurat) {
        Surat suratBaru = new Surat(pengirimProvider,encryption(isiSurat));
        suratSurat.add(suratBaru);
    }

    @Override
    public void kirimSurat(PesanSurat penerimaProvider, String isiSurat) {
        super.kirimSurat(penerimaProvider, isiSurat);
    }

    @Override
    public void melihatSurat(int suratId) {
        Surat surat = suratSurat.get(suratId);
        System.out.println("Surat Dikirim Oleh " + userName + idProvider);
        System.out.println("Header :" + "none");
        System.out.println("Isi:"+ surat.getIsiSurat());
    }
}
