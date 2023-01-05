public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        l.setName("Biblioteka #1");
        l.setAdres("Tereshkovoy 12");
        l.setYear(1992);
        l.setAvtor("Khubaev");
        l.setCulture(false);
        l.setKnigi(4000);
        l.setPolki(1000);
        l.CountOfPolki();
        l.Pamyatnik();
        System.out.println(l);


        House h = new House();
        h.setName("Dom Djanaevih");
        h.setAdres("Djanaeva 36");
        h.setYear(1930);
        h.setAvtor("Pliev");
        h.setCulture(true);
        h.Pamyatnik();
        h.setVladelec("Artur");
        h.Vladelec();
        h.setCoutJitel(3);
        h.Jiteli();
        System.out.println(h);


        Police p = new Police();
        p.setName("Policia seluhi");
        p.setAdres("Kuchieva 1");
        p.setYear(1930);
        p.setAvtor("Administracia");
        p.culture = false;
        p.setPogoni("letehi");
        p.setZakluchennie(326);
        p.Zvanie();
        System.out.println(p);

    }
}
