package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;
				
import static org.junit.Assert.assertTrue;

/**
 * 
 * @author Sarah Heckman
 *
 * Extended by Mike Whalen
 *
 * Unit tests for CoffeeMaker class.
 */

public class CoffeeMakerTest extends TestCase {
	
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	private CoffeeMaker cm;
	private RecipeBook recipeBookStub;
	private Recipe [] stubRecipies; 
	
	protected void setUp() throws Exception {
		
		cm = new CoffeeMaker();
		
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		//Set up for r5 (added by MWW)
		r5 = new Recipe();
		r5.setName("Super Hot Chocolate");
		r5.setAmtChocolate("6");
		r5.setAmtCoffee("0");
		r5.setAmtMilk("1");
		r5.setAmtSugar("1");
		r5.setPrice("100");

		stubRecipies = new Recipe [] {r1, r2, r3};
		
		super.setUp();
	}
	
	
	// put your tests here!
	public void testMakeCoffeeAddRecipe1() {
    	try {
    		setUp();
    	} catch (Exception e) {
    	    System.out.println("setUp() function call failure");
    	    return;
    	}
		
		boolean success = false;
		success = cm.addRecipe(r1);
		assertEquals(true, success);
		success = cm.addRecipe(r2);
		assertEquals(true,success);
		success = cm.addRecipe(r3);
		assertEquals(true,success);
		success = cm.addRecipe(r4);
		assertEquals(true,success);
		success = cm.addRecipe(r5);
		assertEquals(false,success);		
	}
	
	// test add invalid recipe price (non-INT)
	public void testMakeCoffeeAddRecipe2() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50.1");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}

	// test add invalid recipe AmtChocolate (non-INT)
	public void testMakeCoffeeAddRecipe3() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0.5");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}

	// test add invalid recipe AmtCoffee (non-INT)
	public void testMakeCoffeeAddRecipe4() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3.5");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}	
	
	// test add invalid recipe AmtMilk (non-INT)
	public void testMakeCoffeeAddRecipe5() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1.8");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}	
	
	// test add invalid recipe AmtSugar (non-INT)
	public void testMakeCoffeeAddRecipe6() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1.6");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}
	
	// test add invalid recipe price (negative)
	public void testMakeCoffeeAddRecipe7() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0.5");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("-50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}	
	
	// test add invalid recipe AmtChocolate (negative)
	public void testMakeCoffeeAddRecipe8() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("-1");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}

	// test add invalid recipe AmtCoffee (negative)
	public void testMakeCoffeeAddRecipe9() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("-3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}	
	
	// test add invalid recipe AmtMilk (negative)
	public void testMakeCoffeeAddRecipe10() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("-1");
    		recipe.setAmtSugar("1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}	
	
	// test add invalid recipe AmtSugar (negative)
	public void testMakeCoffeeAddRecipe11() {
    	try {
    		setUp();
    		
    		Recipe recipe = new Recipe();
    		recipe.setName("Coffee");
    		recipe.setAmtChocolate("0");
    		recipe.setAmtCoffee("3");
    		recipe.setAmtMilk("1");
    		recipe.setAmtSugar("-1");
    		recipe.setPrice("50");
    		cm.addRecipe(recipe);    		
    	}catch (RecipeException e) {
    		assertTrue("Expected Exception with invalid value", true);
    		return;
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
    	
    	fail("Expected Exception missing");
    	return;
	}
	
	// test add recipes and make check number of recipes with getRecipes() 
	public void testMakeCoffeeAddRecipe12() {
    	try {
    		setUp();
    		cm.addRecipe(r1);
    		cm.addRecipe(r2);
    		cm.addRecipe(r3);
    		assertEquals(3, cm.getRecipes().length);
    	}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
	}

	//test add recipes and delete VALID recipes
	public void testMakeCoffeeDeleteRecipe1() {
		try{
			setUp();
			cm.addRecipe(r1);
			cm.addRecipe(r2);
			cm.addRecipe(r3);
			assertEquals("Coffee",cm.deleteRecipe(0));
			assertEquals("Mocha" ,cm.deleteRecipe(1));
			assertEquals("Latte" ,cm.deleteRecipe(2));

		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}		
	}

	//test add recipes and delete INEXISTENT recipes
	public void testMakeCoffeeDeleteRecipe2() {
		try {
			setUp();
			cm.addRecipe(r1);
			cm.addRecipe(r2);
			cm.addRecipe(r3);
			assertEquals(null ,cm.deleteRecipe(3));
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}				
	}

	//test add recipes and delete INVALID recipes
	public void testMakeCoffeeDeleteRecipe3() {
		try {
			setUp();
			cm.addRecipe(r1);
			assertEquals(null,cm.deleteRecipe('0'));
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}				 
	}

	public void testMakeCoffeeDeleteRecipe4() {
		try {
			setUp();
			cm.addRecipe(r1);
			cm.addRecipe(r2);
			cm.addRecipe(r3);
			assertEquals(null, cm.deleteRecipe(-1));
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}
	}	

	//test delete empty recipes
	public void testMakeCoffeeDeleteRecipe5() {
		try {
			setUp();
			assertEquals(null, cm.deleteRecipe(0));
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}		
	}

	//test edit existent recipe
	public void testMakeCoffeeEditRecipe1() {
		try {
			setUp();
			cm.addRecipe(r1);
			cm.addRecipe(r2);
			cm.editRecipe(0, r3);
			assertEquals(cm.getRecipes()[0].getName(), r1.getName()); //name should be the same
			assertEquals(cm.getRecipes()[0].getPrice(), r3.getPrice());
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}	
	}
	
	//test edit non-existent recipe
	public void testMakeCoffeeEditRecipe2() {
		try {
			setUp();
			assertEquals(null, cm.editRecipe(0, r2));
		}
    	catch (Exception e) {
    	    fail("Unexpected setUp() function call failure");
    	    return;
    	}					
	}

//	//test edit recipe with negative index
//	public void testMakeCoffeeEditRecipe3() {
//		try {
//			cm.addRecipe(r1);
//			cm.addRecipe(r2);
//			assertEquals(null, cm.editRecipe(-1, r3));			
//			setUp();
//		}
//    	catch (Exception e) {
//    	    fail("Unexpected setUp() function call failure");
//    	    return;
//    	}	
//	}
//
//	//test edit recipe with character index
//	public void testMakeCoffeeEditRecipe4() {
//		try {
//			setUp();
//			cm.addRecipe(r1);
//			assertEquals(null, cm.editRecipe('a', r3));			
//		}
//    	catch (Exception e) {
//    	    fail("Unexpected setUp() function call failure");
//    	    return;
//    	}		
//	}	
}
