package com.cabInvoiceGenerator;

import java.util.ArrayList;
import java.util.List;

public class RideRepositoryImpli implements RideRepository {

		List<RideModel> rideList;

		public RideRepositoryImpli() {
			rideList = new ArrayList<>();
		}

		@Override
		public void addRideDetails(RideModel ride) {
			rideList.add(ride);
		}

		@Override
		public InvoiceModel getInvoice() {
			InvoiceModel invoice = new InvoiceModel();

			double totalFare = 0;

			for (RideModel rideModel : rideList) {
				totalFare += rideModel.getFare();
			}

			invoice.setTotalFare(totalFare);
			invoice.setTotalNoOfRides(rideList.size());
			invoice.setAvgFare();

			return invoice;
		}

}
