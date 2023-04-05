package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 71 "ce204-hw2-Organization-lib.ump"
// line 187 "ce204-hw2-Organization-lib.ump"
public class FullName
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FullName Attributes
  private String fullName;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name FullName 
   * @param [in] aFullName [\b String]
   * returns the value
   **/
  public FullName(String aFullName)
  {
    fullName = aFullName;
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setFullName 
   * @param [in] aFullName [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setFullName(String aFullName)
  {
    boolean wasSet = false;
    fullName = aFullName;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name getFullName 
   * @retval [\b String]
   * returns the value
   **/
  public String getFullName()
  {
    return fullName;
  }

  public void delete()
  {}

  /**
   * @name toString 
   * @retval [\b String]
   * returns the value
   **/
  public String toString()
  {
    return super.toString() + "["+
            "fullName" + ":" + getFullName()+ "]";
  }
}