package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import lombok.Builder;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-CLUSTER.address_cc.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.553569600+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Builder
public class AddressCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Address/City
   * Description: The name of the city, town, village or other community or delivery center.
   */
  @Path("/items[at0012]/value|value")
  private String cityValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Tree/Occupation record/Facility/Address/City/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour cityNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Address/Country
   * Description: Country - a nation as commonly understood or generally accepted.
   */
  @Path("/items[at0015]/value|value")
  private String countryValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Tree/Occupation record/Facility/Address/Country/null_flavour
   */
  @Path("/items[at0015]/null_flavour|defining_code")
  private NullFlavour countryNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Address/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

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

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
