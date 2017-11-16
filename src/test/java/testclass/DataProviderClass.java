/* 
 * DataProviderClass : This class is used to provide input data for TestClass to search for different products.
 * Here two different products, "head first java" and "head first python" are searched to add to into the shopping cart.
 * In the same way this data provider class can be used to provide input data to search n number different products.
 * Like wise different Objects can be created to provide input data to different test cases.
 */

package testclass;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	

	/*This method provides input data to the test case addProductsToShoppingCart() in TestClass.
	 * Data is provided in the below format as user wants to search for two different products and add to the shopping cart
	 * product1, product2
	 * This format can be changed  based on the requirements.
	 */
	
	@DataProvider(name = "productData")
	public static Object[][] getProductData() {
		return new Object[][] {
			{"head first java", "head first python"}
			};
	}
	
}


