package tasks co.com.choucair.certification.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd,screenplay,Performable;
import net.serenitybdd
import userinterface.choucairAcademypage;

import static org.eclipse.jdt.internal.compiler.impl.CompilerOptions.Tasks;,screenplay.Task;

public class Openup implements Task {
    private userinterface.choucairAcademypage choucairAcademypage;
public static Performable thePage() {
    return Tasks.instrumented (Openup.class)
}

    @Override

    public <T extends Actor> void performAs (T actor){
    actor.attemptTo(Open.browserOn(choucairAcademypage));

    }
}

