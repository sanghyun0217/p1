
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * implement dataStructureADTTest method.
 * @author sanghyun lee
 **/

abstract class DataStructureADTTest<T extends DataStructureADT<String,String>> {
	
	private T dataStructureInstance;
	
	protected abstract T createInstance();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dataStructureInstance = createInstance();
	}

	@AfterEach
	void tearDown() throws Exception {
		dataStructureInstance = null;
	}

	/**
	 * check data structure is empty or not. 
	 * if data structure is not empty print fail message. "data structure should be empty "
	 * 
	 **/

	@Test
	void test00_empty_ds_size() {
		if (dataStructureInstance.size() != 0)
		fail("data structure should be empty, with size=0, but size="+dataStructureInstance.size());
	}
	
	// TODO: implement tests 01 - 04

	
	/**
	 * insert key and check data structure's size 
	 * if data structure size is not one print fail message. "data structure should be 1 "
	 * 
	 **/
	@Test
		void test01_after_insert_one_size_is_one() {
			dataStructureInstance.insert("Key", "Value");
			
			if (dataStructureInstance.size() != 1) {
				fail("Size Should be 1"+"but size="+ dataStructureInstance.size());
			}
			
			
		}
	
	/**
	 * insert key and remove that then check data structure's size 
	 * if data structure size is not zero print fail message. "data structure should be zero "
	 * 
	 **/
	
		@Test
		void test02_after_insert_one_remove_one_size_is_0() {
			dataStructureInstance.insert("Key", "Value");
			
			dataStructureInstance.remove("Key");
			
			
			
			if (dataStructureInstance.size() != 0) {
				fail("Size Should be 0"+"but size="+ dataStructureInstance.size());
			}
			
			
		}
	
		/**
		 * check if data structure already have same key or value 
		 * if data structure already have same key or value 
		 * throw runtime exception 
		 * 
		 * 
		 **/
		
		@Test
		void test03_duplicate_exception_is_thrown() {
			
			try {
				dataStructureInstance.insert("Key", "Value");
				dataStructureInstance.insert("Key", "Value");
			} catch (RuntimeException e) {return;} // Do nothing if passes
			fail("not duplicate");
		} 
		
		/**
		 * insert key and remove "different key or value name" and check 
		 * if data structure contain or equal "different key or value name"print fail message. 
		 * "key does not exist "
		 * 
		 **/
		// test04_remove_returns_false_when_key_not_present
		@Test
		void test04_remove_returns_false_when_key_not_present() {
			dataStructureInstance.insert("key", "value");
			
			if (dataStructureInstance.remove("Kay")) {
				fail("return false when key not present");
			}
		}
		
		/**
		 * insert 2 elements and remove them and check data structure size 
		 * if data structure size is not 0 print fail message. 
		 * "data structure size should be 0 "
		 * 
		 **/
		void test05_insert_2elements_removing_2_get_should_be_ture(){
			dataStructureInstance.insert("key", "value");
			dataStructureInstance.insert("key1", "value1"); // insert key
			dataStructureInstance.remove("key"); // remove key
			dataStructureInstance.remove("key2");

			if (dataStructureInstance.size() != 0) { 
				fail("Size Should be 0"+"but size="+ dataStructureInstance.size());
			}
			
		}
		/**
		 * insert 8 elements and remove them and check data structure size 
		 * if data structure size is not 0 print fail message. 
		 * "data structure size should be 0 "
		 * 
		 **/
		@Test
		void test06_store_at_least_8_items_should_be_able_remove_all_of_them() {
			dataStructureInstance.insert("key", "value");
			dataStructureInstance.insert("key1", "value1");
			dataStructureInstance.insert("key2", "value2");
			dataStructureInstance.insert("key3", "value3");
			dataStructureInstance.insert("key4", "value4");
			dataStructureInstance.insert("key5", "value5");
			dataStructureInstance.insert("key6", "value6");
			dataStructureInstance.insert("key7", "value7");
			
			dataStructureInstance.remove("key");
			dataStructureInstance.remove("key1");
			dataStructureInstance.remove("key2");
			dataStructureInstance.remove("key3");
			dataStructureInstance.remove("key4");
			dataStructureInstance.remove("key5");
			dataStructureInstance.remove("key6");
			dataStructureInstance.remove("key7");
			
			
			if (dataStructureInstance.size() != 0) {
				fail("Size Should be 0"+"but size="+ dataStructureInstance.size());	
			}
				
			
			
			
		}
		/**
		 * insert element and remove then re add element and check data structure element
		 * if data structure element is equal to element. 
		 * 
		 **/
		@Test
		void test07_readd_key_if_key_was_inserted_and_then_removed(){
			dataStructureInstance.insert("key", "value");
			dataStructureInstance.remove("key");
			dataStructureInstance.insert("key", "value");
			
			
			if (dataStructureInstance.size() != 0) {
				fail("not re-add key");
			}
			
			}
		
		
		
}
		

