package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 86 "ce204-hw2-Organization-lib.ump"
// line 202 "ce204-hw2-Organization-lib.ump"
public class Phone
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Phone Attributes
  private String phoneNumber;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Phone 
   * @param [in] aPhoneNumber [\b String]
   * returns the value
   **/
  public Phone(String aPhoneNumber)
  {
    phoneNumber = aPhoneNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setPhoneNumber 
   * @param [in] aPhoneNumber [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name getPhoneNumber 
   * @retval [\b String]
   * returns the value
   **/
  public String getPhoneNumber()
  {
    return phoneNumber;
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
            "phoneNumber" + ":" + getPhoneNumber()+ "]";
  }
}