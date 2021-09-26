package openehrsuspectedcovid19riskassessmentv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode implements EnumValueSet {
  PRESENT("Present", "The specific symptom or sign is present.", "local", "at0023"),

  INDETERMINATE("Indeterminate", "It is not possible to know if the symptom or sign is present or absent.", "local", "at0027"),

  ABSENT("Absent", "The specific symptom or sign is not present.", "local", "at0024");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode(String value, String description, String terminologyId, String code) {
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
