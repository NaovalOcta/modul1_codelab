import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminSingkatan = scanner.nextLine();

        // Konversi jenis kelamin singkatan ke lengkap
        String jenisKelaminLengkap;
        if (jenisKelaminSingkatan.equalsIgnoreCase("P")) {
            jenisKelaminLengkap = "Perempuan";
        } else if (jenisKelaminSingkatan.equalsIgnoreCase("L")) {
            jenisKelaminLengkap = "Laki-laki";
        } else {
            jenisKelaminLengkap = "Tidak diketahui";
        }

        // Meminta input tanggal lahir
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.nextLine();

        // Parse tanggal lahir ke objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Menghitung umur
        LocalDate today = LocalDate.now();
        Period umur = Period.between(tanggalLahir, today);

        // Menampilkan output
        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahirStr);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");
    }
}
