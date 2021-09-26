package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.dwelling.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.563569600+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DwellingCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling/Number of bedrooms
   * Description: The number of bedrooms in the dwelling.
   */
  @Path("/items[at0028]/value|magnitude")
  private Long numberOfBedroomsMagnitude;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Item tree/Dwelling/Number of bedrooms/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour numberOfBedroomsNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling/Overcrowding screening
   * Description: Screening to identify when a dwelling is too small for the size and composition of the household living in it.
   */
  @Path("/items[openEHR-EHR-CLUSTER.overcrowding_screening.v0]")
  private List<OvercrowdingScreeningCluster> overcrowdingScreening;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setNumberOfBedroomsMagnitude(Long numberOfBedroomsMagnitude) {
     this.numberOfBedroomsMagnitude = numberOfBedroomsMagnitude;
  }

  public Long getNumberOfBedroomsMagnitude() {
     return this.numberOfBedroomsMagnitude ;
  }

  public void setNumberOfBedroomsNullFlavourDefiningCode(
      NullFlavour numberOfBedroomsNullFlavourDefiningCode) {
     this.numberOfBedroomsNullFlavourDefiningCode = numberOfBedroomsNullFlavourDefiningCode;
  }

  public NullFlavour getNumberOfBedroomsNullFlavourDefiningCode() {
     return this.numberOfBedroomsNullFlavourDefiningCode ;
  }

  public void setOvercrowdingScreening(List<OvercrowdingScreeningCluster> overcrowdingScreening) {
     this.overcrowdingScreening = overcrowdingScreening;
  }

  public List<OvercrowdingScreeningCluster> getOvercrowdingScreening() {
     return this.overcrowdingScreening ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
