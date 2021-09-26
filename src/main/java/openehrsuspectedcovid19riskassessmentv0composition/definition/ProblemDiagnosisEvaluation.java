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
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.578566100+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ProblemDiagnosisEvaluation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0002]/value|defining_code")
  private ProblemDiagnosisNameDefiningCode problemDiagnosisNameDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/structure/Problem/Diagnosis name/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Structured body site
   * Description: A structured anatomical location for the problem or diagnosis.
   * Comment: Use this SLOT to insert the CLUSTER.anatomical_location or CLUSTER.relative_location archetypes if the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations.
   *
   * If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, use of this SLOT becomes redundant.
   */
  @Path("/data[at0001]/items[at0039]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Specific details
   * Description: Details that are additionally required to record as unique attributes of this problem or diagnosis.
   * Comment: May include structured detail about the grading or staging of the diagnosis; diagnostic criteria, classification criteria or formal severity assessments such as Common Terminology Criteria for Adverse Events.
   */
  @Path("/data[at0001]/items[at0043]")
  private List<Cluster> specificDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Status
   * Description: Contextual or temporal qualifier for a specified problem or diagnosis.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v1 and name/value='Status']")
  private List<StatusCluster> status;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Last updated
   * Description: The date this problem or diagnosis was last updated.
   */
  @Path("/protocol[at0032]/items[at0070]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0032]/items[at0070]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setProblemDiagnosisNameDefiningCode(
      ProblemDiagnosisNameDefiningCode problemDiagnosisNameDefiningCode) {
     this.problemDiagnosisNameDefiningCode = problemDiagnosisNameDefiningCode;
  }

  public ProblemDiagnosisNameDefiningCode getProblemDiagnosisNameDefiningCode() {
     return this.problemDiagnosisNameDefiningCode ;
  }

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setStatus(List<StatusCluster> status) {
     this.status = status;
  }

  public List<StatusCluster> getStatus() {
     return this.status ;
  }

  public void setLastUpdatedValue(TemporalAccessor lastUpdatedValue) {
     this.lastUpdatedValue = lastUpdatedValue;
  }

  public TemporalAccessor getLastUpdatedValue() {
     return this.lastUpdatedValue ;
  }

  public void setLastUpdatedNullFlavourDefiningCode(
      NullFlavour lastUpdatedNullFlavourDefiningCode) {
     this.lastUpdatedNullFlavourDefiningCode = lastUpdatedNullFlavourDefiningCode;
  }

  public NullFlavour getLastUpdatedNullFlavourDefiningCode() {
     return this.lastUpdatedNullFlavourDefiningCode ;
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
