package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 24 "ce204-hw2-Organization-lib.ump"
// line 155 "ce204-hw2-Organization-lib.ump"
public class Patient extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Patient Attributes
  private String id;
  private int age;
  private String accepted;
  private History sickness;
  private List<String> prescriptions;
  private List<String> allergies;
  private List<String> specialReqs;

  //Patient Associations
  private List<OperationsStaff> operationsStaffs;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Doctor 
   * @param [in] aTitle [\b String]
   * @param [in] aGivenName [\b String]
   * @param [in] aMiddleName [\b String]
   * @param [in] aFamilyName [\b String]
   * @param [in] aName [\b FullName]
   * @param [in] aBirthDate [\b String]
   * @param [in] aGender [\b Gender]
   * @param [in] aHomeAddress [\b Address]
   * @param [in] aPhone [\b Phone]
   * @param [in] aİd [\b String]
   * @param [in] aAge [\b int]
   * @param [in] aAccepted [\b String]
   * @param [in] aSickness [\b History]
   * returns the value
   **/
  public Patient(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aİd, int aAge, String aAccepted, History aSickness)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone);
    id = aİd;
    age = aAge;
    accepted = aAccepted;
    sickness = aSickness;
    prescriptions = new ArrayList<String>();
    allergies = new ArrayList<String>();
    specialReqs = new ArrayList<String>();
    operationsStaffs = new ArrayList<OperationsStaff>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setİd 
   * @param [in] aİd [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setİd(String aİd)
  {
    boolean wasSet = false;
    id = aİd;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setAge 
   * @param [in] aAge [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setAccepted 
   * @param [in] aAccepted [\b String]
   * @retval [\b boolean]
   * returns the value
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
   * returns the value
   **/
  public boolean setSickness(History aSickness)
  {
    boolean wasSet = false;
    sickness = aSickness;
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template attribute_SetMany */
  /**
   * @name setPrescription 
   * @param [in] prescriptionsList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPrescription(List<String> prescriptionsList)
  {
    boolean wasAdded = false;
    wasAdded = prescriptions.addAll(prescriptionsList);
    return wasAdded;
  }
 
  /**
   * @name removePrescription 
   * @param [in] aPrescription [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removePrescription(String aPrescription)
  {
    boolean wasRemoved = false;
    wasRemoved = prescriptions.remove(aPrescription);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  /**
   * @name setAllergy 
   * @param [in] allergiesList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setAllergy(List<String> allergiesList)
  {
    boolean wasAdded = false;
    wasAdded = allergies.addAll(allergiesList);
    return wasAdded;
  }
  
  /**
   * @name removeAllergy 
   * @param [in] aAllergy [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeAllergy(String aAllergy)
  {
    boolean wasRemoved = false;
    wasRemoved = allergies.remove(aAllergy);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  /**
   * @name setSpecialReq 
   * @param [in] specialRegsList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setSpecialReq(List<String> specialRegsList)
  {
    boolean wasAdded = false;
    wasAdded = specialReqs.addAll(specialRegsList);
    return wasAdded;
  }

  /**
   * @name removeSpecialReq 
   * @param [in] aSpecialReq [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeSpecialReq(String aSpecialReq)
  {
    boolean wasRemoved = false;
    wasRemoved = specialReqs.remove(aSpecialReq);
    return wasRemoved;
  }
 
  /**
   * @name getİd 
   * @retval [\b String]
   * returns the value
   **/
  public String getİd()
  {
    return id;
  }
  /**
   * @name getAge 
   * @retval [\b int]
   * returns the value
   **/
  public int getAge()
  {
    return age;
  }
  /**
   * @name getAccepted 
   * @retval [\b String]
   * returns the value
   **/
  public String getAccepted()
  {
    return accepted;
  }
  /**
   * @name getSickness 
   * @retval [\b History]
   * returns the value
   **/
  public History getSickness()
  {
    return sickness;
  }
  /**
   * @name setSickness 
   * @param [in] Sickness [\b String]
   * returns the value
   **/
  public void setSickness(String Sickness) {
	  sickness.setPatientSickness(Sickness);
  }
  /**
   * @name getSicknesses 
   * @retval [\b String]
   * returns the value
   **/
  public String getSicknesses() {
	  return sickness.getPatientSickness();
  }
  
  /* Code from template attribute_GetMany */
  /**
   * @name getPrescription 
   * @param [in] index [\b int index]
   * @retval [\b String]
   * returns the value
   **/
  public String getPrescription(int index)
  {
    String aPrescription = prescriptions.get(index);
    return aPrescription;
  }
 
  /**
   * @name getPrescriptions 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getPrescriptions()
  {
    String[] newPrescriptions = prescriptions.toArray(new String[prescriptions.size()]);
    return newPrescriptions;
  }

  /**
   * @name numberOfPrescriptions 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfPrescriptions()
  {
    int number = prescriptions.size();
    return number;
  }
  
  /**
   * @name hasPrescriptions 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasPrescriptions()
  {
    boolean has = prescriptions.size() > 0;
    return has;
  }
  /**
   * @name indexOfPrescription 
   * @param [in] aPrescription [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfPrescription(String aPrescription)
  {
    int index = prescriptions.indexOf(aPrescription);
    return index;
  }
  /* Code from template attribute_GetMany */
  /**
   * @name getAllergy 
   * @param [in] index [\b int]
   * @retval [\b String]
   * returns the value
   **/
  public String getAllergy(int index)
  {
    String aAllergy = allergies.get(index);
    return aAllergy;
  }
  /**
   * @name getAllergies 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getAllergies()
  {
    String[] newAllergies = allergies.toArray(new String[allergies.size()]);
    return newAllergies;
  }
  /**
   * @name numberOfAllergies 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfAllergies()
  {
    int number = allergies.size();
    return number;
  }
  /**
   * @name hasAllergies 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasAllergies()
  {
    boolean has = allergies.size() > 0;
    return has;
  }
  /**
   * @name indexOfAllergy 
   * @param [in] aAllergy [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfAllergy(String aAllergy)
  {
    int index = allergies.indexOf(aAllergy);
    return index;
  }
  
  /* Code from template attribute_GetMany */
  /**
   * @name getSpecialReq 
   * @param [in] index [\b int]
   * @retval [\b String]
   * returns the value
   **/
  public String getSpecialReq(int index)
  {
    String aSpecialReq = specialReqs.get(index);
    return aSpecialReq;
  }

  /**
   * @name getSpecialReqs 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getSpecialReqs()
  {
    String[] newSpecialReqs = specialReqs.toArray(new String[specialReqs.size()]);
    return newSpecialReqs;
  }
 
  /**
   * @name numberOfSpecialReqs 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfSpecialReqs()
  {
    int number = specialReqs.size();
    return number;
  }

  /**
   * @name hasSpecialReqs 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasSpecialReqs()
  {
    boolean has = specialReqs.size() > 0;
    return has;
  }

  /**
   * @name indexOfSpecialReq 
   * @param [in] aSpecialReq [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfSpecialReq(String aSpecialReq)
  {
    int index = specialReqs.indexOf(aSpecialReq);
    return index;
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getOperationsStaff 
   * @param [in] index [\b int]
   * @retval [\b OperationsStaff]
   * returns the value
   **/
  public OperationsStaff getOperationsStaff(int index)
  {
    OperationsStaff aOperationsStaff = operationsStaffs.get(index);
    return aOperationsStaff;
  }

  /**
   * @name getOperationsStaffs 
   * @retval [\b List<OperationsStaff>]
   * returns the value
   **/
  public List<OperationsStaff> getOperationsStaffs()
  {
    List<OperationsStaff> newOperationsStaffs = Collections.unmodifiableList(operationsStaffs);
    return newOperationsStaffs;
  }

  /**
   * @name numberOfOperationsStaffs 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfOperationsStaffs()
  {
    int number = operationsStaffs.size();
    return number;
  }

  /**
   * @name hasOperationsStaffs 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasOperationsStaffs()
  {
    boolean has = operationsStaffs.size() > 0;
    return has;
  }

  /**
   * @name indexOfOperationsStaff 
   * @param [in] aOperationsStaff [\b OperationsStaff]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfOperationsStaff(OperationsStaff aOperationsStaff)
  {
    int index = operationsStaffs.indexOf(aOperationsStaff);
    return index;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfOperationsStaffs 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfOperationsStaffs()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addOperationsStaff 
   * @param [in] aOperationsStaff [\b OperationsStaff]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOperationsStaff(OperationsStaff aOperationsStaff)
  {
    boolean wasAdded = false;
    if (operationsStaffs.contains(aOperationsStaff)) { return false; }
    operationsStaffs.add(aOperationsStaff);
    if (aOperationsStaff.indexOfPatient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aOperationsStaff.addPatient(this);
      if (!wasAdded)
      {
        operationsStaffs.remove(aOperationsStaff);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removeOperationsStaff 
   * @param [in] aOperationsStaff [\b OperationsStaff]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeOperationsStaff(OperationsStaff aOperationsStaff)
  {
    boolean wasRemoved = false;
    if (!operationsStaffs.contains(aOperationsStaff))
    {
      return wasRemoved;
    }

    int oldIndex = operationsStaffs.indexOf(aOperationsStaff);
    operationsStaffs.remove(oldIndex);
    if (aOperationsStaff.indexOfPatient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aOperationsStaff.removePatient(this);
      if (!wasRemoved)
      {
        operationsStaffs.add(oldIndex,aOperationsStaff);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addOperationsStaffAt 
   * @param [in] aOperationsStaff [\b OperationsStaff]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOperationsStaffAt(OperationsStaff aOperationsStaff, int index)
  {  
    boolean wasAdded = false;
    if(addOperationsStaff(aOperationsStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOperationsStaffs()) { index = numberOfOperationsStaffs() - 1; }
      operationsStaffs.remove(aOperationsStaff);
      operationsStaffs.add(index, aOperationsStaff);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveOperationsStaffAt 
   * @param [in] aOperationsStaff [\b OperationsStaff]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveOperationsStaffAt(OperationsStaff aOperationsStaff, int index)
  {
    boolean wasAdded = false;
    if(operationsStaffs.contains(aOperationsStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOperationsStaffs()) { index = numberOfOperationsStaffs() - 1; }
      operationsStaffs.remove(aOperationsStaff);
      operationsStaffs.add(index, aOperationsStaff);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOperationsStaffAt(aOperationsStaff, index);
    }
    return wasAdded;
  }

  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    ArrayList<OperationsStaff> copyOfOperationsStaffs = new ArrayList<OperationsStaff>(operationsStaffs);
    operationsStaffs.clear();
    for(OperationsStaff aOperationsStaff : copyOfOperationsStaffs)
    {
      aOperationsStaff.removePatient(this);
    }
    super.delete();
  }

  /**
   * @name toString 
   * @retval [\b String]
   * returns the value
   **/
  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getİd()+ "," +
            "age" + ":" + getAge()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "accepted" + "=" + (getAccepted() != null ? !getAccepted().equals(this)  ? getAccepted().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "sickness" + "=" + (getSickness() != null ? !getSickness().equals(this)  ? getSickness().toString().replaceAll("  ","    ") : "this" : "null");
  }
}