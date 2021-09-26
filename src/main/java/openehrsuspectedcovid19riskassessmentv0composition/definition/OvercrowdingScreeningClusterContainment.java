package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class OvercrowdingScreeningClusterContainment extends Containment {
  public SelectAqlField<OvercrowdingScreeningCluster> OVERCROWDING_SCREENING_CLUSTER = new AqlFieldImp<OvercrowdingScreeningCluster>(OvercrowdingScreeningCluster.class, "", "OvercrowdingScreeningCluster", OvercrowdingScreeningCluster.class, this);

  public SelectAqlField<Long> NUMBER_OF_PERSONS_SLEEPING_IN_YOUR_BEDROOM_MAGNITUDE = new AqlFieldImp<Long>(OvercrowdingScreeningCluster.class, "/items[at0002]/value|magnitude", "numberOfPersonsSleepingInYourBedroomMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> NUMBER_OF_PERSONS_SLEEPING_IN_YOUR_BEDROOM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OvercrowdingScreeningCluster.class, "/items[at0002]/null_flavour|defining_code", "numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OvercrowdingScreeningCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private OvercrowdingScreeningClusterContainment() {
    super("openEHR-EHR-CLUSTER.overcrowding_screening.v0");
  }

  public static OvercrowdingScreeningClusterContainment getInstance() {
    return new OvercrowdingScreeningClusterContainment();
  }
}
