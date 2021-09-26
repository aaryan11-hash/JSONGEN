package com.covid19.JSONGEN.Controller;


import com.covid19.JSONGEN.ModalCls;
import com.nedap.archie.rm.RMObject;
import openehrsuspectedcovid19riskassessmentv0composition.CovidTemplateProvider;
import openehrsuspectedcovid19riskassessmentv0composition.OpenEHRSuspectedCOVID19RiskAssessmentV0Composition;
import openehrsuspectedcovid19riskassessmentv0composition.definition.*;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conanical")
public class CompositionTemCOntroller {


    @GetMapping("/template")
    public ResponseEntity<ModalCls> getConanicalTemplateJson(@RequestParam String cityName,@RequestParam String countryName, @RequestParam String tempretureValue,
                                                             @RequestParam String healthAssesmentFormat
    ){

        OpenEHRSuspectedCOVID19RiskAssessmentV0Composition composition = new OpenEHRSuspectedCOVID19RiskAssessmentV0Composition();
        composition.setLanguage(Language.EN);
        System.out.println( "Hello World!" );

//        BodyTemperatureObservation bodyTemperatureObservation = new BodyTemperatureObservation();
//        bodyTemperatureObservation.setLanguage(Language.AA);
//        bodyTemperatureObservation.setTemperatureMagnitude(22.3);
//        HealthRiskAssessmentEvaluation healthRiskAssessmentEvaluation = new HealthRiskAssessmentEvaluation();
//        composition.setBodyTemperature(List.of(bodyTemperatureObservation));
//        composition.setHealthRiskAssessment(List.of());
//        composition.setLocation("INDIA MAHARASHTRA PUNE");
//
//
//        TemplateProvider provider = new CovidTemplateProvider();
//        Unflattener unflattener = new Unflattener(provider);
//        RMObject rmObject = unflattener.unflatten(composition);
//        CanonicalJson json = new CanonicalJson();
//        System.out.println(json.marshal(rmObject));

        return ResponseEntity.of(Optional.of(ModalCls.builder().addressCluster(AddressCluster.builder()
                .cityValue(cityName)
                .countryValue(countryName)
                .build())
                .bodyTemperatureObservation(BodyTemperatureObservation.builder()
                        .temperatureMagnitude(Double.parseDouble(tempretureValue))
                        .build())
                .diagnosticStatusDefiningCode(DiagnosticStatusDefiningCode.WORKING)
                .healthRiskAssessmentEvaluation(HealthRiskAssessmentEvaluation.builder()
                        .healthRiskDefiningCode(HealthRiskDefiningCode.EXPOSURE_TO_SEVERE_ACUTE_RESPIRATORY_SYNDROME_CORONAVIRUS2_EVENT)
                        .assessmentMethodValue(healthAssesmentFormat)
                        .build())
                .symptomSignScreeningQuestionnaireObservation(SymptomSignScreeningQuestionnaireObservation.builder()
                        .build())
                .build()));
    }
}
