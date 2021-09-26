package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;

@Entity
@Archetype("openEHR-EHR-CLUSTER.problem_qualifier.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.580577+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class StatusCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Status/Diagnostic status
   * Description: Stage or phase of diagnostic process.
   * Comment: The status is usually determined by a combination of the timing of diagnosis plus level of clinical certainty resulting from diagnostic tests and clinical evidence available. This data element and 'Diagnostic certainty' in EVALUATION.problem_diagnosis are two important axes of the diagnostic process, and valid combinations will need to be presented by software that exposes both data elements, so it is not possible for users to select conflicting combinations. 
   * Preliminary or working diagnoses are intended to represent the single most likely choice out of all differential diagnosis options.
   */
  @Path("/items[at0004]/value|defining_code")
  private DiagnosticStatusDefiningCode diagnosticStatusDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/structure/Status/Diagnostic status/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour diagnosticStatusNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Problem/Diagnosis/Status/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDiagnosticStatusDefiningCode(
      DiagnosticStatusDefiningCode diagnosticStatusDefiningCode) {
     this.diagnosticStatusDefiningCode = diagnosticStatusDefiningCode;
  }

  public DiagnosticStatusDefiningCode getDiagnosticStatusDefiningCode() {
     return this.diagnosticStatusDefiningCode ;
  }

  public void setDiagnosticStatusNullFlavourDefiningCode(
      NullFlavour diagnosticStatusNullFlavourDefiningCode) {
     this.diagnosticStatusNullFlavourDefiningCode = diagnosticStatusNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticStatusNullFlavourDefiningCode() {
     return this.diagnosticStatusNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
