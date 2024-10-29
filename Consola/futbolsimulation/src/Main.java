import simulation.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        Random random = new Random();
        barsa barsita = new barsa();
        madrid mandrid = new madrid();
        Bayern bayer = new Bayern();
        Liverpool liver = new Liverpool();
        ManCity city = new ManCity();
        PSG psg = new PSG();
        actions action = new actions();
        int timemin = 0, timemax = 10, YourChanges = 0, RivalChanges = 0, bookingI=1, YourGoles = 0, RivalGoles = 0 ;
        String[] YourTeam = new String[11], RivalTeam = new String[11]; 
        boolean game = true;
        String YourrTeam = "", RivallTeam= "";

        System.out.println("Choose a team" +
        "\n1. FC Barcelona" +"\n2. Real Madrid" +"\n3. Man. City" +"\n4. Bayern de Múnich"+"\n5. Liverpool"+"\n6. PSG"+"\n0. Salir");
        int team1 = a.nextInt();
        System.out.println("\nChoose other team");
        int team2 = a.nextInt();

        if(team1 == team2 && team1 != 0){
            System.out.println("You can't use same team");
        }
        else if (team1 != 0 && team2 != 0) {

            switch (team1) {
                case 1: //Barsa
                        YourTeam = barsita.getPlayers();
                        bookingI = barsita.getbookingI();
                        YourrTeam = "Barcelona";
                        
                    break;
                case 2: //Real Madrid
                        YourTeam = mandrid.getPlayers();
                        bookingI = mandrid.getbookingI();
                        YourrTeam = "Real Madrid";
                    break;
                case 3: //Man. City
                        YourTeam = city.getPlayers();
                        bookingI = city.getbookingI();
                        YourrTeam = "Man. City";
                    break;
                case 4: //Bayern 
                        YourTeam = bayer.getPlayers();
                        bookingI = bayer.getbookingI();
                        YourrTeam = "Bayern de Múnich";
                    break;
                case 5: //Liverpool
                        YourTeam = liver.getPlayers();
                        bookingI = liver.getbookingI();
                        YourrTeam = "Liverpool";
                    break;
                case 6: //PSG
                        YourTeam = psg.getPlayers();
                        bookingI = psg.getbookingI();
                        YourrTeam = "PSG";
                    break;
                default:
                    break;

            }

            String[] YourBooking = new String[bookingI];
            
            switch (team1) {
                case 1: //Barsa
                        YourBooking = barsita.getbooking();

                    break;
                case 2: //Real Madrid
                        YourBooking = mandrid.getbooking();
                    break;
                case 3: //Man. City
                        YourBooking = city.getbooking();
                    break;
                case 4: // Bayern 
                        YourBooking = bayer.getbooking();
                    break;
                case 5: //Liverpool
                        YourBooking = liver.getbooking();
                    break;
                case 6: //PSG
                        YourBooking = psg.getbooking();
                    break;
                default:
                    break;
            }


            System.out.println("\nYour team is:\n");
            for(int i=0; i<11;i++){
                System.out.println(YourTeam[i]);
            }

            try {
                Thread.sleep(6000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (team2) {
                case 1: //Barsa
                        RivalTeam = barsita.getPlayers();
                        bookingI = barsita.getbookingI();
                        RivallTeam = "Barcelona";
                    break;
                case 2: //Real Madrid
                        RivalTeam = mandrid.getPlayers();
                        bookingI = mandrid.getbookingI();
                        RivallTeam = "Real Madrid";
                    break;
                case 3: //Man. City
                        RivalTeam = city.getPlayers();
                        bookingI = city.getbookingI();
                        RivallTeam = "Man. City";
                    break;
                case 4: // Bayern 
                        RivalTeam = bayer.getPlayers();
                        bookingI = bayer.getbookingI();
                        RivallTeam = "Bayern Múnich";
                    break;
                case 5: //Liverpool
                        RivalTeam = liver.getPlayers();
                        bookingI = liver.getbookingI();
                        RivallTeam = "Liverpool";
                    break;
                case 6: //PSG
                        RivalTeam = psg.getPlayers();
                        bookingI = psg.getbookingI();
                        RivallTeam = "PSG";
                    break;
                default:
                    break;
            }

            String[] RivalBooking = new String[bookingI];

            switch (team2) {
                case 1: //Barsa
                        RivalBooking = barsita.getbooking();
                    break;
                case 2: //Real Madrid
                        RivalBooking = mandrid.getbooking();
                    break;
                case 3: //Man. City
                        RivalBooking = city.getbooking();
                    break;
                case 4: // Bayern 
                        RivalBooking = bayer.getbooking();
                    break;
                case 5: //Liverpool
                        RivalBooking = liver.getbooking();
                    break;
                case 6: //PSG
                        RivalBooking = psg.getbooking();
                    break;
                default:
                    break;
            }

            System.out.println("\nRival team is:\n");
            for(int i=0; i<11;i++){
                System.out.println(RivalTeam[i]);
            }

            try {
                Thread.sleep(6000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\nThe referee starts the match.\n");


            do {
                
                int minute1 = random.nextInt(timemax - timemin) + timemin + 1; //Minuto en el que tu equipo hace una acción
                if (minute1 >= timemax) {
                    minute1 -= 1;
                }
                int minute2 = random.nextInt(timemax - minute1) + minute1 + 1; // Minuto en el que el rival hace un  acción
                
                int action1 = random.nextInt(5) + 1; //La acción que hace tu equipo
                int action2 = random.nextInt(5) + 1; //La acción que hace tu equipo
                int maybe1 = random.nextInt(4); //Esto decide si pasa algo o no pasa 
                int maybe2 = random.nextInt(4);

                if (maybe1 != 0) {
                    switch (action1) { //Acciones del jugador
                        case 1: //Falta
                                System.out.println("Minute "+minute1+" "+action.getFaltaYourTeam(YourTeam, RivalTeam));
                            break;
                        case 2: //Amarilla
                                System.out.println("Minute "+minute1+" "+action.getYourCard(YourTeam, RivalTeam,action1));
                            break;
                        case 3: //Roja
                                System.out.println("Minute "+minute1+" "+action.getYourCard(YourTeam, RivalTeam,action1));
                            break;
                        case 4: //Cambio
                            YourChanges ++;
                            if (YourChanges <= 5) {
                                int titular = random.nextInt(11), reserva = random.nextInt(team2);
                                System.out.println("Minute "+minute1+" "+YourTeam[titular]+" leaves the field and "+YourBooking[reserva]+" comes in");
                                YourTeam[titular] = YourBooking[reserva];
                                action.setYourChanges(titular);
                            }
                            break;
                        case 5: //Gol
                            System.out.println("Minute "+minute1+" "+action.getYourGol(YourTeam,RivalTeam));
                            YourGoles ++;
                            break;
                        default:
                            break;
                    }
                }

                try {
                    Thread.sleep(3000);
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (maybe2 != 0) {
                    switch (action2) { //Acciones del jugador
                        case 1: //Falta
                            System.out.println("Minute "+minute2+" "+action.getFaltaRivalTeam(YourTeam, RivalTeam));
                            break;
                        case 2: //Amarilla
                            System.out.println("Minute "+minute2+" "+action.getRivalCard(YourTeam, RivalTeam,action2));
                            break;
                        case 3: //Roja
                            System.out.println("Minute "+minute2+" "+action.getRivalCard(YourTeam, RivalTeam,action2));
                            break;
                        case 4: //Cambio
                            RivalChanges ++;
                            if (RivalChanges <= 5) {
                                int titular = random.nextInt(11), reserva = random.nextInt(team2);
                                System.out.println("Minute "+minute2+" "+RivalTeam[titular]+" leaves the field and "+RivalBooking[reserva]+" comes in");
                                RivalBooking[titular] = RivalBooking[reserva];
                                action.setRivalChanges(titular);
                            }
                            break;
                        case 5: //Gol
                            System.out.println("Minute "+minute1+" "+action.getRivalGol(YourTeam,RivalTeam));
                            RivalGoles ++;
                            break;
                    
                        default:
                            break;
                    }
                }

                timemin += 10; //Suma al tiempo mínimo
    
                if(timemax==40){ //Si está por acabarse el primer tiempo 
                    timemax += 5; //Se le suma nada más 5 segundos más al temporizador 
                }
                else if(timemax == 45){ //Si el tiempo máximo ya es 45 es que el primer tiempo acabó 
                    System.out.println("\n\tTHE FIRST HALF ENDED\n");
                    timemax = 50; //Preparamos los valores para el segundo tiempo
                    timemin = 45;
                }
                else if(timemin == 45){
                    timemin = 50; //Ajustamos el tiempo mínimo para el segundo tiempo
                }
                else{
                    timemax += 10; //Sumamos 10 al tiempo máximo 
                }
    
                try {
                    Thread.sleep(2000);
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                } 
    
                if (timemax > 90) {  //Dice si el partido terminó
                    game = false;
                    System.out.println("\n\tTHE GAME IS OVER\n");
                }
                
            } while (game);
        }
        else{
            System.out.println("Si");
        }
        
        System.out.println(YourrTeam+" "+YourGoles+" - "+RivalGoles+" "+RivallTeam);


        if (YourGoles>RivalGoles) {
            System.out.println("YOU WIN!!!!!!!!!");
        }
        else if(RivalGoles>YourGoles){
            System.out.println("YOU LOSE");
        }
        else{
            System.out.println("They tied");
        }
        a.close();
    }
}
