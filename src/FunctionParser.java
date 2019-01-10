import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.scene.chart.XYChart;

import java.util.regex.*;



public class FunctionParser {
	
	private static final String powRegex[] = {
			"([0-9x]+)\\^([0-9x]+)",
			"Math.pow($1, $2)",
			"([0-9]+)x",
			"$1\\*x"
	};
	
	
	
	
	private static final ScriptEngine js = new ScriptEngineManager().getEngineByName("nashorn");
	
	static /*XYChart.Series<Number, Number>*/String[] parse(String func, int... options) throws ScriptException {
		
		String res[] = new String[10];
		
		String jsFormattedFunc = func.replaceAll(powRegex[0], powRegex[1]);
		
		for (int i = 0; i < 100; i += 10) {
			res[i/10] = js.eval(
					jsFormattedFunc.replaceAll(powRegex[2], powRegex[3]).replaceAll("x", Integer.toString(i))
			).toString();
		}
		for (String s : res) {
			System.out.println(s);
		}
		return res;
	}
}
/*
	3x^2+2x+5 => Math.pow(3x, 2)+2*x+5
	([0-9x]+)\^([0-9x]+) => Math.pow($1, $2)
	([0-9]+)x => ([0-9]+)x
*/
