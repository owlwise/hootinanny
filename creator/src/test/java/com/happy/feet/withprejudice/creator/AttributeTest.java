package com.happy.feet.withprejudice.creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttributeTest
{
  public static Attribute getStrengthAttribute()
  {
    Attribute strength = new Attribute();
    
    strength.setDescription("Strength");
    strength.setValue(5l);
    strength.setType(Type.PHYSICAL);
    strength.setMaxValue(6l);
    strength.setMinValue(1l);
    strength.setCost(40);
    
    return strength;
  }

  @Test
  public final void testDescription()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertEquals("Strength", testAttribute.getDescription());
  }

  @Test
  public final void testGetValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- should be 5 ",5l, testAttribute.getValue());
  }

  @Test
  public final void testGetType()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength is a Physical Stat",Type.PHYSICAL, testAttribute.getType());
  }

  @Test
  public final void testGetMinValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength Min should be 1 ",1l, testAttribute.getMinValue());
  }

  @Test
  public final void testGetMaxValue()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength Max should be 6 ",6l, testAttribute.getMaxValue());
  }

  @Test
  public final void testGetCost()
  {
    Attribute testAttribute = getStrengthAttribute();
    assertSame("Faliure -- Strength should cost 40 BP ",40, testAttribute.getCost());
  }

}
