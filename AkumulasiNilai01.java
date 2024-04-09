import java.util.Scanner;

public class AkumulasiNilai01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = scanner.nextInt();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tugas tidak valid");
            return;
        }
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = scanner.nextInt();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai kuis tidak valid");
            return;
        }
        System.out.print("Masukkan Nilai UTS: ");
        int uts = scanner.nextInt();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai UTS tidak valid");
            return;
        }
        System.out.print("Masukkan Nilai UAS: ");
        int uas = scanner.nextInt();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai UAS tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String keterangan = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B")
                || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C") ? "LULUS" : "TIDAK LULUS";

        System.out.printf("Nilai akhir : %.1f\n", nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan : " + keterangan);
    }
}