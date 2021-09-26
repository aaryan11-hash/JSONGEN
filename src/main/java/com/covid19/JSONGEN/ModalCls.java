package com.covid19.JSONGEN;

import lombok.Builder;
import lombok.Data;
import openehrsuspectedcovid19riskassessmentv0composition.definition.*;


@Builder
@Data
public class ModalCls {
    AddressCluster addressCluster;
    BodyTemperatureObservation bodyTemperatureObservation;
    DiagnosticStatusDefiningCode diagnosticStatusDefiningCode;
    HealthRiskAssessmentEvaluation healthRiskAssessmentEvaluation;
    SymptomSignScreeningQuestionnaireObservation symptomSignScreeningQuestionnaireObservation;

}
