package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertiesController {

  @Value("${internal.property}")
  private String internal;

  @Value("${external.property}")
  private String external;

  @RequestMapping("/prop")
  public String greeting(Model model) {
    model.addAttribute("internal", internal);
    model.addAttribute("external", external);
    return "properties";
  }

}
