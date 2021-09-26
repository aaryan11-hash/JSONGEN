package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-EVALUATION.occupation_summary.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.543572100+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class HealthRelatedOccupationEvaluation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Occupation record
   * Description: A single job or role carried out by an individual during a specified period of time.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.occupation_record.v1]")
  private List<OccupationRecordCluster> occupationRecord;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Additional details
   * Description: Additional details about the current jobs or roles, or previous occupation history of an individual.
   */
  @Path("/data[at0001]/items[at0005]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0008]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Health related occupation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setOccupationRecord(List<OccupationRecordCluster> occupationRecord) {
     this.occupationRecord = occupationRecord;
  }

  public List<OccupationRecordCluster> getOccupationRecord() {
     return this.occupationRecord ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
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
