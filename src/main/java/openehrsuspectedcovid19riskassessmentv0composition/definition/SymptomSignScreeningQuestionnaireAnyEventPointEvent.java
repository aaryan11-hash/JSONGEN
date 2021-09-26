package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.494382300+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class SymptomSignScreeningQuestionnaireAnyEventPointEvent implements PointEventEntity, SymptomSignScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Screening purpose
   * Description: The reason for overall screening.
   * Comment: For example: screening for an infectious disease, such as SARS-COV-2.
   */
  @Path("/data[at0003]/items[at0034]/value|defining_code")
  private ScreeningPurposeDefiningCode screeningPurposeDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Tree/Screening purpose/null_flavour
   */
  @Path("/data[at0003]/items[at0034]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign
   * Description: Grouping of data elements related to screening for a single symptom or sign.
   */
  @Path("/data[at0003]/items[at0022]")
  private List<SymptomSignScreeningQuestionnaireSpecificSymptomSignCluster> specificSymptomSign;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Specific symptom/sign #1
   * Description: Grouping of data elements related to screening for a single symptom or sign.
   */
  @Path("/data[at0003]/items[at0022 and name/value='Specific symptom/sign #1']")
  private List<SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster> specificSymptomSign1;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/Additional details
   * Description: Additional structured details related to symptom screening.
   */
  @Path("/data[at0003]/items[at0026]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setScreeningPurposeDefiningCode(
      ScreeningPurposeDefiningCode screeningPurposeDefiningCode) {
     this.screeningPurposeDefiningCode = screeningPurposeDefiningCode;
  }

  public ScreeningPurposeDefiningCode getScreeningPurposeDefiningCode() {
     return this.screeningPurposeDefiningCode ;
  }

  public void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode) {
     this.screeningPurposeNullFlavourDefiningCode = screeningPurposeNullFlavourDefiningCode;
  }

  public NullFlavour getScreeningPurposeNullFlavourDefiningCode() {
     return this.screeningPurposeNullFlavourDefiningCode ;
  }

  public void setSpecificSymptomSign(
      List<SymptomSignScreeningQuestionnaireSpecificSymptomSignCluster> specificSymptomSign) {
     this.specificSymptomSign = specificSymptomSign;
  }

  public List<SymptomSignScreeningQuestionnaireSpecificSymptomSignCluster> getSpecificSymptomSign(
      ) {
     return this.specificSymptomSign ;
  }

  public void setSpecificSymptomSign1(
      List<SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster> specificSymptomSign1) {
     this.specificSymptomSign1 = specificSymptomSign1;
  }

  public List<SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster> getSpecificSymptomSign1(
      ) {
     return this.specificSymptomSign1 ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
