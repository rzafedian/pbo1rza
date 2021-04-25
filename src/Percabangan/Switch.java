package Percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs : \"Terimakasih Pak\"");
                System.out.println("Dos : \"Selamat ya\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dos : \"#$%^^\"");
                break;
            case 'C':
                System.out.println("Mhs : \"Ulun turun pul pak, tugas pul jua\"");
                System.out.println("Dos : \"Tapi bisalah menjawab ujian?\"");
                System.out.println("Mhs : \"hihihihi\"");
                break;
            default:
                System.out.println("Mhs : \"Ulun turun pul pak, tugas pul jua\"");
                System.out.println("Dos : \"Bujur jua kah?\"");
                System.out.println("Dos : \"*Memeriksa Berkas\"");
                System.out.println("Dos : \"Menceleng\"");
                System.out.println("Mhs : \"Kaburr\"");
                break;
        }
    }
}

