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

public class HouseholdEvaluationContainment extends Containment {
  public SelectAqlField<HouseholdEvaluation> HOUSEHOLD_EVALUATION = new AqlFieldImp<HouseholdEvaluation>(HouseholdEvaluation.class, "", "HouseholdEvaluation", HouseholdEvaluation.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(HouseholdEvaluation.class, "/data[at0001]/items[at0003]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HouseholdEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Long> NUMBER_OF_HOUSEHOLD_MEMBERS_MAGNITUDE = new AqlFieldImp<Long>(HouseholdEvaluation.class, "/data[at0001]/items[at0007]/value|magnitude", "numberOfHouseholdMembersMagnitude", Long.class, this);

  public SelectAqlField<NullFlavour> NUMBER_OF_HOUSEHOLD_MEMBERS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(HouseholdEvaluation.class, "/data[at0001]/items[at0007]/null_flavour|defining_code", "numberOfHouseholdMembersNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<DwellingCluster> DWELLING = new ListAqlFieldImp<DwellingCluster>(HouseholdEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.dwelling.v0]", "dwelling", DwellingCluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HouseholdEvaluation.class, "/protocol[at0002]/items[at0011]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HouseholdEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HouseholdEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HouseholdEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private HouseholdEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.living_arrangement.v0");
  }

  public static HouseholdEvaluationContainment getInstance() {
    return new HouseholdEvaluationContainment();
  }
}
