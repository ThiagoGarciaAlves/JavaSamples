package br.com.thiagogarciaalves.javasamples.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class AplicacaoServidora {

	public static void main(String[] args) {
		
        HelloServidora objetoServidor;

        try{
            objetoServidor = new HelloServidora();
            Naming.rebind("rmi://localhost:1099/HelloServidora", objetoServidor);
            System.out.println("ObjetoServidor esta ativo!");
        }
        catch(RemoteException re){
            System.out.println("Erro Remoto: "+re.toString());
        }
        catch(Exception e){
            System.out.println("Erro Local: "+e.toString());
        }

	}

}
