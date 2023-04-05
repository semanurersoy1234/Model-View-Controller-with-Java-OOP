package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 81 "ce204-hw2-Organization-lib.ump"
// line 197 "ce204-hw2-Organization-lib.ump"
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
   * returns the address value
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
   * returns the value
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
   * Returns the set address value
   **/
  public String getAddress()
  {
    return address;
  }

  public void delete()
  {}

  /**
   * @name toString 
   * @retval [\b String]
   **/
  public String toString()
  {
    return super.toString() + "["+
            "address" + ":" + getAddress()+ "]";
  }
}