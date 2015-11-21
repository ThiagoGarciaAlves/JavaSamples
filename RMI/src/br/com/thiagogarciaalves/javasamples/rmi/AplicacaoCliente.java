package br.com.thiagogarciaalves.javasamples.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class AplicacaoCliente {

	public static void main(String[] args) {
		
        Hello objetoRemoto;
        String dados;

        try{
            objetoRemoto = (Hello) Naming.lookup("rmi://localhost:1099/HelloServidora");
            dados = JOptionPane.showInputDialog(null,"Entre com o dado a ser impresso pelo Objeto Remoto","Entrada de Dados",JOptionPane.QUESTION_MESSAGE);
            objetoRemoto.imprimirOla(dados);
        }
        catch(RemoteException re){
            JOptionPane.showMessageDialog(null,"Erro Remoto: "+re.toString(),"Erro Remoto",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro Local: "+e.toString(),"Erro Local",JOptionPane.WARNING_MESSAGE);
        }

	}

}
