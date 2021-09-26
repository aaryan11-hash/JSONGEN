package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.534568400+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TravelEventTravelDestinationCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination/Country
   * Description: The country visited.
   */
  @Path("/items[at0011]/value|value")
  private String countryValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/History/Any interval event/Tree/Trip detail/Travel destination/Country/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour countryNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination/State/region
   * Description: The region visited.
   * Comment: Different regions within the same country maybe identified if they potentially pose different health risks.
   */
  @Path("/items[at0012]/value|value")
  private String stateRegionValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/History/Any interval event/Tree/Trip detail/Travel destination/State/region/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour stateRegionNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination/City
   * Description: The city visited.
   * Comment: Different cities within the same country or region maybe identified if they potentially pose different health risks.
   */
  @Path("/items[at0013]/value|value")
  private String cityValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/History/Any interval event/Tree/Trip detail/Travel destination/City/null_flavour
   */
  @Path("/items[at0013]/null_flavour|defining_code")
  private NullFlavour cityNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination/Additional destination details
   * Description: Additional structured details about the travel to, from and at the destination.
   */
  @Path("/items[at0024]")
  private List<Cluster> additionalDestinationDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setCountryValue(String countryValue) {
     this.countryValue = countryValue;
  }

  public String getCountryValue() {
     return this.countryValue ;
  }

  public void setCountryNullFlavourDefiningCode(NullFlavour countryNullFlavourDefiningCode) {
     this.countryNullFlavourDefiningCode = countryNullFlavourDefiningCode;
  }

  public NullFlavour getCountryNullFlavourDefiningCode() {
     return this.countryNullFlavourDefiningCode ;
  }

  public void setStateRegionValue(String stateRegionValue) {
     this.stateRegionValue = stateRegionValue;
  }

  public String getStateRegionValue() {
     return this.stateRegionValue ;
  }

  public void setStateRegionNullFlavourDefiningCode(
      NullFlavour stateRegionNullFlavourDefiningCode) {
     this.stateRegionNullFlavourDefiningCode = stateRegionNullFlavourDefiningCode;
  }

  public NullFlavour getStateRegionNullFlavourDefiningCode() {
     return this.stateRegionNullFlavourDefiningCode ;
  }

  public void setCityValue(String cityValue) {
     this.cityValue = cityValue;
  }

  public String getCityValue() {
     return this.cityValue ;
  }

  public void setCityNullFlavourDefiningCode(NullFlavour cityNullFlavourDefiningCode) {
     this.cityNullFlavourDefiningCode = cityNullFlavourDefiningCode;
  }

  public NullFlavour getCityNullFlavourDefiningCode() {
     return this.cityNullFlavourDefiningCode ;
  }

  public void setAdditionalDestinationDetails(List<Cluster> additionalDestinationDetails) {
     this.additionalDestinationDetails = additionalDestinationDetails;
  }

  public List<Cluster> getAdditionalDestinationDetails() {
     return this.additionalDestinationDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
