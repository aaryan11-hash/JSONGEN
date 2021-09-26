package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class DwellingClusterContainment extends Containment {
  public SelectAqlField<DwellingCluster> DWELLING_CLUSTER = new AqlFieldImp<DwellingCluster>(DwellingCluster.class, "", "DwellingCluster", DwellingCluster.class, this);

  public SelectAqlField<Long> NUMBER_OF_BEDROOMS_MAGNITUDE = new AqlFieldImp<Long>(DwellingCluster.class, "/items[at0028]/value|magnitude", "numberOfBedroomsMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> NUMBER_OF_BEDROOMS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DwellingCluster.class, "/items[at0028]/null_flavour|defining_code", "numberOfBedroomsNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<OvercrowdingScreeningCluster> OVERCROWDING_SCREENING = new ListAqlFieldImp<OvercrowdingScreeningCluster>(DwellingCluster.class, "/items[openEHR-EHR-CLUSTER.overcrowding_screening.v0]", "overcrowdingScreening", OvercrowdingScreeningCluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DwellingCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DwellingClusterContainment() {
    super("openEHR-EHR-CLUSTER.dwelling.v0");
  }

  public static DwellingClusterContainment getInstance() {
    return new DwellingClusterContainment();
  }
}
