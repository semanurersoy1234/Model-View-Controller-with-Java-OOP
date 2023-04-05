package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 15 "ce204-hw2-Organization-lib.ump"
// line 148 "ce204-hw2-Organization-lib.ump"
public class Hospital
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hospital Attributes
  private String name;
  private Address address;
  private Phone phone;

  //Hospital Associations
  private List<Person> persons;
  private List<Department> departments;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Hospital 
   * @param [in] aName [\b String]
   * @param [in] aAddress [\b Address]
   * @param [in] aPhone [\b Phone]
   * returns the value
   **/
  public Hospital(String aName, Address aAddress, Phone aPhone)
  {
    name = aName;
    address = aAddress;
    phone = aPhone;
    persons = new ArrayList<Person>();
    departments = new ArrayList<Department>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setName 
   * @param [in] aName [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * @name setAddress 
   * @param [in] aAddress [\b Address]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setAddress(Address aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }
  
  /**
   * @name setAddress 
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
   * @name getName 
   * @retval [\b String]
   * returns the value
   **/
  public String getName()
  {
    return name;
  }
  
  /**
   * @name getAddress
   * @retval [\b Address]
   * returns the value
   **/
  public Address getAddress()
  {
    return address;
  }
  
  /**
   * @name setAddress 
   * @param [in] Address [\b String]
   * returns the value
   **/
  public void setAddress(String Address) {
	address.setAddress(Address);
  }
  
  /**
   * @name getAddresses 
   * @retval [\b String]
   * returns the value
   **/
  public String getAddresses() {
	return address.getAddress();
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
  
  /**
   * @name getPerson 
   * @param [in] index [\b int]
   * @retval [\b Person]
   * returns the value
   **/
  /* Code from template association_GetMany */
  public Person getPerson(int index)
  {
    Person aPerson = persons.get(index);
    return aPerson;
  }
  
  /**
   * @name getPersons 
   * @retval [\b List<Person>]
   * returns the value
   **/
  public List<Person> getPersons()
  {
    List<Person> newPersons = Collections.unmodifiableList(persons);
    return newPersons;
  }
  
  /**
   * @name numberOfPersons 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfPersons()
  {
    int number = persons.size();
    return number;
  }
  
  /**
   * @name hasPersons 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasPersons()
  {
    boolean has = persons.size() > 0;
    return has;
  }
  
  /**
   * @name indexOfPerson 
   * @param [in] aPerson [\b Person]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfPerson(Person aPerson)
  {
    int index = persons.indexOf(aPerson);
    return index;
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getDepartment 
   * @param [in] index [\b int]
   * @retval [\b Department]
   * returns the value
   **/
  public Department getDepartment(int index)
  {
    Department aDepartment = departments.get(index);
    return aDepartment;
  }
  
  /**
   * @name getDepartments 
   * @retval [\b List<Department>]
   * returns the value
   **/
  public List<Department> getDepartments()
  {
    List<Department> newDepartments = Collections.unmodifiableList(departments);
    return newDepartments;
  }
  
  /**
   * @name numberOfDepartments 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfDepartments()
  {
    int number = departments.size();
    return number;
  }
  
  /**
   * @name hasDepartments 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasDepartments()
  {
    boolean has = departments.size() > 0;
    return has;
  }
  
  /**
   * @name indexOfDepartment 
   * @param [in] aDepartment [\b Department]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfDepartment(Department aDepartment)
  {
    int index = departments.indexOf(aDepartment);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfPersons 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfPersons()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addPerson 
   * @param [in] aPerson [\b Person]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPerson(Person aPerson)
  {
    boolean wasAdded = false;
    if (persons.contains(aPerson)) { return false; }
    persons.add(aPerson);
    if (aPerson.indexOfHospital(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPerson.addHospital(this);
      if (!wasAdded)
      {
        persons.remove(aPerson);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removePerson 
   * @param [in] aPerson [\b Person]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removePerson(Person aPerson)
  {
    boolean wasRemoved = false;
    if (!persons.contains(aPerson))
    {
      return wasRemoved;
    }

    int oldIndex = persons.indexOf(aPerson);
    persons.remove(oldIndex);
    if (aPerson.indexOfHospital(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPerson.removeHospital(this);
      if (!wasRemoved)
      {
        persons.add(oldIndex,aPerson);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addPersonAt 
   * @param [in] aPerson [\b Person]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPersonAt(Person aPerson, int index)
  {  
    boolean wasAdded = false;
    if(addPerson(aPerson))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPersons()) { index = numberOfPersons() - 1; }
      persons.remove(aPerson);
      persons.add(index, aPerson);
      wasAdded = true;
    }
    return wasAdded;
  }
  
  /**
   * @name addOrMovePersonAt 
   * @param [in] aPerson [\b Person]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMovePersonAt(Person aPerson, int index)
  {
    boolean wasAdded = false;
    if(persons.contains(aPerson))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPersons()) { index = numberOfPersons() - 1; }
      persons.remove(aPerson);
      persons.add(index, aPerson);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPersonAt(aPerson, index);
    }
    return wasAdded;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfDepartments 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfDepartments()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addDepartment 
   * @retval [\b Department]
   * returns the value
   **/
  public Department addDepartment()
  {
    return new Department(this);
  }

  /**
   * @name addDepartment 
   * @param [in] aDepartment [\b Department]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDepartment(Department aDepartment)
  {
    boolean wasAdded = false;
    if (departments.contains(aDepartment)) { return false; }
    Hospital existingHospital = aDepartment.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);
    if (isNewHospital)
    {
      aDepartment.setHospital(this);
    }
    else
    {
      departments.add(aDepartment);
    }
    wasAdded = true;
    return wasAdded;
  }
  
  /**
   * @name removeDepartment 
   * @param [in] aDepartment [\b Department]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeDepartment(Department aDepartment)
  {
    boolean wasRemoved = false;
    //Unable to remove aDepartment, as it must always have a hospital
    if (!this.equals(aDepartment.getHospital()))
    {
      departments.remove(aDepartment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addDepartmentAt 
   * @param [in] aDepartment [\b Department]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDepartmentAt(Department aDepartment, int index)
  {  
    boolean wasAdded = false;
    if(addDepartment(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    }
    return wasAdded;
  }
  
  /**
   * @name addOrMoveDepartmentAt 
   * @param [in] aDepartment [\b Department]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveDepartmentAt(Department aDepartment, int index)
  {
    boolean wasAdded = false;
    if(departments.contains(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDepartmentAt(aDepartment, index);
    }
    return wasAdded;
  }
  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    ArrayList<Person> copyOfPersons = new ArrayList<Person>(persons);
    persons.clear();
    for(Person aPerson : copyOfPersons)
    {
      aPerson.removeHospital(this);
    }
    while (departments.size() > 0)
    {
      Department aDepartment = departments.get(departments.size() - 1);
      aDepartment.delete();
      departments.remove(aDepartment);
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
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "address" + "=" + (getAddress() != null ? !getAddress().equals(this)  ? getAddress().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null");
  }
}