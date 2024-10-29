package simulation;

public class Liverpool {
    String[] LiverpoolT = {"C. Kelleher","J. Gomez","J. Quansah","V. van Dijk","A. Robertson","A. Mac Allister",
    "W. Endo","D. Szoboszlai","M. Salah","D. Nuñez","L. Días"};

    String[] LiverpoolR = {"C. Gakpo","H. Elliot","K. Tsimikas","B. Clark","C. Bradley","A. del Castillo","R. Gravenberch",
    "J. McConnell","J. Danns"};
    
    public String[] getPlayers(){
        return LiverpoolT;
    }

    public String[] getbooking(){
        return LiverpoolR;
    }
    public int getbookingI(){
        return LiverpoolR.length;
    }
}
