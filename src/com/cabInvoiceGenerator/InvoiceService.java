package com.cabInvoiceGenerator;

	public interface InvoiceService {

		void addRideDetails(RideModel ride);

		InvoiceModel generateInvoice();


}
