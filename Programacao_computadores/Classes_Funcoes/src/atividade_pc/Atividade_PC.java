/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pc;

import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class Atividade_PC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //mostrarPessoa();//Chama a função mostrarPessoa
        //cadastrarAgenda();//Chama a função cadastrarAgenda
        //cadastrarPedido();//Chama a função cadastrarPedido
        mostrarAluno();//Função para dar uso a classe aluno, aproveitei para colocar meu nome      
    }
    
    //Função mostrar pessoa
    public static void mostrarPessoa(){
        Pessoa pe = new Pessoa();//instância a classe pessoa
        JOptionPane.showMessageDialog(null, "Nome: "+pe.get_nome()+"\nData de Nascimento: "+pe.get_dt_nascimento()
                +"\nAltura: "+pe.get_altura()+"cm.");//Mostra os valores pré definidos na classe pessoa
    }
    //-----------------------------
    
    //Função cadastrar agenda
    public static void cadastrarAgenda(){
        Agenda age = new Agenda();//instância a classe Agenda
        DaoAgenda dao = new DaoAgenda();//instância a classe DaoAgenda onde fica os métodos
        
        Object[] options = { "Não.", "Sim!" };//Define as opções como sim ou não
        
        //Mostra  a mensagem perguntando se deseja cadastrar uma nova pessoa na agenda
        int opcao= JOptionPane.showOptionDialog(null, "Deseja cadastrar um novo contato na agenda?","Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options);
        
        //Caso a resposta seja sim, executa os comandos
        if(opcao == 1){
            age.set_nome(JOptionPane.showInputDialog("Digite o nome: "));//Define o atributo nome na classe Agenda
            age.set_telefone(Integer.parseInt(JOptionPane.showInputDialog("DIgite o numero do telefone/Celular.\nSomente numeros e sem espaço.")));//Define o atributo telefone na classe Agenda
            age.set_email(JOptionPane.showInputDialog("Digite o e-mail: "));//Define o atributo e-mail na classe Agenda
            age.set_endreco(JOptionPane.showInputDialog("Digite o endereço como o numero: "));//Define o atributo endereço na classe Agenda
            dao.mostrarTudo(age);//Chama o método de mostrar o contato cadastrado na Agenda
        }
        //Caso seja não, ele fecha o programa
        else{
            System.out.close();
        }
    }
    //----------------------------------
    
    //Função cadastrar pedido
    public static void cadastrarPedido(){
        Cliente clie = new Cliente();
        NotaFiscal nf = new NotaFiscal();
        DaoClieNF dao = new DaoClieNF();
        
        Object[] options = { "Não.", "Sim!" };
        int opcao= JOptionPane.showOptionDialog(null, "Deseja cadastrar um novo pedido?","Alerta", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options);
        
        if(opcao == 1){
            nf.set_numNota(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Nota fiscal: ")));
            clie.set_noome(JOptionPane.showInputDialog("Digite o nome do Cliente: "));
            clie.set_cpf(Integer.parseInt(JOptionPane.showInputDialog("DIgite o cpf do Cliente.\nSomente numeros e sem espaço.")));
            clie.set_email(JOptionPane.showInputDialog("Digite o e-mail do Cliente: "));
            nf.set_dt_emissao(JOptionPane.showInputDialog("Didite a data de emissão.\nExemplo: 11/08/2000"));
            nf.set_totalNota(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total da nota: ")));
            
            dao.mostrarNota(clie, nf);
        }
        else{
            System.out.close();
        }
    }
    //---------------------------------
    
    //Função mostrar Aluno
    public static void mostrarAluno(){
        Aluno alu = new Aluno();
        
        JOptionPane.showMessageDialog(null, "Nome: "+alu.getNome()+"\nCurso: "+alu.getCurso()
                +"\nNota: "+alu.getNota()+"cm.");//Mostra os valores pré definidos na classe Aluno, Fiz isso para "Assinar a atividade"
    
    }
    
}
