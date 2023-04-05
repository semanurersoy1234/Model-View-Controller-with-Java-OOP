package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 20 "ce204-hw2-organization-lib-3.ump"
// line 75 "ce204-hw2-organization-lib-3.ump"
public class Diagnosis
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Diagnosis Associations
  private List<Prescription> prescriptions;
  private List<Doctor> doctors;
  private Patient patient;
  private List<Examination> examinations;
  private List<Treatment> treatments;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Diagnosis 
   * @param [in] aPatient [\b Patient]
   * returns the value
   **/
  public Diagnosis(Patient aPatient)
  {
    prescriptions = new ArrayList<Prescription>();
    doctors = new ArrayList<Doctor>();
    boolean didAddPatient = setPatient(aPatient);
    if (!didAddPatient)
    {
      throw new RuntimeException("Unable to create diagnosi due to patient. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    examinations = new ArrayList<Examination>();
    treatments = new ArrayList<Treatment>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  /**
   * @name getPrescription 
   * @param [in] index [\b int]
   * @retval [\b Prescription]
   * returns the value
   **/
  public Prescription getPrescription(int index)
  {
    Prescription aPrescription = prescriptions.get(index);
    return aPrescription;
  }
 
  /**
   * @name getPrescriptions 
   * @retval [\b List<Prescription>]
   * returns the value
   **/
  public List<Prescription> getPrescriptions()
  {
    List<Prescription> newPrescriptions = Collections.unmodifiableList(prescriptions);
    return newPrescriptions;
  }
 
  /**
   * @name numberOfPrescriptions 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfPrescriptions()
  {
    int number = prescriptions.size();
    return number;
  }
 
  /**
   * @name hasPrescriptions 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasPrescriptions()
  {
    boolean has = prescriptions.size() > 0;
    return has;
  }
 
  /**
   * @name indexOfPrescription 
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfPrescription(Prescription aPrescription)
  {
    int index = prescriptions.indexOf(aPrescription);
    return index;
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
   * @name getExamination 
   * @param [in] index [\b int]
   * @retval [\b Examination]
   * returns the value
   **/
  public Examination getExamination(int index)
  {
    Examination aExamination = examinations.get(index);
    return aExamination;
  }
 
  /**
   * @name getExaminations 
   * @retval [\b List<Examination>]
   * returns the value
   **/
  public List<Examination> getExaminations()
  {
    List<Examination> newExaminations = Collections.unmodifiableList(examinations);
    return newExaminations;
  }

  /**
   * @name numberOfExaminations 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfExaminations()
  {
    int number = examinations.size();
    return number;
  }

  /**
   * @name hasExaminations 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasExaminations()
  {
    boolean has = examinations.size() > 0;
    return has;
  }

  /**
   * @name indexOfExamination 
   * @param [in] aExamination [\b Examination]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfExamination(Examination aExamination)
  {
    int index = examinations.indexOf(aExamination);
    return index;
  }
  
  /* Code from template association_GetMany */
  /**
   * @name getTreatment 
   * @param [in] aAddress [\b int]
   * @retval [\b Treatment]
   * returns the value
   **/
  public Treatment getTreatment(int index)
  {
    Treatment aTreatment = treatments.get(index);
    return aTreatment;
  }

  /**
   * @name getTreatments 
   * @retval [\b List<Treatment>]
   * returns the value
   **/
  public List<Treatment> getTreatments()
  {
    List<Treatment> newTreatments = Collections.unmodifiableList(treatments);
    return newTreatments;
  }

  /**
   * @name numberOfTreatments
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfTreatments()
  {
    int number = treatments.size();
    return number;
  }

  /**
   * @name hasTreatments 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasTreatments()
  {
    boolean has = treatments.size() > 0;
    return has;
  }

  /**
   * @name indexOfTreatment 
   * @param [in] aTreatment [\b Treatment]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfTreatment(Treatment aTreatment)
  {
    int index = treatments.indexOf(aTreatment);
    return index;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfPrescriptions 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfPrescriptions()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addPrescription 
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPrescription(Prescription aPrescription)
  {
    boolean wasAdded = false;
    if (prescriptions.contains(aPrescription)) { return false; }
    prescriptions.add(aPrescription);
    if (aPrescription.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPrescription.addDiagnosi(this);
      if (!wasAdded)
      {
        prescriptions.remove(aPrescription);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removePrescription 
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removePrescription(Prescription aPrescription)
  {
    boolean wasRemoved = false;
    if (!prescriptions.contains(aPrescription))
    {
      return wasRemoved;
    }

    int oldIndex = prescriptions.indexOf(aPrescription);
    prescriptions.remove(oldIndex);
    if (aPrescription.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPrescription.removeDiagnosi(this);
      if (!wasRemoved)
      {
        prescriptions.add(oldIndex,aPrescription);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addPrescriptionAt 
   * @param [in] aPrescription [\b Prescription]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPrescriptionAt(Prescription aPrescription, int index)
  {  
    boolean wasAdded = false;
    if(addPrescription(aPrescription))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrescriptions()) { index = numberOfPrescriptions() - 1; }
      prescriptions.remove(aPrescription);
      prescriptions.add(index, aPrescription);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMovePrescriptionAt 
   * @param [in] aPrescription [\b Prescription]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMovePrescriptionAt(Prescription aPrescription, int index)
  {
    boolean wasAdded = false;
    if(prescriptions.contains(aPrescription))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrescriptions()) { index = numberOfPrescriptions() - 1; }
      prescriptions.remove(aPrescription);
      prescriptions.add(index, aPrescription);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPrescriptionAt(aPrescription, index);
    }
    return wasAdded;
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
    if (aDoctor.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addDiagnosi(this);
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
    if (aDoctor.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removeDiagnosi(this);
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
      existingPatient.removeDiagnosi(this);
    }
    patient.addDiagnosi(this);
    wasSet = true;
    return wasSet;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfExaminations 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    examinations.add(aExamination);
    if (aExamination.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aExamination.addDiagnosi(this);
      if (!wasAdded)
      {
        examinations.remove(aExamination);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removeExamination 
   * @param [in] aExamination [\b Examination]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    if (!examinations.contains(aExamination))
    {
      return wasRemoved;
    }

    int oldIndex = examinations.indexOf(aExamination);
    examinations.remove(oldIndex);
    if (aExamination.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aExamination.removeDiagnosi(this);
      if (!wasRemoved)
      {
        examinations.add(oldIndex,aExamination);
      }
    }
    return wasRemoved;
  } 
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addExaminationAt 
   * @param [in] aExamination [\b Examination]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addExaminationAt(Examination aExamination, int index)
  {  
    boolean wasAdded = false;
    if(addExamination(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveExaminationAt 
   * @param [in] aExamination [\b Examination]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveExaminationAt(Examination aExamination, int index)
  {
    boolean wasAdded = false;
    if(examinations.contains(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExaminationAt(aExamination, index);
    }
    return wasAdded;
  }
  
  /* Code from template association_MinimumNumberOfMethod */
  /**
   * @name minimumNumberOfTreatments 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfTreatments()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addTreatment 
   * @param [in] aTreatment [\b Treatment]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addTreatment(Treatment aTreatment)
  {
    boolean wasAdded = false;
    if (treatments.contains(aTreatment)) { return false; }
    treatments.add(aTreatment);
    if (aTreatment.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTreatment.addDiagnosi(this);
      if (!wasAdded)
      {
        treatments.remove(aTreatment);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removeTreatment 
   * @param [in] aTreatment [\b Treatment]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeTreatment(Treatment aTreatment)
  {
    boolean wasRemoved = false;
    if (!treatments.contains(aTreatment))
    {
      return wasRemoved;
    }

    int oldIndex = treatments.indexOf(aTreatment);
    treatments.remove(oldIndex);
    if (aTreatment.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTreatment.removeDiagnosi(this);
      if (!wasRemoved)
      {
        treatments.add(oldIndex,aTreatment);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addTreatmentAt 
   * @param [in] aTreatment [\b Treatment]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addTreatmentAt(Treatment aTreatment, int index)
  {  
    boolean wasAdded = false;
    if(addTreatment(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMoveTreatmentAt 
   * @param [in] aTreatment [\b Treatment]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMoveTreatmentAt(Treatment aTreatment, int index)
  {
    boolean wasAdded = false;
    if(treatments.contains(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTreatmentAt(aTreatment, index);
    }
    return wasAdded;
  }

  /**
   * @name delete 
   * returns the value
   **/
  public void delete()
  {
    ArrayList<Prescription> copyOfPrescriptions = new ArrayList<Prescription>(prescriptions);
    prescriptions.clear();
    for(Prescription aPrescription : copyOfPrescriptions)
    {
      aPrescription.removeDiagnosi(this);
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removeDiagnosi(this);
    }
    Patient placeholderPatient = patient;
    this.patient = null;
    if(placeholderPatient != null)
    {
      placeholderPatient.removeDiagnosi(this);
    }
    ArrayList<Examination> copyOfExaminations = new ArrayList<Examination>(examinations);
    examinations.clear();
    for(Examination aExamination : copyOfExaminations)
    {
      aExamination.removeDiagnosi(this);
    }
    ArrayList<Treatment> copyOfTreatments = new ArrayList<Treatment>(treatments);
    treatments.clear();
    for(Treatment aTreatment : copyOfTreatments)
    {
      aTreatment.removeDiagnosi(this);
    }
  }

}