package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.524574+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class TravelEventAnyIntervalEventIntervalEvent implements IntervalEventEntity {
  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Recent travel?
   * Description: Has the individual travelled during the specified interval?
   * Comment: Use the Event to set the relevant interval.
   */
  @Path("/data[at0003]/items[at0004 and name/value='Recent travel?']/value|defining_code")
  private RecentTravelDefiningCode recentTravelDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/History/Any interval event/Tree/Recent travel?/null_flavour
   */
  @Path("/data[at0003]/items[at0004 and name/value='Recent travel?']/null_flavour|defining_code")
  private NullFlavour recentTravelNullFlavourDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/Trip detail
   * Description: Details about a single trip away from the home base.
   * Comment: The trip has a single departure and return date to their home base. A trip may include visiting many individual places, and these details should be recorded in the Itinerary.
   */
  @Path("/data[at0003]/items[at0008]")
  private List<TravelEventTripDetailCluster> tripDetail;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Suspected COVID-19 risk assessment2.v0/Travel event/Any interval event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setRecentTravelDefiningCode(RecentTravelDefiningCode recentTravelDefiningCode) {
     this.recentTravelDefiningCode = recentTravelDefiningCode;
  }

  public RecentTravelDefiningCode getRecentTravelDefiningCode() {
     return this.recentTravelDefiningCode ;
  }

  public void setRecentTravelNullFlavourDefiningCode(
      NullFlavour recentTravelNullFlavourDefiningCode) {
     this.recentTravelNullFlavourDefiningCode = recentTravelNullFlavourDefiningCode;
  }

  public NullFlavour getRecentTravelNullFlavourDefiningCode() {
     return this.recentTravelNullFlavourDefiningCode ;
  }

  public void setTripDetail(List<TravelEventTripDetailCluster> tripDetail) {
     this.tripDetail = tripDetail;
  }

  public List<TravelEventTripDetailCluster> getTripDetail() {
     return this.tripDetail ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
