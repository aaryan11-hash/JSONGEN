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
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import java.time.temporal.TemporalAccessor;

public class StoryHistoryObservationContainment extends Containment {
  public SelectAqlField<StoryHistoryObservation> STORY_HISTORY_OBSERVATION = new AqlFieldImp<StoryHistoryObservation>(StoryHistoryObservation.class, "", "StoryHistoryObservation", StoryHistoryObservation.class, this);

  public SelectAqlField<String> STORY_VALUE = new AqlFieldImp<String>(StoryHistoryObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value|value", "storyValue", String.class, this);

  public SelectAqlField<NullFlavour> STORY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StoryHistoryObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0004]/null_flavour|defining_code", "storyNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_DETAIL = new ListAqlFieldImp<Cluster>(StoryHistoryObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0006]", "structuredDetail", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(StoryHistoryObservation.class, "/data[at0001]/events[at0002]/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(StoryHistoryObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(StoryHistoryObservation.class, "/protocol[at0007]/items[at0008]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(StoryHistoryObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(StoryHistoryObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(StoryHistoryObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private StoryHistoryObservationContainment() {
    super("openEHR-EHR-OBSERVATION.story.v1");
  }

  public static StoryHistoryObservationContainment getInstance() {
    return new StoryHistoryObservationContainment();
  }
}
