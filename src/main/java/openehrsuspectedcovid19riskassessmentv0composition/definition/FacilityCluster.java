package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.organisation_cc.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.549568800+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class FacilityCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Identifier
   * Description: The organisation identifier(s).
   */
  @Path("/items[at0018]")
  private List<Cluster> identifier;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Facility name
   * Description: Name associated with the organisation.
   */
  @Path("/items[at0012 and name/value='Facility name']/value|value")
  private String facilityNameValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Tree/Occupation record/Facility/Facility name/null_flavour
   */
  @Path("/items[at0012 and name/value='Facility name']/null_flavour|defining_code")
  private NullFlavour facilityNameNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Telecom
   * Description: Contact detail for the organisation.
   */
  @Path("/items[at0014]")
  private List<Cluster> telecom;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Address
   * Description: Address details aligned with FHIR resource.
   */
  @Path("/items[openEHR-EHR-CLUSTER.address_cc.v0]")
  private List<AddressCluster> address;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Part of
   * Description: The organization of which this organization forms a part.
   */
  @Path("/items[at0017]")
  private List<Cluster> partOf;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/Contact
   * Description: Contact for the organisation for a certain purpose.
   */
  @Path("/items[at0016]")
  private List<Cluster> contact;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setIdentifier(List<Cluster> identifier) {
     this.identifier = identifier;
  }

  public List<Cluster> getIdentifier() {
     return this.identifier ;
  }

  public void setFacilityNameValue(String facilityNameValue) {
     this.facilityNameValue = facilityNameValue;
  }

  public String getFacilityNameValue() {
     return this.facilityNameValue ;
  }

  public void setFacilityNameNullFlavourDefiningCode(
      NullFlavour facilityNameNullFlavourDefiningCode) {
     this.facilityNameNullFlavourDefiningCode = facilityNameNullFlavourDefiningCode;
  }

  public NullFlavour getFacilityNameNullFlavourDefiningCode() {
     return this.facilityNameNullFlavourDefiningCode ;
  }

  public void setTelecom(List<Cluster> telecom) {
     this.telecom = telecom;
  }

  public List<Cluster> getTelecom() {
     return this.telecom ;
  }

  public void setAddress(List<AddressCluster> address) {
     this.address = address;
  }

  public List<AddressCluster> getAddress() {
     return this.address ;
  }

  public void setPartOf(List<Cluster> partOf) {
     this.partOf = partOf;
  }

  public List<Cluster> getPartOf() {
     return this.partOf ;
  }

  public void setContact(List<Cluster> contact) {
     this.contact = contact;
  }

  public List<Cluster> getContact() {
     return this.contact ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
