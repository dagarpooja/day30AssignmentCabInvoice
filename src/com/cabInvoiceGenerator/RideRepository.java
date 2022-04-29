package com.cabInvoiceGenerator;

	public interface RideRepository {

		void addRideDetails(RideModel ride);

		InvoiceModel getInvoice();
		

}
