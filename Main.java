public class Main {
    public static void main(String[] args){

        producer martin = new producer("Martin");
        vokalis sean = new vokalis("sean");

        lagu lagu1 = new lagu("Go", "pop", 142);

        System.out.println(" --- system pencatatan produksi lagu ---");
        lagu1.tampil();
        System.out.println();

        martin.tampil();
        martin.kerja();

        System.out.println();

        sean.tampil();
        sean.kerja();

        System.out.println();
        System.out.println("semua data produksi telah dicatat");

    }
    
}
