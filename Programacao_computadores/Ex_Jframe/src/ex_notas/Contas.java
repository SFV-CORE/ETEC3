
package ex_notas;

public class Contas {

    public static void main(String[] args) {
    }
    
    public String mediaBimRec(String nota1, String nota2, String nota3, String nota4)
    {   
        float  media = (Float.parseFloat(nota1) + Float.parseFloat(nota2) + Float.parseFloat(nota3) + Float.parseFloat(nota4))/4;  
        return String.valueOf(media);
     }
    
    public String mediaBim(String nota1, String nota2, String nota3)
    {   
        float  media = (Float.parseFloat(nota1) + Float.parseFloat(nota2) + Float.parseFloat(nota3))/3;  
        return String.valueOf(media);
     }
    
    public String status(String f1, String f2, String f3, String f4, String aula){
        int faltas;
        faltas = (Integer.parseInt(f1) + Integer.parseInt(f2) + Integer.parseInt(f3) + Integer.parseInt(f4));
        
        if((faltas*0.25) > Integer.parseInt(aula)){
          String status = "Reprovado";
          return status;
        }
        else {
          String status = "Aprovado";
          return status;
        }
    }
}
