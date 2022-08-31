import java.util.*;

public class State
{
  private Map<Object, Object> map;
    

  public State()
  {
    //Hashmap
    map = new TreeMap<>();
  }

  public void setVariableValue(Object one, Object two)
  {
    map.put(one, two);
  }
  //Sets variable values

  public Object getVariableValue(String one)
  {
    return map.get(one);
  }
  //Gets variable values
}