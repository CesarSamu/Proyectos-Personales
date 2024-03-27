package simulation;
import java.util.Random;

public class actions {
    Random random = new Random();
    int[] YoTeYeCa = new int[11], RiTiYeCa = new int[11], YoTeReCa = new int[11], RiTiReCa = new int[11];

    public String getFaltaYourTeam(String[] YourTeam, String[] RivalTeam){ //Falta del usuario
        String result = "Falta 1 es el error";
        boolean a = true;

        while (a) {
            int player1 = random.nextInt(11),player2 = random.nextInt(11);

            if (YoTeReCa[player1] == 0 && RiTiReCa[player2] == 0) {
                result = " Player "+YourTeam[player1]+" has committed a foul on player "+RivalTeam[player2];
                a = false;
            }
        }

        return result;
    }

    public String getFaltaRivalTeam(String[] YourTeam, String[] RivalTeam){ //Falta del rival
        String result = "Falta 2 es error";
        boolean a = true;

        while (a) {
            int player1 = random.nextInt(11),player2 = random.nextInt(11);
            
            if (YoTeReCa[player1] == 0 && RiTiReCa[player2] == 0) {
                result = " player "+RivalTeam[player1]+" has committed a foul on player "+YourTeam[player2];
                a = false;
            }
        }

        return result;
    }

    public String getYourCard(String[] YourTeam, String[] RivalTeam, int card){ //Evento de targeta amarilla
        String result = "Amarilla es error";
        int randomposition1 = random.nextInt(11), randomposition2 = random.nextInt(11);

        if(card == 2){ //Amarilla
            if (YoTeYeCa[randomposition1] == 0) {
                YoTeYeCa[randomposition1] = 1;
                result = " player "+YourTeam[randomposition1]+" received a yellow card for making a very strong tackle on player "+RivalTeam[randomposition2];
            }
            else{
                YoTeReCa[randomposition1] = 1;
                result = " player "+YourTeam[randomposition1]+" has been expelled for accumulating 2 yellow cards";

            }
        }
        else{ //Roja
            if (YoTeReCa[randomposition1] == 0) {
                YoTeReCa[randomposition1] = 1;
                result = " player "+YourTeam[randomposition1]+" received a straight red card due to a too harsh tackle.";
            }   
        }
        return result;
    }

    public String getRivalCard(String[] YourTeam, String[] RivalTeam, int card){
        String result = "Amarilla 2 es error";
        int randomposition1 = random.nextInt(11), randomposition2 = random.nextInt(11);

        if(card == 2){ //Amarilla
            if (RiTiYeCa[randomposition1] == 0) {
                RiTiYeCa[randomposition1] = 1;
                result = " player "+RivalTeam[randomposition1]+" received a yellow card for making a very strong tackle on player "+YourTeam[randomposition2];
            }
            else{
                YoTeReCa[randomposition1] = 1;
                result = " player "+RivalTeam[randomposition1]+" has been expelled for accumulating 2 yellow cards";

            }
        }
        else{ //Roja
            if (YoTeReCa[randomposition1] == 0) {
                YoTeReCa[randomposition1] = 1;
                result = " player "+RivalTeam[randomposition1]+" received a straight red card due to a too harsh tackle.";
            }   
        }
        return result;
    }

    public void setYourChanges(int a){
        YoTeYeCa[a] = 0;
        YoTeReCa[a] = 0;
        
    }

    public void setRivalChanges(int a){
        RiTiYeCa[a] = 0;
        RiTiReCa[a] = 0;
    }

    public String getYourGol(String[] YourTeam, String[] RivalTeam){
        String result ="Gol es error";
        boolean a = true;

        while (a) {
            int player = random.nextInt(11), eventrandom = random.nextInt(20),typegol=random.nextInt(3);

            if (eventrandom!=15) {
                if (typegol == 0) {  //Gol normal
                    if (YoTeReCa[player] == 0) {
                        result = YourTeam[player]+" scored a goal";
                        a = false;
                    }
                }
                else if(typegol == 1){ //Penal
                    if (YoTeReCa[player] == 0) {
                        result = YourTeam[player]+" scored a penalty goal";
                        a = false;
                    }
                }
                else{
                    if (YoTeReCa[player] == 0) { //Cabeza
                        result = YourTeam[player]+" scored a header goal";
                        a = false;
                    }
                }
            }
            else{
                if (RiTiReCa[player] == 0) { //Auto gol
                    result = RivalTeam[player]+"  has scored an own goal";
                    a = false;
                }
            }
        }
        
        return result;
    }

    public String getRivalGol(String[] YourTeam, String[] RivalTeam){
        String result ="Gol rival es error";
        boolean a = true;

        while (a) {
            int player = random.nextInt(11), eventrandom = random.nextInt(20),typegol=random.nextInt(3);

            if (eventrandom!=15) {
                if (typegol == 0) {  //Gol normal
                    if (YoTeReCa[player] == 0) {
                        result = RivalTeam[player]+" scored a goal";
                        a = false;
                    }
                }
                else if(typegol == 1){ //Penal
                    if (YoTeReCa[player] == 0) {
                        result = RivalTeam[player]+" scored a penalty goal";
                        a = false;
                    }
                }
                else{
                    if (YoTeReCa[player] == 0) { //Cabeza
                        result = RivalTeam[player]+" scored a header goal";
                        a = false;
                    }
                }
            }
            else{
                if (RiTiReCa[player] == 0) { //Auto gol
                    result = YourTeam[player]+"  has scored an own goal";
                    a = false;
                }
            }
        }
        
        return result;
    }
}
