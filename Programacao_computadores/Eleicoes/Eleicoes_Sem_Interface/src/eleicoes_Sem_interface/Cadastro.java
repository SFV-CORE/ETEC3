/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes_Sem_interface;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Cadastro {
    
    public static void main(String[] args) 
    {
    
        
     //Cadastro de canditos  
       
        int n1, n2, n3;
        String c1, c2, c3;
        
        int votos, branco = 0, nulo = 0, totalVotos = 0; 
        int votosCan1 = 0, votosCan2 = 0, votosCan3 = 0;
        
        int tVotosC1 = 0, tVotosC2 = 0, tVotosC3 = 0;
        String lugar1 = "", lugar2 = "", lugar3 = "";
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do primeiro Candidato: "));
        c1 = JOptionPane.showInputDialog("Insira o nome do primeiro Candidato: ");
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do segundo Candidato: "));
        c2 = JOptionPane.showInputDialog("Insira o nome do segundo Candidato: ");
        
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do terceiro Candidato: "));
        c3 = JOptionPane.showInputDialog("Insira o nome do terceiro Candidato: ");
          
     //Votação
                   
        do
        {   
          votos = Integer.parseInt(JOptionPane.showInputDialog(n1+" para "+c1+"\n"+n2+" para "+c2+"\n"+n3+" para "+c3+"\n0 para nulo\n99 para sair\nInsira em quem você vai votar: "));
          if(votos == n1)
          {
            votosCan1++;
          }
          else if(votos == n2)
          {
            votosCan2++;
          } 
          else if(votos == n3)
          {
            votosCan3++;
          } 
          else if(votos == 0)
          {
            nulo++;
          }
          else if(votos == 9)
          {
            branco++;
          }   
          else if(votos != 99){
              JOptionPane.showMessageDialog(null, "Candidato não reconhecido, por favor tente novamente.");
          }
        } while (votos != 99);
        
        totalVotos = votosCan2+votosCan3+votosCan1+branco+nulo;
           
     // verificação
       
      if(votosCan1 == votosCan2 && votosCan2 == votosCan3){
         JOptionPane.showMessageDialog(null, "Ocorreu um empate, por favor procure fazer a segunda fase!"); 
      }
      else{
        if(votosCan1 > votosCan2 && votosCan1 > votosCan3 )
        {
          lugar1 = c1;
          tVotosC1 = votosCan1;
               
          if(votosCan2 > votosCan1)
          {
            lugar2 = c2;
            tVotosC2 = votosCan2;
            
            lugar3 = c3;
            tVotosC3 = votosCan3;
          }
          else
          {
            lugar2 = c3;
            tVotosC2 = votosCan3;
            
            lugar3 = c2;
            tVotosC3 = votosCan3;
          }
        }
        else if(votosCan2 > votosCan1 && votosCan2 > votosCan3 )
        {
          lugar1 = c2;
          tVotosC1 = votosCan2;
               
          if(votosCan1 > votosCan3)
          {
            lugar2 = c1;
            tVotosC2 = votosCan1;
            
            lugar3 = c3;
            tVotosC3 = votosCan3;
          }
          else
          {
            lugar2 = c3;
            tVotosC2 = votosCan3;
            
            lugar3 = c1;
            tVotosC3 = votosCan1;
          }
        }
        else if(votosCan3 > votosCan1 && votosCan3 > votosCan2 )
        {
          lugar1 = c3;
          tVotosC1 = votosCan3;           
               
          if(votosCan1 > votosCan2)
          {
            lugar2 = c1;
            tVotosC2 = votosCan1;
            
            lugar3 = c2;
            tVotosC3 = votosCan2;        
          }
          else
          {
            lugar2 = c2;
            tVotosC2 = votosCan2;
            
            lugar3 = c1;
            tVotosC3 = votosCan1;         
          }
        }
        
     //Porcentagem
        int PC1, PC2, PC3, PNulo, PBranco;

        PC1 = (tVotosC1*100)/totalVotos;
        PC2 = (tVotosC2*100)/totalVotos;
        PC3 = (tVotosC3*100)/totalVotos;
        PNulo = (nulo*100)/totalVotos;
        PBranco = (branco*100)/totalVotos;          
            
     //Exibição       

        JOptionPane.showMessageDialog(null, "Total de votos: "+totalVotos);
        JOptionPane.showMessageDialog(null, "Candidato Eleito: "+lugar1+"\nVotos: "+tVotosC1+"\nCom "+PC1+"% do total de votos.");
        JOptionPane.showMessageDialog(null, "2° Lugar: "+lugar2+"\nVotos: "+tVotosC2+"\nCom "+PC2+"% do total de votos.");
        JOptionPane.showMessageDialog(null, "3° Lugar: "+lugar3+"\nVotos: "+tVotosC3+"\nCom "+PC3+"% do total de votos.");
        JOptionPane.showMessageDialog(null, "Brancos: "+branco+"\nCom "+PBranco+"% do total de votos"); 
        JOptionPane.showMessageDialog(null, "Nulos: "+nulo+"\nCom "+PNulo+"% do total de votos"); 
      }        
    }
}
