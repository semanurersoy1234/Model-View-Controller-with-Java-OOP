package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 1 "ce204-hw2-organization-lib-3.ump"
// line 53 "ce204-hw2-organization-lib-3.ump"
public class Patient
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Patient Associations
  private List<Treatment> treatments;
  private List<Prescription> prescriptions;
  private List<Doctor> doctors;
  private List<Examination> examinations;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------
  /**
   * @name Patient 
   * returns the value
   **/
  public Patient()
  {
    treatments = new ArrayList<Treatment>();
    prescriptions = new ArrayList<Prescription>();
    doctors = new ArrayList<Doctor>();
    examinations = new ArrayList<Examination>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /* Code from template association_GetMany */
  /**
   * @name getTreatment 
   * @param [in] index [\b int]
   * @retval [\b getTreatment]
   * returns the value
   **/
  public Treatment getTreatment(int index)
  {
    Treatment aTreatment = treatments.get(index);
    return aTreatment;
  }

  /**
   * @name getTreatments 
   * @retval [\b ist<Treatment>]
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
   * @name minimumNumberOfTreatments 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfTreatments()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addTreatment 
   * @retval [\b Treatment]
   * returns the value
   **/
  public Treatment addTreatment()
  {
    return new Treatment(this);
  }

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
    Patient existingPatient = aTreatment.getPatient();
    boolean isNewPatient = existingPatient != null && !this.equals(existingPatient);
    if (isNewPatient)
    {
      aTreatment.setPatient(this);
    }
    else
    {
      treatments.add(aTreatment);
    }
    wasAdded = true;
    return wasAdded;
  }

  /**
   * @name removeTreatment 
   * @param [in] aTreatment [\b Treatment]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeTreatment(Treatment aTreatment)
  {
    boolean wasRemoved = false;
    //Unable to remove aTreatment, as it must always have a patient
    if (!this.equals(aTreatment.getPatient()))
    {
      treatments.remove(aTreatment);
      wasRemoved = true;
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
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addPrescription 
   * @retval [\b Prescription]
   * returns the value
   **/
  public Prescription addPrescription()
  {
    return new Prescription(this);
  }

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
    Patient existingPatient = aPrescription.getPatient();
    boolean isNewPatient = existingPatient != null && !this.equals(existingPatient);
    if (isNewPatient)
    {
      aPrescription.setPatient(this);
    }
    else
    {
      prescriptions.add(aPrescription);
    }
    wasAdded = true;
    return wasAdded;
  }

  /**
   * @name removePrescription 
   * @param [in] aPrescription [\b Prescription]
   * @retval [\b removePrescription]
   * returns the value
   **/
  public boolean removePrescription(Prescription aPrescription)
  {
    boolean wasRemoved = false;
    //Unable to remove aPrescription, as it must always have a patient
    if (!this.equals(aPrescription.getPatient()))
    {
      prescriptions.remove(aPrescription);
      wasRemoved = true;
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
    if (aDoctor.indexOfPatient(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctor.addPatient(this);
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
    if (aDoctor.indexOfPatient(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctor.removePatient(this);
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
   * param [in] aDoctor [\b Doctor]
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
   * param [in] aDoctor [\b Doctor]
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
   * @name minimumNumberOfExaminations 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addExamination 
   * @param [in] aDoctor [\b Doctor]
   * @retval [\b Examination]
   * returns the value
   **/
  public Examination addExamination(Doctor aDoctor)
  {
    return new Examination(this, aDoctor);
  }

  /**
   * @name addExamination 
   * @param [in] aExamination [\b Examination]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    Patient existingPatient = aExamination.getPatient();
    boolean isNewPatient = existingPatient != null && !this.equals(existingPatient);
    if (isNewPatient)
    {
      aExamination.setPatient(this);
    }
    else
    {
      examinations.add(aExamination);
    }
    wasAdded = true;
    return wasAdded;
  }

  /**
   * @name removeExamination 
   * @param [in] aExamination [\b Examination]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    //Unable to remove aExamination, as it must always have a patient
    if (!this.equals(aExamination.getPatient()))
    {
      examinations.remove(aExamination);
      wasRemoved = true;
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
   * @name minimumNumberOfDiagnosis 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfDiagnosis()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToOne */
  /**
   * @name addDiagnosi 
   * @retval [\b Diagnosis]
   * returns the value
   **/
  public Diagnosis addDiagnosi()
  {
    return new Diagnosis(this);
  }

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
    Patient existingPatient = aDiagnosi.getPatient();
    boolean isNewPatient = existingPatient != null && !this.equals(existingPatient);
    if (isNewPatient)
    {
      aDiagnosi.setPatient(this);
    }
    else
    {
      diagnosis.add(aDiagnosi);
    }
    wasAdded = true;
    return wasAdded;
  }

  /**
   * @name removeDiagnosi 
   * @param [in] aDiagnosi [\b Diagnosis]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removeDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasRemoved = false;
    //Unable to remove aDiagnosi, as it must always have a patient
    if (!this.equals(aDiagnosi.getPatient()))
    {
      diagnosis.remove(aDiagnosi);
      wasRemoved = true;
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
    for(int i=treatments.size(); i > 0; i--)
    {
      Treatment aTreatment = treatments.get(i - 1);
      aTreatment.delete();
    }
    for(int i=prescriptions.size(); i > 0; i--)
    {
      Prescription aPrescription = prescriptions.get(i - 1);
      aPrescription.delete();
    }
    ArrayList<Doctor> copyOfDoctors = new ArrayList<Doctor>(doctors);
    doctors.clear();
    for(Doctor aDoctor : copyOfDoctors)
    {
      aDoctor.removePatient(this);
    }
    for(int i=examinations.size(); i > 0; i--)
    {
      Examination aExamination = examinations.get(i - 1);
      aExamination.delete();
    }
    for(int i=diagnosis.size(); i > 0; i--)
    {
      Diagnosis aDiagnosi = diagnosis.get(i - 1);
      aDiagnosi.delete();
    }
  }

}