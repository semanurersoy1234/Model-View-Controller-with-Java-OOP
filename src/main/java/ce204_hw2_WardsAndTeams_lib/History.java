package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 68 "ce204-hw2-organization-lib-2.ump"
// line 134 "ce204-hw2-organization-lib-2.ump"
public class History
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //History Attributes
  private String sickness;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name History 
   * @param [in] aSickness [\b String]
   **/
  public History(String aSickness)
  {
    sickness = aSickness;
  }

  //------------------------
  // INTERFACE
  //------------------------

  
  /**
   * @name setSickness 
   * @param [in] aSickness [\b String]
   * @retval [\b boolean]
   * set the value
   **/
  public boolean setSickness(String aSickness)
  {
    boolean wasSet = false;
    sickness = aSickness;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name getSickness 
   * @retval [\b String]
   * return the value
   **/
  public String getSickness()
  {
    return sickness;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "sickness" + ":" + getSickness()+ "]";
  }
}