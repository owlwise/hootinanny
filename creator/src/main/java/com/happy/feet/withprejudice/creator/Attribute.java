package com.happy.feet.withprejudice.creator;

public class Attribute
{
  String description;
  double value;
  Enum<Type> type;
  double minValue;
  double maxValue;
  int cost;
  
  public String getDescription()
  {
    return description;
  }
  public void setDescription(String description)
  {
    this.description = description;
  }
  public double getValue()
  {
    return value;
  }
  public void setValue(double value)
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
  public double getMinValue()
  {
    return minValue;
  }
  public void setMinValue(double minValue)
  {
    this.minValue = minValue;
  }
  public double getMaxValue()
  {
    return maxValue;
  }
  public void setMaxValue(double maxValue)
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
