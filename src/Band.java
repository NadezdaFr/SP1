public class Band {
    private String name;
    private char genre;
    private int totalFans;
    private double balance;
    private int xPoints;
    private boolean isActive;

    public Band(String name, char genre, int totalFans, double balance, int xPoints, boolean isActive){
        this.name = name;
        this.genre = genre;
        this.totalFans= totalFans;
        this.balance= balance;
        this.xPoints= xPoints;
        this.isActive= isActive;
    }
    public boolean getisActive() {
        return isActive;
    }

    public int getxPoints() {
        return xPoints;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public char getGenre() {
        return genre;
    }
     public int getTotalFans(){
        return totalFans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public void setTotalFans(int totalFans) {
        this.totalFans = totalFans;
    }
    public void setBalance(double balance) {
        this.balance= balance;
    }
    public void setxPoints(int xPoints){
        this.xPoints= xPoints;
    }
    public void setisActive(boolean isActive) {
        this.isActive= isActive;
    }



    @Override
    public String toString() {
        return "Bandname: " + name + " Genre: " + genre + " TotalFans: " + totalFans + " balance " + balance +" DKK. "+ xPoints + " XP. "+ "Active "+isActive;
    }
}
