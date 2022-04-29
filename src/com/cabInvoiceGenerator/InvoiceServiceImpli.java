package com.cabInvoiceGenerator;

	public class InvoiceServiceImpli implements InvoiceService {

		RideRepository rideRepository;

		public InvoiceServiceImpli() {
			rideRepository = new RideRepositoryImpli();
		}

		public void addRideDetails(RideModel ride) {
			rideRepository.addRideDetails(ride);
		}

		@Override
		public InvoiceModel generateInvoice() {
			return rideRepository.getInvoice();
		}
}
