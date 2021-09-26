package openehrsuspectedcovid19riskassessmentv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode2 implements EnumValueSet {
  PRESENT("Present", "The risk factor has been identified for this individual.", "local", "at0018"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if the risk factor is present or absent.", "local", "at0026"),

  ABSENT("Absent", "The risk factor has not been identified for this individual.", "local", "at0019");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode2(String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
