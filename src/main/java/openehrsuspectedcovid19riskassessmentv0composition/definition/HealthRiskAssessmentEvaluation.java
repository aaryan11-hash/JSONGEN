package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import lombok.Builder;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.health_risk.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.569562100+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Builder
public class HealthRiskAssessmentEvaluation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Health risk
   * Description: Identification of the potential future disease, condition or health issue for which the risk is being assessed, by name.
   * Comment: Coding of 'Health risk' with a terminology is preferred, where possible. Free text should be used only if there is no appropriate terminology available. For example: risk of cardiovascular disease, with risk factors of hypertension and hypercholesterolaemia.
   */
  @Path("/data[at0001]/items[at0002]/value|defining_code")
  private HealthRiskDefiningCode healthRiskDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Health risk/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour healthRiskNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Specific risk factors/Risk factor
   * Description: Identification of the risk factor, by name.
   * Comment: For example: hypertension and hypercholesterolaemia, which may be used as part of the overall assessment for cardiovascular disease; or a genetic marker. Coding of 
   * 'Risk factor' with a terminology, where possible.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Specific risk factors']/items[at0013]/value|value")
  private String specificRiskFactorsRiskFactorValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Specific risk factors/Risk factor/null_flavour
   */
  @Path("/data[at0001]/items[at0016 and name/value='Specific risk factors']/items[at0013]/null_flavour|defining_code")
  private NullFlavour specificRiskFactorsRiskFactorNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Specific risk factors/Presence
   * Description: Presence of the risk factor.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Specific risk factors']/items[at0017]/value|defining_code")
  private PresenceDefiningCode2 specificRiskFactorsPresenceDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Specific risk factors/Presence/null_flavour
   */
  @Path("/data[at0001]/items[at0016 and name/value='Specific risk factors']/items[at0017]/null_flavour|defining_code")
  private NullFlavour specificRiskFactorsPresenceNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Specific risk factors/Detail
   * Description: Structured detail about other aspects of the risk factor assessment.
   * Comment: For example: Prevalence of the risk factor in family members.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Specific risk factors']/items[at0027]")
  private List<Cluster> specificRiskFactorsDetail;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Other risk factors/Risk factor
   * Description: Identification of the risk factor, by name.
   * Comment: For example: hypertension and hypercholesterolaemia, which may be used as part of the overall assessment for cardiovascular disease; or a genetic marker. Coding of 
   * 'Risk factor' with a terminology, where possible.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Other risk factors']/items[at0013]/value|value")
  private String otherRiskFactorsRiskFactorValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Other risk factors/Risk factor/null_flavour
   */
  @Path("/data[at0001]/items[at0016 and name/value='Other risk factors']/items[at0013]/null_flavour|defining_code")
  private NullFlavour otherRiskFactorsRiskFactorNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Other risk factors/Presence
   * Description: Presence of the risk factor.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Other risk factors']/items[at0017]/value|defining_code")
  private PresenceDefiningCode2 otherRiskFactorsPresenceDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Other risk factors/Presence/null_flavour
   */
  @Path("/data[at0001]/items[at0016 and name/value='Other risk factors']/items[at0017]/null_flavour|defining_code")
  private NullFlavour otherRiskFactorsPresenceNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Other risk factors/Detail
   * Description: Structured detail about other aspects of the risk factor assessment.
   * Comment: For example: Prevalence of the risk factor in family members.
   */
  @Path("/data[at0001]/items[at0016 and name/value='Other risk factors']/items[at0027]")
  private List<Cluster> otherRiskFactorsDetail;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Risk assessment
   * Description: Evaluation of the health risk.
   * Comment: There may be multiple variations on the assessment of risk. The Choice data type allows for recording of the assessment as either free text or value sets (such as low, medium or hig). The proportion data type allows recording of a percentage, a ratio or a fraction. The quantity data type allows recording of a decimal number.
   */
  @Path("/data[at0001]/items[at0003]/value|value")
  private String riskAssessmentValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/structure/Risk assessment/null_flavour
   */
  @Path("/data[at0001]/items[at0003]/null_flavour|defining_code")
  private NullFlavour riskAssessmentNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Last updated
   * Description: The date this health risk assessment was last updated.
   * Comment: This data element may be thought redundant if the data is recorded and stored using COMPOSITIONs within a closed clinical system. However if this information is extracted from its original COMPOSITION context, for example, to be included in another document or message then the temporal context is effectively removed. This 'Last updated' data element has been explicitly added to allow the critical temporal data to be kept alongside the clinical data in all circumstances. It is assumed that the clinical system can copy the date from the COMPOSITION to reduce the need for duplication of data entry by the clinician.
   */
  @Path("/protocol[at0010]/items[at0024]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0010]/items[at0024]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Assessment method
   * Description: Identification of the algorithm or guideline used to make the assessment of risk.
   * Comment: For example: Framingham cardiovascular risk calculator.
   */
  @Path("/protocol[at0010]/items[at0025]/value|value")
  private String assessmentMethodValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Tree/Assessment method/null_flavour
   */
  @Path("/protocol[at0010]/items[at0025]/null_flavour|defining_code")
  private NullFlavour assessmentMethodNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example:  local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0010]/items[at0011]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setHealthRiskDefiningCode(HealthRiskDefiningCode healthRiskDefiningCode) {
     this.healthRiskDefiningCode = healthRiskDefiningCode;
  }

  public HealthRiskDefiningCode getHealthRiskDefiningCode() {
     return this.healthRiskDefiningCode ;
  }

  public void setHealthRiskNullFlavourDefiningCode(NullFlavour healthRiskNullFlavourDefiningCode) {
     this.healthRiskNullFlavourDefiningCode = healthRiskNullFlavourDefiningCode;
  }

  public NullFlavour getHealthRiskNullFlavourDefiningCode() {
     return this.healthRiskNullFlavourDefiningCode ;
  }

  public void setSpecificRiskFactorsRiskFactorValue(String specificRiskFactorsRiskFactorValue) {
     this.specificRiskFactorsRiskFactorValue = specificRiskFactorsRiskFactorValue;
  }

  public String getSpecificRiskFactorsRiskFactorValue() {
     return this.specificRiskFactorsRiskFactorValue ;
  }

  public void setSpecificRiskFactorsRiskFactorNullFlavourDefiningCode(
      NullFlavour specificRiskFactorsRiskFactorNullFlavourDefiningCode) {
     this.specificRiskFactorsRiskFactorNullFlavourDefiningCode = specificRiskFactorsRiskFactorNullFlavourDefiningCode;
  }

  public NullFlavour getSpecificRiskFactorsRiskFactorNullFlavourDefiningCode() {
     return this.specificRiskFactorsRiskFactorNullFlavourDefiningCode ;
  }

  public void setSpecificRiskFactorsPresenceDefiningCode(
      PresenceDefiningCode2 specificRiskFactorsPresenceDefiningCode) {
     this.specificRiskFactorsPresenceDefiningCode = specificRiskFactorsPresenceDefiningCode;
  }

  public PresenceDefiningCode2 getSpecificRiskFactorsPresenceDefiningCode() {
     return this.specificRiskFactorsPresenceDefiningCode ;
  }

  public void setSpecificRiskFactorsPresenceNullFlavourDefiningCode(
      NullFlavour specificRiskFactorsPresenceNullFlavourDefiningCode) {
     this.specificRiskFactorsPresenceNullFlavourDefiningCode = specificRiskFactorsPresenceNullFlavourDefiningCode;
  }

  public NullFlavour getSpecificRiskFactorsPresenceNullFlavourDefiningCode() {
     return this.specificRiskFactorsPresenceNullFlavourDefiningCode ;
  }

  public void setSpecificRiskFactorsDetail(List<Cluster> specificRiskFactorsDetail) {
     this.specificRiskFactorsDetail = specificRiskFactorsDetail;
  }

  public List<Cluster> getSpecificRiskFactorsDetail() {
     return this.specificRiskFactorsDetail ;
  }

  public void setOtherRiskFactorsRiskFactorValue(String otherRiskFactorsRiskFactorValue) {
     this.otherRiskFactorsRiskFactorValue = otherRiskFactorsRiskFactorValue;
  }

  public String getOtherRiskFactorsRiskFactorValue() {
     return this.otherRiskFactorsRiskFactorValue ;
  }

  public void setOtherRiskFactorsRiskFactorNullFlavourDefiningCode(
      NullFlavour otherRiskFactorsRiskFactorNullFlavourDefiningCode) {
     this.otherRiskFactorsRiskFactorNullFlavourDefiningCode = otherRiskFactorsRiskFactorNullFlavourDefiningCode;
  }

  public NullFlavour getOtherRiskFactorsRiskFactorNullFlavourDefiningCode() {
     return this.otherRiskFactorsRiskFactorNullFlavourDefiningCode ;
  }

  public void setOtherRiskFactorsPresenceDefiningCode(
      PresenceDefiningCode2 otherRiskFactorsPresenceDefiningCode) {
     this.otherRiskFactorsPresenceDefiningCode = otherRiskFactorsPresenceDefiningCode;
  }

  public PresenceDefiningCode2 getOtherRiskFactorsPresenceDefiningCode() {
     return this.otherRiskFactorsPresenceDefiningCode ;
  }

  public void setOtherRiskFactorsPresenceNullFlavourDefiningCode(
      NullFlavour otherRiskFactorsPresenceNullFlavourDefiningCode) {
     this.otherRiskFactorsPresenceNullFlavourDefiningCode = otherRiskFactorsPresenceNullFlavourDefiningCode;
  }

  public NullFlavour getOtherRiskFactorsPresenceNullFlavourDefiningCode() {
     return this.otherRiskFactorsPresenceNullFlavourDefiningCode ;
  }

  public void setOtherRiskFactorsDetail(List<Cluster> otherRiskFactorsDetail) {
     this.otherRiskFactorsDetail = otherRiskFactorsDetail;
  }

  public List<Cluster> getOtherRiskFactorsDetail() {
     return this.otherRiskFactorsDetail ;
  }

  public void setRiskAssessmentValue(String riskAssessmentValue) {
     this.riskAssessmentValue = riskAssessmentValue;
  }

  public String getRiskAssessmentValue() {
     return this.riskAssessmentValue ;
  }

  public void setRiskAssessmentNullFlavourDefiningCode(
      NullFlavour riskAssessmentNullFlavourDefiningCode) {
     this.riskAssessmentNullFlavourDefiningCode = riskAssessmentNullFlavourDefiningCode;
  }

  public NullFlavour getRiskAssessmentNullFlavourDefiningCode() {
     return this.riskAssessmentNullFlavourDefiningCode ;
  }

  public void setLastUpdatedValue(TemporalAccessor lastUpdatedValue) {
     this.lastUpdatedValue = lastUpdatedValue;
  }

  public TemporalAccessor getLastUpdatedValue() {
     return this.lastUpdatedValue ;
  }

  public void setLastUpdatedNullFlavourDefiningCode(
      NullFlavour lastUpdatedNullFlavourDefiningCode) {
     this.lastUpdatedNullFlavourDefiningCode = lastUpdatedNullFlavourDefiningCode;
  }

  public NullFlavour getLastUpdatedNullFlavourDefiningCode() {
     return this.lastUpdatedNullFlavourDefiningCode ;
  }

  public void setAssessmentMethodValue(String assessmentMethodValue) {
     this.assessmentMethodValue = assessmentMethodValue;
  }

  public String getAssessmentMethodValue() {
     return this.assessmentMethodValue ;
  }

  public void setAssessmentMethodNullFlavourDefiningCode(
      NullFlavour assessmentMethodNullFlavourDefiningCode) {
     this.assessmentMethodNullFlavourDefiningCode = assessmentMethodNullFlavourDefiningCode;
  }

  public NullFlavour getAssessmentMethodNullFlavourDefiningCode() {
     return this.assessmentMethodNullFlavourDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
