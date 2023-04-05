package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 15 "ce204-hw2-organization-lib-2.ump"
// line 90 "ce204-hw2-organization-lib-2.ump"
public class Ward
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum Gender { Male, Female }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ward Attributes
  private String name;
  private Gender patientsGender;
  private int capacity;

  //Ward Associations
  private Hospital hospital;
  private List<Patient> patients;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Ward 
   * @param [in] aName [\b String]
   * @param [in] aPatientsGender [\b Gender]
   * @param [in] aCapacity [\b int]
   * @param [in] aHospital [\b Hospital]
   **/
  public Ward(String aName, Gender aPatientsGender, int aCapacity, Hospital aHospital)
  {
    name = aName;
    patientsGender = aPatientsGender;
    capacity = aCapacity;
    boolean didAddHospital = setHospital(aHospital);
    if (!didAddHospital)
    {
      throw new RuntimeException("Unable to create ward due to hospital. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    patients = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  /**
   * @name setName 
   * @param [in] aName [\b String]
   * @retval [\b boolean]
   **/
  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setPatientsGender 
   * @param [in] aPatientsGender [\b Gender]
   * @retval [\b boolean]
   **/
  public boolean setPatientsGender(Gender aPatientsGender)
  {
    boolean wasSet = false;
    patientsGender = aPatientsGender;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setCapacity 
   * @param [in] aCapacity [\b int]
   * @retval [\b boolean]
   **/
  public boolean setCapacity(int aCapacity)
  {
    boolean wasSet = false;
    capacity = aCapacity;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name getName 
   * @retval [\b String]
   **/
  public String getName()
  {
    return name;
  }

  /**
   * @name getPatientsGender 
   * @retval [\b Gender]
   **/
  public Gender getPatientsGender()
  {
    return patientsGender;
  }

  /**
   * @name getCapacity 
   * @retval [\b int]
   **/
  public int getCapacity()
  {
    return capacity;
  }
  /* Code from template association_GetOne */
  public Hospital getHospital()
  {
    return hospital;
  }
  /* Code from template association_GetMany */
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }

  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }

  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }

  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }

  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
  /* Code from template association_SetOneToMany */
  public boolean setHospital(Hospital aHospital)
  {
    boolean wasSet = false;
    if (aHospital == null)
    {
      return wasSet;
    }

    Hospital existingHospital = hospital;
    hospital = aHospital;
    if (existingHospital != null && !existingHospital.equals(aHospital))
    {
      existingHospital.removeWard(this);
    }
    hospital.addWard(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
 
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    Ward existingWard = aPatient.getWard();
    boolean isNewWard = existingWard != null && !this.equals(existingWard);
    if (isNewWard)
    {
      aPatient.setWard(this);
    }
    else
    {
      patients.add(aPatient);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    //Unable to remove aPatient, as it must always have a ward
    if (!this.equals(aPatient.getWard()))
    {
      patients.remove(aPatient);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPatientAt(Patient aPatient, int index)
  {  
    boolean wasAdded = false;
    if(addPatient(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePatientAt(Patient aPatient, int index)
  {
    boolean wasAdded = false;
    if(patients.contains(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientAt(aPatient, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Hospital placeholderHospital = hospital;
    this.hospital = null;
    if(placeholderHospital != null)
    {
      placeholderHospital.removeWard(this);
    }
    for(int i=patients.size(); i > 0; i--)
    {
      Patient aPatient = patients.get(i - 1);
      aPatient.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "capacity" + ":" + getCapacity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "patientsGender" + "=" + (getPatientsGender() != null ? !getPatientsGender().equals(this)  ? getPatientsGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "hospital = "+(getHospital()!=null?Integer.toHexString(System.identityHashCode(getHospital())):"null");
  }
}