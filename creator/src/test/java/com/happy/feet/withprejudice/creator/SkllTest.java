package com.happy.feet.withprejudice.creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkllTest
{
  public static Skill getPistolSkill()
  {
    Skill pistolSkill = new Skill();
    
    pistolSkill.setCost(12);;
    pistolSkill.setDescription("Pistol");
    pistolSkill.setGroup(SkillGroup.FIREARMS);
    pistolSkill.setRank(3);
    pistolSkill.setType(Type.ACTIVE);
    
    return pistolSkill;
  }

  @Test
  public final void testType()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Type should be Active",Type.ACTIVE,testSkill.getType());
  }

  @Test
  public final void testDescription()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Skill shojuld be called Pistol","Pistol",testSkill.getDescription());
  }

  @Test
  public final void testGroup()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Skill group should be Firearms",SkillGroup.FIREARMS,testSkill.getGroup());
  }

  @Test
  public final void testRank()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Should be Professional rank of 3",3,testSkill.getRank());
  }

  @Test
  public final void testCost()
  {
    Skill testSkill = getPistolSkill();
    assertSame("Should be a cost of 12 BP",12,testSkill.getCost());
  }

}
