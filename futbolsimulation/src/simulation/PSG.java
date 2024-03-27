package simulation;

public class PSG {
    String[] PSGT = {"G. Donnarumma","A. Hakimi","D. Pereira","Beraldo","Lucas","K. Lee","M. Ugarte","Vithina","O, Dembelé","G. Ramos",
    "K. Mbappé",};

    String[] PSGR = {"R. Kolo","N. Mendes","N. Mukiele","Zaire-Emery","S. Mayulu","R. Peña","C. Soler","A. Letellier","A. Tenas"};

    public String[] getPlayers(){
        return PSGT;
    }

    public String[] getbooking(){
        return PSGR;
    }
    public int getbookingI(){
        return PSGR.length;
    }
}
