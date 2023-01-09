public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printTerabyteGigabyteMegabyteKilobyte(5);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes ) {
         int megaBytes = kiloBytes / 1024;
         int remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainingKiloBytes + " KB");
        }

    }
    public static void  printTerabyteGigabyteMegabyteKilobyte(long teraByte){
        long gigaByte = teraByte * 1024;
        long megaBytes =  gigaByte * 1024;
        long kiloBytes = megaBytes * 1024;

        if (teraByte < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("Terabyte amount is " + teraByte + " TB " + ", In Gigabyte form its "
            + gigaByte + " GB , in Megabyte form its " + megaBytes + " MB " + " and  in Kilobyte form its " + kiloBytes );
        }
    }

}