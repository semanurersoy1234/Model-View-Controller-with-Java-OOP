package ce204_hw2_treatment_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 7 "ce204-hw2-organization-lib-3.ump"
// line 60 "ce204-hw2-organization-lib-3.ump"
public class Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Associations
  private List<Treatment> treatments;
  private List<Prescription> prescriptions;
  private List<Examination> examinations;
  private List<Patient> patients;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Doctor 
   * returns the value
   **/
  public Doctor()
  {
    treatments = new ArrayList<Treatment>();
    prescriptions = new ArrayList<Prescription>();
    examinations = new ArrayList<Examination>();
    patients = new ArrayList<Patient>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  
  /* Code from template association_GetMany */
  /**
   * @name getTreatment 
   * @param [in] index [\b int]
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
   * @retval [\b getExaminations]
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
   * @name getPatient 
   * @param [in] index [\b int]
   * @retval [\b Patient]
   * returns the value
   **/
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }

  /**
   * @name getPatients 
   * @retval [\b List<Patient>]
   * returns the value
   **/
  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }
  
  /**
   * @name numberOfPatients 
   * @retval [\b int]
   * returns the value
   **/
  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }

  /**
   * @name hasPatients 
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }

  /**
   * @name indexOfPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b int]
   * returns the value
   **/
  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
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
    if (aTreatment.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTreatment.addDoctor(this);
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
    if (aTreatment.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTreatment.removeDoctor(this);
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
  public boolean addPrescription(Prescription aPrescription)
  {
    boolean wasAdded = false;
    if (prescriptions.contains(aPrescription)) { return false; }
    prescriptions.add(aPrescription);
    if (aPrescription.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPrescription.addDoctor(this);
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
    if (aPrescription.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPrescription.removeDoctor(this);
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
   * @param [in] aPrescription [\b addPrescriptionAt]
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
   * @param [in] aPrescription [\b addPrescriptionAt]
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
   * @param [in] aPatient [\b Patient]
   * @retval [\b Examination]
   * returns the value
   **/
  public Examination addExamination(Patient aPatient)
  {
    return new Examination(aPatient, this);
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
    Doctor existingDoctor = aExamination.getDoctor();
    boolean isNewDoctor = existingDoctor != null && !this.equals(existingDoctor);
    if (isNewDoctor)
    {
      aExamination.setDoctor(this);
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
    //Unable to remove aExamination, as it must always have a doctor
    if (!this.equals(aExamination.getDoctor()))
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
   * @name minimumNumberOfPatients 
   * @retval [\b int]
   * returns the value
   **/
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  
  /* Code from template association_AddManyToManyMethod */
  /**
   * @name addPatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    patients.add(aPatient);
    if (aPatient.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatient.addDoctor(this);
      if (!wasAdded)
      {
        patients.remove(aPatient);
      }
    }
    return wasAdded;
  }
  
  /* Code from template association_RemoveMany */
  /**
   * @name removePatient 
   * @param [in] aPatient [\b Patient]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    if (!patients.contains(aPatient))
    {
      return wasRemoved;
    }

    int oldIndex = patients.indexOf(aPatient);
    patients.remove(oldIndex);
    if (aPatient.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatient.removeDoctor(this);
      if (!wasRemoved)
      {
        patients.add(oldIndex,aPatient);
      }
    }
    return wasRemoved;
  }
  
  /* Code from template association_AddIndexControlFunctions */
  /**
   * @name addPatientAt 
   * @param [in] aPatient [\b Patient]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addPatientAt(Patient aPatient, int index)
  {  
    boolean wasAdded = false;
    if(addPatient(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }

  /**
   * @name addOrMovePatientAt 
   * @param [in] aPatient [\b Patient]
   * @param [in] index [\b int]
   * @retval [\b boolean]
   * returns the value
   **/
  public boolean addOrMovePatientAt(Patient aPatient, int index)
  {
    boolean wasAdded = false;
    if(patients.contains(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientAt(aPatient, index);
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
    if (aDiagnosi.indexOfDoctor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addDoctor(this);
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
    if (aDiagnosi.indexOfDoctor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeDoctor(this);
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
    ArrayList<Treatment> copyOfTreatments = new ArrayList<Treatment>(treatments);
    treatments.clear();
    for(Treatment aTreatment : copyOfTreatments)
    {
      aTreatment.removeDoctor(this);
    }
    ArrayList<Prescription> copyOfPrescriptions = new ArrayList<Prescription>(prescriptions);
    prescriptions.clear();
    for(Prescription aPrescription : copyOfPrescriptions)
    {
      aPrescription.removeDoctor(this);
    }
    for(int i=examinations.size(); i > 0; i--)
    {
      Examination aExamination = examinations.get(i - 1);
      aExamination.delete();
    }
    ArrayList<Patient> copyOfPatients = new ArrayList<Patient>(patients);
    patients.clear();
    for(Patient aPatient : copyOfPatients)
    {
      aPatient.removeDoctor(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeDoctor(this);
    }
  }

}