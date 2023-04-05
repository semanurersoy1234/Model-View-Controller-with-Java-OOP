package ce204_hw2_organization_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 76 "ce204-hw2-Organization-lib.ump"
// line 192 "ce204-hw2-Organization-lib.ump"
public class History
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //History Attributes
  private String patientSickness;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name History 
   * @param [in] aPatientSickness [\b String]
   * returns the value
   **/
  public History(String aPatientSickness)
  {
    patientSickness = aPatientSickness;
  }

  //------------------------
  // INTERFACE
  //------------------------
  /**
   * @name setPatientSickness 
   * @param [in] aPatientSickness [\b String]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPatientSickness(String aPatientSickness)
  {
    boolean wasSet = false;
    patientSickness = aPatientSickness;
    wasSet = true;
    return wasSet;
  }
  /**
   * @name getPatientSickness 
   * @retval [\b String]
   * returns the value
   **/
  public String getPatientSickness()
  {
    return patientSickness;
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
            "patientSickness" + ":" + getPatientSickness()+ "]";
  }
}