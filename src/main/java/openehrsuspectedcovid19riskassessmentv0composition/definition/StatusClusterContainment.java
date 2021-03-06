package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class StatusClusterContainment extends Containment {
  public SelectAqlField<StatusCluster> STATUS_CLUSTER = new AqlFieldImp<StatusCluster>(StatusCluster.class, "", "StatusCluster", StatusCluster.class, this);

  public SelectAqlField<DiagnosticStatusDefiningCode> DIAGNOSTIC_STATUS_DEFINING_CODE = new AqlFieldImp<DiagnosticStatusDefiningCode>(StatusCluster.class, "/items[at0004]/value|defining_code", "diagnosticStatusDefiningCode", DiagnosticStatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> DIAGNOSTIC_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StatusCluster.class, "/items[at0004]/null_flavour|defining_code", "diagnosticStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(StatusCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private StatusClusterContainment() {
    super("openEHR-EHR-CLUSTER.problem_qualifier.v1");
  }

  public static StatusClusterContainment getInstance() {
    return new StatusClusterContainment();
  }
}
