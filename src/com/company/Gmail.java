package com.company;

public class Gmail extends Email{

    public Gmail(String userName) {
        super(userName);
        idProvider = "@yahoo.com";
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
