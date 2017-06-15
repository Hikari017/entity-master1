package japonics.newspring.controllers;

import japonics.newspring.TicketRepository;
import japonics.newspring.models.Ticket;
import japonics.newspring.models.forms.PersonForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Justyna on 29.05.2017.
 */@SpringBootApplication
@ComponentScan({"japonics.newspring"})
@Controller
public class MainController {
@Autowired
    TicketRepository ticketRepository;

    // Logger logger = Logger.getLogger(MainController.class);

 @RequestMapping(value = "/{ticketId}", method = RequestMethod.GET)
 @ResponseBody
 public void home( @PathVariable("prefix")String prefix){
        List<Ticket> tickets= ticketRepository.findByMessageLike("%Nic%");
        String messages = "tickety rozpoczynajacych sie na 'Nic': ;
        for (Ticket ticket:tickets
             ) {messages+= ticket.getMessage() + " ,";

        }

        return messages;
//        return tickets.stream().map(s->s.getMessage()).collect
//                (Collectors.joining("," , "Tickety",""));
//    }
//        Optional<Ticket> ticket = ticketRepository.findOne(id);
//        if (ticket.isPresent()) {
//
//
//            return "odczytalem z bazy: " + ticket.get().getMessage();
//
// }
//return ticket.map(s->"Dana z bazy: " +s.getMessage()).orElse("brak danych");
//    public String main(Model model) {
//
//        ZonedDateTime now = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris"));
//
//        System.out.println("Time now: " + now.toString());
//
//        if(now.toLocalTime().getHour() >= 16){
//            model.addAttribute("someString", "a");
//        }else{
//            model.addAttribute("someString", "b");
//        }
//
//        return "index";
//    }
//
//    @RequestMapping(value = "/data", method = RequestMethod.POST)
//    @ResponseBody
//    public String data(@RequestParam(value = "name") String name,
//                       @RequestParam(value = "lastname") String lastname,
//                       @RequestParam(value = "age") int age){
//        return name + " " + lastname + " jest " + ((age >= 18) ? "pełnoletni" : "niepełnoletni");
//    }
//
//    @RequestMapping(value = "/newform", method = RequestMethod.GET)
//    public String newform(Model model) {
//        model.addAttribute("personObject", new PersonForm());
//        return "form";
//    }
//
//    @RequestMapping(value = "/newform", method = RequestMethod.POST)
//    public String newformPost(@ModelAttribute("personObject") @Valid PersonForm person, BindingResult result){
//        if(result.hasErrors()){
//            return "form";
//        }
//
//        return "result";
//    }

//    @RequestMapping(value = "/contact", method = RequestMethod.GET)
//    public String contact(Model model) {
//        model.addAttribute("personObject", new PersonForm());
//        return "contact";
//    }
//
//    @RequestMapping(value = "/contact", method = RequestMethod.POST)
//    @ResponseBody
//    public String newformContact(@ModelAttribute("personObject") @Valid PersonForm person, BindingResult result){
//        if(result.hasErrors()){
//            return "formularz kontaktowy: " +person.getName();
//        }
//
//        return "result";
//    }
    //wzorzec projektowy -sugestia rozwiazania pewnego problemu

    // Testujemy jak działa wzorzec builder ;)
    // Nie ma wpływu na działanie springa
    private void testBuilder() {
        PersonForm personForm = new PersonForm.Builder("Justyna")
                .age(21)
                .email("justynasylwia017@gmail.com")
                .lastname("Luszczak")
                .number("669580317")
                .build();

        personForm.getAge();
    }






}
//    @RequestMapping(value = "/data", method = RequestMethod.GET)
//    @ResponseBody
//    public Integer data (@RequestParam("age") Integer ageFromForm){
//        return (Integer.valueOf("Twoje wiek : " +ageFromForm));
//    }
//    public String main() {
//        return "<b>Hello code academy!</b> post";
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    @ResponseBody
//    public String mainGet() {
//        return "<b>Hello code academy!</b> get : " + simpleBean.generateString();


