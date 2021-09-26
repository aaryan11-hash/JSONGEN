package openehrsuspectedcovid19riskassessmentv0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SymptomOrSignNameDefiningCode implements EnumValueSet {
  FEVER("Fever", "", "SNOMED_-CT", "386661006"),

  DIFFICULTY_BREATHING("Difficulty breathing", "", "SNOMED_-CT", "267036007"),

  PAIN_IN_THROAT("Pain in throat", "", "SNOMED_-CT", "162397003"),

  COUGH("Cough", "", "SNOMED_-CT", "49727002"),

  INFLUENZA_LIKE_SYMPTOMS("Influenza-like symptoms", "", "SNOMED_-CT", "315642008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SymptomOrSignNameDefiningCode(String value, String description, String terminologyId,
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
