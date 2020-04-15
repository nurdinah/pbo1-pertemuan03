package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs      : \"Thankyou pak\"");
                System.out.println("Dosen    : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs      : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen    : \"Tasarah bapa ai\"");
                break;
            case 'C':
                System.out.println("Mhs      : \"Ulun turun tarus pak ai, tugas menggawi jua\"");
                System.out.println("Dosen    : \"Tapi nitip absen, Tugas Copy Paste ampun kawan\"");
                System.out.println("Mhs      : \"Nah, ketahuan am Hahaha...\"");
                break;
            default:
                System.out.println("Mhs      : \"Ulun turun pul Pak ai, tugas mengerjakan ja jua\"");
                System.out.println("Dosen    : \"Bujur juakah?\"");
                System.out.println("Mhs      : \"Inggih pak ai\"");
                System.out.println("Dosen    : \"Habis memeriksa berkas, langsung bediri\"");
                System.out.println("Mhs      : \"Kaborrrrrrr wkwkwkwk\"");
                break;
        }
    }
}