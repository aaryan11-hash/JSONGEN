package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

import java.time.temporal.TemporalAccessor;

public class TravelEventObservationContainment extends Containment {
  public SelectAqlField<TravelEventObservation> TRAVEL_EVENT_OBSERVATION = new AqlFieldImp<TravelEventObservation>(TravelEventObservation.class, "", "TravelEventObservation", TravelEventObservation.class, this);

  public ListSelectAqlField<TravelEventAnyIntervalEventIntervalEvent> ANY_INTERVAL_EVENT = new ListAqlFieldImp<TravelEventAnyIntervalEventIntervalEvent>(TravelEventObservation.class, "/data[at0001]/events[at0002]", "anyIntervalEvent", TravelEventAnyIntervalEventIntervalEvent.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(TravelEventObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(TravelEventObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(TravelEventObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(TravelEventObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(TravelEventObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private TravelEventObservationContainment() {
    super("openEHR-EHR-OBSERVATION.travel_event.v0");
  }

  public static TravelEventObservationContainment getInstance() {
    return new TravelEventObservationContainment();
  }
}
