package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 23 "ce204-hw2-organization-lib-2.ump"
// line 95 "ce204-hw2-organization-lib-2.ump"
public class Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Attributes
  private List<String> specialty;
  private List<String> locations;

  //Doctor Associations
  private List<Patient> patients;
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Doctor()
  {
    specialty = new ArrayList<String>();
    locations = new ArrayList<String>();
    patients = new ArrayList<Patient>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  
  /**
   * @name setSpecialty 
   * @param [in] specialtyList [\b List<String>]
   * @retval [\b boolean]
   **/
  public boolean setSpecialty(List<String> specialtyList)
  {
    boolean wasAdded = false;
    wasAdded = specialty.addAll(specialtyList);
    return wasAdded;
  }

  /**
   * @name removeSpecialty 
   * @param [in] aSpecialty [\b String]
   * @retval [\b boolean]
   **/
  public boolean removeSpecialty(String aSpecialty)
  {
    boolean wasRemoved = false;
    wasRemoved = specialty.remove(aSpecialty);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  
  /**
   * @name setLocation 
   * @param [in] locationList [\b List<String>]
   * @retval [\b boolean]
   **/
  public boolean setLocation(List<String> locationList)
  {
    boolean wasAdded = false;
    wasAdded = locations.addAll(locationList);
    return wasAdded;
  }

  /**
   * @name removeLocation 
   * @param [in] aLocation [\b String]
   * @retval [\b boolean]
   **/
  public boolean removeLocation(String aLocation)
  {
    boolean wasRemoved = false;
    wasRemoved = locations.remove(aLocation);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  
  /**
   * @name getSpecialty 
   * @param [in] index [\b int]
   * @retval [\b String]
   **/
  public String getSpecialty(int index)
  {
    String aSpecialty = specialty.get(index);
    return aSpecialty;
  }

  /**
   * @name getSpecialty 
   * @retval [\b String[]]
   **/
  public String[] getSpecialty()
  {
    String[] newSpecialty = specialty.toArray(new String[specialty.size()]);
    return newSpecialty;
  }

  /**
   * @name numberOfSpecialty 
   * @retval [\b int]
   **/
  public int numberOfSpecialty()
  {
    int number = specialty.size();
    return number;
  }

  /**
   * @name hasSpecialty 
   * @retval [\b boolean]
   **/
  public boolean hasSpecialty()
  {
    boolean has = specialty.size() > 0;
    return has;
  }

  /**
   * @name indexOfSpecialty 
   * @param [in] aSpecialty [\b String]
   * @retval [\b int]
   **/
  public int indexOfSpecialty(String aSpecialty)
  {
    int index = specialty.indexOf(aSpecialty);
    return index;
  }
  /* Code from template attribute_GetMany */
  
  /**
   * @name getLocation 
   * @param [in] index [\b int]
   * @retval [\b String]
   **/
  public String getLocation(int index)
  {
    String aLocation = locations.get(index);
    return aLocation;
  }

  /**
   * @name getLocations 
   * @retval [\b String[]]
   **/
  public String[] getLocations()
  {
    String[] newLocations = locations.toArray(new String[locations.size()]);
    return newLocations;
  }

  /**
   * @name numberOfLocations 
   * @retval [\b int]
   **/
  public int numberOfLocations()
  {
    int number = locations.size();
    return number;
  }

  /**
   * @name hasLocations 
   * @retval [\b boolean]
   **/
  public boolean hasLocations()
  {
    boolean has = locations.size() > 0;
    return has;
  }

  /**
   * @name indexOfLocation 
   * @param [in] aLocation [\b String]
   * @retval [\b int]
   **/
  public int indexOfLocation(String aLocation)
  {
    int index = locations.indexOf(aLocation);
    return index;
  }
  /* Code from template association_GetMany */
  
  /**
   * @name getPatient 
   * @param [in] index [\b int]
   * @retval [\b Patient]
   **/
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }

  /**
   * @name getPatients 
   * @retval [\b List<Patient>]
   **/
  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }

  /**
   * @name numberOfPatients 
   * @retval [\b int]
   **/
  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }

  /**
   * @name hasPatients 
   * @retval [\b boolean]
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
   **/
  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_patients()
  {
    patients.clear();
  }
  /* Code from template association_GetOne */
  
  /**
   * @name getTeam 
   * @retval [\b Team]
   **/
  public Team getTeam()
  {
    return team;
  }

  /**
   * @name hasTeam 
   * @retval [\b boolean]
   **/
  public boolean hasTeam()
  {
    boolean has = team != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  
  /**
   * @name addPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   **/
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    patients.add(aPatient);
    if (aPatient.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatient.addDoctor(this);
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
    if (aPatient.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatient.removeDoctor(this);
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
  /* Code from template association_SetOptionalOneToMany */
  
  /**
   * @name setTeam 
   * @param [in] aTeam [\b Team]
   * @retval [\b boolean]
   **/
  public boolean setTeam(Team aTeam)
  {
    boolean wasSet = false;
    Team existingTeam = team;
    team = aTeam;
    if (existingTeam != null && !existingTeam.equals(aTeam))
    {
      existingTeam.removeDoctor(this);
    }
    if (aTeam != null)
    {
      aTeam.addDoctor(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Patient> copyOfPatients = new ArrayList<Patient>(patients);
    patients.clear();
    for(Patient aPatient : copyOfPatients)
    {
      aPatient.removeDoctor(this);
    }
    if (team != null)
    {
      Team placeholderTeam = team;
      this.team = null;
      placeholderTeam.removeDoctor(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null");
  }
}