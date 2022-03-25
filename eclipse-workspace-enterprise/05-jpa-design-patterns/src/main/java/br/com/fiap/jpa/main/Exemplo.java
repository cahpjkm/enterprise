package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {
	public static void main(String[] args) {
		//obter uma fabrica de entity manager
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		
		fabrica.close();
	}
}
