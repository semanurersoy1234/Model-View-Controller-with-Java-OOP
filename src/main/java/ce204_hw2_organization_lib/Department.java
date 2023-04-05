package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

import ce204_hw2_organization_lib.Person.Gender;


// line 50 "ce204-hw2-Organization-lib.ump"
// line 165 "ce204-hw2-Organization-lib.ump"
public class Department
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Department Associations
  private List<Staff> staffs;
  private Hospital hospital;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Department 
   * @param [in] aHospital [\b Hospital]
   * returns the address value
   **/
  public Department(Hospital aHospital)
  {
    staffs = new ArrayList<Staff>();
    boolean didAddHospital = setHospital(aHospital);
    if (!didAddHospital)
    {
      throw new RuntimeException("Unable to create department due to hospital. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  /**
   * @name getStaff 
   * @param [in] index [\b int]
   * @retval [\b Staff]
   * returns the value
   **/
  public Staff getStaff(int index)
  {
    Staff aStaff = staffs.get(index);
    return aStaff;
  }
  
  public List<Staff> getStaffs()
  {
    List<Staff> newStaffs = Collections.unmodifiableList(staffs);
    return newStaffs;
  }
  /**
   * @name numberOfStaffs 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfStaffs()
  {
    int number = staffs.size();
    return number;
  }
  /**
   * @name hasStaffs 
   * @retval [\b boolean]
   * returns the value
   **/

  public boolean hasStaffs()
  {
    boolean has = staffs.size() > 0;
    return has;
  }
  /**
   * @name indexOfStaff 
   * @param [in] aStaff [\b Staff]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfStaff(Staff aStaff)
  {
    int index = staffs.indexOf(aStaff);
    return index;
  }
  /* Code from template association_GetOne */
  /* Code from template association_GetOne */
  /**
  * @name getHospital 
  * @retval [\b Hospital]
  * returns the value
  **/
  public Hospital getHospital()
  {
    return hospital;
  }
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfStaffs 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfStaffs()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  /**
   * @name addStaff 
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
   * @retval [\b Staff]
   * returns the value
   **/
  public Staff addStaff(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined)
  {
    return new Staff(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, this);
  }
  /**
   * @name addStaff 
   * @param [in] aStaff [\b Staff]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addStaff(Staff aStaff)
  {
    boolean wasAdded = false;
    if (staffs.contains(aStaff)) { return false; }
    Department existingDepartment = aStaff.getDepartment();
    boolean isNewDepartment = existingDepartment != null && !this.equals(existingDepartment);
    if (isNewDepartment)
    {
      aStaff.setDepartment(this);
    }
    else
    {
      staffs.add(aStaff);
    }
    wasAdded = true;
    return wasAdded;
  }
  /**
   * @name removeStaff 
   * @param [in] aStaff [\b Staff]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeStaff(Staff aStaff)
  {
    boolean wasRemoved = false;
    //Unable to remove aStaff, as it must always have a department
    if (!this.equals(aStaff.getDepartment()))
    {
      staffs.remove(aStaff);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addStaffAt 
   * @param [in] aStaff [\b Staff]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addStaffAt(Staff aStaff, int index)
  {  
    boolean wasAdded = false;
    if(addStaff(aStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStaffs()) { index = numberOfStaffs() - 1; }
      staffs.remove(aStaff);
      staffs.add(index, aStaff);
      wasAdded = true;
    }
    return wasAdded;
  }
  /**
   * @name addOrMoveStaffAt 
   * @param [in] aStaff [\b Staff]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveStaffAt(Staff aStaff, int index)
  {
    boolean wasAdded = false;
    if(staffs.contains(aStaff))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStaffs()) { index = numberOfStaffs() - 1; }
      staffs.remove(aStaff);
      staffs.add(index, aStaff);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStaffAt(aStaff, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  /**
   * @name setHospital 
   * @param [in] aHospital [\b Hospital]
   * @retval [\b boolean]
   * returns the value
   **/
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
      existingHospital.removeDepartment(this);
    }
    hospital.addDepartment(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while (staffs.size() > 0)
    {
      Staff aStaff = staffs.get(staffs.size() - 1);
      aStaff.delete();
      staffs.remove(aStaff);
    }
    
    Hospital placeholderHospital = hospital;
    this.hospital = null;
    if(placeholderHospital != null)
    {
      placeholderHospital.removeDepartment(this);
    }
  }
}