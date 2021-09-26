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

public class ProblemDiagnosisEvaluationContainment extends Containment {
  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS_EVALUATION = new AqlFieldImp<ProblemDiagnosisEvaluation>(ProblemDiagnosisEvaluation.class, "", "ProblemDiagnosisEvaluation", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<ProblemDiagnosisNameDefiningCode> PROBLEM_DIAGNOSIS_NAME_DEFINING_CODE = new AqlFieldImp<ProblemDiagnosisNameDefiningCode>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/value|defining_code", "problemDiagnosisNameDefiningCode", ProblemDiagnosisNameDefiningCode.class, this);

  public SelectAqlField<NullFlavour> PROBLEM_DIAGNOSIS_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "problemDiagnosisNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0039]", "structuredBodySite", Cluster.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0043]", "specificDetails", Cluster.class, this);

  public ListSelectAqlField<StatusCluster> STATUS = new ListAqlFieldImp<StatusCluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v1]", "status", StatusCluster.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0070]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0070]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0071]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProblemDiagnosisEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProblemDiagnosisEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ProblemDiagnosisEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static ProblemDiagnosisEvaluationContainment getInstance() {
    return new ProblemDiagnosisEvaluationContainment();
  }
}
