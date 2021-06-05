package SpringFirst;

import java.util.Map;

public class Api {

}



public class Car {
   private String id;
   private String name;
   private String colour;
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   
   public String getColour() {
	      return colour;
	   }
   public void setColour(String colour) {
	      this.colour = colour;
   }

   Controller
   public class CarServiceController {
      private static Map<String, Car> productRepo = new HashMap<>();
      
       static {
         Car toyota = new Car();
         toyota.setId("1");
         toyota.setName("corona");
         toyota.setColour("blue");
         productRepo.put(toyota.getId(), toyota);
         
         Car bmw = new Car();
         bmw.setId("2");
         bmw.setName("green");
         productRepo.put(bmw.getId(), bmw);

       }
   
   @RequestMapping(value = "/cars")
   public ResponseEntity<Object> getCar(){
   
   return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
   }
   
   @RequestMapping(value = "/cars", method = RequestMethod.POST)
   public ResponseEntity<Object> createProduct(@RequestBody Car car){
	productRepo.put(product.getId(), car);   
   return new ResponseEntity<>("Car is created", HttpStatus.CREATED);
   }
   
   @RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("id")String id, @RequestBody){
   productRepo.remove(id);
   product.setId(id);
   productRepo.put(id, car);
   return new ResponseEntity<>("Car is updated", HttpStatus.OK);
   }
   
   //change colour
   @RequestMapping(value = "/cars/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("colour")String colour, @RequestBody){
   productRepo.remove(colour);
   product.setId(colour);
   productRepo.put(colour, car);
   return new ResponseEntity<>("Car is updated", HttpStatus.OK);
   }
   
   
   @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Object> delete(@PathVariable("id") String id){
	   productRepo.remove(id);
	return new ResponseEntity<>("Car is deleted", HttpStatus.OK);   
   }
   }
   
   
   