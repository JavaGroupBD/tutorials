package com.zaghir.project.hellocucumber.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.util.stream.Collectors.toList;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Contrat;

public class FactoryContrat {
	
	public static List<Contrat> listContrat = new ArrayList<>();
	public static void createContrat(Abonne abonne ) {
				
		listContrat.add(
				new  Contrat(
						new Random().nextInt(7),
						abonne.getId(),
						abonne.getAdresse())
				);
		listContrat.add(
				new  Contrat(
						new Random().nextInt(7),
						abonne.getId(),
						abonne.getAdresse())
				);
		listContrat.add(
				new  Contrat(
						new Random().nextInt(7),
						abonne.getId(),
						abonne.getAdresse())
				);		
		
	}
	
	public static List<Contrat> getListContratAbonne(Abonne abonne ){
		
		List<Contrat> list = listContrat.stream()
				.filter(contrat -> contrat.getIdAbonne().equals(abonne.getId()))
				.collect(toList());
		return list ;
	}

}
