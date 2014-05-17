package myself.textalign;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/admin")
public class TextAlignmentController {

	private static final Logger logger = Logger
			.getLogger(TextAlignmentController.class);

	@RequestMapping(value = "/align", method = RequestMethod.POST)
	public @ResponseBody String justifyText(@RequestBody InputText inputText) {
		logger.info("Inputtext: " + inputText.getText());
		ArrayList<String> list = Utils.fullJustify(
				inputText.getText().split(" "), inputText.getLen());
		StringBuilder sb = new StringBuilder();
		for (String ls : list)
			sb.append(ls + "\n");
		return sb.toString();
	}
}
