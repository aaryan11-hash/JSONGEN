package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.encapsulated.DvParsable;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.584572700+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ServiceRequestCurrentActivityActivity implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Service name
   * Description: The name of the single service or activity requested.
   * Comment: Coding of the 'Service name' with a coding system is desirable, if available. For example: 'referral' to an endocrinologist for diabetes management.
   */
  @Path("/description[at0009]/items[at0121]/value|defining_code")
  private ServiceNameDefiningCode serviceNameDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Tree/Service name/null_flavour
   */
  @Path("/description[at0009]/items[at0121]/null_flavour|defining_code")
  private NullFlavour serviceNameNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Reason for request
   * Description: A short phrase describing the reason for the request.
   * Comment: Coding of the 'Reason for request' with a coding system is desirable, if available. This data element allows multiple occurrences to enable the user to record a multiple responses, if required. For example: 'manage diabetes complications'.
   */
  @Path("/description[at0009]/items[at0062]")
  private List<ServiceRequestReasonForRequestElement> reasonForRequest;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Complex timing
   * Description: Details about a complex service request requiring a sequence of timings.
   * Comment: For example: 'hourly vital signs observations for 4 hours, then 4 hourly for 20 hours' or 'every third Wednesday for 3 visits' or .
   */
  @Path("/description[at0009]/items[at0151]")
  private List<Cluster> complexTiming;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Specific details
   * Description: Additional detail about the service requested.
   * Comment: For example: Specimen details for a laboratory test request, or anatomical location for a procedure request.
   */
  @Path("/description[at0009]/items[at0132]")
  private List<Cluster> specificDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Supporting information
   * Description: Digital document, image, video or diagram supplied as additional information to support or inform the request.
   */
  @Path("/description[at0009]/items[at0149]")
  private List<Cluster> supportingInformation;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/Patient requirements
   * Description: Language, transport or other personal requirements to support the patient's attendance or participation in provision of the service.
   */
  @Path("/description[at0009]/items[at0116]")
  private List<Cluster> patientRequirements;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/timing
   */
  @Path("/timing")
  private DvParsable timing;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Service request/Current Activity/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setServiceNameDefiningCode(ServiceNameDefiningCode serviceNameDefiningCode) {
     this.serviceNameDefiningCode = serviceNameDefiningCode;
  }

  public ServiceNameDefiningCode getServiceNameDefiningCode() {
     return this.serviceNameDefiningCode ;
  }

  public void setServiceNameNullFlavourDefiningCode(
      NullFlavour serviceNameNullFlavourDefiningCode) {
     this.serviceNameNullFlavourDefiningCode = serviceNameNullFlavourDefiningCode;
  }

  public NullFlavour getServiceNameNullFlavourDefiningCode() {
     return this.serviceNameNullFlavourDefiningCode ;
  }

  public void setReasonForRequest(List<ServiceRequestReasonForRequestElement> reasonForRequest) {
     this.reasonForRequest = reasonForRequest;
  }

  public List<ServiceRequestReasonForRequestElement> getReasonForRequest() {
     return this.reasonForRequest ;
  }

  public void setComplexTiming(List<Cluster> complexTiming) {
     this.complexTiming = complexTiming;
  }

  public List<Cluster> getComplexTiming() {
     return this.complexTiming ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setSupportingInformation(List<Cluster> supportingInformation) {
     this.supportingInformation = supportingInformation;
  }

  public List<Cluster> getSupportingInformation() {
     return this.supportingInformation ;
  }

  public void setPatientRequirements(List<Cluster> patientRequirements) {
     this.patientRequirements = patientRequirements;
  }

  public List<Cluster> getPatientRequirements() {
     return this.patientRequirements ;
  }

  public void setTiming(DvParsable timing) {
     this.timing = timing;
  }

  public DvParsable getTiming() {
     return this.timing ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
