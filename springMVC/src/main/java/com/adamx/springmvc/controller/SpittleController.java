package com.adamx.springmvc.controller;

import java.util.Date;
import java.util.List;

import com.adamx.springmvc.Spittle;
import com.adamx.springmvc.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.org.mozilla.javascript.internal.ast.ReturnStatement;


@Controller
@RequestMapping("/spittles")
public class SpittleController {

  private static final String MAX_LONG_AS_STRING = "9223372036854775807";
  
  private SpittleRepository spittleRepository;

  @Autowired
  public SpittleController(SpittleRepository spittleRepository) {

      this.spittleRepository = spittleRepository;
  }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model){
//        model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE,20));
//        return "spittles";
//    }
  @RequestMapping(method=RequestMethod.GET)
  public List<Spittle> spittles(
      @RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
      @RequestParam(value="count", defaultValue="20") int count) {
    return spittleRepository.findSpittles(max, count);
  }
    /** handle /spittles/show?spittle_id=  **/
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String spittle(
//        @RequestParam("spittle_id")long spittleId,Model model){
        @RequestParam(value="spittle_id",defaultValue =MAX_LONG_AS_STRING)long spittleId,Model model){
        model.addAttribute("spittle",spittleRepository.findOne(spittleId));
        return "spittle";
    }
//  @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
//  public String spittle(
//      @PathVariable("spittleId") long spittleId,
//      Model model) {
//    model.addAttribute(spittleRepository.findOne(spittleId));
//    return "spittle";
//  }
//
//  @RequestMapping(method=RequestMethod.POST)
//  public String saveSpittle(SpittleForm form, Model model) throws Exception {
//    spittleRepository.save(new Spittle(null, form.getMessage(), new Date(),
//        form.getLongitude(), form.getLatitude()));
//    return "redirect:/spittles";
//  }

}
