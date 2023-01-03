package az.smart;

import org.renjin.script.RenjinScriptEngine;
import org.renjin.script.RenjinScriptEngineFactory;

import javax.script.ScriptException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws ScriptException {
        RenjinScriptEngineFactory factory = new RenjinScriptEngineFactory();
        RenjinScriptEngine engine = factory.getScriptEngine();

        File file = new File("src/main/resources/premier_league.csv");
        String normalizedPath = file.getAbsolutePath().replace("\\", "/");
        engine.eval("premier_league <- read.csv('" + normalizedPath + "')");
        engine.eval("print(summary(premier_league))");
    }
}
