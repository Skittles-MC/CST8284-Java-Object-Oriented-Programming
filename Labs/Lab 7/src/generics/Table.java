package generics;

import java.util.ArrayList;


public class Table {
 
  private static int row;
  private static int span = 14;
  
  public Table() {}
  
  public static <E> void displayEqualityTable(ArrayList<E> arList){

    // Print columns headers
    resetRow();
    System.out.print(getFormatedOutput());
    for (E e: arList) {
      System.out.print(getFormatedOutput(getClassSimpleName(e) + getRow()));
      incRow();
    }
    System.out.println("");

    //  Print out each row,starting with the name of the object
    resetRow();
    for (E eRow: arList){
      System.out.print(getFormatedOutput(getClassSimpleName(eRow) + getRow()));
      incRow();
      for (E eCol: arList)
        System.out.print( getFormatedOutput(eRow.equals(eCol)) );
      System.out.println();
    }
    
    System.out.println("\n");
  }
  
  private static <E> String getClassSimpleName(E e) {
    return e.getClass().getSimpleName();
  }
  
  private static int getRow() {
    return Table.row;
  }

  private static void incRow() {
    Table.row += 1;
  }
  
  private static void resetRow() {
    Table.row = 0;
  }
  
  private static String getFormatedOutput(String in) {
    StringBuilder sb = new StringBuilder(in);
    while (sb.length() < span)
      sb.insert(0, " ");
    return sb.toString();
  } 

  private static String getFormatedOutput() {
    StringBuilder sb = new StringBuilder();
    while (sb.length() < span)
      sb.insert(0, " ");
    return sb.toString();
  }
  
  private static String getFormatedOutput(boolean in) {
    StringBuilder sb = new StringBuilder( Boolean.toString(in) );
    while (sb.length() < span)
      sb.insert(0, " ");
    return sb.toString();
  } 
  
}

