package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 63 "ce204-hw2-organization-lib-2.ump"
// line 129 "ce204-hw2-organization-lib-2.ump"
public class Phone
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Phone Attributes
  private String phone;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Phone 
   * @param [in] aPhone [\b String]
   **/
  public Phone(String aPhone)
  {
    phone = aPhone;
  }

  //------------------------
  // INTERFACE
  //------------------------

  /**
   * @name setPhone 
   * @param [in] aPhone [\b String]
   * @retval [\b boolean]
   **/
  public boolean setPhone(String aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name getPhone 
   * @retval [\b String]
   **/
  public String getPhone()
  {
    return phone;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "phone" + ":" + getPhone()+ "]";
  }
}