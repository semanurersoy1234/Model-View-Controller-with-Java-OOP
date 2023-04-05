package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 96 "ce204-hw2-Organization-lib.ump"
// line 212 "ce204-hw2-Organization-lib.ump"
public class Doctor extends OperationsStaff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Attributes
  private List<String> specialty;
  private List<String> locations;

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
   * @param [in] aJoined [\b String]
   * @param [in] aDepartment [\b Department]
   * returns the value
   **/
  public Doctor(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined, Department aDepartment)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, aDepartment);
    specialty = new ArrayList<String>();
    locations = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  /**
   * @name setSpecialty 
   * @param [in] specialtyList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setSpecialty(List<String> specialtyList)
  {
    boolean wasAdded = false;
    wasAdded = specialty.addAll(specialtyList);
    return wasAdded;
  }
  /**
   * @name removeSpecialty 
   * @param [in] specialtyList [\b String]
   * @retval [\b boolean]
   * returns the value
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
   * @param [in] locationsList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setLocation(List<String> locationsList)
  {
    boolean wasAdded = false;
    wasAdded = locations.addAll(locationsList);
    return wasAdded;
  }
  /**
   * @name removeLocation 
   * @param [in] aLocation [\b String]
   * @retval [\b boolean]
   * returns the value
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
   * returns the value
   **/
  public String getSpecialty(int index)
  {
    String aSpecialty = specialty.get(index);
    return aSpecialty;
  }
  /**
   * @name setSpecialty 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getSpecialty()
  {
    String[] newSpecialty = specialty.toArray(new String[specialty.size()]);
    return newSpecialty;
  }
  /**
   * @name numberOfSpecialty 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfSpecialty()
  {
    int number = specialty.size();
    return number;
  }
  /**
   * @name hasSpecialty 
   * @retval [\b boolean]
   * returns the value
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
   * returns the value
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
   * returns the value
   **/
  public String getLocation(int index)
  {
    String aLocation = locations.get(index);
    return aLocation;
  }
  /**
   * @name getLocations 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getLocations()
  {
    String[] newLocations = locations.toArray(new String[locations.size()]);
    return newLocations;
  }
  /**
   * @name numberOfLocations 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfLocations()
  {
    int number = locations.size();
    return number;
  }
  /**
   * @name hasLocations
   * @retval [\b boolean]
   * returns the value
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
   * returns the value
   **/
  public int indexOfLocation(String aLocation)
  {
    int index = locations.indexOf(aLocation);
    return index;
  }

  public void delete()
  {
    super.delete();
  }

  /**
   * @name toString 
   * @retval [\b String]
   * returns the value
   **/
  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}