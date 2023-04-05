package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 15 "ce204-hw2-organization-lib-3.ump"
// line 69 "ce204-hw2-organization-lib-3.ump"
public class Examination
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Examination Associations
  private Patient patient;
  private Doctor doctor;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Examination 
   * @param [in] aPatient [\b Patient]
   * @param [in] aDoctor [\b Doctor]
   * returns the value
   **/
  public Examination(Patient aPatient, Doctor aDoctor)
  {
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create examination due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddDoctor = setDoctor(aDoctor);
    if (!didAddDoctor)
    {
      throw new RuntimeException("Unable to create examination due to doctor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  /**
   * @name Patient 
   * @retval [\b Patient]
   * returns the value
   **/
  public Patient getPatient()
  {
    return patient;
  }
  
  /* Code from template association_GetOne */
  /**
   * @name Patient 
   * @retval [\b Doctor]
   * returns the value
   **/
  public Doctor getDoctor()
  {
    return doctor;
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getDiagnosi 
   * @param [in] index [\b int]
   * @retval [\b Diagnosis]
   * returns the value
   **/
  public Diagnosis getDiagnosi(int index)
  {
    Diagnosis aDiagnosi = diagnosis.get(index);
    return aDiagnosi;
  }

  /**
   * @name getDiagnosis 
   * @retval [\b List<Diagnosis>]
   * returns the value
   **/
  public List<Diagnosis> getDiagnosis()
  {
    List<Diagnosis> newDiagnosis = Collections.unmodifiableList(diagnosis);
    return newDiagnosis;
  }

  /**
   * @name numberOfDiagnosis 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfDiagnosis()
  {
    int number = diagnosis.size();
    return number;
  }

  /**
   * @name hasDiagnosis 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasDiagnosis()
  {
    boolean has = diagnosis.size() > 0;
    return has;
  }

  /**
   * @name indexOfDiagnosi 
   * @param [in] aDiagnosi [\b Diagnosis]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfDiagnosi(Diagnosis aDiagnosi)
  {
    int index = diagnosis.indexOf(aDiagnosi);
    return index;
  }
  
  /* Code from template association_SetOneToMany */
  /**
   * @name setPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setPatient(Patient aPatient)
  {
    boolean wasSet = false;
    if (aPatient == null)
    {
      return wasSet;
    }

    Patient existingPatient = patient;
    patient = aPatient;
    if (existingPatient != null && !existingPatient.equals(aPatient))
    {
      existingPatient.removeExamination(this);
    }
    patient.addExamination(this);
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template association_SetOneToMany */
  /**
   * @name setDoctor 
   * @param [in] aDoctor [\b Doctor]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean setDoctor(Doctor aDoctor)
  {
    boolean wasSet = false;
    if (aDoctor == null)
    {
      return wasSet;
    }

    Doctor existingDoctor = doctor;
    doctor = aDoctor;
    if (existingDoctor != null && !existingDoctor.equals(aDoctor))
    {
      existingDoctor.removeExamination(this);
    }
    doctor.addExamination(this);
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfDiagnosis 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfDiagnosis()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasAdded = false;
    if (diagnosis.contains(aDiagnosi)) { return false; }
    diagnosis.add(aDiagnosi);
    if (aDiagnosi.indexOfExamination(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addExamination(this);
      if (!wasAdded)
      {
        diagnosis.remove(aDiagnosi);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removeDiagnosi 
   * @param [in] aDiagnosi [\b Diagnosis]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasRemoved = false;
    if (!diagnosis.contains(aDiagnosi))
    {
      return wasRemoved;
    }

    int oldIndex = diagnosis.indexOf(aDiagnosi);
    diagnosis.remove(oldIndex);
    if (aDiagnosi.indexOfExamination(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeExamination(this);
      if (!wasRemoved)
      {
        diagnosis.add(oldIndex,aDiagnosi);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addDiagnosiAt 
   * @param [in] aDiagnosi [\b Diagnosis]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDiagnosiAt(Diagnosis aDiagnosi, int index)
  {  
    boolean wasAdded = false;
    if(addDiagnosi(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveDiagnosiAt
   * @param [in] aDiagnosi [\b Diagnosis] 
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveDiagnosiAt(Diagnosis aDiagnosi, int index)
  {
    boolean wasAdded = false;
    if(diagnosis.contains(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDiagnosiAt(aDiagnosi, index);
    }
    return wasAdded;
  }

  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    Patient placeholderPatient = patient;
    this.patient = null;
    if(placeholderPatient != null)
    {
      placeholderPatient.removeExamination(this);
    }
    Doctor placeholderDoctor = doctor;
    this.doctor = null;
    if(placeholderDoctor != null)
    {
      placeholderDoctor.removeExamination(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeExamination(this);
    }
  }

}