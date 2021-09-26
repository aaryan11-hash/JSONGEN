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
@Archetype("openEHR-EHR-CLUSTER.occupation_record.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.546569800+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class OccupationRecordCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Job title/role
   * Description: The main job title or the role of the individual.
   * Comment: For example: Chief Executive Officer; Carer; or Student. Each of these job titles or roles may be comprised of multiple duties.
   */
  @Path("/items[at0005]/value|value")
  private String jobTitleRoleValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Tree/Occupation record/Job title/role/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour jobTitleRoleNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Facility
   * Description: Organisation details aligned with FHIR resource.
   */
  @Path("/items[openEHR-EHR-CLUSTER.organisation_cc.v0 and name/value='Facility']")
  private List<FacilityCluster> facility;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/Additional details
   * Description: Further detail about an occupation record.
   * Comment: For example: workplace location and conditions; or combat zone experience.
   */
  @Path("/items[at0018]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setJobTitleRoleValue(String jobTitleRoleValue) {
     this.jobTitleRoleValue = jobTitleRoleValue;
  }

  public String getJobTitleRoleValue() {
     return this.jobTitleRoleValue ;
  }

  public void setJobTitleRoleNullFlavourDefiningCode(
      NullFlavour jobTitleRoleNullFlavourDefiningCode) {
     this.jobTitleRoleNullFlavourDefiningCode = jobTitleRoleNullFlavourDefiningCode;
  }

  public NullFlavour getJobTitleRoleNullFlavourDefiningCode() {
     return this.jobTitleRoleNullFlavourDefiningCode ;
  }

  public void setFacility(List<FacilityCluster> facility) {
     this.facility = facility;
  }

  public List<FacilityCluster> getFacility() {
     return this.facility ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
