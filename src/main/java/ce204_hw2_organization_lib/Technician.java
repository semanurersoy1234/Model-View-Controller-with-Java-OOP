package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 113 "ce204-hw2-Organization-lib.ump"
// line 227 "ce204-hw2-Organization-lib.ump"
public class Technician extends TechnicalStaff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------
   /**
   * @name Technician 
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
  public Technician(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined, Department aDepartment)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, aDepartment);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}