package co.com. choucair. certification.academy.runners;
import RunnerTags.CucumberWithSerenity;
import cucumber. api. CucumberOptions;
import cucumber.api.SnippetType;

        import net. serenitybdd, cucumber, CucumberWithSerenity;
        import org. junit,runner,Runwith;

@runwith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.academy.stepdefinitions",
        snippets = SnippetType,CAMELCASE
        public class RunnerTags{
}
