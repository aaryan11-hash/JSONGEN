package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class OccupationRecordClusterContainment extends Containment {
  public SelectAqlField<OccupationRecordCluster> OCCUPATION_RECORD_CLUSTER = new AqlFieldImp<OccupationRecordCluster>(OccupationRecordCluster.class, "", "OccupationRecordCluster", OccupationRecordCluster.class, this);

  public SelectAqlField<String> JOB_TITLE_ROLE_VALUE = new AqlFieldImp<String>(OccupationRecordCluster.class, "/items[at0005]/value|value", "jobTitleRoleValue", String.class, this);

  public SelectAqlField<NullFlavour> JOB_TITLE_ROLE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OccupationRecordCluster.class, "/items[at0005]/null_flavour|defining_code", "jobTitleRoleNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<FacilityCluster> FACILITY = new ListAqlFieldImp<FacilityCluster>(OccupationRecordCluster.class, "/items[openEHR-EHR-CLUSTER.organisation_cc.v0]", "facility", FacilityCluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(OccupationRecordCluster.class, "/items[at0018]", "additionalDetails", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OccupationRecordCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private OccupationRecordClusterContainment() {
    super("openEHR-EHR-CLUSTER.occupation_record.v1");
  }

  public static OccupationRecordClusterContainment getInstance() {
    return new OccupationRecordClusterContainment();
  }
}
