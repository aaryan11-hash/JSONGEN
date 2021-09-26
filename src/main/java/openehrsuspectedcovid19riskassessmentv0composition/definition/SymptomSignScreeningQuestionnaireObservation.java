package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import lombok.Builder;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.symptom_sign_screening.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.457668800+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Builder
public class SymptomSignScreeningQuestionnaireObservation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0021]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Symptom/sign screening questionnaire/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<SymptomSignScreeningQuestionnaireAnyEventChoice> anyEvent;

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

  public void setAnyEvent(List<SymptomSignScreeningQuestionnaireAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<SymptomSignScreeningQuestionnaireAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
