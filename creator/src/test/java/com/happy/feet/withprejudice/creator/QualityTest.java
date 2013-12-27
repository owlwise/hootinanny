package com.happy.feet.withprejudice.creator;

import static org.junit.Assert.*;

import org.junit.Test;

public class QualityTest
{
  public static Quality getAmbidextrousuality()
  {
    Quality ambidextrous = new Quality();
    
    ambidextrous.setCost(5);
    ambidextrous.setDescription("Ambidextrous");
    ambidextrous.setType(Type.POSITIVE);
    
    return ambidextrous;
  }

  @Test
  public final void testType()
  {
    Quality testQuality = getAmbidextrousuality();
    assertSame("Quality tyep should be positive",Type.POSITIVE,testQuality.getType());
  }

  @Test
  public final void testDescription()
  {
    Quality testQuality = getAmbidextrousuality();
    assertSame("Quality name should be Ambidextrous","Ambidextrous",testQuality.getDescription());
  }

  @Test
  public final void testCost()
  {
    Quality testQuality = getAmbidextrousuality();
    assertSame("Cost should be 5 BO",5,testQuality.getCost());
  }

}
