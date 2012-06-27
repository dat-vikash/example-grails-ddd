package example.shipping

class Shipment {

	enum ShippingStatus {
		WAITING, SENT, DELIVERED;
	}

	ShippingStatus status = ShippingStatus.WAITING

	static constraints = {
	}
}
