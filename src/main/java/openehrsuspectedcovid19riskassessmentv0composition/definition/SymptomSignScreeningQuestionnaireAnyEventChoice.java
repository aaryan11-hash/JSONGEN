package openehrsuspectedcovid19riskassessmentv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

import javax.annotation.processing.Generated;
import java.time.temporal.TemporalAccessor;
import java.util.List;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2021-09-17T01:28:15.501389400+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface SymptomSignScreeningQuestionnaireAnyEventChoice {
  List<SymptomSignScreeningQuestionnaireSpecificSymptomSignCluster> getSpecificSymptomSign();

  void setSpecificSymptomSign(
      List<SymptomSignScreeningQuestionnaireSpecificSymptomSignCluster> specificSymptomSign);

  List<SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster> getSpecificSymptomSign1();

  void setSpecificSymptomSign1(
      List<SymptomSignScreeningQuestionnaireSpecificSymptomSign1Cluster> specificSymptomSign1);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<Cluster> getAdditionalDetails();

  void setAdditionalDetails(List<Cluster> additionalDetails);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  ScreeningPurposeDefiningCode getScreeningPurposeDefiningCode();

  void setScreeningPurposeDefiningCode(ScreeningPurposeDefiningCode screeningPurposeDefiningCode);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);
}
