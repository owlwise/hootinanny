package com.happy.feet.withprejudice.creator;

import java.util.List;

public class Character
{
  String name;
  Enum<MetaType> race;
  List<Quality> positiveQualities;
  List<Attribute> attributes;
  List<Skill> skills;
  
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public Enum<MetaType> getRace()
  {
    return race;
  }
  public void setRace(Enum<MetaType> race)
  {
    this.race = race;
  }
  public List<Quality> getPositiveQualities()
  {
    return positiveQualities;
  }
  public void setPositiveQualities(List<Quality> positiveQualities)
  {
    this.positiveQualities = positiveQualities;
  }
  public List<Attribute> getAttributes()
  {
    return attributes;
  }
  public void setAttributes(List<Attribute> attributes)
  {
    this.attributes = attributes;
  }
  public List<Skill> getSkills()
  {
    return skills;
  }
  public void setSkills(List<Skill> skills)
  {
    this.skills = skills;
  }

}
