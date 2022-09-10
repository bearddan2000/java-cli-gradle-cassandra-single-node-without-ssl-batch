
package example.dto;

public enum CQLOPT {
  KEYSPACE("-create-keyspace.cql", "Keyspace"),
  INDEX("-index-table.cql", "Index"),
  SELECT("-select-table.cql", "Select"),
  BATCH("-run-batch.cql", "Batch"),
  VIEW("-create-view.cql", "View"),
  INSERT("-insert-table.cql", "Insert"),
  CREATE("-create-table.cql", "Create");

  public final String cqlFile;
  public final String operation;

  private CQLOPT(String file, String op)
  {
    this.cqlFile = file;
    this.operation = op;
  }

}
