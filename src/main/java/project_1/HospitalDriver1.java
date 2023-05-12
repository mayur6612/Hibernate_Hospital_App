package project_1;

import java.util.ArrayList; 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class HospitalDriver1 {

public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mayur");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital1 hospital=new Hospital1();
		hospital.setId(1);
		hospital.setName("Apollo Hospitals");
		hospital.setCeo("Dr.Prathap Reddy");
		
		Branches branch1=new Branches();
		branch1.setId(1);
		branch1.setName("Deccan Pune");
		branch1.setManager("Salman khan");
		
		
		
		List<Branches> branches=new ArrayList<Branches>();
		branches.add(branch1);
		
		
		
		hospital.setBranches(branches);
		
		Address address1=new Address();
		address1.setId(1);
		address1.setLocation("Deccan Pune");
		address1.setLandmark("street7");
		address1.setPincode(566788);
		
		
		
		branch1.setAddress(address1);
		
		Patients patient1=new Patients();
		patient1.setId(1);
		patient1.setName("Ajay");
		patient1.setAge(20);
		patient1.setGender("Male");
		patient1.setBloodgroup("O Negative");
		
		
		List<Patients> patients=new ArrayList<Patients>();
		patients.add(patient1);
		
		
		branch1.setPatients(patients);
		
		
		
		Diseases disease1=new Diseases();
		disease1.setId(1);
		disease1.setDisease_name("Corona");
		disease1.setSymptoms("Cough,high fever ,cold");
		
		
		
		List<Diseases> diseases=new ArrayList<Diseases>();
		diseases.add(disease1);
		
		patient1.setDiseases(diseases);
		
		disease1.setPatients(patients);
		
		
		Encounter encounter1=new Encounter();
		encounter1.setId(1);
		encounter1.setPname("Ajay");
		encounter1.setDate("20/8/2022");
		encounter1.setLast_in("25/8/2022");
		encounter1.setLast_out("25/8/2022");
		
		
		
		List<Encounter> encounters=new ArrayList<Encounter>();
		encounters.add(encounter1);
		
		patient1.setEncounters(encounters);
		
		et.begin();
		
		em.persist(hospital);
		em.persist(branch1);
		em.persist(address1);
		em.persist(patient1);
		em.persist(disease1);
		em.persist(encounter1);
		
		et.commit();
		
	}
}
