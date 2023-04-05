package ce204_hw2_WardsAndTeams_lib;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 1 "ce204-hw2-organization-lib-2.ump"
// line 78 "ce204-hw2-organization-lib-2.ump"
public class Hospital
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hospital Attributes
  private String name;
  private Address address;
  private Phone phone;

  //Hospital Associations
  private List<Team> teams;
  private List<Ward> wards;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  /**
   * @name Hospital 
   * @param [in] aName [\b String]
   * @param [in] aAddress [\b Address]
   * @param [in] aPhone [\b Phone]
   **/
  public Hospital(String aName, Address aAddress, Phone aPhone)
  {
    name = aName;
    address = aAddress;
    phone = aPhone;
    teams = new ArrayList<Team>();
    wards = new ArrayList<Ward>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  /**
   * @name setName 
   * @param [in] aName [\b String]
   * @retval [\b boolean]
   * set the value
   **/
  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setAddress 
   * @param [in] aAddress [\b Address]
   * @retval [\b boolean]
   * set the value
   **/
  public boolean setAddress(Address aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name setPhone 
   * @param [in] aPhone [\b Phone]
   * @retval [\b boolean]
   * set the value
   **/
  public boolean setPhone(Phone aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }

  /**
   * @name getName 
   * @retval [\b String]
   * return the value
   **/
  public String getName()
  {
    return name;
  }

  /**
   * @name getAddress 
   * @retval [\b Address]
   * return the value
   **/
  public Address getAddress()
  {
    return address;
  }
  
  /**
   * @name setAddress 
   * @param [in] Address [\b String]
   * set the value
   **/
  public void setAddress(String Address) {
	  address.setAddress(Address);
  }
  /**
   * @name getAddresses 
   * @retval [\b String]
   * return the value
   **/
  public String getAddresses() {
	  return address.getAddress();
  }

  /**
   * @name getPhone 
   * @retval [\b Phone]
   * return the value
   **/
  public Phone getPhone()
  {
    return phone;
  }
  
  /**
   * @name setPhone 
   * @param [in] Phone [\b String]
   * set the value
   **/
  public void setPhone(String Phone) {
	  phone.setPhone(Phone);
  }
  /**
   * @name getPhonee 
   * @retval [\b String]
   * return the value
   **/
  public String getPhonee() {
	  return phone.getPhone();
  }
  
  /* Code from template association_GetMany */
  
  /**
   * @name getTeam 
   * @param [in] index [\b int]
   * @retval [\b Team]
   * return the value
   **/
  public Team getTeam(int index)
  {
    Team aTeam = teams.get(index);
    return aTeam;
  }

  /**
   * @name getTeams 
   * @retval [\b List<Team>]
   * return the value
   **/
  public List<Team> getTeams()
  {
    List<Team> newTeams = Collections.unmodifiableList(teams);
    return newTeams;
  }

  /**
   * @name numberOfTeams 
   * @retval [\b int]
   * return the value
   **/
  public int numberOfTeams()
  {
    int number = teams.size();
    return number;
  }

  /**
   * @name hasTeams 
   * @retval [\b boolean]
   * return the value
   **/
  public boolean hasTeams()
  {
    boolean has = teams.size() > 0;
    return has;
  }

  /**
   * @name indexOfTeam 
   * @param [in] aTeam [\b Team]
   * @retval [\b int]
   * return the value
   **/
  public int indexOfTeam(Team aTeam)
  {
    int index = teams.indexOf(aTeam);
    return index;
  }
  /* Code from template association_GetMany */
  
  /**
   * @name getWard 
   * @param [in] index [\b int]
   * @retval [\b Ward]
   * return the value
   **/
  public Ward getWard(int index)
  {
    Ward aWard = wards.get(index);
    return aWard;
  }

  public List<Ward> getWards()
  {
    List<Ward> newWards = Collections.unmodifiableList(wards);
    return newWards;
  }

  public int numberOfWards()
  {
    int number = wards.size();
    return number;
  }

  public boolean hasWards()
  {
    boolean has = wards.size() > 0;
    return has;
  }

  public int indexOfWard(Ward aWard)
  {
    int index = wards.indexOf(aWard);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfTeamsValid()
  {
    boolean isValid = numberOfTeams() >= minimumNumberOfTeams();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTeams()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public Team addTeam(String aName, ConsultantDoctor aTeamleader)
  {
    Team aNewTeam = new Team(aName, this, aTeamleader);
    return aNewTeam;
  }

  public boolean addTeam(Team aTeam)
  {
    boolean wasAdded = false;
    if (teams.contains(aTeam)) { return false; }
    Hospital existingHospital = aTeam.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);

    if (isNewHospital && existingHospital.numberOfTeams() <= minimumNumberOfTeams())
    {
      return wasAdded;
    }
    if (isNewHospital)
    {
      aTeam.setHospital(this);
    }
    else
    {
      teams.add(aTeam);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTeam(Team aTeam)
  {
    boolean wasRemoved = false;
    //Unable to remove aTeam, as it must always have a hospital
    if (this.equals(aTeam.getHospital()))
    {
      return wasRemoved;
    }

    //hospital already at minimum (1)
    if (numberOfTeams() <= minimumNumberOfTeams())
    {
      return wasRemoved;
    }

    teams.remove(aTeam);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTeamAt(Team aTeam, int index)
  {  
    boolean wasAdded = false;
    if(addTeam(aTeam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTeams()) { index = numberOfTeams() - 1; }
      teams.remove(aTeam);
      teams.add(index, aTeam);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTeamAt(Team aTeam, int index)
  {
    boolean wasAdded = false;
    if(teams.contains(aTeam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTeams()) { index = numberOfTeams() - 1; }
      teams.remove(aTeam);
      teams.add(index, aTeam);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTeamAt(aTeam, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Ward addWard(String aName, Ward.Gender aPatientsGender, int aCapacity)
  {
    return new Ward(aName, aPatientsGender, aCapacity, this);
  }

  public boolean addWard(Ward aWard)
  {
    boolean wasAdded = false;
    if (wards.contains(aWard)) { return false; }
    Hospital existingHospital = aWard.getHospital();
    boolean isNewHospital = existingHospital != null && !this.equals(existingHospital);
    if (isNewHospital)
    {
      aWard.setHospital(this);
    }
    else
    {
      wards.add(aWard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWard(Ward aWard)
  {
    boolean wasRemoved = false;
    //Unable to remove aWard, as it must always have a hospital
    if (!this.equals(aWard.getHospital()))
    {
      wards.remove(aWard);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWardAt(Ward aWard, int index)
  {  
    boolean wasAdded = false;
    if(addWard(aWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWards()) { index = numberOfWards() - 1; }
      wards.remove(aWard);
      wards.add(index, aWard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWardAt(Ward aWard, int index)
  {
    boolean wasAdded = false;
    if(wards.contains(aWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWards()) { index = numberOfWards() - 1; }
      wards.remove(aWard);
      wards.add(index, aWard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWardAt(aWard, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (teams.size() > 0)
    {
      Team aTeam = teams.get(teams.size() - 1);
      aTeam.delete();
      teams.remove(aTeam);
    }
    
    while (wards.size() > 0)
    {
      Ward aWard = wards.get(wards.size() - 1);
      aWard.delete();
      wards.remove(aWard);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "address" + "=" + (getAddress() != null ? !getAddress().equals(this)  ? getAddress().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "phone" + "=" + (getPhone() != null ? !getPhone().equals(this)  ? getPhone().toString().replaceAll("  ","    ") : "this" : "null");
  }
}