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
@Archetype("openEHR-EHR-OBSERVATION.story.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.437660700+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class StoryHistoryObservation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/Any event/Story
   * Description: Narrative description of the story or clinical history for the subject of care.
   */
  @Path("/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value|value")
  private String storyValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/Event Series/Any event/Tree/Story/null_flavour
   */
  @Path("/data[at0001]/events[at0002]/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour storyNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/Any event/Structured detail
   * Description: Structured detail about the individual's story or patient's history.
   * Comment: For example: a specific symptom such as nausea or pain; an event such as a fall off a bicycle; or an issue such as a desire to quit using tobacco.
   */
  @Path("/data[at0001]/events[at0002]/data[at0003]/items[at0006]")
  private List<Cluster> structuredDetail;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/Any event/time
   */
  @Path("/data[at0001]/events[at0002]/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0008]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Story/History/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setStoryValue(String storyValue) {
     this.storyValue = storyValue;
  }

  public String getStoryValue() {
     return this.storyValue ;
  }

  public void setStoryNullFlavourDefiningCode(NullFlavour storyNullFlavourDefiningCode) {
     this.storyNullFlavourDefiningCode = storyNullFlavourDefiningCode;
  }

  public NullFlavour getStoryNullFlavourDefiningCode() {
     return this.storyNullFlavourDefiningCode ;
  }

  public void setStructuredDetail(List<Cluster> structuredDetail) {
     this.structuredDetail = structuredDetail;
  }

  public List<Cluster> getStructuredDetail() {
     return this.structuredDetail ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
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
