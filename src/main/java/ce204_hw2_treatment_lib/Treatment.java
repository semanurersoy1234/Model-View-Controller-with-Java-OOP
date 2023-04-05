package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 34 "ce204-hw2-organization-lib-3.ump"
// line 91 "ce204-hw2-organization-lib-3.ump"
public class Treatment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Treatment Associations
  private Patient patient;
  private List<Doctor> doctors;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Treatment 
   * @param [in] aPatient [\b Patient]
   * returns the value
   **/
  public Treatment(Patient aPatient)
  {
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create treatment due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctors = new ArrayList<Doctor>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
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
   * @name aDoctor 
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
   * @retval [\b ist<Diagnosis>]
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
      existingPatient.removeTreatment(this);
    }
    patient.addTreatment(this);
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
    if (aDoctor.indexOfTreatment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addTreatment(this);
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
    if (aDoctor.indexOfTreatment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removeTreatment(this);
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
    if (aDiagnosi.indexOfTreatment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addTreatment(this);
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
    if (aDiagnosi.indexOfTreatment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeTreatment(this);
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
   *@param [in] aDiagnosi [\b Diagnosis]
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
      placeholderPatient.removeTreatment(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removeTreatment(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeTreatment(this);
    }
  }

}