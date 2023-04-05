package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 29 "ce204-hw2-organization-lib-3.ump"
// line 85 "ce204-hw2-organization-lib-3.ump"
public class Prescription
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Prescription Associations
  private List<Therapy> therapies;
  private Patient patient;
  private List<Doctor> doctors;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name getTreatment 
   * @param [in] index [\b int]
   * @retval [\b getTreatment]
   * returns the value
   **/
  public Prescription(Patient aPatient)
  {
    therapies = new ArrayList<Therapy>();
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create prescription due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /* Code from template association_GetMany */
  /**
   * @name getTherapy 
   * @param [in] index [\b int]
   * @retval [\b Therapy]
   * returns the value
   **/
  public Therapy getTherapy(int index)
  {
    Therapy aTherapy = therapies.get(index);
    return aTherapy;
  }

  /**
   * @name getTherapies 
   * @retval [\b List<Therapy>]
   * returns the value
   **/
  public List<Therapy> getTherapies()
  {
    List<Therapy> newTherapies = Collections.unmodifiableList(therapies);
    return newTherapies;
  }

  /**
   * @name numberOfTherapies 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfTherapies()
  {
    int number = therapies.size();
    return number;
  }

  /**
   * @name hasTherapies 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasTherapies()
  {
    boolean has = therapies.size() > 0;
    return has;
  }

  /**
   * @name indexOfTherapy 
   * @param [in] aTherapy [\b Therapy]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfTherapy(Therapy aTherapy)
  {
    int index = therapies.indexOf(aTherapy);
    return index;
  }
  
  /* Code from template association_GetOne */
  /**
   * @name getPatient 
   * @retval [\b Patient]
   * returns the value
   **/
  public Patient getPatient()
  {
    return patient;
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getDoctor 
   * @param [in] index [\b int]
   * @retval [\b Doctor]
   * returns the value
   **/
  public Doctor getDoctor(int index)
  {
    Doctor aDoctor = doctors.get(index);
    return aDoctor;
  }

  /**
   * @name getDoctors 
   * @retval [\b List<Doctor>]
   * returns the value
   **/
  public List<Doctor> getDoctors()
  {
    List<Doctor> newDoctors = Collections.unmodifiableList(doctors);
    return newDoctors;
  }

  /**
   * @name numberOfDoctors 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfDoctors()
  {
    int number = doctors.size();
    return number;
  }

  /**
   * @name hasDoctors 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasDoctors()
  {
    boolean has = doctors.size() > 0;
    return has;
  }

  /**
   * @name indexOfDoctor 
   * @param [in] aDoctor [\b Doctor]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfDoctor(Doctor aDoctor)
  {
    int index = doctors.indexOf(aDoctor);
    return index;
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
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfTherapies 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfTherapies()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addTherapy 
   * @param [in] aPatient [\b addTherapy]
   * @retval [\b addTherapy]
   * returns the value
   **/
  public Therapy addTherapy(Patient aPatient)
  {
    return new Therapy(aPatient, this);
  }

  /**
   * @name addTherapy 
   * @param [in] aTherapy [\b Therapy]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addTherapy(Therapy aTherapy)
  {
    boolean wasAdded = false;
    if (therapies.contains(aTherapy)) { return false; }
    Prescription existingPrescription = aTherapy.getPrescription();
    boolean isNewPrescription = existingPrescription != null && !this.equals(existingPrescription);
    if (isNewPrescription)
    {
      aTherapy.setPrescription(this);
    }
    else
    {
      therapies.add(aTherapy);
    }
    wasAdded = true;
    return wasAdded;
  }

  /**
   * @name removeTherapy 
   * @param [in] aTherapy [\b Therapy]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeTherapy(Therapy aTherapy)
  {
    boolean wasRemoved = false;
    //Unable to remove aTherapy, as it must always have a prescription
    if (!this.equals(aTherapy.getPrescription()))
    {
      therapies.remove(aTherapy);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addTherapyAt 
   * @param [in] aTherapy [\b Therapy]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addTherapyAt(Therapy aTherapy, int index)
  {  
    boolean wasAdded = false;
    if(addTherapy(aTherapy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTherapies()) { index = numberOfTherapies() - 1; }
      therapies.remove(aTherapy);
      therapies.add(index, aTherapy);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveTherapyAt 
   * @param [in] aTherapy [\b Therapy]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveTherapyAt(Therapy aTherapy, int index)
  {
    boolean wasAdded = false;
    if(therapies.contains(aTherapy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTherapies()) { index = numberOfTherapies() - 1; }
      therapies.remove(aTherapy);
      therapies.add(index, aTherapy);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTherapyAt(aTherapy, index);
    }
    return wasAdded;
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
      existingPatient.removePrescription(this);
    }
    patient.addPrescription(this);
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfDoctors 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfDoctors()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addDoctor 
   * @param [in] aDoctor [\b Doctor]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDoctor(Doctor aDoctor)
  {
    boolean wasAdded = false;
    if (doctors.contains(aDoctor)) { return false; }
    doctors.add(aDoctor);
    if (aDoctor.indexOfPrescription(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addPrescription(this);
      if (!wasAdded)
      {
        doctors.remove(aDoctor);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removeDoctor 
   * @param [in] aDoctor [\b Doctor]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeDoctor(Doctor aDoctor)
  {
    boolean wasRemoved = false;
    if (!doctors.contains(aDoctor))
    {
      return wasRemoved;
    }

    int oldIndex = doctors.indexOf(aDoctor);
    doctors.remove(oldIndex);
    if (aDoctor.indexOfPrescription(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removePrescription(this);
      if (!wasRemoved)
      {
        doctors.add(oldIndex,aDoctor);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addDoctorAt 
   * @param [in] aDoctor [\b Doctor]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDoctorAt(Doctor aDoctor, int index)
  {  
    boolean wasAdded = false;
    if(addDoctor(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveDoctorAt 
   * @param [in] aDoctor [\b Doctor]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveDoctorAt(Doctor aDoctor, int index)
  {
    boolean wasAdded = false;
    if(doctors.contains(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorAt(aDoctor, index);
    }
    return wasAdded;
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
  /**
   * @name addDiagnosi 
   * @param [in] aDiagnosi [\b Diagnosis]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasAdded = false;
    if (diagnosis.contains(aDiagnosi)) { return false; }
    diagnosis.add(aDiagnosi);
    if (aDiagnosi.indexOfPrescription(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addPrescription(this);
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
    if (aDiagnosi.indexOfPrescription(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removePrescription(this);
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
    for(int i=therapies.size(); i > 0; i--)
    {
      Therapy aTherapy = therapies.get(i - 1);
      aTherapy.delete();
    }
    Patient placeholderPatient = patient;
    this.patient = null;
    if(placeholderPatient != null)
    {
      placeholderPatient.removePrescription(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removePrescription(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removePrescription(this);
    }
  }

}