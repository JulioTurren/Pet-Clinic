
package org.springframework.samples.petclinic.products;

import java.util.Collection;
import java.util.Map;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;
import org.springframework.samples.petclinic.owner.OwnerRepository;

@Controller
public class ProductController {
   
     private final OwnerRepository owners;


    public ProductController(OwnerRepository clinicService) {
        this.owners = clinicService;
    }
     @GetMapping(value="/products")
  public String processFindForm( Map<String, Object> model) {
      Products miProducts = new Products();
      model.put("product", miProducts);
      return "products/products";
    }
}
