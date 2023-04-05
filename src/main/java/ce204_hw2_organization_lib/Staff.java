package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

import java.util.*;

// line 41 "ce204-hw2-Organization-lib.ump"
// line 160 "ce204-hw2-Organization-lib.ump"
public class Staff extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Staff Attributes
  private String joined;
  private List<String> education;
  private List<String> certification;
  private List<String> languages;

  //Staff Associations
  private Department department;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Staff 
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
  public Staff(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined, Department aDepartment)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone);
    joined = aJoined;
    education = new ArrayList<String>();
    certification = new ArrayList<String>();
    languages = new ArrayList<String>();
    boolean didAddDepartment = setDepartment(aDepartment);
    if (!didAddDepartment)
    {
      throw new RuntimeException("Unable to create staff due to department. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setJoined 
   * @param [in] aJoined [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setJoined(String aJoined)
  {
    boolean wasSet = false;
    joined = aJoined;
    wasSet = true;
    return wasSet;
  } 
  
  /* Code from template attribute_SetMany */
  /**
   * @name setEducation 
   * @param [in] educationList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setEducation(List<String> educationList)
  {
    boolean wasAdded = false;
    wasAdded = education.addAll(educationList);
    return wasAdded;
  }
  /**
   * @name removeEducation 
   * @param [in] aEducation [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeEducation(String aEducation)
  {
    boolean wasRemoved = false;
    wasRemoved = education.remove(aEducation);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  /**
   * @name setCertification 
   * @param [in] certificationList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setCertification(List<String> certificationList)
  {
    boolean wasAdded = false;
    wasAdded = certification.addAll(certificationList);
    return wasAdded;
  }
 
  /**
   * @name removeCertification 
   * @param [in] aCertification [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeCertification(String aCertification)
  {
    boolean wasRemoved = false;
    wasRemoved = certification.remove(aCertification);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  /**
   * @name setLanguage 
   * @param [in] languageList [\b List<String>]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setLanguage(List<String> languageList)
  {
    boolean wasAdded = false;
    wasAdded = languages.addAll(languageList);
    return wasAdded;
  }
  /**
   * @name removeLanguage 
   * @param [in] aLanguage [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeLanguage(String aLanguage)
  {
    boolean wasRemoved = false;
    wasRemoved = languages.remove(aLanguage);
    return wasRemoved;
  }
 
  /**
   * @name getJoined 
   * @retval [\b String]
   * returns the value
   **/
  public String getJoined()
  {
    return joined;
  }
  
  /* Code from template attribute_GetMany */
  /**
   * @name getEducation 
   * @param [in] index [\b int]
   * @retval [\b String]
   * returns the value
   **/
  public String getEducation(int index)
  {
    String aEducation = education.get(index);
    return aEducation;
  }
  /**
   * @name getEducation 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getEducation()
  {
    String[] newEducation = education.toArray(new String[education.size()]);
    return newEducation;
  }
 
  /**
   * @name numberOfEducation 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfEducation()
  {
    int number = education.size();
    return number;
  }
 
  /**
   * @name hasEducation 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasEducation()
  {
    boolean has = education.size() > 0;
    return has;
  }
 
  /**
   * @name indexOfEducation 
   * @param [in] aEducation [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfEducation(String aEducation)
  {
    int index = education.indexOf(aEducation);
    return index;
  }
  
  /* Code from template attribute_GetMany */
  /**
   * @name getCertification 
   * @param [in] index [\b int]
   * @retval [\b String]
   * returns the value
   **/
  public String getCertification(int index)
  {
    String aCertification = certification.get(index);
    return aCertification;
  }

  /**
   * @name getCertification 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getCertification()
  {
    String[] newCertification = certification.toArray(new String[certification.size()]);
    return newCertification;
  }

  /**
   * @name numberOfCertification 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfCertification()
  {
    int number = certification.size();
    return number;
  }

  /**
   * @name hasCertification 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasCertification()
  {
    boolean has = certification.size() > 0;
    return has;
  }

  /**
   * @name indexOfCertification 
   * @param [in] aCertification [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfCertification(String aCertification)
  {
    int index = certification.indexOf(aCertification);
    return index;
  }
  
  /* Code from template attribute_GetMany */
  /**
   * @name getLanguage 
   * @param [in] index [\b int]
   * @retval [\b String]
   * returns the value
   **/
  public String getLanguage(int index)
  {
    String aLanguage = languages.get(index);
    return aLanguage;
  }

  /**
   * @name getLanguages 
   * @retval [\b String[]]
   * returns the value
   **/
  public String[] getLanguages()
  {
    String[] newLanguages = languages.toArray(new String[languages.size()]);
    return newLanguages;
  }

  /**
   * @name numberOfLanguages 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfLanguages()
  {
    int number = languages.size();
    return number;
  }

  /**
   * @name hasLanguages 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasLanguages()
  {
    boolean has = languages.size() > 0;
    return has;
  }

  /**
   * @name indexOfLanguage 
   * @param [in] aLanguage [\b String]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfLanguage(String aLanguage)
  {
    int index = languages.indexOf(aLanguage);
    return index;
  }
  
  /* Code from template association_GetOne */
  /**
   * @name getDepartment 
   * @retval [\b Department]
   * returns the value
   **/
  public Department getDepartment()
  {
    return department;
  }
  
  /* Code from template association_SetOneToMany */
  /**
   * @name setDepartment 
   * @param [in] aDepartment [\b Department]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setDepartment(Department aDepartment)
  {
    boolean wasSet = false;
    if (aDepartment == null)
    {
      return wasSet;
    }

    Department existingDepartment = department;
    department = aDepartment;
    if (existingDepartment != null && !existingDepartment.equals(aDepartment))
    {
      existingDepartment.removeStaff(this);
    }
    department.addStaff(this);
    wasSet = true;
    return wasSet;
  }

  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    Department placeholderDepartment = department;
    this.department = null;
    if(placeholderDepartment != null)
    {
      placeholderDepartment.removeStaff(this);
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
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "joined" + "=" + (getJoined() != null ? !getJoined().equals(this)  ? getJoined().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "department = "+(getDepartment()!=null?Integer.toHexString(System.identityHashCode(getDepartment())):"null");
  }
}