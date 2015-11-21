package br.com.thiagogarciaalves.javasamples.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

public class HelloServidora extends UnicastRemoteObject implements Hello {
	
	private static final long serialVersionUID = 1L;

	public HelloServidora() throws RemoteException{}

	public void imprimirOla(String oqImprimir) throws RemoteException {
	    JOptionPane.showMessageDialog(null,oqImprimir.toUpperCase(),"Mensagem do Objeto Cliente",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
