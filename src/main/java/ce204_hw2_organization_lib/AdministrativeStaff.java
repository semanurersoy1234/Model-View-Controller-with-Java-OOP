package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 55 "ce204-hw2-Organization-lib.ump"
// line 171 "ce204-hw2-Organization-lib.ump"
public class AdministrativeStaff extends Staff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------
	
  /**
  * @name AdministrativeStaff 
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
  * Returns the administrative staff value
  **/
  public AdministrativeStaff(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, FullName aName, String aBirthDate, Gender aGender, Address aHomeAddress, Phone aPhone, String aJoined, Department aDepartment)
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