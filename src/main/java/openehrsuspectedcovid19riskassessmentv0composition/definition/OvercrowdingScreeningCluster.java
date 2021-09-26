package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-CLUSTER.overcrowding_screening.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.564565300+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class OvercrowdingScreeningCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling/Overcrowding screening/Number of persons sleeping in your bedroom
   * Description: Number of people per bedroom in a dwelling.
   */
  @Path("/items[at0002 and name/value='Number of persons sleeping in your bedroom']/value|magnitude")
  private Long numberOfPersonsSleepingInYourBedroomMagnitude;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Item tree/Dwelling/Overcrowding screening/Number of persons sleeping in your bedroom/null_flavour
   */
  @Path("/items[at0002 and name/value='Number of persons sleeping in your bedroom']/null_flavour|defining_code")
  private NullFlavour numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling/Overcrowding screening/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setNumberOfPersonsSleepingInYourBedroomMagnitude(
      Long numberOfPersonsSleepingInYourBedroomMagnitude) {
     this.numberOfPersonsSleepingInYourBedroomMagnitude = numberOfPersonsSleepingInYourBedroomMagnitude;
  }

  public Long getNumberOfPersonsSleepingInYourBedroomMagnitude() {
     return this.numberOfPersonsSleepingInYourBedroomMagnitude ;
  }

  public void setNumberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode(
      NullFlavour numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode) {
     this.numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode = numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode;
  }

  public NullFlavour getNumberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode() {
     return this.numberOfPersonsSleepingInYourBedroomNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
