package openehrsuspectedcovid19riskassessmentv0composition;

import org.apache.xmlbeans.XmlException;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class CovidTemplateProvider implements TemplateProvider {

    @Override
    public Optional<OPERATIONALTEMPLATE> find(String s) {
        InputStream stream = getClass().getResourceAsStream("/sample.opt");

        try{
            TemplateDocument template = TemplateDocument.Factory.parse(stream);
            return Optional.ofNullable(template.getTemplate());
        }catch (XmlException | IOException e){
            System.out.println("error happened");
            return Optional.ofNullable(null);
        }

    }
}
