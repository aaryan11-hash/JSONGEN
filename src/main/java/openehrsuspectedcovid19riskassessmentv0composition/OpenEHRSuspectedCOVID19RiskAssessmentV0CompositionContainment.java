package openehrsuspectedcovid19riskassessmentv0composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import openehrsuspectedcovid19riskassessmentv0composition.definition.*;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

import java.time.temporal.TemporalAccessor;

public class OpenEHRSuspectedCOVID19RiskAssessmentV0CompositionContainment extends Containment {
  public SelectAqlField<OpenEHRSuspectedCOVID19RiskAssessmentV0Composition> OPEN_E_H_R_SUSPECTED_C_O_V_ID19_RISK_ASSESSMENT_V0_COMPOSITION = new AqlFieldImp<OpenEHRSuspectedCOVID19RiskAssessmentV0Composition>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "", "OpenEHRSuspectedCOVID19RiskAssessmentV0Composition", OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public ListSelectAqlField<StoryHistoryObservation> STORY_HISTORY = new ListAqlFieldImp<StoryHistoryObservation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-OBSERVATION.story.v1]", "storyHistory", StoryHistoryObservation.class, this);

  public ListSelectAqlField<SymptomSignScreeningQuestionnaireObservation> SYMPTOM_SIGN_SCREENING_QUESTIONNAIRE = new ListAqlFieldImp<SymptomSignScreeningQuestionnaireObservation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0]", "symptomSignScreeningQuestionnaire", SymptomSignScreeningQuestionnaireObservation.class, this);

  public ListSelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new ListAqlFieldImp<BodyTemperatureObservation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public ListSelectAqlField<TravelEventObservation> TRAVEL_EVENT = new ListAqlFieldImp<TravelEventObservation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-OBSERVATION.travel_event.v0]", "travelEvent", TravelEventObservation.class, this);

  public SelectAqlField<HealthRelatedOccupationEvaluation> HEALTH_RELATED_OCCUPATION = new AqlFieldImp<HealthRelatedOccupationEvaluation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-EVALUATION.occupation_summary.v1]", "healthRelatedOccupation", HealthRelatedOccupationEvaluation.class, this);

  public SelectAqlField<HouseholdEvaluation> HOUSEHOLD = new AqlFieldImp<HouseholdEvaluation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-EVALUATION.living_arrangement.v0]", "household", HouseholdEvaluation.class, this);

  public ListSelectAqlField<HealthRiskAssessmentEvaluation> HEALTH_RISK_ASSESSMENT = new ListAqlFieldImp<HealthRiskAssessmentEvaluation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-EVALUATION.health_risk.v1]", "healthRiskAssessment", HealthRiskAssessmentEvaluation.class, this);

  public ListSelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS = new ListAqlFieldImp<ProblemDiagnosisEvaluation>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "problemDiagnosis", ProblemDiagnosisEvaluation.class, this);

  public ListSelectAqlField<ServiceRequestInstruction> SERVICE_REQUEST = new ListAqlFieldImp<ServiceRequestInstruction>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/content[openEHR-EHR-INSTRUCTION.service_request.v1]", "serviceRequest", ServiceRequestInstruction.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(OpenEHRSuspectedCOVID19RiskAssessmentV0Composition.class, "/territory", "territory", Territory.class, this);

  private OpenEHRSuspectedCOVID19RiskAssessmentV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static OpenEHRSuspectedCOVID19RiskAssessmentV0CompositionContainment getInstance() {
    return new OpenEHRSuspectedCOVID19RiskAssessmentV0CompositionContainment();
  }
}
