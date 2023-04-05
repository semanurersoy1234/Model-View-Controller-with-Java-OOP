package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 58 "ce204-hw2-organization-lib-2.ump"
// line 124 "ce204-hw2-organization-lib-2.ump"
public class Address
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Address Attributes
  private String address;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Address 
   * @param [in] aAddress [\b String]
   * returns the value
   **/
  public Address(String aAddress)
  {
    address = aAddress;
  }

  //------------------------
  // INTERFACE
  //------------------------

   /**
   * @name setAddress 
   * @param [in] aAddress [\b String]
   * @retval [\b boolean]
   * set the value
   **/
  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name getAddress 
   * @retval [\b String]
   * returns the value
   **/
  public String getAddress()
  {
    return address;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "address" + ":" + getAddress()+ "]";
  }
}