package simulation;

public class ManCity {
    String[] cityT = {"S. Ortega","K. Walker","R. Dias","M. Akanji","J. Gvardiol","Rodrigo","K. De Bruyne","B. Silva",
    "P. Foden","J. Doku","E. Haaland",}; 

    String[] cityR = {"S. Carson ","Ederson","S. Gómez","R. Lewis","J. Stones","Joshua","O. Bobb ","J. Grealish","M. Kovacic",
    "J. McAtee ","M. Nunes","K. Phillips ","Julián Álvarez","N. Ake "};
    
    public String[] getPlayers(){
        return cityT;
    }

    public String[] getbooking(){
        return cityR;
    }
    public int getbookingI(){
        return cityR.length;
    }
}
