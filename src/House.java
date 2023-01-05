public class House extends Building implements LivingHouse {
    String vladelec;
    int countJitel;

    public String getVladelec() {
        return vladelec;
    }

    public void setVladelec(String vladelec) {
        this.vladelec = vladelec;
    }

    public int getCoutJitel() {
        return countJitel;
    }

    public void setCoutJitel(int coutJitel) {
        countJitel = coutJitel;
    }

    public House() {
        super();

    }

    public void Vladelec() {
        System.out.println("Eto chastniy dom " + vladelec + "a !");
    }

    public void Jiteli() {
        if (countJitel <= 5) {
            System.out.println("Eto malenkiy dom!");
        } else {
            System.out.println("Eto bolshoy dom!");
        }
    }

    public void Pamyatnik() {
        if (isCulture()) {
            System.out.println("Jiloy dom yavlyaetsa istoricheskim zdaniem!");
        } else {
            System.out.println("Jiloy dom NE yavlyaetsa istoricheskim zdaniem!");
        }

    }

    public String toString() {
        return this.name + " \n" + this.year + " \n" + this.adres + " \n" + this.avtor + "\n\n\n";
    }

    @Override
    public void showInfo() {
        System.out.println("Infa po domu");
    }

    @Override
    public void showYear() {
        System.out.println("pokaz goda " + year);
    }
}
