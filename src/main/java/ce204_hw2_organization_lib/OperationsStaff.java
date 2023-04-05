package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 65 "ce204-hw2-Organization-lib.ump"
// line 181 "ce204-hw2-Organization-lib.ump"
public class OperationsStaff extends Staff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //OperationsStaff Associations
  private List<Patient> patients;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name OperationsStaff 
   * @param [in] aTitle [\b String]
   * @param [in] aGivenName [\b String]
   * @param [in] aMiddleName [\b String]
   * @param [in] aFamilyName [\b String]
   * @param [in] aName [\b FullName]
   * @param [in] aBirthDate [\b String]
   * @param [in] aGender [\b Gender]
   * @param [in] aHomeAddress [\b Address]
   * @param [in] aPhone [\b Phone]
   * @param [in] aJoined [\b String]
   * @param [in] aDepartment [\b Department]
   * returns the value
   **/
  public OperationsStaff(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined, Department aDepartment)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, aDepartment);
    patients = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  /**
   * @name getPatient 
   * @param [in] index [\b int]
   * @retval [\b Patient]
   * returns the value
   **/
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }
  /**
   * @name getPatients 
   * @retval [\b List<Patient>]
   * returns the value
   **/
  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }
  /**
   * @name numberOfPatients
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }
  /**
   * @name hasPatients 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }
  /**
   * @name indexOfPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfPatients 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    patients.add(aPatient);
    if (aPatient.indexOfOperationsStaff(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatient.addOperationsStaff(this);
      if (!wasAdded)
      {
        patients.remove(aPatient);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  /**
   * @name removePatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    if (!patients.contains(aPatient))
    {
      return wasRemoved;
    }

    int oldIndex = patients.indexOf(aPatient);
    patients.remove(oldIndex);
    if (aPatient.indexOfOperationsStaff(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatient.removeOperationsStaff(this);
      if (!wasRemoved)
      {
        patients.add(oldIndex,aPatient);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addPatientAt 
   * @param [in] aPatient [\b Patient]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
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
  /**
   * @name addOrMovePatientAt 
   * @param [in] aPatient [\b Patient]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
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
    ArrayList<Patient> copyOfPatients = new ArrayList<Patient>(patients);
    patients.clear();
    for(Patient aPatient : copyOfPatients)
    {
      aPatient.removeOperationsStaff(this);
    }
    super.delete();
  }

}