package openehrsuspectedcovid19riskassessmentv0composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import openehrsuspectedcovid19riskassessmentv0composition.definition.*;
import org.ehrbase.client.annotations.*;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.encounter.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.412659500+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Template("openEHR suspected COVID-19 risk assessment.v0")
public class OpenEHRSuspectedCOVID19RiskAssessmentV0Composition implements CompositionEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History
   * Description: The subjective clinical history of the subject of care as recorded directly by the subject, or reported to a clinician by the subject or a carer.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.story.v1]")
  private List<StoryHistoryObservation> storyHistory;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire
   * Description: An individual- or self-reported questionnaire screening for symptoms and signs.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0]")
  private List<SymptomSignScreeningQuestionnaireObservation> symptomSignScreeningQuestionnaire;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature
   * Description: A measurement of the body temperature, which is a surrogate for the core body temperature of the individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.body_temperature.v2]")
  private List<BodyTemperatureObservation> bodyTemperature;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event
   * Description: Details about travel during an interval of time.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.travel_event.v0]")
  private List<TravelEventObservation> travelEvent;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation
   * Description: Summary or persistent information about an individual's current and past jobs and/or roles.
   */
  @Path("/content[openEHR-EHR-EVALUATION.occupation_summary.v1 and name/value='Health related occupation']")
  private HealthRelatedOccupationEvaluation healthRelatedOccupation;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household
   * Description: The circumstances about an individual living alone or with others.
   * Comment: This information will provide a sense of the level of support, both physically and emotionally, to which an individual may have access.
   */
  @Path("/content[openEHR-EHR-EVALUATION.living_arrangement.v0 and name/value='Household']")
  private HouseholdEvaluation household;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health risk assessment
   * Description: Assessment of the potential and likelihood of future adverse health effects as determined by identified risk factors.
   */
  @Path("/content[openEHR-EHR-EVALUATION.health_risk.v1]")
  private List<HealthRiskAssessmentEvaluation> healthRiskAssessment;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private List<ProblemDiagnosisEvaluation> problemDiagnosis;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request
   * Description: Request for a health-related service or activity to be delivered by a clinician, organisation or agency.
   */
  @Path("/content[openEHR-EHR-INSTRUCTION.service_request.v1]")
  private List<ServiceRequestInstruction> serviceRequest;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setStoryHistory(List<StoryHistoryObservation> storyHistory) {
     this.storyHistory = storyHistory;
  }

  public List<StoryHistoryObservation> getStoryHistory() {
     return this.storyHistory ;
  }

  public void setSymptomSignScreeningQuestionnaire(
      List<SymptomSignScreeningQuestionnaireObservation> symptomSignScreeningQuestionnaire) {
     this.symptomSignScreeningQuestionnaire = symptomSignScreeningQuestionnaire;
  }

  public List<SymptomSignScreeningQuestionnaireObservation> getSymptomSignScreeningQuestionnaire() {
     return this.symptomSignScreeningQuestionnaire ;
  }

  public void setBodyTemperature(List<BodyTemperatureObservation> bodyTemperature) {
     this.bodyTemperature = bodyTemperature;
  }

  public List<BodyTemperatureObservation> getBodyTemperature() {
     return this.bodyTemperature ;
  }

  public void setTravelEvent(List<TravelEventObservation> travelEvent) {
     this.travelEvent = travelEvent;
  }

  public List<TravelEventObservation> getTravelEvent() {
     return this.travelEvent ;
  }

  public void setHealthRelatedOccupation(
      HealthRelatedOccupationEvaluation healthRelatedOccupation) {
     this.healthRelatedOccupation = healthRelatedOccupation;
  }

  public HealthRelatedOccupationEvaluation getHealthRelatedOccupation() {
     return this.healthRelatedOccupation ;
  }

  public void setHousehold(HouseholdEvaluation household) {
     this.household = household;
  }

  public HouseholdEvaluation getHousehold() {
     return this.household ;
  }

  public void setHealthRiskAssessment(List<HealthRiskAssessmentEvaluation> healthRiskAssessment) {
     this.healthRiskAssessment = healthRiskAssessment;
  }

  public List<HealthRiskAssessmentEvaluation> getHealthRiskAssessment() {
     return this.healthRiskAssessment ;
  }

  public void setProblemDiagnosis(List<ProblemDiagnosisEvaluation> problemDiagnosis) {
     this.problemDiagnosis = problemDiagnosis;
  }

  public List<ProblemDiagnosisEvaluation> getProblemDiagnosis() {
     return this.problemDiagnosis ;
  }

  public void setServiceRequest(List<ServiceRequestInstruction> serviceRequest) {
     this.serviceRequest = serviceRequest;
  }

  public List<ServiceRequestInstruction> getServiceRequest() {
     return this.serviceRequest ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
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

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
