package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class AddressClusterContainment extends Containment {
  public SelectAqlField<AddressCluster> ADDRESS_CLUSTER = new AqlFieldImp<AddressCluster>(AddressCluster.class, "", "AddressCluster", AddressCluster.class, this);

  public SelectAqlField<String> CITY_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0012]/value|value", "cityValue", String.class, this);

  public SelectAqlField<NullFlavour> CITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0012]/null_flavour|defining_code", "cityNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COUNTRY_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0015]/value|value", "countryValue", String.class, this);

  public SelectAqlField<NullFlavour> COUNTRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0015]/null_flavour|defining_code", "countryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AddressCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private AddressClusterContainment() {
    super("openEHR-EHR-CLUSTER.address_cc.v0");
  }

  public static AddressClusterContainment getInstance() {
    return new AddressClusterContainment();
  }
}
