public class Primitives{
  int defaultInt;
  long defaultLong;
  float defaultFloat;
  double defaultDouble;
  char defaultChar;
  boolean defaultBoolean;
  byte defaultByte;
      public static void main(String[] args) {
      
      Primitives value = new Primitives();
      int assignedInt= 4;
      long assignedLong = 100000L;
      float assignedFloat = 5.5f;
      double assignedDouble = 123.45;
      char assignedChar = 'A';
      boolean assignedBoolean = true;
      byte assignedByte= 10;
      short assignedShort= 1000;

      System.out.println("Assigned valuess");
      System.out.println(assignedInt);
      System.out.println(assignedLong);
      System.out.println(assignedFloat);
      System.out.println(assignedDouble);
      System.out.println(assignedChar);
      System.out.println(assignedBoolean);
      System.out.println(assignedByte);
	  System.out.println(assignedShort);
      
      System.out.println(" ");
  
      System.out.println("Default valuess");
      System.out.println(value.defaultInt);
      System.out.println(value.defaultLong);
      System.out.println(value.defaultFloat);
      System.out.println(value.defaultDouble);
      System.out.println(value.defaultChar);
      System.out.println(value.defaultBoolean);
      System.out.println(value.defaultByte);

  }
}