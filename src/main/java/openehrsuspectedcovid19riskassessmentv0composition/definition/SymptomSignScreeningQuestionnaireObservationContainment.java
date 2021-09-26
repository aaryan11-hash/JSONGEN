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

public class SymptomSignScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<SymptomSignScreeningQuestionnaireObservation> SYMPTOM_SIGN_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<SymptomSignScreeningQuestionnaireObservation>(SymptomSignScreeningQuestionnaireObservation.class, "", "SymptomSignScreeningQuestionnaireObservation", SymptomSignScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(SymptomSignScreeningQuestionnaireObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(SymptomSignScreeningQuestionnaireObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(SymptomSignScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SymptomSignScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SymptomSignScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<SymptomSignScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<SymptomSignScreeningQuestionnaireAnyEventChoice>(SymptomSignScreeningQuestionnaireObservation.class, "/data[at0001]/events[at0002]", "anyEvent", SymptomSignScreeningQuestionnaireAnyEventChoice.class, this);

  private SymptomSignScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.symptom_sign_screening.v0");
  }

  public static SymptomSignScreeningQuestionnaireObservationContainment getInstance() {
    return new SymptomSignScreeningQuestionnaireObservationContainment();
  }
}
