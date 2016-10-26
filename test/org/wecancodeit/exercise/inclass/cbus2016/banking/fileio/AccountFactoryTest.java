package org.wecancodeit.exercise.inclass.cbus2016.banking.fileio;

import org.junit.Assert;
import org.junit.Test;
import org.wecancodeit.exercise.inclass.cbus2016.banking.Account;

public class AccountFactoryTest {

	@Test
	public void shouldReadName() {
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filepath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\src\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountInfo1.txt";
		//act
		Account account = underTest.read(filepath);
		String name = account.getName();
		//assert
		Assert.assertEquals("Jojo McCoy", name);
	}
}
