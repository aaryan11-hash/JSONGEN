package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.528564300+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TravelEventTripDetailCluster implements LocatableEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Travel destination
   * Description: Details about a single location visited on a trip.
   */
  @Path("/items[at0010]")
  private List<TravelEventTravelDestinationCluster> travelDestination;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Additional trip details
   * Description: Additional structured details about the whole trip.
   */
  @Path("/items[at0025]")
  private List<Cluster> additionalTripDetails;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/Date of return
   * Description: The date when the individual returned back to their home base.
   */
  @Path("/items[at0019]/value|value")
  private TemporalAccessor dateOfReturnValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/History/Any interval event/Tree/Trip detail/Date of return/null_flavour
   */
  @Path("/items[at0019]/null_flavour|defining_code")
  private NullFlavour dateOfReturnNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setTravelDestination(List<TravelEventTravelDestinationCluster> travelDestination) {
     this.travelDestination = travelDestination;
  }

  public List<TravelEventTravelDestinationCluster> getTravelDestination() {
     return this.travelDestination ;
  }

  public void setAdditionalTripDetails(List<Cluster> additionalTripDetails) {
     this.additionalTripDetails = additionalTripDetails;
  }

  public List<Cluster> getAdditionalTripDetails() {
     return this.additionalTripDetails ;
  }

  public void setDateOfReturnValue(TemporalAccessor dateOfReturnValue) {
     this.dateOfReturnValue = dateOfReturnValue;
  }

  public TemporalAccessor getDateOfReturnValue() {
     return this.dateOfReturnValue ;
  }

  public void setDateOfReturnNullFlavourDefiningCode(
      NullFlavour dateOfReturnNullFlavourDefiningCode) {
     this.dateOfReturnNullFlavourDefiningCode = dateOfReturnNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfReturnNullFlavourDefiningCode() {
     return this.dateOfReturnNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
