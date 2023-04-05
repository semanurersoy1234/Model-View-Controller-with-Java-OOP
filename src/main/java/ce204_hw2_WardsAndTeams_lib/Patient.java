package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
import java.util.*;

// line 32 "ce204-hw2-organization-lib-2.ump"
// line 103 "ce204-hw2-organization-lib-2.ump"
public class Patient
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------
	
 public enum Gender { Male, Female }	
  //Patient Attributes
  private String id;
  private Gender gender;
  private int age;
  private String accepted;
  private History sickness;
  private List<String> prescriptions;
  private List<String> allergies;
  private List<String> specialReqs;

  //Patient Associations
  private Ward ward;
  private Team team;
  private List<Doctor> doctors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Patient 
   * @param [in] aİd [\b String]
   * @param [in] aGender [\b Gender]
   * @param [in] aAge [\b int]
   * @param [in] aAccepted [\b String]
   * @param [in] aSickness [\b History]
   * @param [in] aWard [\b Ward]
   * @param [in] aTeam [\b Team]
   * @retval [\b boolean]
   **/
  public Patient(String aİd, Gender aGender, int aAge, String aAccepted, History aSickness, Ward aWard, Team aTeam)
  {
    id = aİd;
    gender = aGender;
    age = aAge;
    accepted = aAccepted;
    sickness = aSickness;
    prescriptions = new ArrayList<String>();
    allergies = new ArrayList<String>();
    specialReqs = new ArrayList<String>();
    boolean didAddWard = setWard(aWard);
    if (!didAddWard)
    {
      throw new RuntimeException("Unable to create patient due to ward. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddTeam = setTeam(aTeam);
    if (!didAddTeam)
    {
      throw new RuntimeException("Unable to create patient due to team. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  /**
   * @name setİd 
   * @param [in] aİd [\b String]
   * @retval [\b boolean]
   **/
  public boolean setİd(String aİd)
  {
    boolean wasSet = false;
    id = aİd;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setGender 
   * @param [in] aGender [\b Gender]
   * @retval [\b boolean]
   **/
  public boolean setGender(Gender aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setAge 
   * @param [in] aAge [\b int]
   * @retval [\b boolean]
   **/
  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setAge 
   * @param [in] aAccepted [\b String]
   * @retval [\b boolean]
   **/
  public boolean setAccepted(String aAccepted)
  {
    boolean wasSet = false;
    accepted = aAccepted;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setSickness 
   * @param [in] aSickness [\b History]
   * @retval [\b boolean]
   **/
  public boolean setSickness(History aSickness)
  {
    boolean wasSet = false;
    sickness = aSickness;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean setPrescription(List<String> prescriptionsList)
  {
    boolean wasAdded = false;
    wasAdded = prescriptions.addAll(prescriptionsList);
    return wasAdded;
  }

  public boolean removePrescription(String aPrescription)
  {
    boolean wasRemoved = false;
    wasRemoved = prescriptions.remove(aPrescription);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean setAllergy(List<String> allergiesList)
  {
    boolean wasAdded = false;
    wasAdded = allergies.addAll(allergiesList);
    return wasAdded;
  }

  public boolean removeAllergy(String aAllergy)
  {
    boolean wasRemoved = false;
    wasRemoved = allergies.remove(aAllergy);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean setSpecialReq(List<String> specialRegsList)
  {
    boolean wasAdded = false;
    wasAdded = specialReqs.addAll(specialRegsList);
    return wasAdded;
  }

  public boolean removeSpecialReq(String aSpecialReq)
  {
    boolean wasRemoved = false;
    wasRemoved = specialReqs.remove(aSpecialReq);
    return wasRemoved;
  }

  /**
   * @name getİd 
   * @retval [\b String]
   **/
  public String getİd()
  {
    return id;
  }

  /**
   * @name getGender 
   * @retval [\b Gender]
   **/
  public Gender getGender()
  {
    return gender;
  }

  /**
   * @name getAge 
   * @retval [\b int]
   **/
  public int getAge()
  {
    return age;
  }

  /**
   * @name getAccepted 
   * @retval [\b getAccepted]
   **/
  public String getAccepted()
  {
    return accepted;
  }

  /**
   * @name getSickness 
   * @retval [\b History]
   **/
  public History getSickness()
  {
    return sickness;
  }
  
  public void setSickness(String Sickness) {
	  sickness.setSickness(Sickness);
  }
  public String getSicknesses() {
	  return sickness.getSickness();
  }
  
  /* Code from template attribute_GetMany */
  public String getPrescription(int index)
  {
    String aPrescription = prescriptions.get(index);
    return aPrescription;
  }

  public String[] getPrescriptions()
  {
    String[] newPrescriptions = prescriptions.toArray(new String[prescriptions.size()]);
    return newPrescriptions;
  }

  public int numberOfPrescriptions()
  {
    int number = prescriptions.size();
    return number;
  }

  public boolean hasPrescriptions()
  {
    boolean has = prescriptions.size() > 0;
    return has;
  }

  public int indexOfPrescription(String aPrescription)
  {
    int index = prescriptions.indexOf(aPrescription);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getAllergy(int index)
  {
    String aAllergy = allergies.get(index);
    return aAllergy;
  }

  public String[] getAllergies()
  {
    String[] newAllergies = allergies.toArray(new String[allergies.size()]);
    return newAllergies;
  }

  public int numberOfAllergies()
  {
    int number = allergies.size();
    return number;
  }

  public boolean hasAllergies()
  {
    boolean has = allergies.size() > 0;
    return has;
  }

  public int indexOfAllergy(String aAllergy)
  {
    int index = allergies.indexOf(aAllergy);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getSpecialReq(int index)
  {
    String aSpecialReq = specialReqs.get(index);
    return aSpecialReq;
  }

  public String[] getSpecialReqs()
  {
    String[] newSpecialReqs = specialReqs.toArray(new String[specialReqs.size()]);
    return newSpecialReqs;
  }

  public int numberOfSpecialReqs()
  {
    int number = specialReqs.size();
    return number;
  }

  public boolean hasSpecialReqs()
  {
    boolean has = specialReqs.size() > 0;
    return has;
  }

  public int indexOfSpecialReq(String aSpecialReq)
  {
    int index = specialReqs.indexOf(aSpecialReq);
    return index;
  }
  /* Code from template association_GetOne */
  public Ward getWard()
  {
    return ward;
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }
  /* Code from template association_GetMany */
  public Doctor getDoctor(int index)
  {
    Doctor aDoctor = doctors.get(index);
    return aDoctor;
  }

  public List<Doctor> getDoctors()
  {
    List<Doctor> newDoctors = Collections.unmodifiableList(doctors);
    return newDoctors;
  }

  public int numberOfDoctors()
  {
    int number = doctors.size();
    return number;
  }

  public boolean hasDoctors()
  {
    boolean has = doctors.size() > 0;
    return has;
  }

  public int indexOfDoctor(Doctor aDoctor)
  {
    int index = doctors.indexOf(aDoctor);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_doctors()
  {
    doctors.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  /* Code from template association_SetOneToMany */
  public boolean setWard(Ward aWard)
  {
    boolean wasSet = false;
    if (aWard == null)
    {
      return wasSet;
    }

    Ward existingWard = ward;
    ward = aWard;
    if (existingWard != null && !existingWard.equals(aWard))
    {
      existingWard.removePatient(this);
    }
    ward.addPatient(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setTeam(Team aTeam)
  {
    boolean wasSet = false;
    if (aTeam == null)
    {
      return wasSet;
    }

    Team existingTeam = team;
    team = aTeam;
    if (existingTeam != null && !existingTeam.equals(aTeam))
    {
      existingTeam.removePatient(this);
    }
    team.addPatient(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctors()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDoctor(Doctor aDoctor)
  {
    boolean wasAdded = false;
    if (doctors.contains(aDoctor)) { return false; }
    doctors.add(aDoctor);
    if (aDoctor.indexOfPatient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addPatient(this);
      if (!wasAdded)
      {
        doctors.remove(aDoctor);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDoctor(Doctor aDoctor)
  {
    boolean wasRemoved = false;
    if (!doctors.contains(aDoctor))
    {
      return wasRemoved;
    }

    int oldIndex = doctors.indexOf(aDoctor);
    doctors.remove(oldIndex);
    if (aDoctor.indexOfPatient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removePatient(this);
      if (!wasRemoved)
      {
        doctors.add(oldIndex,aDoctor);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDoctorAt(Doctor aDoctor, int index)
  {  
    boolean wasAdded = false;
    if(addDoctor(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDoctorAt(Doctor aDoctor, int index)
  {
    boolean wasAdded = false;
    if(doctors.contains(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorAt(aDoctor, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToMany_relatedSpecialization */
  public boolean setConsultantDoctor_ConsultantDoctor(ConsultantDoctor aConsultantDoctor)
  {
    boolean wasSet = false;
    if (aConsultantDoctor == null)
    {
      return wasSet;
    }

    ConsultantDoctor existingConsultantDoctor = getConsultantDoctor_OneConsultantDoctor();
    ConsultantDoctor consultantDoctor = aConsultantDoctor;
    if (existingConsultantDoctor != null && !existingConsultantDoctor.equals(aConsultantDoctor))
    {
      existingConsultantDoctor.removePatient(this);
    }
    consultantDoctor.addPatient(this);
    wasSet = true;
    return wasSet;
  }

  private ConsultantDoctor getConsultantDoctor_OneConsultantDoctor() {
	// TODO Auto-generated method stub
	return null;
}

public void delete()
  {
    Ward placeholderWard = ward;
    this.ward = null;
    if(placeholderWard != null)
    {
      placeholderWard.removePatient(this);
    }
    Team placeholderTeam = team;
    this.team = null;
    if(placeholderTeam != null)
    {
      placeholderTeam.removePatient(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removePatient(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getİd()+ "," +
            "age" + ":" + getAge()+ "," +
            "accepted" + ":" + getAccepted()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "gender" + "=" + (getGender() != null ? !getGender().equals(this)  ? getGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sickness" + "=" + (getSickness() != null ? !getSickness().equals(this)  ? getSickness().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "ward = "+(getWard()!=null?Integer.toHexString(System.identityHashCode(getWard())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "consultantDoctor = "+(getConsultantDoctor()!=null?Integer.toHexString(System.identityHashCode(getConsultantDoctor())):"null");
  }

private Object getConsultantDoctor() {
	// TODO Auto-generated method stub
	return null;
}
}