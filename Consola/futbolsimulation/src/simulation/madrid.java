package simulation;

public class madrid {
    String[] madridT = {"Andriy Lunin","Daniel Carvajal","Antonio Rüdiger","Nacho Fernández","Ferland Mendy","Aurélien Tchouaméni",
        "Toni Kroos","Jude Bellingham","Rodrygo","Joselu","Vinicius Jr",};

    String[] madridR = {"Thibaut Courtois","Kepa Arrizabalaga ","Éder Militão ","David Alaba ","Fran García ","Lucas Vázquez",
        "Federico Valverde ","Luka Modric","Dani Ceballos","Brahim Díaz","Arda Güler","Nico Paz",};


    public String[] getPlayers(){
        return madridT;
    }

    public String[] getbooking(){
        return madridR;
    }
    public int getbookingI(){
        return madridR.length;
    }
}
