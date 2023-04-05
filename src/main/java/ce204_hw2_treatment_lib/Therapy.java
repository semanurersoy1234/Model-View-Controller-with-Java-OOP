package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


// line 38 "ce204-hw2-organization-lib-3.ump"
// line 96 "ce204-hw2-organization-lib-3.ump"
public class Therapy extends Treatment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Therapy Associations
  private Prescription prescription;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  
  /**
   * @name Therapy 
   * @param [in] aPatient [\b Patient]
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b boolean]
   * returns the value
   **/
  public Therapy(Patient aPatient, Prescription aPrescription)
  {
    super(aPatient);
    boolean didAddPrescription = setPrescription(aPrescription);
    if (!didAddPrescription)
    {
      throw new RuntimeException("Unable to create therapy due to prescription. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /* Code from template association_GetOne */
  /**
   * @name getPrescription 
   * @retval [\b Prescription]
   * returns the value
   **/
  public Prescription getPrescription()
  {
    return prescription;
  }
  
  /* Code from template association_SetOneToMany */
  /**
   * @name setPrescription 
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPrescription(Prescription aPrescription)
  {
    boolean wasSet = false;
    if (aPrescription == null)
    {
      return wasSet;
    }

    Prescription existingPrescription = prescription;
    prescription = aPrescription;
    if (existingPrescription != null && !existingPrescription.equals(aPrescription))
    {
      existingPrescription.removeTherapy(this);
    }
    prescription.addTherapy(this);
    wasSet = true;
    return wasSet;
  }

  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    Prescription placeholderPrescription = prescription;
    this.prescription = null;
    if(placeholderPrescription != null)
    {
      placeholderPrescription.removeTherapy(this);
    }
    super.delete();
  }

}