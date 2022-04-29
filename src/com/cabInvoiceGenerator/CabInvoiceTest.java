package com.cabInvoiceGenerator;

import org.junit.Test;

public class CabInvoiceTest {

		@Test
		public void fareAmountMultipleRide() {

			CabInvoiceGenerator generator = new CabInvoiceGenerator();

			generator.bookCabForMonth();
			
			generator.generateInvoice();
		}


}
