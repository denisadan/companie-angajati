import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Companie companie = new Companie("SDA");
		
		Departament departamentMarketing = new Marketing();
		Departament departamentProductie = new Productie();
		Departament departamentHr = new Departament("HR", 5);
		
		List<Departament> departamente = new ArrayList<Departament>();
		departamente.add(departamentMarketing);
		departamente.add(departamentProductie);
		departamente.add(departamentHr);
		
		companie.setDepartamente(departamente);
		
		Candidat candidat1 = new Candidat("Pop", "Ionut", 10, "Marketing");
		Candidat candidat2 = new Candidat("Pop", "Andreea", 1, "Productie");
		Candidat candidat3 = new Candidat("Pop", "Andreea", 7, "Productie");
		Candidat candidat4 = new Candidat("Pop", "Andreea", 3, "HR");
		Candidat candidat5 = new Candidat("Pop", "Andreea", 3, "Productie");
		
		List<Candidat> candidati = new ArrayList<Candidat>();
		candidati.add(candidat1);
		candidati.add(candidat2);
		candidati.add(candidat3);
		candidati.add(candidat4);
		candidati.add(candidat5);
		
		companie.setAngajati(candidati);
		
		try {
			companie.recruteaza();
		} catch (IncapacitateEvaluare e) {
		}
		
		writeCandidatesToTxtFile(companie.getAngajati());
		writeCandidatesToJsonFile(companie.getAngajati());
		readCandidatesFromJsonFile(companie.getAngajati());
	}
	
	public static void writeCandidatesToTxtFile(List<Candidat> candidates) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("candidati.txt"));
			writer.write(candidates.toString());
		} catch (IOException e) {
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}
	}
	
	private static void writeCandidatesToJsonFile(List<Candidat> candidates) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("candidati.json"));
		String toPrint = new ObjectMapper().writeValueAsString(candidates);
		writer.write(toPrint);
		writer.close();
	}
	
	private static void readCandidatesFromJsonFile(List<Candidat> candidates) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String input = new String(Files.readAllBytes(Paths.get("candidati.json")));
		List<Candidat> candidati = objectMapper.readValue(input, objectMapper.getTypeFactory().constructCollectionType(List.class, Candidat.class));
		System.out.println(candidati);
	}
	
}
