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

public class HealthRelatedOccupationEvaluationContainment extends Containment {
  public SelectAqlField<HealthRelatedOccupationEvaluation> HEALTH_RELATED_OCCUPATION_EVALUATION = new AqlFieldImp<HealthRelatedOccupationEvaluation>(HealthRelatedOccupationEvaluation.class, "", "HealthRelatedOccupationEvaluation", HealthRelatedOccupationEvaluation.class, this);

  public ListSelectAqlField<OccupationRecordCluster> OCCUPATION_RECORD = new ListAqlFieldImp<OccupationRecordCluster>(HealthRelatedOccupationEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.occupation_record.v1]", "occupationRecord", OccupationRecordCluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(HealthRelatedOccupationEvaluation.class, "/data[at0001]/items[at0005]", "additionalDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HealthRelatedOccupationEvaluation.class, "/protocol[at0007]/items[at0008]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HealthRelatedOccupationEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HealthRelatedOccupationEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HealthRelatedOccupationEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private HealthRelatedOccupationEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.occupation_summary.v1");
  }

  public static HealthRelatedOccupationEvaluationContainment getInstance() {
    return new HealthRelatedOccupationEvaluationContainment();
  }
}
