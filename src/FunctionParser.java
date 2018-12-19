import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.scene.chart.XYChart;



public class FunctionParser {
	
	private String powRegex;
	private static ScriptEngine js = new ScriptEngineManager().getEngineByName("nashorn");
	
	static XYChart.Series<Number, Number> parse(String func) throws ScriptException {
		js.eval("kek");
		
		return null;
	}
}
/*
	3x^2+2x+5 => Math.pow(3x, 2)+2*x+5
	([0-9x]+)\^([0-9x]+) => Math.pow($1, $2)
	([0-9]+)x => $1*x
*/