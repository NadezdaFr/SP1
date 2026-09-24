import javax.swing.plaf.synth.SynthOptionPaneUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Printer printer = new Printer();
    Band myBand = new Band("Buddha Codes", 'E', 8500, 4750.00, 3200, true);
    Band mySecondBand = new Band("Metallica", 'R', 10500, 1000.00, 5000, false);

    System.out.println(myBand);
    //System.out.println(mySecondBand);
    System.out.println(myBand.getBalance());
    System.out.println(myBand.getName());



    //(KÆRNEKONCEPTER: FANS, FAME LEVEL, PENGE, REPETORIE).
    System.out.println("SP1 BAND SIM");
    System.out.println();
    System.out.println("Iteration 1: Variables-------------------------");
    // (variable, operatorer, navngivning og Arrays)
    System.out.println();
    System.out.println("=== BAND PROFILE ===");
    System.out.println("Name: " + myBand.getName());
    char genre = 'E'; // (Electronic)
    System.out.println("Genre: " + myBand.getGenre());
    System.out.println("Fans: " + myBand.getTotalFans());
    int fansMax = 15000;
    System.out.println("Fans Max: " + fansMax);
    System.out.println("Fans/ Max: " + myBand.getTotalFans() + "/" + fansMax);
    int fameLevel = 2;
    System.out.println("fame level: " + fameLevel);
    System.out.println("XP: " + myBand.getxPoints());
    System.out.println("Money: " + myBand.getBalance() + " DKK");
    System.out.println("Active: " + myBand.getisActive());
    System.out.println();


    String[] songs = {"Suffering Delusion", "Bodhisatva Way", "Medicin Buddha", "Moon On A Flower", "Rainbows Flow", "Rainbows Flow"};
    printer.printBands(songs);




    //Iteration 2: Control Structures: Tilføj logik til dit band-system:
    //Status checks,Fame system,Repertoire,Simpel “gig” simulation,Random event
    System.out.println("Iteration 2: Control Structures------------------------");
    System.out.println("=== STATUS CHECK==");
    if (myBand.getTotalFans() < ((fansMax * 25) / 100)) {
        System.out.println("WARNING: losing relevance! Consider a comeback strategy.");
    } else {
        System.out.println("STATUS: lokal Hero");
    }
    int newFans = 300;
    if (newFans <= 0 && !myBand.getisActive()) {
        System.out.println("The band is broken up");
    } else if (newFans >= 300 && newFans <= 1000) {
        System.out.println("Not bad... " + newFans + " new fans");
    } else {
        System.out.println("Well done" + newFans + " new fans!");
    }
    String genreName = "";
    switch (genre) {
        case 'E':
            genreName = "Electronic";
            break;
        case 'R':
            genreName = "Rock";
            break;
        case 'H':
            genreName = "HioHop";
            break;
        case 'P':
            genreName = "Pop";
            break;
        default:
            System.out.println("Another genre");
    }
    System.out.println("Genre " + genre + ": for " + genreName);
    System.out.println();
    //System.out.println("===GIG NIGHT===");

    System.out.println("Iteration 3: Methods------------------------------");







}





