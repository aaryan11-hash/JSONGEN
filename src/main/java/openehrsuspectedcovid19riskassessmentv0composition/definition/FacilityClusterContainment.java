package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class FacilityClusterContainment extends Containment {
  public SelectAqlField<FacilityCluster> FACILITY_CLUSTER = new AqlFieldImp<FacilityCluster>(FacilityCluster.class, "", "FacilityCluster", FacilityCluster.class, this);

  public ListSelectAqlField<Cluster> IDENTIFIER = new ListAqlFieldImp<Cluster>(FacilityCluster.class, "/items[at0018]", "identifier", Cluster.class, this);

  public SelectAqlField<String> FACILITY_NAME_VALUE = new AqlFieldImp<String>(FacilityCluster.class, "/items[at0012]/value|value", "facilityNameValue", String.class, this);

  public SelectAqlField<NullFlavour> FACILITY_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(FacilityCluster.class, "/items[at0012]/null_flavour|defining_code", "facilityNameNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> TELECOM = new ListAqlFieldImp<Cluster>(FacilityCluster.class, "/items[at0014]", "telecom", Cluster.class, this);

  public ListSelectAqlField<AddressCluster> ADDRESS = new ListAqlFieldImp<AddressCluster>(FacilityCluster.class, "/items[openEHR-EHR-CLUSTER.address_cc.v0]", "address", AddressCluster.class, this);

  public ListSelectAqlField<Cluster> PART_OF = new ListAqlFieldImp<Cluster>(FacilityCluster.class, "/items[at0017]", "partOf", Cluster.class, this);

  public ListSelectAqlField<Cluster> CONTACT = new ListAqlFieldImp<Cluster>(FacilityCluster.class, "/items[at0016]", "contact", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(FacilityCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private FacilityClusterContainment() {
    super("openEHR-EHR-CLUSTER.organisation_cc.v0");
  }

  public static FacilityClusterContainment getInstance() {
    return new FacilityClusterContainment();
  }
}
