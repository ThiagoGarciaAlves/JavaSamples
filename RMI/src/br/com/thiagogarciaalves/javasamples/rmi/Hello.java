package br.com.thiagogarciaalves.javasamples.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	void imprimirOla(String oqImprimir) throws RemoteException;
}
