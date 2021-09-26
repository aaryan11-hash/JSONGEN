package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.483857500+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1/Symptom or sign name
   * Description: Name of the symptom or sign being screened.
   */
  @Path("/items[at0004]/value|value")
  private String symptomOrSignNameValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Tree/Specific symptom/sign #1/Symptom or sign name/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour symptomOrSignNameNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1/Presence?
   * Description: Presence of the symptom or sign.
   */
  @Path("/items[at0005]/value|defining_code")
  private PresenceDefiningCode presenceDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Tree/Specific symptom/sign #1/Presence?/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1/Onset
   * Description: The date/time when the symptom or sign was first noticed.
   * Comment: Partial dates are allowed.
   */
  @Path("/items[at0006]/value|value")
  private TemporalAccessor onsetValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Tree/Specific symptom/sign #1/Onset/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour onsetNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1/Comment
   * Description: Additional narrative about the specific symptom or sign, not captured in other fields.
   */
  @Path("/items[at0035]/value|value")
  private String commentValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Tree/Specific symptom/sign #1/Comment/null_flavour
   */
  @Path("/items[at0035]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setSymptomOrSignNameValue(String symptomOrSignNameValue) {
     this.symptomOrSignNameValue = symptomOrSignNameValue;
  }

  public String getSymptomOrSignNameValue() {
     return this.symptomOrSignNameValue ;
  }

  public void setSymptomOrSignNameNullFlavourDefiningCode(
      NullFlavour symptomOrSignNameNullFlavourDefiningCode) {
     this.symptomOrSignNameNullFlavourDefiningCode = symptomOrSignNameNullFlavourDefiningCode;
  }

  public NullFlavour getSymptomOrSignNameNullFlavourDefiningCode() {
     return this.symptomOrSignNameNullFlavourDefiningCode ;
  }

  public void setPresenceDefiningCode(PresenceDefiningCode presenceDefiningCode) {
     this.presenceDefiningCode = presenceDefiningCode;
  }

  public PresenceDefiningCode getPresenceDefiningCode() {
     return this.presenceDefiningCode ;
  }

  public void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode) {
     this.presenceNullFlavourDefiningCode = presenceNullFlavourDefiningCode;
  }

  public NullFlavour getPresenceNullFlavourDefiningCode() {
     return this.presenceNullFlavourDefiningCode ;
  }

  public void setOnsetValue(TemporalAccessor onsetValue) {
     this.onsetValue = onsetValue;
  }

  public TemporalAccessor getOnsetValue() {
     return this.onsetValue ;
  }

  public void setOnsetNullFlavourDefiningCode(NullFlavour onsetNullFlavourDefiningCode) {
     this.onsetNullFlavourDefiningCode = onsetNullFlavourDefiningCode;
  }

  public NullFlavour getOnsetNullFlavourDefiningCode() {
     return this.onsetNullFlavourDefiningCode ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
