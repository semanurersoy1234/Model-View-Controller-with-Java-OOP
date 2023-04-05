package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;


// line 46 "ce204-hw2-organization-lib-2.ump"
// line 110 "ce204-hw2-organization-lib-2.ump"
public class ConsultantDoctor extends Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConsultantDoctor Associations
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConsultantDoctor()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  
  /**
   * @name getTeam 
   * @retval [\b Team]
   * return the value
   **/
  public Team getTeam()
  {
    return team;
  }

  /**
   * @name hasTeam 
   * @retval [\b boolean]
   * has team value
   **/
  public boolean hasTeam()
  {
    boolean has = team != null;
    return has;
  }
  /* Code from template association_GetMany_specialization */
  
  /**
   * @name getPatient_Patient 
   * @param [in] index [\b int]
   * @retval [\b Patient]
   **/
  public Patient getPatient_Patient(int index)
  {
    Patient aPatient = (Patient)super.getPatient(index);
    return aPatient;
  }

  /* required for Java 7. */
  
  /**
   * @name getPatients_Patient 
   * @retval [\b List<Patient>]
   **/
  @SuppressWarnings("unchecked")
  public List<Patient> getPatients_Patient()
  {
    List<? extends Patient> newPatients = super.getPatients();
    return (List<Patient>)newPatients;
  }
  /* Code from template association_SetOptionalOneToOne */
  
  /**
   * @name setTeam 
   * @param [in] aNewTeam [\b Team]
   * @retval [\b boolean]
   **/
  public boolean setTeam(Team aNewTeam)
  {
    boolean wasSet = false;
    if (team != null && !team.equals(aNewTeam) && equals(team.getTeamleader()))
    {
      //Unable to setTeam, as existing team would become an orphan
      return wasSet;
    }

    team = aNewTeam;
    ConsultantDoctor anOldTeamleader = aNewTeam != null ? aNewTeam.getTeamleader() : null;

    if (!this.equals(anOldTeamleader))
    {
      if (anOldTeamleader != null)
      {
        anOldTeamleader.team = null;
      }
      if (team != null)
      {
        team.setTeamleader(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfPatients_Patient()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne_specialization */
 
  public void delete()
  {
    Team existingTeam = team;
    team = null;
    if (existingTeam != null)
    {
      existingTeam.delete();
    }
    super.delete();
  }

}