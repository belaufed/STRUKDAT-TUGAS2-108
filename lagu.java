public class lagu {
    String judul;
    String genre;
    int durasi;
    
    public lagu(String judul, String genre, int durasi){
        this.judul=judul;
        this.genre=genre;
        this.durasi=durasi;
    }
    void tampil(){
        System.out.println("judul: "+judul);
        System.out.println("genre: "+genre);
        System.out.println("durasi: "+durasi);
    }
    
    
}
