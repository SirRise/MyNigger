import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.scene.chart.XYChart;

public class FunctionParser {
	
	private static final ScriptEngine js = new ScriptEngineManager().getEngineByName("nashorn");
	private static XYChart.Series<Number, Number> series = new XYChart.Series<>(); 
	private static final String powRegex[] = {
			"([0-9x]+)\\^([0-9x]+)",
			"Math.pow($1, $2)",
			"([0-9]+)x",
			"$1\\*x"
	};
	
	static XYChart.Series<Number, Number> parse(String func, int... options) throws ScriptException {
		String jsFormattedFunc = func.replaceAll(powRegex[0], powRegex[1]).replaceAll(powRegex[2], powRegex[3]);
		System.out.println(jsFormattedFunc);
		for (int i = 10; i < 100; i+= 10) {
			series.getData().add(
					new XYChart.Data<Number, Number>(
							i,
							Float.parseFloat(js.eval(jsFormattedFunc.replaceAll("x", Integer.toString(i))).toString())
					)
			);
		}
		return series;
	}
}
