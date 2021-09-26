package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.living_arrangement.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.561564100+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class HouseholdEvaluation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Description
   * Description: Narrative description about the living arrangements.
   */
  @Path("/data[at0001]/items[at0003]/value|value")
  private String descriptionValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Item tree/Description/null_flavour
   */
  @Path("/data[at0001]/items[at0003]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Number of household members
   * Description: The number of individuals who are in the household.
   */
  @Path("/data[at0001]/items[at0007]/value|magnitude")
  private Long numberOfHouseholdMembersMagnitude;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Item tree/Number of household members/null_flavour
   */
  @Path("/data[at0001]/items[at0007]/null_flavour|defining_code")
  private NullFlavour numberOfHouseholdMembersNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Dwelling
   * Description: An overview about the properties of a single structure, or a discrete space within a structure, and associated spaces in which an individual lives.
   * Comment: The intended scope of dwelling includes, but is not limited to: a building; part of a building; house; apartment; prison; houseboat; mobile home; or vehicle. It can also include the spaces associated with a structure or property, including the basement or yard.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.dwelling.v0]")
  private List<DwellingCluster> dwelling;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0002]/items[at0011]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Household/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setNumberOfHouseholdMembersMagnitude(Long numberOfHouseholdMembersMagnitude) {
     this.numberOfHouseholdMembersMagnitude = numberOfHouseholdMembersMagnitude;
  }

  public Long getNumberOfHouseholdMembersMagnitude() {
     return this.numberOfHouseholdMembersMagnitude ;
  }

  public void setNumberOfHouseholdMembersNullFlavourDefiningCode(
      NullFlavour numberOfHouseholdMembersNullFlavourDefiningCode) {
     this.numberOfHouseholdMembersNullFlavourDefiningCode = numberOfHouseholdMembersNullFlavourDefiningCode;
  }

  public NullFlavour getNumberOfHouseholdMembersNullFlavourDefiningCode() {
     return this.numberOfHouseholdMembersNullFlavourDefiningCode ;
  }

  public void setDwelling(List<DwellingCluster> dwelling) {
     this.dwelling = dwelling;
  }

  public List<DwellingCluster> getDwelling() {
     return this.dwelling ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
