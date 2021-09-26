package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAccessor;

public class HealthRiskAssessmentEvaluationContainment extends Containment {
  public SelectAqlField<HealthRiskAssessmentEvaluation> HEALTH_RISK_ASSESSMENT_EVALUATION = new AqlFieldImp<HealthRiskAssessmentEvaluation>(HealthRiskAssessmentEvaluation.class, "", "HealthRiskAssessmentEvaluation", HealthRiskAssessmentEvaluation.class, this);

  public SelectAqlField<HealthRiskDefiningCode> HEALTH_RISK_DEFINING_CODE = new AqlFieldImp<HealthRiskDefiningCode>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0002]/value|defining_code", "healthRiskDefiningCode", HealthRiskDefiningCode.class, this);

  public SelectAqlField<NullFlavour> HEALTH_RISK_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "healthRiskNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SPECIFIC_RISK_FACTORS_RISK_FACTOR_VALUE = new AqlFieldImp<String>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0013]/value|value", "specificRiskFactorsRiskFactorValue", String.class, this);

  public SelectAqlField<NullFlavour> SPECIFIC_RISK_FACTORS_RISK_FACTOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0013]/null_flavour|defining_code", "specificRiskFactorsRiskFactorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PresenceDefiningCode2> SPECIFIC_RISK_FACTORS_PRESENCE_DEFINING_CODE = new AqlFieldImp<PresenceDefiningCode2>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0017]/value|defining_code", "specificRiskFactorsPresenceDefiningCode", PresenceDefiningCode2.class, this);

  public SelectAqlField<NullFlavour> SPECIFIC_RISK_FACTORS_PRESENCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0017]/null_flavour|defining_code", "specificRiskFactorsPresenceNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_RISK_FACTORS_DETAIL = new ListAqlFieldImp<Cluster>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0027]", "specificRiskFactorsDetail", Cluster.class, this);

  public SelectAqlField<String> OTHER_RISK_FACTORS_RISK_FACTOR_VALUE = new AqlFieldImp<String>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0013]/value|value", "otherRiskFactorsRiskFactorValue", String.class, this);

  public SelectAqlField<NullFlavour> OTHER_RISK_FACTORS_RISK_FACTOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0013]/null_flavour|defining_code", "otherRiskFactorsRiskFactorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PresenceDefiningCode2> OTHER_RISK_FACTORS_PRESENCE_DEFINING_CODE = new AqlFieldImp<PresenceDefiningCode2>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0017]/value|defining_code", "otherRiskFactorsPresenceDefiningCode", PresenceDefiningCode2.class, this);

  public SelectAqlField<NullFlavour> OTHER_RISK_FACTORS_PRESENCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0017]/null_flavour|defining_code", "otherRiskFactorsPresenceNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> OTHER_RISK_FACTORS_DETAIL = new ListAqlFieldImp<Cluster>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0016]/items[at0027]", "otherRiskFactorsDetail", Cluster.class, this);

  public SelectAqlField<String> RISK_ASSESSMENT_VALUE = new AqlFieldImp<String>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0003]/value|value", "riskAssessmentValue", String.class, this);

  public SelectAqlField<NullFlavour> RISK_ASSESSMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "riskAssessmentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(HealthRiskAssessmentEvaluation.class, "/protocol[at0010]/items[at0024]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/protocol[at0010]/items[at0024]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> ASSESSMENT_METHOD_VALUE = new AqlFieldImp<String>(HealthRiskAssessmentEvaluation.class, "/protocol[at0010]/items[at0025]/value|value", "assessmentMethodValue", String.class, this);

  public SelectAqlField<NullFlavour> ASSESSMENT_METHOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HealthRiskAssessmentEvaluation.class, "/protocol[at0010]/items[at0025]/null_flavour|defining_code", "assessmentMethodNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HealthRiskAssessmentEvaluation.class, "/protocol[at0010]/items[at0011]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HealthRiskAssessmentEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HealthRiskAssessmentEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HealthRiskAssessmentEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private HealthRiskAssessmentEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.health_risk.v1");
  }

  public static HealthRiskAssessmentEvaluationContainment getInstance() {
    return new HealthRiskAssessmentEvaluationContainment();
  }
}
