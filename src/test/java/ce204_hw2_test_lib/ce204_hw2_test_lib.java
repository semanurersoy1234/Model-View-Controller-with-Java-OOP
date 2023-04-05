package ce204_hw2_test_lib;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import ce204_hw2_organization_lib.*;
import ce204_hw2_organization_lib.Address;
import ce204_hw2_organization_lib.Doctor;
import ce204_hw2_organization_lib.History;
import ce204_hw2_organization_lib.Hospital;
import ce204_hw2_organization_lib.Patient;
import ce204_hw2_organization_lib.Person.Gender;
import ce204_hw2_organization_lib.Phone;

public class ce204_hw2_test_lib {

	@Test
	public void titlePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("Dr.",person.getTitle());
	}
	@Test
	public void titlePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setTitle("Prof.");
		String result = person.getTitle();
		assertEquals("Prof.",result);
	}
	
	@Test
	public void givenNamePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("Bedirhan",person.getGivenName());
	}
	@Test
	public void givenNamePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setGivenName("Sema");
		String result = person.getGivenName();
		assertEquals("Sema",result);
	}
	
	@Test
	public void middleNamePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("",person.getMiddleName());
	}
	@Test
	public void middleNamePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setMiddleName("Nur");
		String result = person.getMiddleName();
		assertEquals("Nur",result);
	}
	
	@Test
	public void familyNamePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("Özçelik",person.getFamilyName());
	}
	@Test
	public void familyNamePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setFamilyName("Ersoy");
		String result = person.getFamilyName();
		assertEquals("Ersoy",result);
	}
	
	@Test
	public void fullNamePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("Bedirhan Özçelik",person.getNamee());
	}
	@Test
	public void fullNamePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setName("Sema Nur Ersoy");
		String result = person.getNamee();
		assertEquals("Sema Nur Ersoy",result);
	}
	
	@Test
	public void datePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("22.08.2002",person.getBirthDate());
	}
	@Test
	public void datePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setBirthDate("26.02.2002");
		String result = person.getBirthDate();
		assertEquals("26.02.2002",result);
	}
	
	@Test
	public void genderPerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals(Gender.Male,person.getGender());
	}
	@Test
	public void genderPerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setGender(gender);
		Gender result = person.getGender();
		assertEquals(Gender.Female,result);
	}
	
	@Test
	public void homeAddressPerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("Trabzon/Fatih",person.getHomeAddresses());
	}
	@Test
	public void homeAddressPerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setHomeAddress("Trabzon/Yomra");
		String result = person.getHomeAddresses();
		assertEquals("Trabzon/Yomra",result);
	}
	
	@Test
	public void phonePerson_getTest() {
		FullName fullname = new FullName("Bedirhan Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Fatih");
		Phone phone = new Phone("05063623676"); 
		Person person = new Person("Dr.","Bedirhan","","Özçelik",fullname,"22.08.2002",gender,address,phone);
		assertEquals("05063623676",person.getPhonee());
	}
	@Test
	public void phonePerson_setTest() {
		FullName fullname = new FullName("Sema Nur Ersoy");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05358219661"); 
		Person person = new Person("Prof.","Sema","Nur","Ersoy",fullname,"26.02.2002",gender,address,phone);
		person.setPhone("05358219661");
		String result = person.getPhonee();
		assertEquals("05358219661",result);
	}
	
	@Test
	public void nameHospital_getTest() {
		Address address = new Address("Trabzon/Yenimahalle");
		Phone phone = new Phone("04622291247"); 
		Hospital hospital = new Hospital("Numune Hastanesi",address,phone);
		assertEquals("Numune Hastanesi", hospital.getName());
	}
	@Test
	public void nameHospital_setTest() {
		Address address = new Address("Trabzon/Aydınlıkevler");
		Phone phone = new Phone("04622234568"); 
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		hospital.setName("MedicalPark Hastanesi");
		String result = hospital.getName();
		assertEquals("MedicalPark Hastanesi",result);
	}
	
	@Test
	public void addressHospital_getTest() {
		Address address = new Address("Trabzon/Yenimahalle");
		Phone phone = new Phone("04622291247"); 
		Hospital hospital = new Hospital("Numune Hastanesi",address,phone);
		assertEquals("Trabzon/Yenimahalle", hospital.getAddresses());
	}
	@Test
	public void addressHospital_setTest() {
		Address address = new Address("Trabzon/Aydınlıkevler");
		Phone phone = new Phone("04622234568"); 
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		hospital.setAddress("Trabzon/Aydınlıkevler");
		String result = hospital.getAddresses();
		assertEquals("Trabzon/Aydınlıkevler",result);
	}
	
	@Test
	public void phoneHospital_getTest() {
		Address address = new Address("Trabzon/Yenimahalle");
		Phone phone = new Phone("04622291247"); 
		Hospital hospital = new Hospital("Numune Hastanesi",address,phone);
		assertEquals("04622291247", hospital.getPhonee());
	}
	@Test
	public void phoneHospital_setTest() {
		Address address = new Address("Trabzon/Aydınlıkevler");
		Phone phone = new Phone("04622234568"); 
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		hospital.setPhone("04622234568");
		String result = hospital.getPhonee();
		assertEquals("04622234568",result);
	}
	
	@Test
	public void idPatient_getTest() {
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		assertEquals("081",patient.getİd());
	}
	@Test
	public void idPatient_setTest() {
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setİd("001");
		String result = patient.getİd();
		assertEquals("001",result);
	}
	
	@Test
	public void agePatient_getTest() {
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		assertEquals(5,patient.getAge());
	}
	@Test
	public void agePatient_setTest() {
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setAge(63);
		int result = patient.getAge();
		assertEquals(63,result);
	}
	
	@Test
	public void accaptedPatient_getTest() {
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		assertEquals("25.09.2020",patient.getAccepted());
	}
	@Test
	public void accaptedPatient_setTest() {
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setAccepted("15.04.2019");
		String result = patient.getAccepted();
		assertEquals("15.04.2019",result);
	}
	
	@Test
	public void sicknessPatient_getTest() {
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		assertEquals("Hepatit-B",patient.getSicknesses());
	}
	@Test
	public void sicknessPatient_setTest() {
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setSickness("Grip");
		String result = patient.getSicknesses();
		assertEquals("Grip",result);
	}

	@Test
	public void prescriptionsPatient_Test() {
		String[] prescriptions = {"Parol","Dolorex"};
		List<String>prescriptionsList = Arrays.asList(prescriptions);
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		patient.setPrescription(prescriptionsList);
		List<String>patientPrescriptions = Arrays.asList(patient.getPrescriptions());
		assertEquals(prescriptionsList,patientPrescriptions);
	}
	@Test
	public void prescriptionsPatient_Test2() {
		String[] prescriptions = {"Klamoks","Augmentin"};
		List<String>prescriptionsList = Arrays.asList(prescriptions);
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setPrescription(prescriptionsList);
		List<String>patientPrescriptions = Arrays.asList(patient.getPrescriptions());
		assertEquals(prescriptionsList,patientPrescriptions);
	}
	
	@Test
	public void allergiesPatient_Test() {
		String[] allergies = {"Polen","Toz","Güneş"};
		List<String>allergiesList = Arrays.asList(allergies);
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		patient.setAllergy(allergiesList);
		List<String>patientAllergies = Arrays.asList(patient.getAllergies());
		assertEquals(allergiesList,patientAllergies);
	}
	@Test
	public void allergiesPatient_Test2() {
		String[] allergies = {"Çiçek","Arı","İlaç"};
		List<String>allergiesList = Arrays.asList(allergies);
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setAllergy(allergiesList);
		List<String>patientAllergies = Arrays.asList(patient.getAllergies());
		assertEquals(allergiesList,patientAllergies);
	}
	
	@Test
	public void specialReqsPatient_Test() {
		String[] specialReqs = {"Yemek","İçeçek"};
		List<String>specialRegsList = Arrays.asList(specialReqs);
		FullName fullname = new FullName("Ahmet Emir Özçelik");
		Gender gender = Gender.Male;
		Address address = new Address("Trabzon/Beşirli");
		Phone phone = new Phone("05358175861"); 
		History history = new History("Hepatit-B");
		Patient patient = new Patient("","Ahmet","Emir","Özçelik",fullname,"19.07.2017",gender,address,phone,"081",5,"25.09.2020",history);
		patient.setSpecialReq(specialRegsList);
		List<String>patientSpecialRegs = Arrays.asList(patient.getSpecialReqs());
		assertEquals(specialRegsList,patientSpecialRegs);
	}
	@Test
	public void specialReqsPatient_Test2() {
		String[] specialReqs = {"Yemek","Kıyafet"};
		List<String>specialRegsList = Arrays.asList(specialReqs);
		FullName fullname = new FullName("Recep Tayyip Erdoğan");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Kasımpaşa");
		Phone phone = new Phone("05350534753"); 
		History history= new History("Grip");
		Patient patient = new Patient("Reis","Recep","Tayyip","Erdoğan",fullname,"26.02.1960",gender,address,phone,"001",63,"15.04.2019",history);
		patient.setSpecialReq(specialRegsList);
		List<String>patientSpecialRegs = Arrays.asList(patient.getSpecialReqs());
		assertEquals(specialRegsList,patientSpecialRegs);
	}
	
	@Test
	public void joinedStaff_getTest() {
		FullName fullname = new FullName("Nurgül Rümeysa Er");
		Gender gender = Gender.Female;
		Address address = new Address("Kahramanmaraş/Elbistan");
		Phone phone = new Phone("05443616566");
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Doç","Nurgül","Rümeysa","Er",fullname,"27.12.2001",gender,address,phone,"21.05.2018",department);
		assertEquals("21.05.2018",staff.getJoined());
	}
	@Test
	public void joinedStaff_setTest() {
		FullName fullname = new FullName("Melek Şahin");
		Gender gender = Gender.Female;
		Address address = new Address("Ankara/Mamak");
		Phone phone = new Phone("05443566526");
		Hospital hospital = new Hospital("Acıbadem Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("","Melek","","Şahin",fullname,"14.05.2011",gender,address,phone,"18.11.2008",department);
		staff.setJoined("18.11.2008");
		String result = staff.getJoined();
		assertEquals("18.11.2008",result);
	}
	
	@Test
	public void educationStaff_Test() {
		String[] educations = {"Üniversite Mezunu","Doktora"};
		List<String>educationList = Arrays.asList(educations);
		FullName fullname = new FullName("Nurgül Rümeysa Er");
		Gender gender = Gender.Female;
		Address address = new Address("Kahramanmaraş/Elbistan");
		Phone phone = new Phone("05443616566");
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Doç","Nurgül","Rümeysa","Er",fullname,"27.12.2001",gender,address,phone,"21.05.2018",department);
		staff.setEducation(educationList);
		List<String>staffEducations = Arrays.asList(staff.getEducation());
		assertEquals(educationList,staffEducations);
	}
	@Test
	public void educationStaff_Test2() {
		String[] educations = {"Lise Mezunu"};
		List<String>educationList = Arrays.asList(educations);
		FullName fullname = new FullName("Melek Şahin");
		Gender gender = Gender.Female;
		Address address = new Address("Ankara/Mamak");
		Phone phone = new Phone("05443566526");
		Hospital hospital = new Hospital("Acıbadem Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("","Melek","","Şahin",fullname,"14.05.2011",gender,address,phone,"18.11.2008",department);
		staff.setEducation(educationList);
		List<String>staffEducations = Arrays.asList(staff.getEducation());
		assertEquals(educationList,staffEducations);
	}
	
	@Test
	public void certificationStaff_Test() {
		String[] certifications = {"Yazılım","Bilişim"};
		List<String>certificationList = Arrays.asList(certifications);
		FullName fullname = new FullName("Nurgül Rümeysa Er");
		Gender gender = Gender.Female;
		Address address = new Address("Kahramanmaraş/Elbistan");
		Phone phone = new Phone("05443616566");
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Doç","Nurgül","Rümeysa","Er",fullname,"27.12.2001",gender,address,phone,"21.05.2018",department);
		staff.setCertification(certificationList);
		List<String>staffCertifications = Arrays.asList(staff.getCertification());
		assertEquals(certificationList,staffCertifications);
	}
	@Test
	public void certificationStaff_Test2() {
		String[] certifications = {"Html&Css","Bootstrap"};
		List<String>certificationList = Arrays.asList(certifications);
		FullName fullname = new FullName("Melek Şahin");
		Gender gender = Gender.Female;
		Address address = new Address("Ankara/Mamak");
		Phone phone = new Phone("05443566526");
		Hospital hospital = new Hospital("Acıbadem Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("","Melek","","Şahin",fullname,"14.05.2011",gender,address,phone,"18.11.2008",department);
		staff.setCertification(certificationList);
		List<String>staffCertifications = Arrays.asList(staff.getCertification());
		assertEquals(certificationList,staffCertifications);
	}
	
	@Test
	public void languagesStaff_Test() {
		String[] languages = {"Türkçe","İngilizce"};
		List<String>languageList = Arrays.asList(languages);
		FullName fullname = new FullName("Nurgül Rümeysa Er");
		Gender gender = Gender.Female;
		Address address = new Address("Kahramanmaraş/Elbistan");
		Phone phone = new Phone("05443616566");
		Hospital hospital = new Hospital("MedicalPark Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Doç","Nurgül","Rümeysa","Er",fullname,"27.12.2001",gender,address,phone,"21.05.2018",department);
		staff.setLanguage(languageList);
		List<String>staffLanguages = Arrays.asList(staff.getLanguages());
		assertEquals(languageList,staffLanguages);
	}
	@Test
	public void languagesStaff_Test2() {
		String[] languages = {"Türkçe","Almanca"};
		List<String>languageList = Arrays.asList(languages);
		FullName fullname = new FullName("Melek Şahin");
		Gender gender = Gender.Female;
		Address address = new Address("Ankara/Mamak");
		Phone phone = new Phone("05443566526");
		Hospital hospital = new Hospital("Acıbadem Hastanesi",address,phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("","Melek","","Şahin",fullname,"14.05.2011",gender,address,phone,"18.11.2008",department);
		staff.setLanguage(languageList);
		List<String>staffLanguages = Arrays.asList(staff.getLanguages());
		assertEquals(languageList,staffLanguages);
	}
	
	@Test
	public void specialtyDoctor_Test() {
		String[] specialties = {"Göz","Dahiliye"};
		List<String>specialtyList = Arrays.asList(specialties);
		FullName fullname = new FullName("Ali Fuat Atmaca");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Tuzla");
		Phone phone = new Phone("05323459526");
		Hospital hospital = new Hospital("Imperial Hastanesi",address,phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Prof","Ali","Fuat","Atmaca",fullname,"24.04.1975",gender,address,phone,"30.05.2017",department);
		doctor.setSpecialty(specialtyList);
		List<String>doctorSpecialties = Arrays.asList(doctor.getSpecialty());
		assertEquals(specialtyList,doctorSpecialties);
	}
	@Test
	public void specialtyDoctor_Test2() {
		String[] specialties = {"Kalp","Cildiye"};
		List<String>specialtyList = Arrays.asList(specialties);
		FullName fullname = new FullName("Banu Çiftçi");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05353489537");
		Hospital hospital = new Hospital("Kaşüstü Hastanesi",address,phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Dr.","Banu","","Çiftçi",fullname,"15.08.1985",gender,address,phone,"17.07.2020",department);
		doctor.setSpecialty(specialtyList);
		List<String>doctorSpecialties = Arrays.asList(doctor.getSpecialty());
		assertEquals(specialtyList,doctorSpecialties);
	}
	
	@Test
	public void locationsDoctor_Test() {
		String[] locations = {"Ankara","İzmir"};
		List<String>locationsList = Arrays.asList(locations);
		FullName fullname = new FullName("Ali Fuat Atmaca");
		Gender gender = Gender.Male;
		Address address = new Address("İstanbul/Tuzla");
		Phone phone = new Phone("05323459526");
		Hospital hospital = new Hospital("Imperial Hastanesi",address,phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Prof","Ali","Fuat","Atmaca",fullname,"24.04.1975",gender,address,phone,"30.05.2017",department);
		doctor.setLocation(locationsList);
		List<String>doctorLocations = Arrays.asList(doctor.getLocations());
		assertEquals(locationsList,doctorLocations);
	}
	@Test
	public void locationsDoctor_Test2() {
		String[] locations = {"Trabzon","İstanbul"};
		List<String>locationsList = Arrays.asList(locations);
		FullName fullname = new FullName("Banu Çiftçi");
		Gender gender = Gender.Female;
		Address address = new Address("Trabzon/Yomra");
		Phone phone = new Phone("05353489537");
		Hospital hospital = new Hospital("Kaşüstü Hastanesi",address,phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Dr.","Banu","","Çiftçi",fullname,"15.08.1985",gender,address,phone,"17.07.2020",department);
		doctor.setLocation(locationsList);
		List<String>doctorLocations = Arrays.asList(doctor.getLocations());
		assertEquals(locationsList,doctorLocations);
	}

	//start wards and teams
	@Test
	public void namesHospital_getTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		assertEquals("Karadeniz Hastanesi",hospital.getName());
	}
	@Test
	public void namesHospital_setTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		hospital.setName("Kanuni Hastanesi");
		String result = hospital.getName();
		assertEquals("Kanuni Hastanesi",result);
	}
	
	@Test
	public void addressesHospital_getTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		assertEquals("Trabzon/Moloz",hospital.getAddresses());
	}
	@Test
	public void addressesHospital_setTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		hospital.setAddress("Ankara/Gölbaşı");
		String result = hospital.getAddresses();
		assertEquals("Ankara/Gölbaşı",result);
	}
	
	@Test
	public void phonesHospital_getTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		assertEquals("04622141647",hospital.getPhonee());
	}
	@Test
	public void phonesHospital_setTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		hospital.setPhone("04621842647");
		String result = hospital.getPhonee();
		assertEquals("04621842647",result);
	}
	
	@Test
	public void nameTeam_getTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("ÖZER Yazılım",hospital,consultantDoctor);
		assertEquals("ÖZER Yazılım",team.getName());
	}
	@Test
	public void nameTeam_setTest() {
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		team.setName("Hak Yazılım");
		String result = team.getName();
		assertEquals("Hak Yazılım",result);
	}
	
	@Test
	public void nameWard_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", gender, 20, hospital);
		assertEquals("Ay Yıldız",ward.getName());
	}
	@Test
	public void nameWard_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ersoy Software", gender, 40, hospital);
		ward.setName("Ersoy Software");
		String result = ward.getName();
		assertEquals("Ersoy Software",result);
	}
	
	@Test
	public void patientsGenderWard_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ersoy Software", gender, 40, hospital);
		assertEquals(ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female,ward.getPatientsGender());
	}
	@Test
	public void patientsGenderWard_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", gender, 20, hospital);
		ward.setPatientsGender(gender);
		ce204_hw2_WardsAndTeams_lib.Ward.Gender result = ward.getPatientsGender();
		assertEquals(ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male,result);
	}
	
	@Test
	public void capacityWard_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Moloz");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04622141647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Karadeniz Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ersoy Software", gender, 40, hospital);
		assertEquals(40,ward.getCapacity());
	}
	@Test
	public void capacityWard_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender gender = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", gender, 20, hospital);
		ward.setCapacity(20);
		int result = ward.getCapacity();
		assertEquals(20,result);
	}
	
	@Test
	public void specialtiesDoctor_Test() {
		String[] specialties = {"Beyin","Dahiliye"};
		List<String>specialtyList = Arrays.asList(specialties);
		ce204_hw2_WardsAndTeams_lib.Doctor doctor = new ce204_hw2_WardsAndTeams_lib.Doctor();
		doctor.setSpecialty(specialtyList);
		List<String>doctorSpecialties = Arrays.asList(doctor.getSpecialty());
		assertEquals(specialtyList,doctorSpecialties);
	}
	@Test
	public void specialtiesDoctor_Test2() {
		String[] specialties = {"Göz","Kulak Burun Boğaz"};
		List<String>specialtyList = Arrays.asList(specialties);
		ce204_hw2_WardsAndTeams_lib.Doctor doctor = new ce204_hw2_WardsAndTeams_lib.Doctor();
		doctor.setSpecialty(specialtyList);
		List<String>doctorSpecialties = Arrays.asList(doctor.getSpecialty());
		assertEquals(specialtyList,doctorSpecialties);
	}
	
	@Test
	public void locationDoctor_Test() {
		String[] locations = {"Muğla","Rize"};
		List<String>locationList = Arrays.asList(locations);
		ce204_hw2_WardsAndTeams_lib.Doctor doctor = new ce204_hw2_WardsAndTeams_lib.Doctor();
		doctor.setLocation(locationList);
		List<String>doctorLocations = Arrays.asList(doctor.getLocations());
		assertEquals(locationList,doctorLocations);
	}
	@Test
	public void locationDoctor_Test2() {
		String[] locations = {"Edirne","Bursa"};
		List<String>locationList = Arrays.asList(locations);
		ce204_hw2_WardsAndTeams_lib.Doctor doctor = new ce204_hw2_WardsAndTeams_lib.Doctor();
		doctor.setLocation(locationList);
		List<String>doctorLocations = Arrays.asList(doctor.getLocations());
		assertEquals(locationList,doctorLocations);
	}
	
	@Test
	public void idPatients_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		assertEquals("061",patient.getİd());
	}
	@Test
	public void idPatients_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setİd("123");
		String result = patient.getİd();
		assertEquals("123",result);
	}
	
	@Test
	public void genderPatients_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		assertEquals(ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male, patient.getGender());
	}
	@Test
	public void genderPatients_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setGender(gender);
		ce204_hw2_WardsAndTeams_lib.Patient.Gender result = patient.getGender();
		assertEquals(ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female, result);
	}
	
	@Test
	public void agePatients_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		assertEquals(38,patient.getAge());
	}
	@Test
	public void agePatients_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setAge(23);
		int result = patient.getAge();
		assertEquals(23,result);
	}
	
	@Test
	public void acceptedPatients_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		assertEquals("22.04.2021",patient.getAccepted());
	}
	@Test
	public void acceptedPatients_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setAccepted("12.04.2012");
		String result = patient.getAccepted();
		assertEquals("12.04.2012",result);
	}
	
	@Test
	public void sicknessPatients_getTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		assertEquals("Kızamık",patient.getSicknesses());
	}
	@Test
	public void sicknessPatients_setTest() {
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setSickness("Ateş");
		String result = patient.getSicknesses();
		assertEquals("Ateş",result);
	}
	
	@Test
	public void prescriptionsPatients_Test() {
		String[] prescriptions = {"İliadin","Dolorex"};
		List<String>prescriptionsList = Arrays.asList(prescriptions);	
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		patient.setPrescription(prescriptionsList);
		List<String>patientPrescriptions = Arrays.asList(patient.getPrescriptions());
		assertEquals(prescriptionsList,patientPrescriptions);
	}
	@Test
	public void prescriptionsPatients_Test2() {
		String[] prescriptions = {"Dexday","Bacoderm"};
		List<String>prescriptionsList = Arrays.asList(prescriptions);	
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setPrescription(prescriptionsList);
		List<String>patientPrescriptions = Arrays.asList(patient.getPrescriptions());
		assertEquals(prescriptionsList,patientPrescriptions);
	}
	
	@Test
	public void allergiesPatients_Test() {
		String[] allergies = {"Çiçek","Arı","İlaç"};
		List<String>allergiesList = Arrays.asList(allergies);
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		patient.setAllergy(allergiesList);
		List<String>patientAllergies = Arrays.asList(patient.getAllergies());
		assertEquals(allergiesList,patientAllergies);
	}
	@Test
	public void allergiesPatients_Test2() {
		String[] allergies = {"Toz","Polen","Güneş"};
		List<String>allergiesList = Arrays.asList(allergies);
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setAllergy(allergiesList);
		List<String>patientAllergies = Arrays.asList(patient.getAllergies());
		assertEquals(allergiesList,patientAllergies);
	}
	
	@Test
	public void specialReqsPatients_Test() {
		String[] specialReqs = {"Yemek","İçeçek"};
		List<String>specialRegsList = Arrays.asList(specialReqs);
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Male;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Kızamık");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Ankara/Gölbaşı");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("061", gender, 38, "22.04.2021", history, ward, team);
		patient.setSpecialReq(specialRegsList);
		List<String>patientSpecialRegs = Arrays.asList(patient.getSpecialReqs());
		assertEquals(specialRegsList,patientSpecialRegs);
	}
	@Test
	public void specialReqsPatients_Test2() {
		String[] specialReqs = {"Yemek","Kıyafet"};
		List<String>specialRegsList = Arrays.asList(specialReqs);
		ce204_hw2_WardsAndTeams_lib.Ward.Gender genders = ce204_hw2_WardsAndTeams_lib.Ward.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.Patient.Gender gender = ce204_hw2_WardsAndTeams_lib.Patient.Gender.Female;
		ce204_hw2_WardsAndTeams_lib.History history = new ce204_hw2_WardsAndTeams_lib.History("Ateş");
		ce204_hw2_WardsAndTeams_lib.Address address = new ce204_hw2_WardsAndTeams_lib.Address("Trabzon/Kurankursu");
		ce204_hw2_WardsAndTeams_lib.Phone phone = new ce204_hw2_WardsAndTeams_lib.Phone("04621842647"); 
		ce204_hw2_WardsAndTeams_lib.Hospital hospital = new ce204_hw2_WardsAndTeams_lib.Hospital("Kanuni Hastanesi",address,phone);
		ce204_hw2_WardsAndTeams_lib.Ward ward = new ce204_hw2_WardsAndTeams_lib.Ward("Ay Yıldız", genders, 20, hospital);
		ce204_hw2_WardsAndTeams_lib.ConsultantDoctor consultantDoctor = new ce204_hw2_WardsAndTeams_lib.ConsultantDoctor();
		ce204_hw2_WardsAndTeams_lib.Team team = new ce204_hw2_WardsAndTeams_lib.Team("Hak Yazılım",hospital,consultantDoctor);
		ce204_hw2_WardsAndTeams_lib.Patient patient = new ce204_hw2_WardsAndTeams_lib.Patient("123", gender, 23, "12.04.2012", history, ward, team);
		patient.setSpecialReq(specialRegsList);
		List<String>patientSpecialRegs = Arrays.asList(patient.getSpecialReqs());
		assertEquals(specialRegsList,patientSpecialRegs);
	}
}