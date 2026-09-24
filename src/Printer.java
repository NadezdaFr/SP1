public class Printer {
    public void printBands(String[] songs){
        System.out.println("Repertorie "+ songs.length +" songs");
        for(int i =0; i < songs.length; i++) {
            System.out.println("- " + songs[i]);
        }
    }

}
