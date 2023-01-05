public class Police extends Building {
    String pogoni;
    int zakluchennie;

    public String getPogoni() {
        return pogoni;
    }

    public void setPogoni(String pogoni) {
        this.pogoni = pogoni;
    }

    public int getZakluchennie() {
        return zakluchennie;
    }

    public void setZakluchennie(int zakluchennie) {
        this.zakluchennie = zakluchennie;
    }

    public void Zvanie() {
        System.out.println("Zdes v osnovnom" + pogoni);
    }


    public String toString() {
        return this.name + "\n" + this.year + "\n" + this.adres + "\n" + this.avtor + "\n" + zakluchennie + "\n\n\n";
    }

}
