package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 1 "ce204-hw2-Organization-lib.ump"
// line 143 "ce204-hw2-Organization-lib.ump"
public class Person
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum Gender { Male, Female }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private String title;
  private String givenName;
  private String middleName;
  private String familyName;
  private FullName name;
  private String birthDate;
  private Gender gender;
  private Address homeAddress;
  private Phone phone;

  //Person Associations
  private List<Hospital> hospitals;

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
   * returns the value
   **/
  public Person(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone)
  {
    title = aTitle;
    givenName = aGivenName;
    middleName = aMiddleName;
    familyName = aFamilyName;
    name = aName;
    birthDate = aBirthDate;
    gender = aGender;
    homeAddress = aHomeAddress;
    phone = aPhone;
    hospitals = new ArrayList<Hospital>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setTitle 
   * @param [in] aTitle [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setTitle(String aTitle)
  {
    boolean wasSet = false;
    title = aTitle;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setGivenName 
   * @param [in] aGivenName [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setGivenName(String aGivenName)
  {
    boolean wasSet = false;
    givenName = aGivenName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setMiddleName 
   * @param [in] aMiddleName [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setMiddleName(String aMiddleName)
  {
    boolean wasSet = false;
    middleName = aMiddleName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setFamilyName 
   * @param [in] aFamilyName [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setFamilyName(String aFamilyName)
  {
    boolean wasSet = false;
    familyName = aFamilyName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setName 
   * @param [in] aName [\b FullName]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setName(FullName aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setBirthDate 
   * @param [in] aBirthDate [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setBirthDate(String aBirthDate)
  {
    boolean wasSet = false;
    birthDate = aBirthDate;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setGender 
   * @param [in] aGender [\b Gender]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setGender(Gender aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setHomeAddress 
   * @param [in] aHomeAddress [\b Address]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setHomeAddress(Address aHomeAddress)
  {
    boolean wasSet = false;
    homeAddress = aHomeAddress;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name setPhone 
   * @param [in] aPhone [\b Phone]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPhone(Phone aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name String 
   * @retval [\b String]
   * returns the value
   **/
  public String getTitle()
  {
    return title;
  }
  /**
   * @name getGivenName 
   * @retval [\b String]
   * returns the value
   **/
  public String getGivenName()
  {
    return givenName;
  }
  /**
   * @name getMiddleName 
   * @retval [\b String]
   * returns the value
   **/
  public String getMiddleName()
  {
    return middleName;
  }
  /**
   * @name getFamilyName 
   * @retval [\b String]
   * returns the value
   **/
  public String getFamilyName()
  {
    return familyName;
  }
  /**
   * @name getName 
   * @retval [\b FullName]
   * returns the value
   **/
  public FullName getName()
  {
    return name;
  }
  /**
   * @name setName 
   * @param [in] fullName [\b String]
   * returns the value
   **/
  public void setName(String fullName) {
    name.setFullName(fullName);
  }
  /**
   * @name getNamee 
   * @retval [\b String]
   * returns the value
   **/
  public String getNamee() {
    return name.getFullName();
  }
  /**
   * @name getBirthDate 
   * @retval [\b String]
   * returns the value
   **/
  public String getBirthDate()
  {
    return birthDate;
  }
  /**
   * @name getGender 
   * @retval [\b Gender]
   * returns the value
   **/
  public Gender getGender()
  {
    return gender;
  }
  /**
   * @name getHomeAddress 
   * @retval [\b Address]
   * returns the value
   **/
  public Address getHomeAddress()
  {
    return homeAddress;
  }
  /**
   * @name setHomeAddress
   * @param [in] Address [\b String] 
   * returns the value
   **/
  public void setHomeAddress(String Address) {
	homeAddress.setAddress(Address);
  }
  /**
   * @name getHomeAddresses 
   * @retval [\b String]
   * returns the value
   **/
  public String getHomeAddresses() {
	return homeAddress.getAddress();
  }
  /**
   * @name getPhone 
   * @retval [\b Phone]
   * returns the value
   **/
  public Phone getPhone()
  {
    return phone;
  }
  /**
   * @name setPhone
   * @param [in] Phone [\b String] 
   * returns the value
   **/
  public void setPhone(String Phone) {
	  phone.setPhoneNumber(Phone);
  }
  /**
   * @name getPhonee 
   * @retval [\b String]
   * returns the value
   **/
  public String getPhonee() {
	  return phone.getPhoneNumber();
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getHospital 
   * @param [in] index [\b int]
   * @retval [\b Hospital]
   * returns the value
   **/
  public Hospital getHospital(int index)
  {
    Hospital aHospital = hospitals.get(index);
    return aHospital;
  }
 
  /**
   * @name getHospitals 
   * @retval [\b List<Hospital>]
   * returns the value
   **/
  public List<Hospital> getHospitals()
  {
    List<Hospital> newHospitals = Collections.unmodifiableList(hospitals);
    return newHospitals;
  }
  
  /**
   * @name numberOfHospitals 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfHospitals()
  {
    int number = hospitals.size();
    return number;
  }
  
  /**
   * @name hasHospitals 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasHospitals()
  {
    boolean has = hospitals.size() > 0;
    return has;
  }
  
  /**
   * @name indexOfHospital 
   * @retval [\b int]
   * @param [in] aHospital [\b Hospital]
   * returns the value
   **/
  public int indexOfHospital(Hospital aHospital)
  {
    int index = hospitals.indexOf(aHospital);
    return index;
  } 
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfHospitals 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfHospitals()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addHospital 
   * @param [in] aHospital [\b Hospital]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addHospital(Hospital aHospital)
  {
    boolean wasAdded = false;
    if (hospitals.contains(aHospital)) { return false; }
    hospitals.add(aHospital);
    if (aHospital.indexOfPerson(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aHospital.addPerson(this);
      if (!wasAdded)
      {
        hospitals.remove(aHospital);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  /**
   * @name removeHospital 
   * @param [in] aHospital [\b Hospital]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeHospital(Hospital aHospital)
  {
    boolean wasRemoved = false;
    if (!hospitals.contains(aHospital))
    {
      return wasRemoved;
    }

    int oldIndex = hospitals.indexOf(aHospital);
    hospitals.remove(oldIndex);
    if (aHospital.indexOfPerson(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aHospital.removePerson(this);
      if (!wasRemoved)
      {
        hospitals.add(oldIndex,aHospital);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addHospitalAt 
   * @param [in] aHospital [\b Hospital]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addHospitalAt(Hospital aHospital, int index)
  {  
    boolean wasAdded = false;
    if(addHospital(aHospital))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHospitals()) { index = numberOfHospitals() - 1; }
      hospitals.remove(aHospital);
      hospitals.add(index, aHospital);
      wasAdded = true;
    }
    return wasAdded;
  }
 
  /**
   * @name addOrMoveHospitalAt 
   * @param [in] aHospital [\b Hospital]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveHospitalAt(Hospital aHospital, int index)
  {
    boolean wasAdded = false;
    if(hospitals.contains(aHospital))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHospitals()) { index = numberOfHospitals() - 1; }
      hospitals.remove(aHospital);
      hospitals.add(index, aHospital);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHospitalAt(aHospital, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Hospital> copyOfHospitals = new ArrayList<Hospital>(hospitals);
    hospitals.clear();
    for(Hospital aHospital : copyOfHospitals)
    {
      aHospital.removePerson(this);
    }
  }

  /**
   * @name toString 
   * @retval [\b String]
   * returns the value
   **/
  public String toString()
  {
    return super.toString() + "["+
            "title" + ":" + getTitle()+ "," +
            "givenName" + ":" + getGivenName()+ "," +
            "middleName" + ":" + getMiddleName()+ "," +
            "familyName" + ":" + getFamilyName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "name" + "=" + (getName() != null ? !getName().equals(this)  ? getName().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "birthDate" + "=" + (getBirthDate() != null ? !getBirthDate().equals(this)  ? getBirthDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "gender" + "=" + (getGender() != null ? !getGender().equals(this)  ? getGender().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "homeAddress" + "=" + (getHomeAddress() != null ? !getHomeAddress().equals(this)  ? getHomeAddress().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null");
  }
}