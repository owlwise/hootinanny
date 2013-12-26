package com.happy.feet.withprejudice.creator;

public class Attribute
{
  String description;
  long value;
  Enum<Type> type;
  long minValue;
  long maxValue;
  int cost;
  
  public String getDescription()
  {
    return description;
  }
  public void setDescription(String description)
  {
    this.description = description;
  }
  public long getValue()
  {
    return value;
  }
  public void setValue(long value)
  {
    this.value = value;
  }
  public Enum<Type> getType()
  {
    return type;
  }
  public void setType(Enum<Type> type)
  {
    this.type = type;
  }
  public long getMinValue()
  {
    return minValue;
  }
  public void setMinValue(long minValue)
  {
    this.minValue = minValue;
  }
  public long getMaxValue()
  {
    return maxValue;
  }
  public void setMaxValue(long maxValue)
  {
    this.maxValue = maxValue;
  }
  public int getCost()
  {
    return cost;
  }
  public void setCost(int cost)
  {
    this.cost = cost;
  }
}
