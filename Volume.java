import java.util.Scanner;



class VolumeB {

    public static void main(String[] args) {

        

        Scanner input = new Scanner(System.in);

        

        // Getting float input

        System.out.print("Panjang: ");
        float Panjang = input.nextFloat();

        System.out.print("Lebar: ");
        float Lebar = input.nextFloat();

        System.out.print("Tinggi: ");
        float Tinggi = input.nextFloat();

        float Hasil = Panjang * Lebar * Tinggi;
        
        System.out.println("Panjang = " + Panjang);
        System.out.println("Lebar = " + Lebar);
        System.out.println("Tinggi = " + Tinggi);
        System.out.println("Volume balok adalah = " + Hasil);

        System.out.println("===================");

        System.out.print("Phi( 3.14 || 22/7):");
        float Phi = input.nextFloat();

        System.out.print("Jari-jari: ");
        float Jari = input.nextFloat();

        float Total = 4 * Phi * Jari * Jari * Jari;
        float TotalAkhir = Total / 3;
        //Jari^3
        
        System.out.println("Phi = " + Phi);
        System.out.println("Jari-jari = " + Jari);
        System.out.println("Volume bola adalah = " + TotalAkhir);

        input.close();
        
    }

}
