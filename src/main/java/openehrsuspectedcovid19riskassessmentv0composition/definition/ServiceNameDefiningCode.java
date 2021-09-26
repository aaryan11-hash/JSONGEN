package openehrsuspectedcovid19riskassessmentv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ServiceNameDefiningCode implements EnumValueSet {
  CONTACT_TRACING("Contact tracing", "", "SNOMED-CT", "225368008"),

  ISOLATION_OF_INFECTION_CONTACT("Isolation of infection contact", "", "SNOMED-CT", "170499009");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ServiceNameDefiningCode(String value, String description, String terminologyId, String code) {
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
