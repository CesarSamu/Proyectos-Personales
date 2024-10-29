package simulation;

public class Bayern {
    String[] bayerT = {"M. Neuer","D. Upamecano","M. de Ligt","E. Dier","A. Davies","J. Kimmich","L. Goretzka","L. Sané",
    "T. Müller","J. Musiala","H. Kane"};

    String[] bayerR = {"D. Peretz","M. Kim","R. Guerreiro","S. Boey","T. Buchmann","N. Mazraoui","K. Laimer",
    "A. Pavlović","K. Coman","B. Zaragoza","S. Gnabry"};

    public String[] getPlayers(){
        return bayerT;
    }

    public String[] getbooking(){
        return bayerR;
    }
    public int getbookingI(){
        return bayerR.length;
    }
}
