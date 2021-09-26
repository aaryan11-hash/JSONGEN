package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import lombok.Builder;
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
@Archetype("openEHR-EHR-OBSERVATION.body_temperature.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.515565+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Builder
public class BodyTemperatureObservation implements EntryEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Any event/Temperature
   * Description: The measured body temperature (as a surrogate for the core of the body).
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|magnitude")
  private Double temperatureMagnitude;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Any event/Temperature
   * Description: The measured body temperature (as a surrogate for the core of the body).
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value|units")
  private String temperatureUnits;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/History/Any event/Tree/Temperature/null_flavour
   */
  @Path("/data[at0002]/events[at0003]/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour temperatureNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Any event/Environmental conditions
   * Description: Details about the environmental conditions at the time of temperature measurement.
   */
  @Path("/data[at0002]/events[at0003]/state[at0029]/items[at0056]")
  private List<Cluster> environmentalConditions;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Any event/Exertion
   * Description: Details about the exertion of the person at the time of temperature measurement.
   */
  @Path("/data[at0002]/events[at0003]/state[at0029]/items[at0057]")
  private Cluster exertion;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Any event/time
   */
  @Path("/data[at0002]/events[at0003]/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/origin
   */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Structured measurement location
   * Description: Structured anatomical location of where the measurement was taken.
   */
  @Path("/protocol[at0020]/items[at0064]")
  private List<Cluster> structuredMeasurementLocation;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Device
   * Description: Details about the device use to measure body temperature.
   */
  @Path("/protocol[at0020]/items[at0059]")
  private Cluster device;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: e.g. Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0020]/items[at0062]")
  private List<Cluster> extension;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Body temperature/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setTemperatureMagnitude(Double temperatureMagnitude) {
     this.temperatureMagnitude = temperatureMagnitude;
  }

  public Double getTemperatureMagnitude() {
     return this.temperatureMagnitude ;
  }

  public void setTemperatureUnits(String temperatureUnits) {
     this.temperatureUnits = temperatureUnits;
  }

  public String getTemperatureUnits() {
     return this.temperatureUnits ;
  }

  public void setTemperatureNullFlavourDefiningCode(
      NullFlavour temperatureNullFlavourDefiningCode) {
     this.temperatureNullFlavourDefiningCode = temperatureNullFlavourDefiningCode;
  }

  public NullFlavour getTemperatureNullFlavourDefiningCode() {
     return this.temperatureNullFlavourDefiningCode ;
  }

  public void setEnvironmentalConditions(List<Cluster> environmentalConditions) {
     this.environmentalConditions = environmentalConditions;
  }

  public List<Cluster> getEnvironmentalConditions() {
     return this.environmentalConditions ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
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

  public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
     this.structuredMeasurementLocation = structuredMeasurementLocation;
  }

  public List<Cluster> getStructuredMeasurementLocation() {
     return this.structuredMeasurementLocation ;
  }

  public void setDevice(Cluster device) {
     this.device = device;
  }

  public Cluster getDevice() {
     return this.device ;
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
