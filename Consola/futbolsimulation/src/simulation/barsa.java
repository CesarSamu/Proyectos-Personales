package simulation;

public class barsa {
    String[] barcelonaT = {"Ter Stegen","Jules Kounde","Ronald Araujo","Pau Cubarsí","João Cancelo",
        "Pedri","F. de Jong","Ilkay Gündogan","João Félix","Lewandowski","Lamine Yamal",};

    String[] barcelonaR = {"Alejandro Balde","Iñigo Martínez","Gavi","Ferran Torres","Raphinha","Iñaki Peña","Andreas Christensen",
        "Fermín López","Marcos Alonso","Oriol Romeu","Vitor Roque","Sergi Roberto"};



    public String[] getPlayers(){
        return barcelonaT;
    }

    public String[] getbooking(){
        return barcelonaR;
    }
    public int getbookingI(){
        return barcelonaR.length;
    }
}
