package openehrsuspectedcovid19riskassessmentv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ProblemDiagnosisNameDefiningCode implements EnumValueSet {
  SUSPECTED_DISEASE_CAUSED_BY_SEVERE_ACUTE_RESPIRATORY_CORONAVIRUS2_SITUATION("Suspected disease caused by severe acute respiratory coronavirus 2 (situation)", "", "SNOMED-CT", "840544004"),

  EXPOSURE_TO_SEVERE_ACUTE_RESPIRATORY_SYNDROME_CORONAVIRUS2_EVENT("Exposure to severe acute respiratory syndrome coronavirus 2 (event)", "", "SNOMED-CT", "840546002"),

  DISEASE_CAUSED_BY_SEVERE_ACUTE_RESPIRATORY_SYNDROME_CORONAVIRUS2_DISORDER("Disease caused by severe acute respiratory syndrome coronavirus 2 (disorder)", "", "SNOMED-CT", "840539006");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ProblemDiagnosisNameDefiningCode(String value, String description, String terminologyId,
      String code) {
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
